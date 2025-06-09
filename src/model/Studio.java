/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author MyBook Hype AMD
 */
public class Studio {
    private int id;
    private String name;
    private String location;
    private String description;
    private double pricePerHour;
    private boolean isAvailable;

    // Constructor tanpa ID (untuk insert baru)
    public Studio(String name, String location, String description, double pricePerHour, boolean isAvailable) {
        this.name = name;
        this.location = location;
        this.description = description;
        this.pricePerHour = pricePerHour;
        this.isAvailable = isAvailable;
    }

    // Constructor dengan ID (untuk read/edit)
    public Studio(int id, String name, String location, String description, double pricePerHour, boolean isAvailable) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.description = description;
        this.pricePerHour = pricePerHour;
        this.isAvailable = isAvailable;
    }

    // Getter dan Setter
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(double pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
}

