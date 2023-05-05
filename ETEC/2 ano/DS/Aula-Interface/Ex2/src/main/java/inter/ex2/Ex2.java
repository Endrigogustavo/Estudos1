/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package inter.ex2;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


/**
 *
 * @author dti
 */
public class Ex2 extends JFrame{
    JLabel rot1,rot2,rot3,texto;
    JCheckBox negrito, italico,normal,negritoitalico;
    JRadioButton tam1,tam2,tam3,tam4;
    ButtonGroup grupo;
    String cor[] = {"Sem cor","Vermelhor","Azul"};
    JComboBox lista;
    Integer estilo, tamfonte;

    public Ex2(){
    super("Ex1");
    setLayout(null);
    Container tela = getContentPane();
    rot1 = new JLabel("Cor");
    rot2 = new JLabel("Estilo");
    rot3 = new JLabel("Tamanho");
    texto = new JLabel("Programa feito em java");
    lista = new JComboBox(cor);
    lista.setMaximumRowCount(7);
    negrito = new JCheckBox("Negrito");
    normal = new JCheckBox("Normal");
    italico = new JCheckBox("Italico");
    negritoitalico = new JCheckBox("Negrito Italico");
    tam1 = new JRadioButton("12");
    tam2 = new JRadioButton("14");
    tam3 = new JRadioButton("16");
    tam4 = new JRadioButton("18");
    grupo = new ButtonGroup();
    grupo.add(tam1);
    grupo.add(tam2);
    grupo.add(tam3);
    grupo.add(tam4);
    
    rot1.setBounds(40, 20, 70, 20);
    rot2.setBounds(200, 20, 70, 20);
    rot3.setBounds(300, 20, 70, 20);
    texto.setBounds(100, 200, 300, 20);
    lista.setBounds(40, 50, 150, 20);
    negrito.setBounds(200, 50, 100, 20);
    italico.setBounds(200, 70, 100, 20);
    normal.setBounds(200, 90, 100, 20);
    negritoitalico.setBounds(200, 110, 100, 20);
    tam1.setBounds(350, 50, 100, 20);
    tam2.setBounds(350, 70, 100, 20);
    tam3.setBounds(350, 90, 100, 20);
    tam2.setBounds(350, 110, 100, 20);
    tamfonte=12;
    estilo=Font.PLAIN;
    
            lista.addActionListener(
            new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(lista.getSelectedItem().toString() == "Sem cor")
                texto.setForeground(Color.BLACK);
                if(lista.getSelectedItem().toString() == "Vermelho")
                texto.setForeground(Color.BLACK);
                if(lista.getSelectedItem().toString() == "Azul")
                texto.setForeground(Color.BLACK);
            }
            }
    );
    

  
        setSize(400,250);
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    
    
    public static void main(String[] args) {
        Ex2 app = new Ex2();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}