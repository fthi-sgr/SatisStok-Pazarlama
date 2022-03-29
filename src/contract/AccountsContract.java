/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contract;


public class AccountsContract {
    private int id;
    private int yetkiId;
    private int presonelId;
    private String sifre;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYetkiId() {
        return yetkiId;
    }

    public void setYetkiId(int yetkiId) {
        this.yetkiId = yetkiId;
    }

    public int getPresonelId() {
        return presonelId;
    }

    public void setPresonelId(int presonelId) {
        this.presonelId = presonelId;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    @Override
    public String toString() {
        return "AccountsContract{" + "id=" + id + ", yetkiId=" + yetkiId + ", presonelId=" + presonelId + ", sifre=" + sifre + '}';
    }
    
}
