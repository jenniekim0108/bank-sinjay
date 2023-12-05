package com.enigma.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "nasabah")
public class Nasabah {
    @Id
    @GenericGenerator(name="uuid", strategy = "uuid")
    @GeneratedValue(generator = "uuid") //panjang 32 karakter, dan diklaim tidak akan duplikat`
//       @GeneratedValue(strategy = GenerationType.IDENTITY) - for integer type of ID
    private String id;
    @Column
    private String cif;
    private String name;
    private String phoneNumber;
    private String address;
    private Boolean isActive;

    @OneToMany(mappedBy = "nasabah")
    List<Rekening> lstRekening;

//    constructor bersifat opsional, kalau ga dibuat maka defaultnya kosong
//    constructor yang berisi seluruh parameter, tapi baiknya buat juga constructor default
    public Nasabah(String id, String cif, String name, String phoneNumber, String address, Boolean isActive) {
        this.id = id;
        this.cif = cif;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.isActive = isActive;
    }

    public Nasabah(List<Rekening> lstRekening) {
        this.lstRekening = lstRekening;
    }


    //    spring butuh public constructor
    public Nasabah(){
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
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


    public List<Rekening> getLstRekening() {
        return lstRekening;
    }

    public void setLstRekening(List<Rekening> lstRekening) {
        this.lstRekening = lstRekening;
    }

}
