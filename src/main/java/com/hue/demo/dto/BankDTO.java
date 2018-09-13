package com.hue.demo.dto;

public class BankDTO {
    private  Long Id;
    private  String bankname;
    private  String bankaccount;
    private  String username;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
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

    @Override
    public String toString() {
        return "BankDTO{" +
                "Id=" + Id +
                ", bankname='" + bankname + '\'' +
                ", bankaccount='" + bankaccount + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
