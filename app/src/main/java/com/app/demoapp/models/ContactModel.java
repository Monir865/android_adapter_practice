package com.app.demoapp.models;

public class ContactModel {

    private int image;
    private String name;
    private String contact;

    public ContactModel(int image, String name, String contact) {
        this.image = image;
        this.name = name;
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "ContactModel{" +
                "image=" + image +
                ", name='" + name + '\'' +
                ", contact='" + contact + '\'' +
                '}';
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}
