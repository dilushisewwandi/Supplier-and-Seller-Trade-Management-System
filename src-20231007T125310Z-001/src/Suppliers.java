
import java.io.File;
import java.io.FileWriter;
import java.util.Iterator;
//import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.LinkedList;
import java.util.Queue;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author User
 */
public class Suppliers extends javax.swing.JFrame {
 
    Queue<Supplier> allSuppliers = new LinkedList<>();
    
    public Suppliers() {
        initComponents();
        readAllData();
        displayAllData(); 
    }
    
    void displayAllData() {
        suppliertext.setText("");
        for(Supplier supplier : allSuppliers) {
            suppliertext.append(supplier.getId() + "   " + supplier.getAge() + "      " + supplier.getSupname() + "      " + supplier.getGender() + "      " + supplier.getAddress() + "      " + supplier.getContactnum() + "      " + supplier.getCompanyname());
        }
    }

    
    void readAllData() {
        try {
            File supFile = new File("supplierdata.txt"); 
            Scanner scanner = new Scanner(supFile);
         
            while(scanner.hasNextLine()) {
                String data = scanner.nextLine();
                String[] currentdata = data.split(";");
                Supplier supplier = new Supplier();
                supplier.setId(Integer.parseInt(currentdata[0]));
                supplier.setAge(Integer.parseInt(currentdata[1]));
                supplier.setSupname(currentdata[2]);
                supplier.setGender(currentdata[3]);
                supplier.setAddress(currentdata[4]);
                supplier.setContactnum(currentdata[5]);
                supplier.setCompanyname(currentdata[6]);
                allSuppliers.offer(supplier); // add to queue
            }
         
            scanner.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        supid = new javax.swing.JTextField();
        supname = new javax.swing.JTextField();
        supage = new javax.swing.JTextField();
        supgender = new javax.swing.JTextField();
        supadd = new javax.swing.JTextField();
        supcontact = new javax.swing.JTextField();
        supcompany = new javax.swing.JTextField();
        save = new javax.swing.JButton();
        search = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        suppliertext = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Supplier & Seller Trade Management System");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 255, 102));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-supplier-100.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Suppliers");
        jLabel2.addHierarchyBoundsListener(new java.awt.event.HierarchyBoundsListener() {
            public void ancestorMoved(java.awt.event.HierarchyEvent evt) {
            }
            public void ancestorResized(java.awt.event.HierarchyEvent evt) {
                jLabel2AncestorResized(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap(575, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 810, -1));

        jPanel2.setBackground(new java.awt.Color(153, 255, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Supplier Info");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 6, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("ID");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 99, 46, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Name");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 124, 46, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Age");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 152, 37, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Gender");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 46, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Address");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 208, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Conatact");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 236, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Company name");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 264, -1, -1));
        jPanel2.add(supid, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 93, 200, -1));

        supname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supnameActionPerformed(evt);
            }
        });
        jPanel2.add(supname, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 121, 200, -1));
        jPanel2.add(supage, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 149, 200, -1));
        jPanel2.add(supgender, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 177, 200, -1));
        jPanel2.add(supadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 205, 200, -1));
        jPanel2.add(supcontact, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 233, 200, -1));
        jPanel2.add(supcompany, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 261, 200, -1));

        save.setBackground(new java.awt.Color(153, 255, 153));
        save.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        save.setText("save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        jPanel2.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 70, -1));

        search.setBackground(new java.awt.Color(153, 255, 153));
        search.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        search.setText("search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel2.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, -1, -1));

        suppliertext.setColumns(20);
        suppliertext.setRows(5);
        jScrollPane1.setViewportView(suppliertext);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(388, 93, 388, 226));

        jButton1.setBackground(new java.awt.Color(153, 255, 153));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, -1, -1));

        jButton2.setBackground(new java.awt.Color(153, 255, 153));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 820, 380));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2AncestorResized(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_jLabel2AncestorResized
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2AncestorResized

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
       
        if(supid.getText().equals("")||supname.getText().equals("")||supage.getText().equals("")||supgender.getText().equals("")||supadd.getText().equals("")||supcontact.getText().equals("")||supcompany.getText().equals(""))
        {
           JOptionPane.showMessageDialog(null, "All fileds must be filled");
        }
        else if(checkID())
        {
             JOptionPane.showMessageDialog(null, "ID or contact number alteady exist");
        }
        else
        {
           try{
           Supplier supplier=new Supplier();  
           supplier.setId(Integer.parseInt(supid.getText()));
           supplier.setAge(Integer.parseInt(supage.getText()));
           supplier.setSupname(supname.getText());
           supplier.setGender(supgender.getText());
           supplier.setAddress(supadd.getText());
           supplier.setContactnum(supcontact.getText());
           supplier.setCompanyname(supcompany.getText());
           allSuppliers.add(supplier);
           
           supid.setText("");
            supage.setText("");
             supname.setText("");
              supgender.setText("");
               supadd.setText("");
                supcontact.setText("");
                 supcompany.setText("");
                 displayAllData();
                 saveAllData();
           
           }
           
           catch(Exception e)
           {
               JOptionPane.showMessageDialog(null, "ID and age must be Integer"); 
           }
        }
    }//GEN-LAST:event_saveActionPerformed

 void saveAllData() {
    try {
        FileWriter filewriter = new FileWriter("supplierdata.txt"); 
        for(Supplier supplier : allSuppliers) {
            filewriter.write(supplier.getId() + ";" + supplier.getAge() + ";" + supplier.getSupname() + ";" + supplier.getGender() + ";" + supplier.getAddress() + ";" + supplier.getContactnum() + ";" + supplier.getCompanyname() + "\n");
             filewriter.write(supplier + "\n");
        }
        
        filewriter.close();
    } catch(Exception e) {
        e.printStackTrace();
    }
}
   
public void deleteSupplier(int id) {
    Iterator<Supplier> iterator = allSuppliers.iterator();
    while (iterator.hasNext()) {
        Supplier supplier = iterator.next();
        if (supplier.getId() == id) {
            iterator.remove();
            saveAllData(); // update the data file
            return; // exit the method after deleting the first matching supplier
        }
    }
    // if no supplier with the given ID was found
    JOptionPane.showMessageDialog(null, "No supplier with ID " + id + " found.");
} 
    
    
   boolean checkID() {
    Queue<Supplier> suppliersQueue = new LinkedList<>(allSuppliers);
    Supplier supplier;

    while ((supplier = suppliersQueue.poll()) != null) {
        if (supid.getText().equals(String.valueOf(supplier.getId())) || 
            supcontact.getText().equals(supplier.getContactnum())) {
            return true;
        }
    }
    return false;
}
    
    private void supnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_supnameActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        if(supid.getText() == null || supid.getText().equals("")) {
            return;
        }
        
        Supplier foundSupplier = searchSupplier(supid.getText());
        if(foundSupplier != null) {
            supid.setText(foundSupplier.getId() + "");
            supname.setText(foundSupplier.getSupname());
            supage.setText(foundSupplier.getAge() + "");
            supgender.setText(foundSupplier.getGender());
            supadd.setText(foundSupplier.getAddress());
            supcontact.setText(foundSupplier.getContactnum());
            supcompany.setText(foundSupplier.getCompanyname());
        } else {
            JOptionPane.showMessageDialog(null, "Supplier not found.");
        }
    }
    
private Supplier searchSupplier(String input) {
        Queue<Supplier> queue = new LinkedList<>(allSuppliers);
        while(!queue.isEmpty()) {
            Supplier supplier = queue.remove();
            if(supplier.getId() == Integer.parseInt(input) || supplier.getContactnum().equals(input)) {
                return supplier;
            }
        }
        return null;
    
//put the readalldata here
    

    }//GEN-LAST:event_searchActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
       mainpage m1 =new mainpage();
       m1.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
    if (supid.getText()!= null) {
        try {
            int id = Integer.parseInt(supid.getText());
            deleteSupplier(id);
            displayAllData();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid ID format.");
        }
    }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Suppliers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Suppliers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Suppliers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Suppliers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Suppliers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton save;
    private javax.swing.JToggleButton search;
    private javax.swing.JTextField supadd;
    private javax.swing.JTextField supage;
    private javax.swing.JTextField supcompany;
    private javax.swing.JTextField supcontact;
    private javax.swing.JTextField supgender;
    private javax.swing.JTextField supid;
    private javax.swing.JTextField supname;
    private javax.swing.JTextArea suppliertext;
    // End of variables declaration//GEN-END:variables
}
