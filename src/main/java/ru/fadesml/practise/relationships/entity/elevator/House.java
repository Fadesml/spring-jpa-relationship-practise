package ru.fadesml.practise.relationships.entity.elevator;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "houses")
public class House {
    @Id
    private Long id;

    @OneToMany(mappedBy="house")
    private Set<Elevator> elevators;

    private Integer floors;
}
