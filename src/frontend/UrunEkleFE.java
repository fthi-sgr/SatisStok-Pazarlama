/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package frontend;

import interfaces.FeInterfaces;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

/**
 *
 * @author isill
 */
public class UrunEkleFE extends JDialog implements FeInterfaces{

    public UrunEkleFE() {
        initPencere();
    }

    @Override
    public void initPencere() {
        JPanel panel=initPanel();
        
        panel.setBorder(BorderFactory.createTitledBorder("Ürün Kayıt Alanı"));
        add(panel);
        setTitle("Ürün Ekleyin");
        pack();
        setModalityType(DEFAULT_MODALITY_TYPE);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        
    }

    @Override
    public JPanel initPanel() {
        JPanel panel=new JPanel(new GridLayout(5,2));
        JLabel adiLabel=new JLabel("Ürün Adı:",JLabel.RIGHT);
        panel.add(adiLabel);
        JTextField adiField=new JTextField(10);
        panel.add(adiField);
        JLabel kategoriLabel=new JLabel("Kategori Seç:",JLabel.RIGHT);
        panel.add(kategoriLabel);
        JComboBox kategoriBox=new JComboBox();
        panel.add(kategoriBox);
        JLabel tarihLabel=new JLabel("Tarih:",JLabel.RIGHT);
        panel.add(tarihLabel);
        JTextField adiField2=new JTextField(10);
        panel.add(adiField2);
        JLabel fiyatLabel=new JLabel("Fiyat Gir:",JLabel.RIGHT);
        panel.add(fiyatLabel);
        JTextField fiyatField =new JTextField(10);
        panel.add(fiyatField);
        
        JButton kaydetButton=new JButton("Kaydet");
        panel.add(kaydetButton);
        JButton iptalButton=new JButton("İptal");
        panel.add(iptalButton);
        
        
        
        return panel;
    }

    @Override
    public JMenuBar initBar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public JTabbedPane initTabs() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
