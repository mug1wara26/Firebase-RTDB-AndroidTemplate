package com.example.firebasertdb_androidtemplate;

public class User {
    private String name;
    private String password;
    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String toString() {
        return name;
    }
}
