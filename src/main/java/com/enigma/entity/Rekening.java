package com.enigma.entity;

public class Rekening {

    private String id;

    public String getId() {
        return id;
    }
    private String noRek;
    private String jenisRek;
    private Integer saldo;

    public Rekening(String noRek, String jenisRek, Integer saldo) {
//        this.id = id;
        this.noRek = noRek;
        this.jenisRek = jenisRek;
        this.saldo = saldo;
    }

    public void setId(String id) {
        this.id = id;
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


}
