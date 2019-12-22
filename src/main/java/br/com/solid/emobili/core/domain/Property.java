package br.com.solid.emobili.core.domain;

public class Property {
    private String owner;
    private String address;
    private double price;

    public Property() {

    }

    public Property(String owner, String adress, double price) {
        this.owner = owner;
        this.address = adress;
        this.price = price;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
