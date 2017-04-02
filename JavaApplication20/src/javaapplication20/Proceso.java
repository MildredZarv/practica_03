/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication20;

import javax.swing.JProgressBar;
import javax.swing.JTextArea;
import javax.swing.JTextField;

    public class Proceso extends Thread{
          private JTextArea edt;
          private JProgressBar prog;
    
    public Proceso(JTextArea edt, JProgressBar prog){
        this.edt=edt;
        this.prog=prog;
    }
    
    public void run(){
        for (int i = 0; i < 100; i++) {
            edt.setText(edt.getText()+" "+i);
            prog.setValue(i);
            try{
                sleep(1000);
                
            }catch(InterruptedException ex){
                
            }
            
        }
    }
    
}
