/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2labp2_sebastiancastillo;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author Asus
 */
public class Timer extends Thread {

    JLabel label;
    int seg;
    int m;
    Amdming_Barra t;

    public Timer() {
    }

    public Timer(JLabel label, Amdming_Barra t) {
        this.label = label;
        this.t = t;
    }

    public JLabel getLabel() {
        return label;
    }

    public void setLabel(JLabel label) {
        this.label = label;
    }

    public int getSeg() {
        return seg;
    }

    public void setSeg(int seg) {
        this.seg = seg;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    @Override
    public void run() {
        while (t.isVive()) {
            if (seg < 60) {
                seg++;
            } else {
                m++;
                seg = 0;
            }
            String s = String.format("%02d:%02d", m, seg);
            label.setText(s);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Timer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
}
