package com.carmanager.user_management.model;

public class Admin extends User {

    // Polymorphism: overrides User's getRole()
    @Override
    public String getRole() {
        return "ADMIN";
    }
}
