package ru.zotov.dao.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Position {

    @Id
    int workshopId;
    String workshopName;
}
