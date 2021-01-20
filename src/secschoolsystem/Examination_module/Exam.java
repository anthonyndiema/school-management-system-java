package secschoolsystem.Examination_module;

import javax.swing.JFrame;


public class Exam extends javax.swing.JFrame {

    Scores record=new Scores();
    report rept=new report();
    ClassResults cresult=new ClassResults();
    performance perform=new performance();
    public Exam() {
        initComponents();setDefaultLookAndFeelDecorated(true);
         setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        scores = new javax.swing.JPanel();
        transcr = new javax.swing.JPanel();
        CLASS = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jTabbedPane1.addTab("RECORD SCORED", scores);

        transcr.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                transcrComponentShown(evt);
            }
        });
        transcr.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                transcrFocusGained(evt);
            }
        });
        jTabbedPane1.addTab("PRINT TRANSCRIPTS", transcr);
        jTabbedPane1.addTab("CLASS RESULTS", CLASS);
        jTabbedPane1.addTab("PERFORMANCE REPORTS", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
  
    }//GEN-LAST:event_formWindowActivated

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        scores.add(record);scores.revalidate();
          transcr.add(rept);transcr.revalidate();
          jPanel2.add(perform);jPanel2.revalidate();
          CLASS.add(cresult);CLASS.revalidate();
          
    }//GEN-LAST:event_formWindowOpened

    private void transcrComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_transcrComponentShown

    }//GEN-LAST:event_transcrComponentShown

    private void transcrFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_transcrFocusGained

    }//GEN-LAST:event_transcrFocusGained

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Exam().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CLASS;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel scores;
    private javax.swing.JPanel transcr;
    // End of variables declaration//GEN-END:variables
}
