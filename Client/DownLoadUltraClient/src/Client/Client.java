/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/Application.java to edit this template
 */
package Client;
import java.net.Socket;
import java.io.IOException;
import javax.swing.UIManager;
/**
 *
 * @author Admin
 */
public class Client extends javax.swing.JFrame {

    /**
     * Creates new form Client
     * 
     */
    private java.net.Socket socket;
    public Client() {
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

        jPortField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jConnectButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jNoficationArea = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jServerIPField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jDisconnectButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jItemList = new javax.swing.JList<>();
        jDownloadButton = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentsMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPortField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPortFieldActionPerformed(evt);
            }
        });

        jLabel2.setText("Enter port :");

        jConnectButton.setText("Connect");
        jConnectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConnectButtonActionPerformed(evt);
            }
        });

        jNoficationArea.setColumns(20);
        jNoficationArea.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jNoficationArea.setRows(5);
        jScrollPane1.setViewportView(jNoficationArea);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("List:");

        jLabel1.setText("Client");

        jServerIPField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jServerIPFieldActionPerformed(evt);
            }
        });

        jLabel4.setText("Enter Server IP :");

        jDisconnectButton.setText("Disconnect");
        jDisconnectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDisconnectButtonActionPerformed(evt);
            }
        });

        jItemList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Nothing !" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jItemList);

        jDownloadButton.setText("Download");
        jDownloadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDownloadButtonActionPerformed(evt);
            }
        });

        fileMenu.setMnemonic('f');
        fileMenu.setText("File");

        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Open");
        fileMenu.add(openMenuItem);

        saveMenuItem.setMnemonic('s');
        saveMenuItem.setText("Save");
        fileMenu.add(saveMenuItem);

        saveAsMenuItem.setMnemonic('a');
        saveAsMenuItem.setText("Save As ...");
        saveAsMenuItem.setDisplayedMnemonicIndex(5);
        fileMenu.add(saveAsMenuItem);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Edit");

        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Cut");
        editMenu.add(cutMenuItem);

        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Copy");
        editMenu.add(copyMenuItem);

        pasteMenuItem.setMnemonic('p');
        pasteMenuItem.setText("Paste");
        editMenu.add(pasteMenuItem);

        deleteMenuItem.setMnemonic('d');
        deleteMenuItem.setText("Delete");
        editMenu.add(deleteMenuItem);

        menuBar.add(editMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");

        contentsMenuItem.setMnemonic('c');
        contentsMenuItem.setText("Contents");
        helpMenu.add(contentsMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jServerIPField))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPortField, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jDisconnectButton)
                                    .addComponent(jConnectButton)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(134, 134, 134)
                                .addComponent(jDownloadButton)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jPortField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jConnectButton))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jServerIPField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jDisconnectButton))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jDownloadButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void jPortFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPortFieldActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jPortFieldActionPerformed

    private void jConnectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConnectButtonActionPerformed
        // TODO add your handling code here:
        String portText = jPortField.getText();
        String ipText = jServerIPField.getText();
        try {
            int port = Integer.parseInt(portText);
            socket = new java.net.Socket(ipText, port);
            jNoficationArea.append("Connected to "+ ipText+ " : " + port + "\n");

            // Nhận danh sách file từ server
            java.io.InputStream is = socket.getInputStream();
            java.util.Scanner scanner = new java.util.Scanner(is).useDelimiter("\\A");
            String fileList = scanner.hasNext() ? scanner.next() : "";

            // Hiển thị lên jItemList thay vì jItemArea
            javax.swing.DefaultListModel<String> model = new javax.swing.DefaultListModel<>();
            for (String file : fileList.split("\\r?\\n")) {
                if (!file.trim().isEmpty()) {
                    model.addElement(file);
                }
            }
            jItemList.setModel(model);

            // Nếu vẫn muốn hiển thị text, có thể giữ lại dòng này:
            // jItemArea.setText(fileList);

        } catch (NumberFormatException ex) {
            jNoficationArea.append("Invalid port number!\n");
        } catch (java.io.IOException ex) {
            jNoficationArea.append("Could not connect to " + ipText + ":" + portText + "\n");
        }
    }//GEN-LAST:event_jConnectButtonActionPerformed

    private void jServerIPFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jServerIPFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jServerIPFieldActionPerformed

    private void jDisconnectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDisconnectButtonActionPerformed
        // TODO add your handling code here:
        if (socket != null && !socket.isClosed()) {
            try {
                socket.close();
                jNoficationArea.append("Disconnected from server.\n");
            } catch (java.io.IOException ex) {
                jNoficationArea.append("Error when disconnecting.\n");
            }
        } else {
            jNoficationArea.append("No connection to disconnect.\n");
        }
    }//GEN-LAST:event_jDisconnectButtonActionPerformed

    private void jDownloadButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:private void jDownloadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDownloadButtonActionPerformed
        // Lấy file được chọn
           String selectedFile = jItemList.getSelectedValue();
    if (selectedFile == null) {
        jNoficationArea.append("Please select a file to download.\n");
        return;
    }

    javax.swing.JFileChooser chooser = new javax.swing.JFileChooser();
    chooser.setFileSelectionMode(javax.swing.JFileChooser.DIRECTORIES_ONLY);
    int result = chooser.showSaveDialog(this);
    if (result == javax.swing.JFileChooser.APPROVE_OPTION) {
        java.io.File selectedDir = chooser.getSelectedFile();
        java.io.File saveFile = new java.io.File(selectedDir, selectedFile);

            try {
                // Gửi yêu cầu tên file tới server (tạo kết nối mới)
                String ipText = jServerIPField.getText();
                int port = Integer.parseInt(jPortField.getText());
                Socket downloadSocket = new Socket(ipText, port);

                // Gửi tên file
                java.io.OutputStream out = downloadSocket.getOutputStream();
                out.write((selectedFile + "\n").getBytes());
                out.flush();

                // Nhận dữ liệu file
                java.io.InputStream in = downloadSocket.getInputStream();
                java.io.FileOutputStream fos = new java.io.FileOutputStream(saveFile);

                byte[] buffer = new byte[4096];
                int bytesRead;
                while ((bytesRead = in.read(buffer)) != -1) {
                    fos.write(buffer, 0, bytesRead);
                }

                fos.close();
                in.close();
                out.close();
                downloadSocket.close();

                jNoficationArea.append("Đã tải xong file: " + selectedFile + "\n");
            } catch (Exception ex) {
                jNoficationArea.append("Lỗi khi tải file: " + ex.getMessage() + "\n");
            }
        }
    }//GEN-LAST:event_jDownloadButtonActionPerformed


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
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        try{
            UIManager.setLookAndFeel(
                UIManager.getSystemLookAndFeelClassName());
        }catch(Exception e){
            
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Client().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem contentsMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JButton jConnectButton;
    private javax.swing.JButton jDisconnectButton;
    private javax.swing.JButton jDownloadButton;
    private javax.swing.JList<String> jItemList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextArea jNoficationArea;
    private javax.swing.JTextField jPortField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jServerIPField;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem pasteMenuItem;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    // End of variables declaration//GEN-END:variables

}
