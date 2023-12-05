package com.enigma.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="transaksi")
public class Transaksi {
    @Id
    @GenericGenerator(name="uuid", strategy = "uuid")
    @GeneratedValue(generator = "uuid") //panjang 32 karakter, dan diklaim tidak akan duplikat`
//       @GeneratedValue(strategy = GenerationType.IDENTITY) - for integer type of ID
    private String id;

    @ManyToOne
    @JoinColumn(name="rek_pengirim_id")
    private Rekening rekPengirim;
    @ManyToOne
    @JoinColumn(name="rek_penerima_id")
    private Rekening rekPenerima;
    private Integer jumlah;

    @CreatedDate
    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date createdAt;

    @PrePersist
    public void onCreate(){
        createdAt = new Date();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Rekening getRekPengirim() {
        return rekPengirim;
    }

    public void setRekPengirim(Rekening rekPengirim) {
        this.rekPengirim = rekPengirim;
    }

    public Rekening getRekPenerima() {
        return rekPenerima;
    }

    public void setRekPenerima(Rekening rekPenerima) {
        this.rekPenerima = rekPenerima;
    }

    public Integer getJumlah() {
        return jumlah;
    }

    public void setJumlah(Integer jumlah) {
        this.jumlah = jumlah;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Transaksi(String id, Rekening rekPengirim, Rekening rekPenerima, Integer jumlah) {
        this.id = id;
        this.rekPengirim = rekPengirim;
        this.rekPenerima = rekPenerima;
        this.jumlah = jumlah;
    }

    public Transaksi(){

    }
}
