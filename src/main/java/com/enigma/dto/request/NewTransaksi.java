package com.enigma.dto.request;

public class NewTransaksi {
    private String rekPengirimId;
    private String rekPenerimaId;
    private Integer jumlah;

    public NewTransaksi(String rekPengirimId, String rekPenerimaId, Integer jumlah) {
        this.rekPengirimId = rekPengirimId;
        this.rekPenerimaId = rekPenerimaId;
        this.jumlah = jumlah;
    }

    public String getRekPengirimId() {
        return rekPengirimId;
    }

    public void setRekPengirimId(String rekPengirimId) {
        this.rekPengirimId = rekPengirimId;
    }

    public String getRekPenerimaId() {
        return rekPenerimaId;
    }

    public void setRekPenerimaId(String rekPenerimaId) {
        this.rekPenerimaId = rekPenerimaId;
    }

    public Integer getJumlah() {
        return jumlah;
    }

    public void setJumlah(Integer jumlah) {
        this.jumlah = jumlah;
    }
}
