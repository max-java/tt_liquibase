package by.jrr.tt.liquibase.config;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.persistence.SecondaryTable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Component
@PropertySource("application.properties")
public class DbChanges {

    @Value("${spring.datasource.url}")
    String url;
    @Value("${spring.datasource.username}")
    String name;
    @Value("${spring.datasource.password}")
    String pass;

    private Logger log = LoggerFactory.getLogger("DbChanges");

    public void logDbChanges() {
        try {
            List<DbHistory> history = getChangeHistory();
            DbHistory last = history.get(history.size()-1);
            log.info("DB version: {}, last changes are '{}'", last.tag, last.comments);
            history.forEach(row -> log.debug(row.toString()));
        } catch (Exception ex) {
            log.info("No DB history found");
        }


    }

    private List<DbHistory> getChangeHistory() {
        List<DbHistory> history = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(url, name, pass);
             Statement st = connection.createStatement();
             ResultSet rs = st.executeQuery("select ID, TAG, COMMENTS, FILENAME from DATABASECHANGELOG")) {
            while (rs.next()) {
                history.add(new DbHistory(
                        rs.getString("ID"),
                        rs.getString("TAG"),
                        rs.getString("COMMENTS"),
                        rs.getString("FILENAME")));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return history;
    }

    @AllArgsConstructor
    private class DbHistory {
        String id;
        String tag;
        String comments;
        String fileName;

        @Override
        public String toString() {
            return id + "\t-\t" + tag + "\t" + ":" + comments;
        }
    }
}
