package by.jrr.tt.liquibase.bean;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Human {

    @Id
    @GeneratedValue
    Long id;
    String name;
    String lastName;
    String email;
}
