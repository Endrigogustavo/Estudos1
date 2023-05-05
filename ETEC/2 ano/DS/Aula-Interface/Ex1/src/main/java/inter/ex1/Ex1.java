/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package inter.ex1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


/**
 *
 * @author dti
 */
public class Ex1 extends JFrame{
    JList lista;
    String cidades[] = {"Rio de janeiro","Sao paulo","Bahia","Minas gerais"};
    JButton exibir;
    JLabel rotulo;
    
    public Ex1(){
    super("Ex1");
    setLayout(null);
    Container tela = getContentPane();
    exibir = new JButton("Exibir");
    rotulo = new JLabel();
    lista = new JList(cidades);
    lista.setVisibleRowCount(5);
    JScrollPane painelrolagem = new JScrollPane(lista);
    lista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

    
    painelrolagem.setBounds(40, 50, 150, 100);
    exibir.setBounds(270, 50, 100, 30);
    rotulo.setBounds(50, 150, 200, 30);
    
    
            exibir.addActionListener(
            new ActionListener(){
            public void actionPerformed(ActionEvent e){
            rotulo.setText("o estado é "+lista.getSelectedValue().toString());
            }
            }
    
    
    );
    
  tela.add(painelrolagem);
  tela.add(exibir);
  tela.add(rotulo);
  
        setSize(400,250);
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    
    
    public static void main(String[] args) {
        Ex1 app = new Ex1();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}