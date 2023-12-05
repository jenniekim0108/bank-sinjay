package com.enigma.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table(name="rekening")
public class Rekening {

    @Id
    private String noRek;
    private String jenisRek;
    private Integer saldo;

    @ManyToOne
    @JoinColumn(name="nasabah_id")
    @JsonBackReference
    Nasabah nasabah;

    public Rekening(String noRek, String jenisRek, Integer saldo) {
//        this.id = id;
        this.noRek = noRek;
        this.jenisRek = jenisRek;
        this.saldo = saldo;
    }

    public Rekening(String noRek) {
//        this.id = id;
        this.noRek = noRek;
    }

    public Rekening(){

    }

    public Rekening(Nasabah nasabah) {
        this.nasabah = nasabah;
    }

    public String getNoRek() {
        return noRek;
    }

    public void setNoRek(String noRek) {
        this.noRek = noRek;
    }

    public String getJenisRek() {
        return jenisRek;
    }

    public void setJenisRek(String jenisRek) {
        this.jenisRek = jenisRek;
    }

    public Integer getSaldo() {
        return saldo;
    }

    public void setSaldo(Integer saldo) {
        this.saldo = saldo;
    }


    public Nasabah getNasabah() {
        return nasabah;
    }

    public void setNasabah(Nasabah nasabah) {
        this.nasabah = nasabah;
    }

}
