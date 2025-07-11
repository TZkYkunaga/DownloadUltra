/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/Application.java to edit this template
 */
package Server;


import java.net.Socket;
import java.io.IOException;
import javax.swing.UIManager;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLServerSocketFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.KeyManagerFactory;
import java.security.KeyStore;
import java.security.KeyStoreException;
/**
 *
 * @author Admin
 */
public class Server extends javax.swing.JFrame {

    // Biến instance cho baseDir
    // Lấy baseDir theo vị trí file class/jar, fallback về user.dir nếu lỗi
    private final String baseDir;
    {
        String tmpDir;
        try {
            tmpDir = new java.io.File(Server.class.getProtectionDomain().getCodeSource().getLocation().toURI()).getParentFile().getParentFile().getAbsolutePath();
        } catch (Exception e) {
            tmpDir = System.getProperty("user.dir");
        }
        baseDir = tmpDir;
    }

    /**
     * Creates new form Server
     */
    public Server() {
        initComponents();
        java.io.File assetsDir = new java.io.File(baseDir, "src/Server/Assets");
        if (assetsDir.exists() && assetsDir.isDirectory()) {
            String[] files = assetsDir.list();
            if (files != null) {
                javax.swing.DefaultListModel<String> model = new javax.swing.DefaultListModel<>();
                for (String file : files) {
                    model.addElement(file);
                }
                jItemList.setModel(model); // Hiển thị lên jItemList
            }
        } else {
            jItemList.setModel(new javax.swing.DefaultListModel<>()); // Xóa danh sách nếu không có file
        }
        new javax.swing.Timer(5000, e -> updateAssetList()).start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPortField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPortButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jNoficationArea = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jAddButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jItemList = new javax.swing.JList<>();
        jRemoveButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jConnectionList = new javax.swing.JList<>();
        jDisconnectClientButton = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        exitMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentsMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("Máy Chủ");

        jPortField.setText("2222");
        jPortField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPortFieldActionPerformed(evt);
            }
        });

        jLabel2.setText("Enter port");

        jPortButton.setText("Connect");
        jPortButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPortButtonActionPerformed(evt);
            }
        });

        jNoficationArea.setColumns(20);
        jNoficationArea.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jNoficationArea.setRows(5);
        jScrollPane1.setViewportView(jNoficationArea);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("List:");

        jAddButton.setText("Add");
        jAddButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAddButtonActionPerformed(evt);
            }
        });

        jScrollPane3.setViewportView(jItemList);

        jRemoveButton.setText("Remove");
        jRemoveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRemoveButtonActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(jConnectionList);

        jDisconnectClientButton.setText("Disconnect Client");
        jDisconnectClientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDisconnectClientButtonActionPerformed(evt);
            }
        });

        fileMenu.setMnemonic('f');
        fileMenu.setText("File");

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane3)
                                .addGap(31, 31, 31))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jRemoveButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jAddButton)
                                .addGap(32, 32, 32))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPortField, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPortButton)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addComponent(jDisconnectClientButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jPortField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(jPortButton)))
                            .addComponent(jDisconnectClientButton))
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jRemoveButton)
                            .addComponent(jAddButton))
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void updateAssetList() {
        java.io.File assetsDir = new java.io.File(baseDir, "src/Server/Assets");
        String[] files = assetsDir.list();
        javax.swing.DefaultListModel<String> model = new javax.swing.DefaultListModel<>();
        if (files != null) {
            for (String file : files) {
                model.addElement(file);
            }
        }
        jItemList.setModel(model);
    }

    private void jPortFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPortFieldActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jPortFieldActionPerformed

    private void jPortButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPortButtonActionPerformed
        // TODO add your handling code here:
        String portText = jPortField.getText();
        try {
            int port = Integer.parseInt(portText);

            // --- TLS/SSL ServerSocket ---
            String keyStorePath = baseDir + java.io.File.separator + "src" + java.io.File.separator + "Server" + java.io.File.separator + "serverkeystore.jks";
            String keyStorePassword = "password"; // đổi nếu bạn dùng password khác

            KeyStore ks;
            try {
                ks = KeyStore.getInstance("JKS");
            } catch (KeyStoreException e) {
                jNoficationArea.append("KeyStore error: " + e.getMessage() + "\n");
                return;
            }
            java.io.File ksFile = new java.io.File(keyStorePath);
            if (!ksFile.exists()) {
                jNoficationArea.append("Keystore file not found: " + keyStorePath + "\n");
                return;
            }
            try (java.io.FileInputStream fis = new java.io.FileInputStream(ksFile)) {
                ks.load(fis, keyStorePassword.toCharArray());
            } catch (Exception e) {
                jNoficationArea.append("Cannot load keystore: " + e.getMessage() + "\n");
                return;
            }
            KeyManagerFactory kmf;
            try {
                kmf = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
                kmf.init(ks, keyStorePassword.toCharArray());
            } catch (Exception e) {
                jNoficationArea.append("Cannot init KeyManagerFactory: " + e.getMessage() + "\n");
                return;
            }
            SSLContext ctx;
            try {
                ctx = SSLContext.getInstance("TLS");
                ctx.init(kmf.getKeyManagers(), null, null);
            } catch (Exception e) {
                jNoficationArea.append("SSLContext error: " + e.getMessage() + "\n");
                return;
            }

            SSLServerSocketFactory sslServerSocketFactory = ctx.getServerSocketFactory();
            SSLServerSocket serverSocket = (SSLServerSocket) sslServerSocketFactory.createServerSocket(port);

            jNoficationArea.append("Server is listening on port: " + port + " (TLS)\n");

            new Thread(() -> {
                while (true) {
                    try {
                        Socket clientSocket = serverSocket.accept();
                        ClientInfo clientInfo = new ClientInfo(clientSocket);
                        connectedClients.add(clientInfo);
                        updateConnectionList();
                        String clientIP = clientSocket.getInetAddress().getHostAddress();
                        jNoficationArea.append("Client connected: " + clientIP + "\n");

                        // Xử lý mỗi client ở thread riêng
                        new Thread(() -> {
                            try {
                                java.io.InputStream in = clientSocket.getInputStream();
                                java.io.OutputStream out = clientSocket.getOutputStream();

                                // Đọc thử xem client gửi gì (nếu gửi tên file thì gửi file, nếu không thì gửi danh sách file)
                                clientSocket.setSoTimeout(200);
                                byte[] buf = new byte[1024];
                                int len = -1;
                                try {
                                    len = in.read(buf);
                                } catch (Exception e) { /* timeout */ }

                                if (len <= 0) {
                                    // Không gửi gì, gửi danh sách file
                                    java.io.File assetsDir = new java.io.File(baseDir, "src/Server/Assets");
                                    String[] files = assetsDir.list();
                                    StringBuilder sb = new StringBuilder();
                                    if (files != null) {
                                        for (String file : files) {
                                            sb.append(file).append("\n");
                                        }
                                    }
                                    out.write(sb.toString().getBytes());
                                    out.flush();
                                } else {
                                    // Nhận yêu cầu: có thể là "filename" hoặc "filename|start|end"
                                    String request = new String(buf, 0, len).trim();
                                    String[] parts = request.split("\\|");
                                    String fileName = parts[0];
                                    java.io.File file = new java.io.File(baseDir + java.io.File.separator + "src/Server/Assets", fileName);

                                    if (file.exists()) {
                                        long fileLength = file.length();
                                        long start = 0;
                                        long end = fileLength - 1;
                                        if (parts.length == 3) {
                                            try {
                                                start = Long.parseLong(parts[1]);
                                                end = Long.parseLong(parts[2]);
                                                if (start < 0) start = 0;
                                                if (end >= fileLength) end = fileLength - 1;
                                            } catch (Exception e) {
                                                // Nếu lỗi, giữ mặc định start=0, end=fileLength-1
                                            }
                                        }
                                        // Gửi kích thước phần sẽ gửi (end - start + 1)
                                        out.write(((end - start + 1) + "\n").getBytes());
                                        out.flush();
                                        // Gửi dữ liệu từ byte start đến end
                                        try (java.io.RandomAccessFile raf = new java.io.RandomAccessFile(file, "r")) {
                                            raf.seek(start);
                                            byte[] buffer = new byte[32 * 1024]; // 32KB buffer cho file lớn
                                            long bytesToSend = end - start + 1;
                                            while (bytesToSend > 0) {
                                                int bytesRead = raf.read(buffer, 0, (int)Math.min(buffer.length, bytesToSend));
                                                if (bytesRead == -1) break;
                                                out.write(buffer, 0, bytesRead);
                                                bytesToSend -= bytesRead;
                                            }
                                            out.flush(); // Đảm bảo flush hết dữ liệu
                                        } catch (Exception ex) {
                                            // Log lỗi gửi file lớn
                                            jNoficationArea.append("Lỗi khi gửi file: " + fileName + " - " + ex.getMessage() + "\n");
                                        }
                                    } else {
                                        // Gửi -1 nếu file không tồn tại
                                        out.write("-1\n".getBytes());
                                        out.flush();
                                    }

                                }

                                // Giữ kết nối mở để có thể gửi REFRESH về sau
                                // Không đóng out/in/clientSocket ở đây nữa

                                // Lắng nghe client đóng kết nối
                                while (true) {
                                    int test = in.read();
                                    if (test == -1) break;
                                }
                            } catch (Exception ex) {
                                // Xử lý lỗi nếu cần
                            } finally {
                                try { clientSocket.close(); } catch (Exception ex) {}
                                connectedClients.remove(clientInfo);
                                updateConnectionList();
                            }
                        }).start();
                    } catch (IOException ex) {
                        // Xử lý lỗi nếu cần
                    }
                }
            }).start();

        } catch (NumberFormatException ex) {
            jNoficationArea.append("Invalid port number!\n");
        } catch (IOException ex) {
            jNoficationArea.append("Could not listen on port: " + portText + "\n");
        }
    }//GEN-LAST:event_jPortButtonActionPerformed

    private void jAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAddButtonActionPerformed
        // TODO add your handling code here:
        javax.swing.JFileChooser chooser = new javax.swing.JFileChooser();
        int result = chooser.showOpenDialog(this);
        if (result == javax.swing.JFileChooser.APPROVE_OPTION) {
            java.io.File selectedFile = chooser.getSelectedFile();
            java.io.File destFile = new java.io.File(baseDir + java.io.File.separator + "src/Server/Assets", selectedFile.getName());
            try (java.io.FileInputStream fis = new java.io.FileInputStream(selectedFile);
                java.io.FileOutputStream fos = new java.io.FileOutputStream(destFile)) {
                byte[] buffer = new byte[4096];
                int bytesRead;
                while ((bytesRead = fis.read(buffer)) != -1) {
                    fos.write(buffer, 0, bytesRead);
                }
                jNoficationArea.append("Đã thêm file: " + selectedFile.getName() + "\n");
                updateAssetList();
                notifyClientsRefresh(); // Đảm bảo dòng này được gọi ở đây
            } catch (Exception ex) {
                jNoficationArea.append("Không thể thêm file: " + ex.getMessage() + "\n");
            }
        }
    }//GEN-LAST:event_jAddButtonActionPerformed

    private void jRemoveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRemoveButtonActionPerformed
        java.util.List<String> selectedFiles = jItemList.getSelectedValuesList();
        if (selectedFiles == null || selectedFiles.isEmpty()) {
            jNoficationArea.append("Vui lòng chọn file để xóa!\n");
            return;
        }
        int deleted = 0;
        for (String selectedFile : selectedFiles) {
            java.io.File file = new java.io.File(baseDir + java.io.File.separator + "src/Server/Assets", selectedFile);
            if (file.exists() && file.delete()) {
                deleted++;
                jNoficationArea.append("Đã xóa file: " + selectedFile + "\n");
            } else {
                jNoficationArea.append("Không thể xóa file: " + selectedFile + "\n");
            }
        }
        if (deleted > 0) {
            updateAssetList();
            notifyClientsRefresh(); // Thông báo client refresh
        }
    }//GEN-LAST:event_jRemoveButtonActionPerformed

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void jDisconnectClientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDisconnectClientButtonActionPerformed
        // Ngắt kết nối client được chọn trong danh sách
        Object selectedObj = jConnectionList.getSelectedValue();
        if (selectedObj == null) {
            jNoficationArea.append("Vui lòng chọn client để ngắt kết nối!\n");
            return;
        }
        // Nếu jConnectionList là JList<Object> hoặc raw type, cần ép kiểu về ClientInfo
        ClientInfo selected;
        try {
            selected = (ClientInfo) selectedObj;
        } catch (Exception e) {
            jNoficationArea.append("Không thể xác định client!\n");
            return;
        }
        try {
            selected.socket.close();
            connectedClients.remove(selected);
            updateConnectionList();
            jNoficationArea.append("Đã ngắt kết nối client: " + selected.display + "\n");
        } catch (Exception e) {
            jNoficationArea.append("Không thể ngắt kết nối client: " + e.getMessage() + "\n");
        }
    }//GEN-LAST:event_jDisconnectClientButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try{
            UIManager.setLookAndFeel(
                UIManager.getSystemLookAndFeelClassName());
        }catch(Exception e){
            
        }
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Server().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem contentsMenuItem;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JButton jAddButton;
    private javax.swing.JList<String> jConnectionList;
    private javax.swing.JButton jDisconnectClientButton;
    private javax.swing.JList<String> jItemList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextArea jNoficationArea;
    private javax.swing.JButton jPortButton;
    private javax.swing.JTextField jPortField;
    private javax.swing.JButton jRemoveButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

    // Thêm lớp lưu thông tin client
    private static class ClientInfo {
        final Socket socket;
        final String display;
        ClientInfo(Socket socket) {
            this.socket = socket;
            this.display = socket.getInetAddress().getHostAddress() + ":" + socket.getPort();
        }
        @Override
        public String toString() { return display; }
    }

    // Thay đổi danh sách lưu client
    private final CopyOnWriteArrayList<ClientInfo> connectedClients = new CopyOnWriteArrayList<>();

    // Cập nhật danh sách client lên jConnectionList
    private void updateConnectionList() {
        // Đảm bảo jConnectionList khai báo là JList<Object> hoặc JList (raw type) để setModel với ClientInfo
        javax.swing.DefaultListModel<ClientInfo> model = new javax.swing.DefaultListModel<>();
        for (ClientInfo ci : connectedClients) {
            model.addElement(ci);
        }
        jConnectionList.setModel((javax.swing.ListModel) model); // Ép kiểu về ListModel để tránh lỗi generic
    }

    // Sửa notifyClientsRefresh cho ClientInfo
    private void notifyClientsRefresh() {
        for (ClientInfo client : connectedClients) {
            try {
                java.io.OutputStream out = client.socket.getOutputStream();
                out.write("REFRESH\n".getBytes());
                out.flush();
            } catch (Exception e) {
                try { client.socket.close(); } catch (Exception ex) {}
                connectedClients.remove(client);
                updateConnectionList();
            }
        }
    }
}