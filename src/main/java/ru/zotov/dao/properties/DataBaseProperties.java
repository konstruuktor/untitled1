package ru.zotov.dao.properties;

public class DataBaseProperties {
    String URL = "jdbc:postgresql://localhost/testDataBase";
    String user = "postgres";
    String password = "911";

    public String getURL() {
        return URL;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }
}
