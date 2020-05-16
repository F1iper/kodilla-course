package com.kodilla.good.patterns.challenges.food2door;

public class Producer {

    private final String name;
    private final String surname;
    private final String address;
    private final String email;
    private final String phone;

    public Producer(final String name, final String surname, final String address, final String email, final String phone) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }
}