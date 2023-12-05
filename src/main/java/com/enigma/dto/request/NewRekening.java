package com.enigma.dto.request;

import com.enigma.entity.Nasabah;

public class NewRekening {
    private String noRek;
    private String jenis;
    private Integer saldo;
    private String nasabahId;

    public NewRekening(String noRek, String jenis, Integer saldo, String nasabahId) {
        this.noRek = noRek;
        this.jenis = jenis;
        this.saldo = saldo;
        this.nasabahId = nasabahId;
    }

    public String getNoRek() {
        return noRek;
    }

    public void setNoRek(String noRek) {
        this.noRek = noRek;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public Integer getSaldo() {
        return saldo;
    }

    public void setSaldo(Integer saldo) {
        this.saldo = saldo;
    }

    public String getNasabahId() {
        return nasabahId;
    }

    public void setNasabahId(String nasabahId) {
        this.nasabahId = nasabahId;
    }
}
