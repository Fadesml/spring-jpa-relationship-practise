package ru.fadesml.practise.relationships.entity.elevator;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "elevators")
public class Elevator {
    @Id
    private Long id;

    private Integer maxKG;
    private Integer minKG;

    private Boolean isClosed;

    @ManyToOne
    @JoinColumn(name="house_id", nullable=true)
    private House house;
}
