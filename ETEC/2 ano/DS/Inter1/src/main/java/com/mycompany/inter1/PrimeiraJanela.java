/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inter1;
import javax.swing.*;
/**
 *
 * @author dti
 */
public class PrimeiraJanela extends JFrame{
    public PrimeiraJanela(){
        super("Nossa primeira janela");
        setSize(300,150);
        setVisible(true);
    }
    public static void main(String[] args) {
        PrimeiraJanela app = new PrimeiraJanela();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
    

