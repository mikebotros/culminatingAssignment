/*
 * Michael Botros
 * January 28th, 2020
 * This program allows any user to encrypt a message using a key with an XOR encryption method. The software also has a decryption menu where the user can decrypt an encrypted message if they have the key
 */

package encryption;

/**
 *
 * @author MiBot3117
 */
public class frmEncryption extends javax.swing.JFrame {

    /**
     * Creates new form frmEncryption
     */
    public frmEncryption() {
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

        lblTitle = new javax.swing.JLabel();
        lblTitle2 = new javax.swing.JLabel();
        lblInstructionEncrypt = new javax.swing.JLabel();
        btnEncrypt = new javax.swing.JButton();
        lblEncryptResult = new javax.swing.JLabel();
        btnToDecryption = new javax.swing.JButton();
        btnGenerateKey = new javax.swing.JButton();
        lblKeyInstructions = new javax.swing.JLabel();
        txtKey = new javax.swing.JTextField();
        lblKeyEntry = new javax.swing.JLabel();
        scrMessage = new javax.swing.JScrollPane();
        txtMessage = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtEncrypted = new javax.swing.JTextArea();
        lblTip = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitle.setFont(new java.awt.Font("TI-92p Mini Sans", 0, 14)); // NOI18N
        lblTitle.setText("---TOP SECRET---");

        lblTitle2.setFont(new java.awt.Font("Ti83pc", 0, 14)); // NOI18N
        lblTitle2.setText("---ENCRYPTER/DECRYPTER SOFTWARE---");

        lblInstructionEncrypt.setFont(new java.awt.Font("Ti73pc", 0, 11)); // NOI18N
        lblInstructionEncrypt.setText("Enter a decrypted message to encrypt it");

        btnEncrypt.setFont(new java.awt.Font("Ti83pc", 0, 11)); // NOI18N
        btnEncrypt.setForeground(new java.awt.Color(204, 0, 0));
        btnEncrypt.setText("ENCRYPT");
        btnEncrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncryptActionPerformed(evt);
            }
        });

        lblEncryptResult.setFont(new java.awt.Font("Ti83Pluspc", 0, 11)); // NOI18N

        btnToDecryption.setText("To Decryption--->");
        btnToDecryption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnToDecryptionActionPerformed(evt);
            }
        });

        btnGenerateKey.setText("Generate Key");
        btnGenerateKey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateKeyActionPerformed(evt);
            }
        });

        lblKeyInstructions.setText("Your key will appear here...");

        txtKey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKeyActionPerformed(evt);
            }
        });

        lblKeyEntry.setText("Enter your key here:");

        txtMessage.setColumns(20);
        txtMessage.setLineWrap(true);
        txtMessage.setRows(5);
        scrMessage.setViewportView(txtMessage);

        txtEncrypted.setColumns(20);
        txtEncrypted.setLineWrap(true);
        txtEncrypted.setRows(5);
        jScrollPane1.setViewportView(txtEncrypted);

        lblTip.setText("(A number is preferable)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(lblInstructionEncrypt))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(lblTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGenerateKey)
                            .addComponent(lblKeyEntry))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblKeyInstructions, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtKey, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 17, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnToDecryption)
                                .addGap(40, 40, 40))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblTitle2)
                                .addGap(103, 103, 103))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblTip)
                                .addGap(18, 18, 18)
                                .addComponent(btnEncrypt)
                                .addGap(221, 221, 221))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblEncryptResult, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(scrMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTitle2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblInstructionEncrypt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblEncryptResult, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGenerateKey)
                    .addComponent(lblKeyInstructions))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtKey, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblKeyEntry))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEncrypt)
                    .addComponent(lblTip))
                .addGap(7, 7, 7)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(btnToDecryption)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEncryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncryptActionPerformed
       
        //Grab the users message as a string
       String message = txtMessage.getText();
       //String messageBinary = strToBinary(message);
       
       //String messageBinaryEncrypted = "";
       //declaring end message string
       String messageEncrypted = "";
       
       //Grab the key from the user as a string
       String key = txtKey.getText();
       //String keyBinary = strToBinary(message);
       
       //keyBinary = lengthenKey(keyBinary, messageBinary);
       
       //convert the message using the key using the convert method
       convert(message, key);
       
       /*
       for (int i = 0; i<messageBinary.length(); i++){
        int binValue = messageBinary.charAt(i) ^ keyBinary.charAt(i);
        lblEncrypted.setText(binValue + "");
        if(binValue == 1){
            messageBinaryEncrypted += "1";
        } else {
            messageBinaryEncrypted += "0";
        }
       }
       */
        
        /*
        for(int index = 0; index < messageBinaryEncrypted.length(); index+=7) {
            String temp = messageBinaryEncrypted.substring(index, index+7);
            int num = Integer.parseInt(temp,2);
            char letter = (char) num;
            messageEncrypted += letter;
            //messageEncrypted = messageEncrypted + letter;
        }
       */
       
        txtEncrypted.setText(messageEncrypted);
               
    }//GEN-LAST:event_btnEncryptActionPerformed

    private void btnToDecryptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnToDecryptionActionPerformed
        this.setVisible(false);
        new frmDecryption().setVisible(true);
    }//GEN-LAST:event_btnToDecryptionActionPerformed

    private void txtKeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKeyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKeyActionPerformed

    private void btnGenerateKeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateKeyActionPerformed
       
       final int MAX = 899999999;
       final int MIN = 100000000;
        
        randomKeyGenerator(MIN, MAX);
    }//GEN-LAST:event_btnGenerateKeyActionPerformed

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
            java.util.logging.Logger.getLogger(frmEncryption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmEncryption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmEncryption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmEncryption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmEncryption().setVisible(true);
            }
        });
    }
    static String reverse(String input)  
    { 
        char[] a = input.toCharArray(); 
        int l, r = 0; 
        r = a.length - 1; 
  
        for (l = 0; l < r; l++, r--) 
        { 
            // Swap values of l and r  
            char temp = a[l]; 
            a[l] = a[r]; 
            a[r] = temp; 
        } 
        return String.valueOf(a); 
    } 
    
    public void convert(String message, String key)
    {
        StringBuilder sb = new StringBuilder();
        String result = "";
        
        for(int i = 0; i < message.length(); i++)
        {
            sb.append((char)(message.charAt(i) ^ key.charAt(i % key.length())));
            result = sb.toString();
        }
        txtEncrypted.setText(result);
    }
    
    public String strToBinary(String message) 
    { 
        int length = message.length(); 
        String binary = "";
        
        for (int i = 0; i < length; i++)  
        { 
            // converting each char to an ASCII value 
            int value = Integer.valueOf(message.charAt(i)); 
  
            // Converting ASCII value to binary by modulus dividing by 2 and checking the remainder to determine the value of the bit, then dividing by two until you get to 0. The result is the reverse binary string of the value
            while (value > 0)  
            { 
                if (value % 2 == 1)
                { 
                    binary += '1'; 
                } 
                else
                    binary += '0'; 
                value = value/2;
            } 
            binary = reverse(binary); 
            
        } 
        return(binary);
    }
    
    public String lengthenKey(String key, String message){
        
        for(int i = 0; i>=((message.length()/key.length())+1); i++)
        {
            String temporary = key;
            key = temporary + key;
        }
        return(key);
    }
    
    public void randomKeyGenerator(int n1, int n2) {
             
        int randomNumber = (int)Math.round(Math.random()*n2+n1);
        lblKeyInstructions.setText(String.valueOf(randomNumber));
        /*
        String randomKey = "";      
        
        for (int i = 0; i<n2; i++) {
        int randomNumber = (int)Math.round(Math.random()*n1+97);
        randomKey += Character.toString((char)randomNumber);
        lblKeyInstructions.setText(randomKey);
        }
        */
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEncrypt;
    private javax.swing.JButton btnGenerateKey;
    private javax.swing.JButton btnToDecryption;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEncryptResult;
    private javax.swing.JLabel lblInstructionEncrypt;
    private javax.swing.JLabel lblKeyEntry;
    private javax.swing.JLabel lblKeyInstructions;
    private javax.swing.JLabel lblTip;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTitle2;
    private javax.swing.JScrollPane scrMessage;
    private javax.swing.JTextArea txtEncrypted;
    private javax.swing.JTextField txtKey;
    private javax.swing.JTextArea txtMessage;
    // End of variables declaration//GEN-END:variables
}
