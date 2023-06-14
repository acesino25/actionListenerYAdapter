/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actionListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author PC
 */
public class Eventos extends JFrame {

    public Eventos() {
        
        JTextField campo = new JTextField(150);
        JButton btnCampo = new JButton("Click Me");
        campo.setBounds(15, 30, 150, 50);
        btnCampo.setBounds(15, 60, 150, 100);
        
        JLabel label = new JLabel("hola");
        label.setBounds(15, 150, 100, 100);
        
        // USANDO CLASE ANÓNIMA DEFINIMOS UN LISTENER
        /*ActionListener listener = new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Accion performada");
            }
        };*/
        // O USAMOS UN CLASE INTERNA ADAPTADORA
        ActionListener listener = new ButtonListener();
        
        // ASIGNAMOS NUESTRO LISTENER
        btnCampo.addActionListener(listener);
        
        add(campo);
        add(btnCampo);
        add(label);
        setSize(400, 400);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public class ButtonListener extends ButtonListenerAdapter{
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Boton presionado");
        }
    }
    
    class ButtonListenerAdapter implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            //System.out.println("Boton presionado");
        }
        
    }
    
    
}
