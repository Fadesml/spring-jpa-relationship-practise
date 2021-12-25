package ru.fadesml.practise.relationships.entity.messager;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "messages")
public class Message {
    @Id
    private Long id;

    //текст сообщения
    private String body;

    //дата и время отправления сообщения
    private LocalDateTime sendedAt;

    //является ли шаблонным сообщением / сообщением от системы
    private Boolean isTemplate;

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "messages")
    private Set<Chat> chats;
}
