package com.springapp.hardware_store.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by radud on 22/11/2015.
 */
@Entity
@Table(name = "transaction_status")
public class TransactionStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "status_name")
    private String name;
    @OneToMany
    @JoinColumn(name = "status_id", nullable = false)
    List<Transaction> members;

    public TransactionStatus() {
    }

    public List<Transaction> getMembers() {
        return members;
    }

    public void setMembers(List<Transaction> members) {
        this.members = members;
    }

    public TransactionStatus(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
