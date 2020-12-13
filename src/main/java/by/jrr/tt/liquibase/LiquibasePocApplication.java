package by.jrr.tt.liquibase;

import by.jrr.tt.liquibase.config.DbChanges;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
public class LiquibasePocApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(LiquibasePocApplication.class, args);
		ctx.getBean(DbChanges.class).logDbChanges();
	}

}
