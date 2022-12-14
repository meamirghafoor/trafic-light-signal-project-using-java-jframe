/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Trafic_Light;

import java.net.URL;
import java.awt.Image;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.Timer;

/**
 *
 * @author neutron
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
         URL dash2=getClass().getResource("Icon/bck.png");
        ImageIcon dashico2=new ImageIcon(new ImageIcon(dash2).getImage().getScaledInstance(bck.getWidth(),bck.getHeight(),Image.SCALE_SMOOTH));
        bck.setIcon(dashico2);
        URL dash1=getClass().getResource("Icon/nutral.png");
        ImageIcon dashico1=new ImageIcon(new ImageIcon(dash1).getImage().getScaledInstance(icon.getWidth(),icon.getHeight(),Image.SCALE_SMOOTH));
        icon.setIcon(dashico1);
    }
    int count=0;
    int light_id=0;
    int from_light=0;
    int green_blink=0;
    int blink_type=0;
    Timer teem;
    void icon(){
        teem=new Timer(500, (ActionEvent arg0) -> {
             count++;
        if(light_id==0){
           URL dash=getClass().getResource("Icon/red.png");
           ImageIcon dash1=new ImageIcon(new ImageIcon(dash).getImage().getScaledInstance(icon.getWidth(),icon.getHeight(),Image.SCALE_SMOOTH));
           icon.setIcon(dash1);
           if(count==20){
           light_id=1;
           from_light=0;
           count=0;
           }
        }else if(light_id==1){
            URL dash=getClass().getResource("Icon/yellow.png");
           ImageIcon dash1=new ImageIcon(new ImageIcon(dash).getImage().getScaledInstance(icon.getWidth(),icon.getHeight(),Image.SCALE_SMOOTH));
           icon.setIcon(dash1);
           if(count==3){
           if(from_light==0){
               light_id=2;
           }else if(from_light==2){
               light_id=0;
           }
            count=0;
           }
        }else if(light_id==2){
            URL dash=getClass().getResource("Icon/green.png");
           ImageIcon dash1=new ImageIcon(new ImageIcon(dash).getImage().getScaledInstance(icon.getWidth(),icon.getHeight(),Image.SCALE_SMOOTH));
           icon.setIcon(dash1);
           if(count==13){
           from_light=2;
           light_id=3;
           count=0;
            }
        }
        else if(light_id==3){
            if(blink_type==0){
                URL dash=getClass().getResource("Icon/nutral.png");
                ImageIcon dash1=new ImageIcon(new ImageIcon(dash).getImage().getScaledInstance(icon.getWidth(),icon.getHeight(),Image.SCALE_SMOOTH));
                icon.setIcon(dash1);
                if(green_blink==1){
                green_blink=0;
                blink_type=1;
                }
                
            }else if(blink_type==1){
                URL dash=getClass().getResource("Icon/green.png");
                ImageIcon dash1=new ImageIcon(new ImageIcon(dash).getImage().getScaledInstance(icon.getWidth(),icon.getHeight(),Image.SCALE_SMOOTH));
                icon.setIcon(dash1);
                if(green_blink==1){
                    green_blink=0;
                    blink_type=0;
                }
            }
            if(count==7){
                from_light=2;
                light_id=1;
                count=0;
                green_blink=0;
                blink_type=0;
            }
            green_blink++;
        }
        });teem.start();
    }
   
Timer teemer;
int type=0;
int yellow_blink=0;
void error(){
        teemer=new Timer(500, (ActionEvent arg0) -> {
            if(type==0){
                URL dash=getClass().getResource("Icon/nutral.png");
                ImageIcon dash1=new ImageIcon(new ImageIcon(dash).getImage().getScaledInstance(icon.getWidth(),icon.getHeight(),Image.SCALE_SMOOTH));
                icon.setIcon(dash1);
                if(yellow_blink==1){
                yellow_blink=0;
                type=1;
                }
                
            }else if(type==1){
                URL dash=getClass().getResource("Icon/red.png");
                ImageIcon dash1=new ImageIcon(new ImageIcon(dash).getImage().getScaledInstance(icon.getWidth(),icon.getHeight(),Image.SCALE_SMOOTH));
                icon.setIcon(dash1);
                if(yellow_blink==1){
                    yellow_blink=0;
                    type=0;
                }   
            }
            yellow_blink++;
        });teemer.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        icon = new javax.swing.JLabel();
        bck = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Trafic Signal");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconMouseClicked(evt);
            }
        });
        jPanel1.add(icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 90, 130, 210));
        jPanel1.add(bck, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 490));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 490));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
int i=0;
    private void iconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconMouseClicked
        // TODO add your handling code here:
        if(i==0){
           icon();
          i++;
        }else{
            if(i==1){
            error();
            teem.stop();
            }
        }
    }//GEN-LAST:event_iconMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bck;
    private javax.swing.JLabel icon;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
