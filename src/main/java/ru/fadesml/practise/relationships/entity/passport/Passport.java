package ru.fadesml.practise.relationships.entity.passport;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "passports")
public class Passport {
    @Id
    private Long id;

    private String firstName;
    private String secondName;
    private String lastName;

    private Long series;
    private Long number;
}
