package com.enigma.entity;

public class Nasabah {
    private int id;
    private String cif;
    private String name;
    private String phoneNumber;
    private String address;
    private Boolean isActive;

    public Nasabah(int id, String cif, String name, String phoneNumber, String address, Boolean isActive) {
        this.id = id;
        this.cif = cif;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.isActive = isActive;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Boolean getIsActive(){
        return isActive;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setIsActive(Boolean isActive){
        this.isActive = isActive;
    }

}
