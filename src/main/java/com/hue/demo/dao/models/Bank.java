package com.hue.demo.dao.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "banks")
public class Bank implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "bank_id")
    private Long bankId;

    @Column(name = "bank_name")
    private String bankname;

    @Column(name = "bank_account")
    private String bankaccount;

    @Column(name = "user_name")
    private String username;



    public Long getBankId() {
        return bankId;
    }

    public void setBankId(Long bankId) {
        this.bankId = bankId;
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    public String getBankaccount() {
        return bankaccount;
    }

    public void setBankaccount(String bankaccount) {
        this.bankaccount = bankaccount;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
