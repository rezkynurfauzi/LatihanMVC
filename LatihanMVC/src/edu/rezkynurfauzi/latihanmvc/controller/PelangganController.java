/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.rezkynurfauzi.latihanmvc.controller;

import edu.rezkynurfauzi.latihanmvc.model.PelangganModel;
import edu.rezkynurfauzi.latihanmvc.view.PelangganView;
import javax.swing.JOptionPane;

/**
 *
 * NIM      : 10118016
 * NAMA     : REZKY NUR FAUZI
 * KELAS    : IF-01/S1/III
 */
public class PelangganController {
    
    private PelangganModel model;

    public void setModel(PelangganModel model) {
        this.model = model;
    }
    
    
    
    public void resetForm(PelangganView view){
        String nama = view.getTxtnama().getText();
        String email = view.getTxtemail().getText();
        String telepon = view.getTxttelepon().getText();
        
        if (nama.equals("") && email.equals("") && telepon.equals("")){
        
        } else
        
            model.resetForm();
    }
    
    public void simpanForm(PelangganView view){
        String nama = view.getTxtnama().getText();
        String email = view.getTxtemail().getText();
        String telepon = view.getTxttelepon().getText();
        
        if (nama.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Nama Masih Kosong!");
        }   else if (email.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Email Masih Kosong!");
        }   else if (telepon.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "No Telepon Masih Kosong!");
        }   else {
            model.simpanForm();
        }
    }
}
