package Presentacion;

import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.ListModel;
import javax.swing.table.DefaultTableModel;

public class Frm_menu extends javax.swing.JFrame {

    public Frm_menu() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        //this.setMaximumSize(new Dimension(1366,768));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jComboBox3 = new javax.swing.JComboBox();
        jComboBox4 = new javax.swing.JComboBox();
        jComboBox5 = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jComboBox6 = new javax.swing.JComboBox();
        jComboBox7 = new javax.swing.JComboBox();
        jComboBox8 = new javax.swing.JComboBox();
        jComboBox9 = new javax.swing.JComboBox();
        jComboBox10 = new javax.swing.JComboBox();
        jComboBox11 = new javax.swing.JComboBox();
        jComboBox12 = new javax.swing.JComboBox();
        jComboBox13 = new javax.swing.JComboBox();
        jComboBox14 = new javax.swing.JComboBox();
        jComboBox15 = new javax.swing.JComboBox();
        jComboBox16 = new javax.swing.JComboBox();
        cmbAyampaco = new javax.swing.JComboBox();
        jComboBox18 = new javax.swing.JComboBox();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jComboBox19 = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        cb_platos = new javax.swing.JComboBox<>();
        btn_agregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_objetos = new javax.swing.JTable();
        txt_cantidad = new javax.swing.JTextField();
        txt_total = new javax.swing.JTextField();
        txt_precio = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MENÚ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Papyrus", 1, 36))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Lucida Handwriting", 1, 30)); // NOI18N
        jLabel2.setText("PLATOS");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Handwriting", 1, 30)); // NOI18N
        jLabel3.setText("BEBIDAS");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, -1, -1));

        jLabel4.setFont(new java.awt.Font("Eras Light ITC", 1, 24)); // NOI18N
        jLabel4.setText("Ayampaco con pollo");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel5.setFont(new java.awt.Font("Eras Light ITC", 1, 24)); // NOI18N
        jLabel5.setText("Ayampaco con pescado");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jLabel6.setFont(new java.awt.Font("Eras Light ITC", 1, 24)); // NOI18N
        jLabel6.setText("Gaseosas");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 120, -1, -1));

        jLabel7.setFont(new java.awt.Font("Eras Light ITC", 1, 24)); // NOI18N
        jLabel7.setText("Agua");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 170, -1, -1));

        jLabel8.setFont(new java.awt.Font("Eras Light ITC", 1, 24)); // NOI18N
        jLabel8.setText("Cerveza");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 210, -1, -1));

        jLabel9.setFont(new java.awt.Font("Eras Light ITC", 1, 24)); // NOI18N
        jLabel9.setText("$ 3,00");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, -1, -1));

        jLabel10.setFont(new java.awt.Font("Eras Light ITC", 1, 24)); // NOI18N
        jLabel10.setText("$ 4.00");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, -1, -1));

        jComboBox1.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 320, -1, -1));

        jComboBox2.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 680, -1, -1));

        jComboBox3.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", " " }));
        jPanel1.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 120, -1, -1));

        jComboBox4.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        jPanel1.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 160, -1, -1));

        jComboBox5.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        jPanel1.add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 120, -1, -1));

        jButton2.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        jButton2.setText("GENERAR PEDIDO");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 400, -1, -1));

        jButton1.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        jButton1.setText("VOLVER A OPCIONES");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 340, -1, -1));

        jLabel11.setFont(new java.awt.Font("Eras Light ITC", 1, 24)); // NOI18N
        jLabel11.setText("Chuleta asada");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, -1, -1));

        jLabel12.setFont(new java.awt.Font("Eras Light ITC", 1, 24)); // NOI18N
        jLabel12.setText("Lomo de chancho asado");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, -1, -1));

        jLabel13.setFont(new java.awt.Font("Eras Light ITC", 1, 24)); // NOI18N
        jLabel13.setText("Tilapia al jugo");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, -1, -1));

        jLabel14.setFont(new java.awt.Font("Eras Light ITC", 1, 24)); // NOI18N
        jLabel14.setText("Tilapia asada");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        jLabel15.setFont(new java.awt.Font("Eras Light ITC", 1, 24)); // NOI18N
        jLabel15.setText("Caldo de gallina criolla");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        jLabel16.setFont(new java.awt.Font("Eras Light ITC", 1, 24)); // NOI18N
        jLabel16.setText("Seco de pollo criollo");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        jLabel17.setFont(new java.awt.Font("Eras Light ITC", 1, 24)); // NOI18N
        jLabel17.setText("Tilapia frita");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

        jLabel18.setFont(new java.awt.Font("Eras Light ITC", 1, 24)); // NOI18N
        jLabel18.setText("Caldo de caracha");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        jLabel19.setFont(new java.awt.Font("Eras Light ITC", 1, 24)); // NOI18N
        jLabel19.setText("Costilla de chancho asada");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, -1, -1));

        jLabel20.setFont(new java.awt.Font("Eras Light ITC", 1, 24)); // NOI18N
        jLabel20.setText("Pollo asado");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, -1, -1));

        jLabel21.setFont(new java.awt.Font("Eras Light ITC", 1, 24)); // NOI18N
        jLabel21.setText("Carne asada");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 600, -1, -1));

        jLabel22.setFont(new java.awt.Font("Eras Light ITC", 1, 24)); // NOI18N
        jLabel22.setText("Almuerzos caseros");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 640, -1, -1));

        jLabel23.setFont(new java.awt.Font("Eras Light ITC", 1, 24)); // NOI18N
        jLabel23.setText("Parrilladas");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 680, -1, -1));

        jLabel24.setFont(new java.awt.Font("Eras Light ITC", 1, 24)); // NOI18N
        jLabel24.setText("$ 4,00");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 520, -1, -1));

        jLabel25.setFont(new java.awt.Font("Eras Light ITC", 1, 24)); // NOI18N
        jLabel25.setText("$ 3,00");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, -1, -1));

        jLabel26.setFont(new java.awt.Font("Eras Light ITC", 1, 24)); // NOI18N
        jLabel26.setText("$ 3,00");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, -1, -1));

        jLabel27.setFont(new java.awt.Font("Eras Light ITC", 1, 24)); // NOI18N
        jLabel27.setText("$ 5,00");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, -1, -1));

        jLabel28.setFont(new java.awt.Font("Eras Light ITC", 1, 24)); // NOI18N
        jLabel28.setText("$ 5,00");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, -1, -1));

        jLabel29.setFont(new java.awt.Font("Eras Light ITC", 1, 24)); // NOI18N
        jLabel29.setText("$ 5,00");
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 400, -1, -1));

        jLabel30.setFont(new java.awt.Font("Eras Light ITC", 1, 24)); // NOI18N
        jLabel30.setText("$ 4,00");
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 440, -1, -1));

        jLabel31.setFont(new java.awt.Font("Eras Light ITC", 1, 24)); // NOI18N
        jLabel31.setText("$ 4,00");
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 480, -1, -1));

        jLabel32.setFont(new java.awt.Font("Eras Light ITC", 1, 24)); // NOI18N
        jLabel32.setText("$ 5,00");
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, -1, -1));

        jLabel33.setFont(new java.awt.Font("Eras Light ITC", 1, 24)); // NOI18N
        jLabel33.setText("$ 2,50");
        jPanel1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 560, -1, -1));

        jLabel34.setFont(new java.awt.Font("Eras Light ITC", 1, 24)); // NOI18N
        jLabel34.setText("$ 2,50");
        jPanel1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 640, -1, -1));

        jLabel35.setFont(new java.awt.Font("Eras Light ITC", 1, 24)); // NOI18N
        jLabel35.setText("$ 10,00");
        jPanel1.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 680, -1, -1));

        jLabel36.setFont(new java.awt.Font("Eras Light ITC", 1, 24)); // NOI18N
        jLabel36.setText("$ 2,50");
        jPanel1.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 600, -1, -1));

        jComboBox6.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        jPanel1.add(jComboBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 640, -1, -1));

        jComboBox7.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        jPanel1.add(jComboBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 600, -1, -1));

        jComboBox8.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        jPanel1.add(jComboBox8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 560, -1, -1));

        jComboBox9.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        jPanel1.add(jComboBox9, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 520, -1, -1));

        jComboBox10.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        jComboBox10.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        jPanel1.add(jComboBox10, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 480, -1, -1));

        jComboBox11.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        jComboBox11.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        jPanel1.add(jComboBox11, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 440, -1, -1));

        jComboBox12.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        jComboBox12.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        jPanel1.add(jComboBox12, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 400, -1, -1));

        jComboBox13.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        jComboBox13.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        jPanel1.add(jComboBox13, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 360, -1, -1));

        jComboBox14.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        jComboBox14.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        jPanel1.add(jComboBox14, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, -1, -1));

        jComboBox15.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        jComboBox15.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        jPanel1.add(jComboBox15, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 240, -1, -1));

        jComboBox16.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        jComboBox16.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        jPanel1.add(jComboBox16, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, -1, -1));

        cmbAyampaco.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        cmbAyampaco.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        jPanel1.add(cmbAyampaco, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, -1, -1));

        jComboBox18.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        jComboBox18.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        jPanel1.add(jComboBox18, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, -1, -1));

        jLabel37.setFont(new java.awt.Font("Lucida Handwriting", 1, 30)); // NOI18N
        jLabel37.setText("OTROS PROD.");
        jPanel1.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 70, -1, -1));

        jLabel38.setFont(new java.awt.Font("Eras Light ITC", 1, 24)); // NOI18N
        jLabel38.setText("Cigarrillos");
        jPanel1.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 120, -1, -1));

        jComboBox19.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        jComboBox19.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        jPanel1.add(jComboBox19, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 200, -1, -1));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cb_platos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SECO POLLO", "CALDO POLLO", "CARACHA", "ASADO POLLO", "AYAMPACO" }));
        jPanel2.add(cb_platos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 170, -1));

        btn_agregar.setText("OK");
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jt_objetos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DESCRIPCION", "CANTIDAD", "PRECIO", "TOTAL"
            }
        ));
        jScrollPane1.setViewportView(jt_objetos);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 380, 250));
        jPanel2.add(txt_cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 170, -1));
        jPanel2.add(txt_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 170, -1));

        txt_precio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_precioActionPerformed(evt);
            }
        });
        jPanel2.add(txt_precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 170, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 450, 580, 280));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 820));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Frm_opciones ven = new Frm_opciones();
        this.setVisible(false);
        ven.setVisible(true);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:

        Frm_pedido frmP = new Frm_pedido();
        frmP.lblMsn.setText(cmbAyampaco.getSelectedItem() + "");
        frmP.setVisible(true);

        //String [][] datos=
    }//GEN-LAST:event_jButton2MouseClicked

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        // TODO add your handling code here:
        //Sección 1 

        DefaultTableModel modelo = (DefaultTableModel) this.jt_objetos.getModel();
        //Sección 2

        Object[] fila = new Object[4];

        fila[0] = this.cb_platos.getSelectedItem().toString();

        fila[1] = this.txt_cantidad.getText();

        fila[2] = this.txt_precio.getText();

        fila[3] = this.txt_total.getText();
        //Sección 4
        modelo.addRow(fila);
        //Sección 5
        this.jt_objetos.setModel(modelo);
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void txt_precioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_precioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_precioActionPerformed

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
            java.util.logging.Logger.getLogger(Frm_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregar;
    private javax.swing.JComboBox<String> cb_platos;
    private javax.swing.JComboBox cmbAyampaco;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox10;
    private javax.swing.JComboBox jComboBox11;
    private javax.swing.JComboBox jComboBox12;
    private javax.swing.JComboBox jComboBox13;
    private javax.swing.JComboBox jComboBox14;
    private javax.swing.JComboBox jComboBox15;
    private javax.swing.JComboBox jComboBox16;
    private javax.swing.JComboBox jComboBox18;
    private javax.swing.JComboBox jComboBox19;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JComboBox jComboBox6;
    private javax.swing.JComboBox jComboBox7;
    private javax.swing.JComboBox jComboBox8;
    private javax.swing.JComboBox jComboBox9;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jt_objetos;
    private javax.swing.JTextField txt_cantidad;
    private javax.swing.JTextField txt_precio;
    private javax.swing.JTextField txt_total;
    // End of variables declaration//GEN-END:variables
}
