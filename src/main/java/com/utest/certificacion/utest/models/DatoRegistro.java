package com.utest.certificacion.utest.models;

public class DatoRegistro {

    private String firsName;
    private String lastName;
    private String emailAddress;
    private String month;
    private String day;
    private String year;
    private String languages;
    private String password;


    public DatoRegistro(String firsName, String lastName, String emailAddress, String month, String day, String year, String languages, String password) {
        this.firsName = firsName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.month = month;
        this.day = day;
        this.year = year;
        this.languages = languages;
        this.password = password;
    }

    public String getFirsName() {
        return firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getMonth() {
        return month;
    }

    public String getDay() {
        return day;
    }

    public String getYear() {
        return year;
    }

    public String getLanguages() {
        return languages;
    }

    public String getPassword() {
        return password;
    }
}
