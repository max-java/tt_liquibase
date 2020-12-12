package by.jrr.tt.liquibase.repository;

import by.jrr.tt.liquibase.bean.Human;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource
public interface HumanRepository extends JpaRepository<Human, Long> {
}
