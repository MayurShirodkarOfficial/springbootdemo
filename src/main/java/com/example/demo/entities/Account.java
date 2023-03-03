package com.example.demo.entities;


import jakarta.persistence.*;

@Entity
@Table(name="accounts")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    @Column(name = "name", nullable = false)
    String name;

    @Column(name = "balance", nullable = false)
    int balance;

    public Account() {
    }

    public Account(long id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public long getId() {
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

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
