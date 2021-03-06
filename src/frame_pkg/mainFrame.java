package frame_pkg;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author paulo
 */
public final class mainFrame extends javax.swing.JFrame {
    
    private static DefaultTableModel modelo;
    public static String arquivo;
    public static String caminho = "src/file_pkg/";
    public static String nome,email,telefone;
    public static File arq = new File("src/ranking.txt");
    public static ArrayList<String> lista = new ArrayList<>();
    
    public void listFilesForFolder(final File folder) 
    {
        String file_name;
        for (final File fileEntry : folder.listFiles()) 
        {
            if (fileEntry.isDirectory()) {
                listFilesForFolder(fileEntry);
            } else {
                file_name = fileEntry.getName();
                file_name = file_name.substring(0, file_name.length()-4);
                ComboBoxFiles.addItem(file_name);
            }
        }
    }
    
    void loadFiles()
    {
        try
        {
            final File folder = new File(caminho);
            listFilesForFolder(folder);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Erro: \n"+e, 
                    "Erro de arquivo", 
                    JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    /**
     * Creates new form mainFrame
     */
    public mainFrame() {
        initComponents();
        loadFiles();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelClose = new javax.swing.JLabel();
        ComboBoxFiles = new javax.swing.JComboBox<>();
        ButtonPlay = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaTable = new javax.swing.JTable();

        setTitle("Tela Principal");
        setName("mainFrame"); // NOI18N
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        LabelClose.setBackground(new java.awt.Color(204, 204, 255));
        LabelClose.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LabelClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_pkg/close-window-24.png"))); // NOI18N
        LabelClose.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        LabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelCloseMouseClicked(evt);
            }
        });

        ComboBoxFiles.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        ComboBoxFiles.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        ButtonPlay.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        ButtonPlay.setText("PLAY QUIZ");
        ButtonPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonPlayActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel1.setText("QUIZ PORTAS ABERTAS");

        tabelaTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "E-mail", "Telefone", "Língua", "Pontuação"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LabelClose))
                    .addComponent(ComboBoxFiles, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ButtonPlay, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelClose)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(ComboBoxFiles, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ButtonPlay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelCloseMouseClicked
        this.dispose();
    }//GEN-LAST:event_LabelCloseMouseClicked

    private void ButtonPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonPlayActionPerformed
        arquivo = (String) ComboBoxFiles.getSelectedItem();
        SignUpFrame signUp = new SignUpFrame();
        signUp.setVisible(true);
    }//GEN-LAST:event_ButtonPlayActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.modelo = (DefaultTableModel) tabelaTable.getModel();
        Load();
    }//GEN-LAST:event_formWindowOpened

    public static void setNome(String a)
    {
        nome = a;
    }
    
    public static void setEmail(String e)
    {
        email = e;
    }
    
    public static void setTelefone(String t)
    {
        telefone = t;
    }
    
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
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new mainFrame().setVisible(true);
        });
    }
    
    public static void saveInfo(int qnt_correto)
    {
        int correto = qnt_correto;
        Object[] items = {nome,email,telefone,arquivo,correto};
        modelo.addRow(items);
        String linha = nome+"|"+email+"|"+telefone+"|"+arquivo+"|"+correto;
        lista.add(linha);
        Save();
    }
    
    public static void Save() 
    {
        try
        {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(arq,true))) 
            {
                String linha = null;
                new PrintWriter(arq).close();
                for(int i=0;i<lista.size();i++)
                {
                    linha = lista.get(i);
                    writer.append(linha);
                    writer.newLine();
                }
                writer.close();
            } 
        }
        catch(Exception ex)
        {
             JOptionPane.showMessageDialog(null, ex, "Erro",JOptionPane.CANCEL_OPTION);
        }
    }
    
    public static void Load()
    {
        try
        {
            Scanner entrada = new Scanner(arq);
            while(entrada.hasNext())
            {
                String linha = entrada.nextLine();
                lista.add(linha); //Adiciona 
                String[] partes = linha.split("[|]");
                Object[] row = {partes[0],partes[1],partes[2],partes[3],partes[4]};
                modelo.addRow(row);
            }
        }
        catch(IOException ex)
        {
            JOptionPane.showMessageDialog(null, "Erro: \n"+ex, 
                    "Erro de arquivo", 
                    JOptionPane.ERROR_MESSAGE);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonPlay;
    private javax.swing.JComboBox<String> ComboBoxFiles;
    private javax.swing.JLabel LabelClose;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaTable;
    // End of variables declaration//GEN-END:variables
}
