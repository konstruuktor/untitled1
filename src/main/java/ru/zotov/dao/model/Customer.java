package ru.zotov.dao.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Customer {
    @Id
    int customerId;
    String customerName;
    String productName;
    @ManyToMany
    List<Project> projects;
}
