package com.example.userservice.model;

public class User {
    private String userID;
    private String name;
    private String email;
    private double latitude;
    private double longitude;

    // Constructor
    public User(String userID, String name, String email) {
        this.userID = userID;
        this.name = name;
        this.email = email;
        this.latitude = 0.0;
        this.longitude = 0.0;
    }

    // Getters and Setters
    public String getUserID() {
        return userID;
    }

    public void setLocation(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getLocation() {
        return "Latitude: " + latitude + ", Longitude: " + longitude;
    }
}
