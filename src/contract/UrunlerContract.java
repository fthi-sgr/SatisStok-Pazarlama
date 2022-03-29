/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contract;

import java.util.Date;

/**
 *
 * @author ultra
 */
public class UrunlerContract {
    
    private int id ;
    private String adi;
    private int kategoriId;
    private Date tarih;
    private float fiyat;
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public int getKategoriId() {
        return kategoriId;
    }

    public void setKategoriId(int kategoriId) {
        this.kategoriId = kategoriId;
    }

    public Date getTarih() {
        return tarih;
    }

    public void setTarih(Date tarih) {
        this.tarih = tarih;
    }

    public float getFiyat() {
        return fiyat;
    }

    public void setFiyat(float fiyat) {
        this.fiyat = fiyat;
    }
    

    @Override
    public String toString() {
        return "UrunlerContract{" + "id=" + id + ", adi=" + adi + ", kategoriId=" + kategoriId + ", tarih=" + tarih + ",fiyat=" + fiyat + '}';
    }
    
    
    
}
