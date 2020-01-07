/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.rezkynurfauzi.latihanmvc.model;

import edu.rezkynurfauzi.latihanmvc.event.PelangganListener;
import javax.swing.JOptionPane;

/**
 *
 * NIM      : 10118016
 * NAMA     : REZKY NUR FAUZI
 * KELAS    : IF-01/S1/III
 */
public class PelangganModel {
    
    
    private String nama;
    private String email;
    private String telepon;

    private PelangganListener pelangganListener;

    public PelangganListener getPelangganlistener() {
        return pelangganListener;
    }
    
    public void setPelangganListener(PelangganListener pelangganListener){
        this.pelangganListener = pelangganListener;
    }
    
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
        fireOnChange();
    }

    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email){
        this.email = email;
        fireOnChange();
    }

    public String getTelepon() {
        return telepon;
    }
    
    public void setTelepon(String telepon){
        this.telepon = telepon;
        fireOnChange();
    }
    
    protected void fireOnChange(){
        if (pelangganListener != null){
            pelangganListener.onChange(this);
        }
    }
    
    public void resetForm(){
        setNama("");
        setEmail("");
        setTelepon("");
    }
    
    public void simpanForm(){
        JOptionPane.showMessageDialog(null, "Berhasil Disimpan!");
    }
    
}
