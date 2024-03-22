/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2labp2_sebastiancastillo;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

/**
 *
 * @author Asus
 */
public class Amdming_Barra extends Thread {

    JProgressBar barra;
    JProgressBar barra2;
    int velocidad, velocidad2;
    boolean vive=true;
    JLabel gan,tiempo,gan2;
    
    
    public Amdming_Barra() {
    }
    
    public Amdming_Barra(int velocidad, JProgressBar barra, JProgressBar barra2, int velocidad2) {
        this.velocidad = velocidad;
        this.barra = barra;
        this.barra2 = barra2;
        this.velocidad2 = velocidad2;
    }

    public JProgressBar getBarra2() {
        return barra2;
    }

    public void setBarra2(JProgressBar barra2) {
        this.barra2 = barra2;
    }

    public int getVelocidad2() {
        return velocidad2;
    }

    public void setVelocidad2(int velocidad2) {
        this.velocidad2 = velocidad2;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public JLabel getGan() {
        return gan;
    }

    public void setGan(JLabel gan) {
        this.gan = gan;
    }

    public JLabel getTiempo() {
        return tiempo;
    }

    public void setTiempo(JLabel tiempo) {
        this.tiempo = tiempo;
    }

    public JLabel getGan2() {
        return gan2;
    }

    public void setGan2(JLabel gan2) {
        this.gan2 = gan2;
    }

    @Override
    public void run() {
        barra.setMaximum(1000);
        barra2.setMaximum(1000);
        while (barra.getValue() < barra.getMaximum() && barra2.getValue() < barra2.getMaximum()) {
            barra.setValue(barra.getValue() + velocidad);
            barra2.setValue(barra2.getValue() + velocidad2);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Amdming_Barra.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        vive=false;
           if (barra.getValue() == barra.getMaximum() || barra2.getValue() == barra2.getMaximum())
            if (barra.getValue() > barra2.getValue()) {
                JOptionPane.showMessageDialog(null, "El ganador es: " + gan.getText() + " En el tiempo de: " + tiempo.getText());
            } else if (barra.getValue() < barra2.getValue()) {
                JOptionPane.showMessageDialog(null, "El ganador es: " + gan2.getText() + " En el tiempo de: " + tiempo.getText());
            } else {
                JOptionPane.showMessageDialog(null, "Es un empate");
            }
    }
     
}
