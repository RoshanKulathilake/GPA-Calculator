
package gpa.cal;

import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainJFrame extends javax.swing.JFrame {

    ArrayList<JTextField> textFields = new ArrayList<>();
    ArrayList<JTextField> textFields2 = new ArrayList<>();
    public MainJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        subjectsjLabel = new javax.swing.JLabel();
        noOfSubjectsTextField = new javax.swing.JTextField();
        okayjButton = new javax.swing.JButton();
        resultsjPanel = new javax.swing.JPanel();
        sumjTextField = new javax.swing.JTextField();
        getGPAjButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        totalCreditsjTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        subjectsjLabel.setText("No : Subjects");

        okayjButton.setText("Okay");
        okayjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okayjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout resultsjPanelLayout = new javax.swing.GroupLayout(resultsjPanel);
        resultsjPanel.setLayout(resultsjPanelLayout);
        resultsjPanelLayout.setHorizontalGroup(
            resultsjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        resultsjPanelLayout.setVerticalGroup(
            resultsjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );

        getGPAjButton.setText("GPA");
        getGPAjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getGPAjButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Total Credits");

        totalCreditsjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalCreditsjTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(okayjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(subjectsjLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                            .addComponent(noOfSubjectsTextField)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(getGPAjButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(sumjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalCreditsjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(143, Short.MAX_VALUE))
            .addComponent(resultsjPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(subjectsjLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(noOfSubjectsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(okayjButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resultsjPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(totalCreditsjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(getGPAjButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sumjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okayjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okayjButtonActionPerformed
        String noOfSubjects = noOfSubjectsTextField.getText();
        int result = Integer.parseInt(noOfSubjects);
        System.out.println(result);
        
        if(result<3){
            
            JOptionPane.showMessageDialog(null, "Enter more than 2", "TITLE", JOptionPane.WARNING_MESSAGE);
            
        }else{
            createTextField(result);
              
        }
    }//GEN-LAST:event_okayjButtonActionPerformed

    private void getGPAjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getGPAjButtonActionPerformed
        //System.out.println(sum());
        sumjTextField.setText(String.valueOf(new Double(sumMarks()/sumCredit())));
        totalCreditsjTextField.setText(String.valueOf(new Double(sumCredit())));
    }//GEN-LAST:event_getGPAjButtonActionPerformed

    private void totalCreditsjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalCreditsjTextFieldActionPerformed
        
    }//GEN-LAST:event_totalCreditsjTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton getGPAjButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField noOfSubjectsTextField;
    private javax.swing.JButton okayjButton;
    private javax.swing.JPanel resultsjPanel;
    private javax.swing.JLabel subjectsjLabel;
    private javax.swing.JTextField sumjTextField;
    private javax.swing.JTextField totalCreditsjTextField;
    // End of variables declaration//GEN-END:variables

   public void createTextField(int result){
        JTextField tf,tf2;
        JLabel jl,jl2;
        int i = 1; 
        
        while (i <= result) { 
            resultsjPanel.setLayout(new GridLayout(i,1));
            tf = new JTextField(); 
            jl = new JLabel("Subject : "+i); 
            
            tf2 = new JTextField(); 
            jl2 = new JLabel("Credit : "); 
            
            textFields.add(tf);
            textFields2.add(tf2);
                
            
            
            resultsjPanel.add(jl);
            resultsjPanel.add(tf);
            resultsjPanel.add(jl2);
            resultsjPanel.add(tf2);
            i++;
                
        } 
            resultsjPanel.validate(); 
            resultsjPanel.repaint();
            okayjButton.setVisible(false);
            
    }
    public double sumCredit(){
        int i;
        double sum = 0;
        for(i = 0; i < textFields2.size(); i++){
            
            sum += Double.parseDouble(textFields2.get(i).getText());
            
        }
        return sum;
    }
    
    public double sumMarks(){
        int i;
        double sum = 0;
        for(i = 0; i < textFields2.size(); i++){
            
            sum += Double.parseDouble(textFields.get(i).getText())*Double.parseDouble(textFields2.get(i).getText());
            
        }
        return sum;
    }
    
}
