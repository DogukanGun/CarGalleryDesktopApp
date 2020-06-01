/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.user;

import userInterface.SqlFrontController;
import userInterface.vehicle.car.userInterface.CarResult;
import vehicle.Car;
import dealer_.Selling.CarGallery;
import interfaces.Frame;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.*;

import person.Client;

public class UserInterface extends JFrame implements Frame{

    
    /**
     * Creates new form UserInterface
     */ 
    private JFrame oldFrame;
    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public JFrame getOldFrame() {
        return oldFrame;
    }

    public void setOldFrame(JFrame oldFrame) {
        this.oldFrame = oldFrame;
    }
    private Client client; 
    private int type;
    public UserInterface() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        yearText = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
         brand = new javax.swing.JComboBox<>();
        engine = new javax.swing.JComboBox<>();
        year = new javax.swing.JSlider();
        maxPrice = new javax.swing.JTextField();
        minPrice = new javax.swing.JTextField();
        manuelGear = new javax.swing.JRadioButton();
        automaticGear = new javax.swing.JRadioButton();
        searchButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        hint = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Brand");
        jLabel1.setVerifyInputWhenFocusTarget(false);
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        yearText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        yearText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        yearText.setText("Year 1995");
        yearText.setVerifyInputWhenFocusTarget(false);
        yearText.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Engine Volume");
        jLabel3.setVerifyInputWhenFocusTarget(false);
        jLabel3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Min Price");
        jLabel4.setVerifyInputWhenFocusTarget(false);
        jLabel4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Max Price");
        jLabel5.setVerifyInputWhenFocusTarget(false);
        jLabel5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("GearBox");
        jLabel6.setVerifyInputWhenFocusTarget(false);
        jLabel6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ArrayList<Car>cars=new CarGallery().getCarGallery().getCars();
        ArrayList<String> models=new ArrayList<>(); 
        for(Car car:cars){
            if(!models.contains(car.getTechnicalInformation().getBrand())){
                models.add(car.getTechnicalInformation().getBrand());
            }
        }
        String[]model=new String[models.size()];
        models.toArray(model);
        brand.setModel(new javax.swing.DefaultComboBoxModel<>(model));

        engine.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1.4", "1.6", "1.8", "1.9", "2.0", "2.5", "2.8", "3.0", "3.5", "Bigger Than 3.5" }));

        year.setMaximum(2020);
        year.setMinimum(1995);
        year.setPaintLabels(true);
        year.setPaintTicks(true);
        year.setSnapToTicks(true);
        year.setValue(1995);
        year.setCursor(new java.awt.Cursor(java.awt.Cursor.W_RESIZE_CURSOR));
        year.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                yearStateChanged(evt);
            }
        });

        manuelGear.setText("MANUAL");
        manuelGear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manuelGearActionPerformed(evt);
            }
        });
        automaticGear.setText("AUTOMATIC");
        automaticGear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                automaticGearActionPerformed(evt);
            }
        });

        searchButton.setText("SEARCH");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        jMenu1.setText("HINT");

        hint.setText("Auto Complete Fields");
        hint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hintActionPerformed(evt);
            }
        });


        jMenu1.add(hint);

        jMenuBar1.add(jMenu1);
        setJMenuBar(jMenuBar1);
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(yearText, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(87, 87, 87)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(brand, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(minPrice)
                                .addComponent(year, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(maxPrice)
                                .addComponent(engine, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(79, 79, 79)
                            .addComponent(manuelGear)
                            .addGap(48, 48, 48)
                            .addComponent(automaticGear))))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(brand, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(yearText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(year, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(engine))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(maxPrice))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(minPrice)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(manuelGear)
                        .addComponent(automaticGear)))
                .addGap(43, 43, 43)
                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    private void hintActionPerformed(ActionEvent evt) {
        String entry=JOptionPane.showInputDialog("We have three options.Please enter 1,2 or 3 to finish auto complete.");
        while(entry.equals(hintValidation(entry)))
            entry=JOptionPane.showInputDialog("We have three options.Please enter 1,2 or 3 to finish auto complete.");
        if(Integer.parseInt(entry)==1) {
            automaticGear.setSelected(true);
            type = 1;
            maxPrice.setText("1000");
            minPrice.setText("6000");
            engine.setSelectedIndex(4);
            year.setValue(2011);
        }else if (Integer.parseInt(entry)==2){
            automaticGear.setSelected(true);
            type = 1;
            maxPrice.setText("1000");
            minPrice.setText("6000");
            engine.setSelectedIndex(4);
            year.setValue(2011);
            brand.setSelectedIndex(4);
        }else{
            manuelGear.setSelected(true);
            type = 2;
            maxPrice.setText("1000");
            minPrice.setText("800000");
            engine.setSelectedIndex(9);
            year.setValue(2017);
            brand.setSelectedIndex(2);
        }

    }
    private boolean hintValidation(String str){
        try{
           int temp= Integer.parseInt(str);
           if (temp>3||temp<=0)
               return false;
           return true;
        }catch (Exception e){
            return false;
        }
    }

    private void automaticGearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_automaticGearActionPerformed
        // TODO add your handling code here:
        automaticGear.setSelected(true);
        type=1;
        manuelGear.setSelected(false);
    }//GEN-LAST:event_automaticGearActionPerformed
    private void manuelGearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_automaticGearActionPerformed
        // TODO add your handling code here:
        automaticGear.setSelected(false);
        manuelGear.setSelected(true);
        type=2;
    }
    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
        if(validatePrice()&&gearValidation()) {
            client = new SqlFrontController().getSqlFrontController().getClient();
            SqlFrontController sqlFrontController = new SqlFrontController().getSqlFrontController();
            String engine_=engine.getSelectedItem().toString();
            if (engine.getSelectedIndex()==9)
                engine_="3.5";
            ArrayList<Car> lists = client.searchCar(String.valueOf(brand.getSelectedItem()), type, Double.parseDouble(engine_), Integer.parseInt(maxPrice.getText()), Integer.parseInt(minPrice.getText()), year.getValue());
            sqlFrontController.setResult(client.searchCar(String.valueOf(brand.getSelectedItem()), type, Double.parseDouble(engine_), Integer.parseInt(maxPrice.getText()), Integer.parseInt(minPrice.getText()), year.getValue()));
            CarResult carResult = new CarResult();
            this.setVisible(false);
            carResult.setVisible(true);
            carResult.setOldFrame(this);
        }else
            JOptionPane.showMessageDialog(this,"Please check your values");
    }//GEN-LAST:event_searchButtonActionPerformed
    private boolean gearValidation(){
        return automaticGear.isSelected()||manuelGear.isSelected();
    }
    private boolean validatePrice(){
        if (maxPrice.getText().contains("-")) return false;
        try {
            Integer.parseInt(minPrice.getText());
            return true;
        }catch (Exception e) {
            return false;
        }
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
            java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserInterface().setVisible(true);
            }
        });
    }
 private void yearStateChanged(javax.swing.event.ChangeEvent evt) {                                  
        // TODO add your handling code here:
        yearText.setText("YEAR :"+year.getValue());
    }  
     
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
       // Variables declaration - do not modify                     
    private javax.swing.JRadioButton automaticGear;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> engine;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton manuelGear;
    private javax.swing.JTextField maxPrice;
    private javax.swing.JTextField minPrice;
    private javax.swing.JButton searchButton;
    private javax.swing.JSlider year;
    private javax.swing.JLabel yearText;
    javax.swing.JComboBox<String> brand;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem hint;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
