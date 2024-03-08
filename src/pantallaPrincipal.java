
import java.awt.*;
import java.util.*;
import javax.swing.*;

public class pantallaPrincipal extends javax.swing.JFrame {

    public ArrayList<User> usuarios;
    public ArrayList<Torneo> torneos;
    public int logedUserindex;

    public pantallaPrincipal() {
        initComponents();
        inicializarUsuarios();
        inicializarTorneos();
        this.setLocationRelativeTo(null);
        setimageLabel(LB_logoUnitec, "src/imagenes/unitec color.png");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DG_registrarse = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TF_regUserName = new javax.swing.JTextField();
        TF_regContra = new javax.swing.JTextField();
        TF_regConfirmContra = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        PN_InicioSec1 = new javax.swing.JPanel();
        LB_registrarse1 = new javax.swing.JLabel();
        LB_textoVali1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        PN_salirRegis = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        CB_participante = new javax.swing.JCheckBox();
        CB_admin = new javax.swing.JCheckBox();
        DG_adminMenu = new javax.swing.JDialog();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        PN_pantallaCrearTorneo = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        PN_salirAdmin = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JL_listaParticipantes = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        JL_listaTorneosAdmin = new javax.swing.JList<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        DG_partMenu = new javax.swing.JDialog();
        jPanel12 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        PN_salirPart = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        JL_listaGanados = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        JL_listaTorneosDisp = new javax.swing.JList<>();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        JL_listaTorneosCerrados = new javax.swing.JList<>();
        jLabel19 = new javax.swing.JLabel();
        DG_crearTorneo = new javax.swing.JDialog();
        jPanel15 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        PN_crearTorneoConfirm = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        TF_nombreTorneo = new javax.swing.JTextField();
        SP_rondasTrone = new javax.swing.JSpinner();
        PN_salirCrearTorneo = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        LB_valiTorneo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        LB_logoUnitec = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TF_logUserName = new javax.swing.JTextField();
        TF_logContra = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        PN_InicioSec = new javax.swing.JPanel();
        LB_inicioSec = new javax.swing.JLabel();
        LB_registrarse = new javax.swing.JLabel();
        LB_textoVali = new javax.swing.JLabel();
        PN_salir = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        DG_registrarse.setUndecorated(true);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 400));

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setText("Nombre de Usuario");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setText("Password");

        TF_regUserName.setBackground(new java.awt.Color(204, 204, 204));
        TF_regUserName.setBorder(null);

        TF_regContra.setBackground(new java.awt.Color(204, 204, 204));
        TF_regContra.setBorder(null);

        TF_regConfirmContra.setBackground(new java.awt.Color(204, 204, 204));
        TF_regConfirmContra.setBorder(null);

        PN_InicioSec1.setBackground(new java.awt.Color(204, 0, 0));
        PN_InicioSec1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PN_InicioSec1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PN_InicioSec1MouseClicked(evt);
            }
        });

        LB_registrarse1.setForeground(new java.awt.Color(0, 0, 0));
        LB_registrarse1.setText("Registrarse");
        LB_registrarse1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout PN_InicioSec1Layout = new javax.swing.GroupLayout(PN_InicioSec1);
        PN_InicioSec1.setLayout(PN_InicioSec1Layout);
        PN_InicioSec1Layout.setHorizontalGroup(
            PN_InicioSec1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PN_InicioSec1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(LB_registrarse1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PN_InicioSec1Layout.setVerticalGroup(
            PN_InicioSec1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PN_InicioSec1Layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addComponent(LB_registrarse1)
                .addContainerGap())
        );

        LB_textoVali1.setForeground(new java.awt.Color(204, 0, 0));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 102));
        jLabel5.setText("Confirm Password");

        PN_salirRegis.setBackground(new java.awt.Color(204, 0, 0));
        PN_salirRegis.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PN_salirRegis.setPreferredSize(new java.awt.Dimension(30, 30));
        PN_salirRegis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PN_salirRegisMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("X");

        javax.swing.GroupLayout PN_salirRegisLayout = new javax.swing.GroupLayout(PN_salirRegis);
        PN_salirRegis.setLayout(PN_salirRegisLayout);
        PN_salirRegisLayout.setHorizontalGroup(
            PN_salirRegisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PN_salirRegisLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PN_salirRegisLayout.setVerticalGroup(
            PN_salirRegisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        CB_participante.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        CB_participante.setText("Participante");

        CB_admin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        CB_admin.setText("Administrador");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(LB_textoVali1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TF_regConfirmContra, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                            .addComponent(jSeparator6)
                            .addComponent(jSeparator4)
                            .addComponent(jSeparator3)
                            .addComponent(TF_regContra)
                            .addComponent(TF_regUserName)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(CB_participante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(PN_InicioSec1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(51, 51, 51)
                                        .addComponent(CB_admin)))
                                .addGap(0, 82, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addComponent(PN_salirRegis, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(PN_salirRegis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(TF_regUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TF_regContra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TF_regConfirmContra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(LB_textoVali1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CB_participante)
                    .addComponent(CB_admin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(PN_InicioSec1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 450, 400));

        javax.swing.GroupLayout DG_registrarseLayout = new javax.swing.GroupLayout(DG_registrarse.getContentPane());
        DG_registrarse.getContentPane().setLayout(DG_registrarseLayout);
        DG_registrarseLayout.setHorizontalGroup(
            DG_registrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        DG_registrarseLayout.setVerticalGroup(
            DG_registrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        DG_adminMenu.setUndecorated(true);

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(204, 0, 0));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PN_pantallaCrearTorneo.setBackground(new java.awt.Color(51, 51, 255));
        PN_pantallaCrearTorneo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PN_pantallaCrearTorneo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PN_pantallaCrearTorneoMouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Crear Torneo");

        javax.swing.GroupLayout PN_pantallaCrearTorneoLayout = new javax.swing.GroupLayout(PN_pantallaCrearTorneo);
        PN_pantallaCrearTorneo.setLayout(PN_pantallaCrearTorneoLayout);
        PN_pantallaCrearTorneoLayout.setHorizontalGroup(
            PN_pantallaCrearTorneoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PN_pantallaCrearTorneoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel9)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        PN_pantallaCrearTorneoLayout.setVerticalGroup(
            PN_pantallaCrearTorneoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PN_pantallaCrearTorneoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel8.add(PN_pantallaCrearTorneo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 130, -1));

        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 580));

        jPanel9.setBackground(new java.awt.Color(204, 204, 204));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PN_salirAdmin.setBackground(new java.awt.Color(204, 0, 0));
        PN_salirAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PN_salirAdmin.setPreferredSize(new java.awt.Dimension(30, 30));
        PN_salirAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PN_salirAdminMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("X");

        javax.swing.GroupLayout PN_salirAdminLayout = new javax.swing.GroupLayout(PN_salirAdmin);
        PN_salirAdmin.setLayout(PN_salirAdminLayout);
        PN_salirAdminLayout.setHorizontalGroup(
            PN_salirAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PN_salirAdminLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PN_salirAdminLayout.setVerticalGroup(
            PN_salirAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel9.add(PN_salirAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(661, 16, 20, -1));

        JL_listaParticipantes.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(JL_listaParticipantes);

        jPanel9.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 118, 222, 311));

        JL_listaTorneosAdmin.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(JL_listaTorneosAdmin);

        jPanel9.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 118, 220, 311));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 0, 0));
        jLabel10.setText("Personas dentro del torneo");
        jPanel9.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 92, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 0, 0));
        jLabel11.setText("Torneos");
        jPanel9.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 92, -1, -1));

        jPanel11.setBackground(new java.awt.Color(255, 0, 0));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Cerrar Torneo");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(14, 14, 14))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 450, -1, 30));

        jPanel13.setBackground(new java.awt.Color(204, 0, 0));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("Marcar Ganador");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 450, -1, 30));

        jPanel7.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 700, 580));

        javax.swing.GroupLayout DG_adminMenuLayout = new javax.swing.GroupLayout(DG_adminMenu.getContentPane());
        DG_adminMenu.getContentPane().setLayout(DG_adminMenuLayout);
        DG_adminMenuLayout.setHorizontalGroup(
            DG_adminMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        DG_adminMenuLayout.setVerticalGroup(
            DG_adminMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        DG_partMenu.setUndecorated(true);

        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel14.setBackground(new java.awt.Color(204, 0, 0));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel12.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 578));

        jPanel16.setBackground(new java.awt.Color(204, 204, 204));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PN_salirPart.setBackground(new java.awt.Color(204, 0, 0));
        PN_salirPart.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PN_salirPart.setPreferredSize(new java.awt.Dimension(30, 30));
        PN_salirPart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PN_salirPartMouseClicked(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setText("X");

        javax.swing.GroupLayout PN_salirPartLayout = new javax.swing.GroupLayout(PN_salirPart);
        PN_salirPart.setLayout(PN_salirPartLayout);
        PN_salirPartLayout.setHorizontalGroup(
            PN_salirPartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PN_salirPartLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PN_salirPartLayout.setVerticalGroup(
            PN_salirPartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel16.add(PN_salirPart, new org.netbeans.lib.awtextra.AbsoluteConstraints(661, 16, 20, -1));

        JL_listaGanados.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(JL_listaGanados);

        jPanel16.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, 170, 311));

        JL_listaTorneosDisp.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(JL_listaTorneosDisp);

        jPanel16.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 170, 311));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 0, 0));
        jLabel16.setText("Torneos Ganados");
        jPanel16.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, -1, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 0, 0));
        jLabel17.setText("Torneos disponibles");
        jPanel16.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        jPanel17.setBackground(new java.awt.Color(255, 0, 0));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setText("Unirse a Torneo");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addGap(14, 14, 14))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel16.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 120, 30));

        JL_listaTorneosCerrados.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane5.setViewportView(JL_listaTorneosCerrados);

        jPanel16.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 170, 311));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(204, 0, 0));
        jLabel19.setText("Torneos Cerrados");
        jPanel16.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, -1, -1));

        jPanel12.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 700, 580));

        javax.swing.GroupLayout DG_partMenuLayout = new javax.swing.GroupLayout(DG_partMenu.getContentPane());
        DG_partMenu.getContentPane().setLayout(DG_partMenuLayout);
        DG_partMenuLayout.setHorizontalGroup(
            DG_partMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        DG_partMenuLayout.setVerticalGroup(
            DG_partMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        DG_crearTorneo.setUndecorated(true);

        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel18.setBackground(new java.awt.Color(204, 0, 0));
        jPanel18.setForeground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );

        jPanel15.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 390));

        jPanel19.setBackground(new java.awt.Color(204, 204, 204));

        PN_crearTorneoConfirm.setBackground(new java.awt.Color(51, 51, 255));
        PN_crearTorneoConfirm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PN_crearTorneoConfirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PN_crearTorneoConfirmMouseClicked(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setText("Crear Torneo");

        javax.swing.GroupLayout PN_crearTorneoConfirmLayout = new javax.swing.GroupLayout(PN_crearTorneoConfirm);
        PN_crearTorneoConfirm.setLayout(PN_crearTorneoConfirmLayout);
        PN_crearTorneoConfirmLayout.setHorizontalGroup(
            PN_crearTorneoConfirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PN_crearTorneoConfirmLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel21)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        PN_crearTorneoConfirmLayout.setVerticalGroup(
            PN_crearTorneoConfirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PN_crearTorneoConfirmLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 255));
        jLabel14.setText("Nombre del Torneo'");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 255));
        jLabel20.setText("Rondas");

        PN_salirCrearTorneo.setBackground(new java.awt.Color(204, 0, 0));
        PN_salirCrearTorneo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PN_salirCrearTorneo.setPreferredSize(new java.awt.Dimension(30, 30));
        PN_salirCrearTorneo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PN_salirCrearTorneoMouseClicked(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel22.setText("X");

        javax.swing.GroupLayout PN_salirCrearTorneoLayout = new javax.swing.GroupLayout(PN_salirCrearTorneo);
        PN_salirCrearTorneo.setLayout(PN_salirCrearTorneoLayout);
        PN_salirCrearTorneoLayout.setHorizontalGroup(
            PN_salirCrearTorneoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PN_salirCrearTorneoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PN_salirCrearTorneoLayout.setVerticalGroup(
            PN_salirCrearTorneoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        LB_valiTorneo.setForeground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PN_salirCrearTorneo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PN_crearTorneoConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SP_rondasTrone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(TF_nombreTorneo, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LB_valiTorneo, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PN_salirCrearTorneo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TF_nombreTorneo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SP_rondasTrone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LB_valiTorneo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(PN_crearTorneoConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );

        jPanel15.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 390, 390));

        javax.swing.GroupLayout DG_crearTorneoLayout = new javax.swing.GroupLayout(DG_crearTorneo.getContentPane());
        DG_crearTorneo.getContentPane().setLayout(DG_crearTorneoLayout);
        DG_crearTorneoLayout.setHorizontalGroup(
            DG_crearTorneoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        DG_crearTorneoLayout.setVerticalGroup(
            DG_crearTorneoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 480));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Nombre de Usuario");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText("Contra");

        TF_logUserName.setBackground(new java.awt.Color(204, 204, 204));
        TF_logUserName.setBorder(null);

        TF_logContra.setBackground(new java.awt.Color(204, 204, 204));
        TF_logContra.setBorder(null);

        PN_InicioSec.setBackground(new java.awt.Color(204, 0, 0));
        PN_InicioSec.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PN_InicioSec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PN_InicioSecMouseClicked(evt);
            }
        });

        LB_inicioSec.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LB_inicioSec.setText("Iniciar session");

        javax.swing.GroupLayout PN_InicioSecLayout = new javax.swing.GroupLayout(PN_InicioSec);
        PN_InicioSec.setLayout(PN_InicioSecLayout);
        PN_InicioSecLayout.setHorizontalGroup(
            PN_InicioSecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PN_InicioSecLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LB_inicioSec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        PN_InicioSecLayout.setVerticalGroup(
            PN_InicioSecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LB_inicioSec, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
        );

        LB_registrarse.setForeground(new java.awt.Color(0, 0, 0));
        LB_registrarse.setText("Registrarse");
        LB_registrarse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LB_registrarse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LB_registrarseMouseClicked(evt);
            }
        });

        PN_salir.setBackground(new java.awt.Color(204, 0, 0));
        PN_salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PN_salir.setPreferredSize(new java.awt.Dimension(30, 30));
        PN_salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PN_salirMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("X");

        javax.swing.GroupLayout PN_salirLayout = new javax.swing.GroupLayout(PN_salir);
        PN_salir.setLayout(PN_salirLayout);
        PN_salirLayout.setHorizontalGroup(
            PN_salirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PN_salirLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PN_salirLayout.setVerticalGroup(
            PN_salirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(LB_registrarse)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TF_logContra, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                            .addComponent(TF_logUserName)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1)
                            .addComponent(PN_InicioSec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LB_textoVali, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator2))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(LB_logoUnitec, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addComponent(PN_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LB_logoUnitec, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PN_salir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(94, 94, 94)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TF_logUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TF_logContra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LB_textoVali, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PN_InicioSec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LB_registrarse)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 450, 480));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PN_salirRegisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PN_salirRegisMouseClicked
        TF_regUserName.setText("");
        TF_regContra.setText("");
        TF_regConfirmContra.setText("");
        DG_registrarse.setVisible(false);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }//GEN-LAST:event_PN_salirRegisMouseClicked

    private void PN_salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PN_salirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_PN_salirMouseClicked

    private void LB_registrarseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LB_registrarseMouseClicked
        this.setVisible(false);
        DG_registrarse.pack();
        DG_registrarse.setLocationRelativeTo(this);
        DG_registrarse.setModal(true);
        DG_registrarse.setVisible(true);
    }//GEN-LAST:event_LB_registrarseMouseClicked

    private void PN_InicioSec1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PN_InicioSec1MouseClicked
        crearUsuario();
    }//GEN-LAST:event_PN_InicioSec1MouseClicked

    private void PN_InicioSecMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PN_InicioSecMouseClicked
        inicio();
    }//GEN-LAST:event_PN_InicioSecMouseClicked

    private void PN_salirAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PN_salirAdminMouseClicked
        DG_adminMenu.setVisible(false);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }//GEN-LAST:event_PN_salirAdminMouseClicked

    private void PN_salirPartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PN_salirPartMouseClicked
        DG_partMenu.setVisible(false);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }//GEN-LAST:event_PN_salirPartMouseClicked

    private void PN_salirCrearTorneoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PN_salirCrearTorneoMouseClicked
        DG_crearTorneo.setVisible(false);
        DG_adminMenu.pack();
        DG_adminMenu.setLocationRelativeTo(this);
        DG_adminMenu.setModal(true);
        DG_adminMenu.setVisible(true);
    }//GEN-LAST:event_PN_salirCrearTorneoMouseClicked

    private void PN_pantallaCrearTorneoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PN_pantallaCrearTorneoMouseClicked
        DG_adminMenu.setVisible(false);
        DG_crearTorneo.pack();
        DG_crearTorneo.setLocationRelativeTo(DG_adminMenu);
        DG_crearTorneo.setModal(true);
        DG_crearTorneo.setVisible(true);
    }//GEN-LAST:event_PN_pantallaCrearTorneoMouseClicked

    private void PN_crearTorneoConfirmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PN_crearTorneoConfirmMouseClicked
        crearTorneo();
    }//GEN-LAST:event_PN_crearTorneoConfirmMouseClicked

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
            java.util.logging.Logger.getLogger(pantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pantallaPrincipal().setVisible(true);
            }
        });
    }

    public void crearTorneo() {
        if ((Integer) SP_rondasTrone.getValue() > 0) {
            ArrayList<Participante> listaParticipantes = new ArrayList();
            Torneo torneo = new Torneo(
                    TF_nombreTorneo.getText(), listaParticipantes,
                    true, false, (Integer) SP_rondasTrone.getValue());
            adminTorneos administrador = new adminTorneos("./torneos.cbm");
            administrador.cargarArchivo();
            administrador.setTorneo(torneo);
            administrador.escribirArchivo();
            torneos.add(torneo);
        }else{
            LB_valiTorneo.setText("debe tener almenos una ronda");
        }
    }

    public void crearUsuario() {
        LB_textoVali1.setText("");

        boolean exitseNom = false;
        for (User usuario : usuarios) {
            if (TF_logUserName.getText().equals(usuario.getNombre())) {
                exitseNom = true;
            }
        }

        if (exitseNom == false) {
            if (CB_participante.isSelected() | CB_admin.isSelected()) {
                if (CB_participante.isSelected()) {
                    if (TF_regContra.getText().equals(TF_regConfirmContra.getText())) {
                        if (TF_regContra.getText().length() <= 4) {
                            LB_textoVali1.setText("La contraseña debe ser mayor de 5 carcateres");
                        } else {
                            User nuevoUser = new Participante(TF_regUserName.getText(), TF_regContra.getText());
                            adminUsuarios administrador = new adminUsuarios("./usuarios.cbm");
                            administrador.cargarArchivo();
                            administrador.setUsuario(nuevoUser);
                            administrador.escribirArchivo();
                            usuarios.add(nuevoUser);

                            LB_textoVali.setText("Creacion exitosa!");
                            System.out.println("");
                            TF_logUserName.setText("");
                            TF_regContra.setText("");
                            TF_regConfirmContra.setText("");
                        }
                    } else {
                        LB_textoVali1.setText("Validacion de contraseña incorrecta");
                    }
                }
                if (CB_admin.isSelected()) {
                    if (TF_regContra.getText().equals(TF_regConfirmContra.getText())) {
                        if (TF_regContra.getText().length() <= 4) {
                            LB_textoVali1.setText("La contraseña debe ser mayor de 5 carcateres");
                        } else {
                            User nuevoUser = new admin(TF_regUserName.getText(), TF_regContra.getText());
                            adminUsuarios administrador = new adminUsuarios("./usuarios.cbm");
                            administrador.cargarArchivo();
                            administrador.setUsuario(nuevoUser);
                            administrador.escribirArchivo();
                            usuarios.add(nuevoUser);

                            LB_textoVali1.setText("Creacion exitosa!");
                            System.out.println("");
                            TF_regUserName.setText("");
                            TF_regContra.setText("");
                            TF_regConfirmContra.setText("");
                        }
                    } else {
                        LB_textoVali1.setText("Validacion de contraseña incorrecta");
                    }
                }
            } else {
                LB_textoVali1.setText("debe Selecionar una opcion de cuenta");
            }
        } else {
            LB_textoVali1.setText("El nombre ya esta tomado");
        }
    }

    public void inicio() {
        if (evaularInicioSec()) {
            this.setVisible(false);
            if (usuarios.get(logedUserindex) instanceof admin) {
                DG_adminMenu.pack();
                DG_adminMenu.setLocationRelativeTo(this);
                DG_adminMenu.setModal(true);
                DG_adminMenu.setVisible(true);
            }
            if (usuarios.get(logedUserindex) instanceof Participante) {
                DG_partMenu.pack();
                DG_partMenu.setLocationRelativeTo(this);
                DG_partMenu.setModal(true);
                DG_partMenu.setVisible(true);
            }
        }
    }

    public boolean evaularInicioSec() {
        boolean entrada = false;
        boolean buscUsuario = false;

        for (User usuario : usuarios) {
            if (TF_logUserName.getText().equals(usuario.getNombre())) {
                buscUsuario = true;
            }
        }

        if (buscUsuario) {
            for (User usuario : usuarios) {
                if (TF_logUserName.getText().equals(usuario.getNombre())) {
                    if (TF_logContra.getText().equals(usuario.getContra())) {
                        TF_logContra.setText("");
                        TF_logUserName.setText("");
                        entrada = true;
                        int index = 0;
                        for (User us : usuarios) {
                            if (us.getNombre().equals(TF_logUserName)) {
                                logedUserindex = index;
                                break;
                            }
                            index++;
                        }
                    } else {
                        LB_textoVali.setText("contraseña incorrecta");
                    }
                }
            }
        } else {
            LB_textoVali.setText("usuario invalido");
        }
        return entrada;
    }

    public void inicializarUsuarios() {
        usuarios = new ArrayList();
        adminUsuarios administrador = new adminUsuarios("./usuarios.cbm");
        administrador.cargarArchivo();
        usuarios = administrador.getListaUsuarios();
    }

    public void inicializarTorneos() {
        torneos = new ArrayList();
        adminTorneos administrador = new adminTorneos("./torneos.cbm");
        administrador.cargarArchivo();;
        torneos = administrador.getListatorneos();
    }

    public void setimageLabel(JLabel nomLabel, String ruta) {
        ImageIcon imagen = new ImageIcon(ruta);
        Icon icon = new ImageIcon(
                imagen.getImage().getScaledInstance(nomLabel.getWidth(), nomLabel.getHeight(), Image.SCALE_DEFAULT));
        nomLabel.setIcon(icon);
        this.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CB_admin;
    private javax.swing.JCheckBox CB_participante;
    private javax.swing.JDialog DG_adminMenu;
    private javax.swing.JDialog DG_crearTorneo;
    private javax.swing.JDialog DG_partMenu;
    private javax.swing.JDialog DG_registrarse;
    private javax.swing.JList<String> JL_listaGanados;
    private javax.swing.JList<String> JL_listaParticipantes;
    private javax.swing.JList<String> JL_listaTorneosAdmin;
    private javax.swing.JList<String> JL_listaTorneosCerrados;
    private javax.swing.JList<String> JL_listaTorneosDisp;
    private javax.swing.JLabel LB_inicioSec;
    private javax.swing.JLabel LB_logoUnitec;
    private javax.swing.JLabel LB_registrarse;
    private javax.swing.JLabel LB_registrarse1;
    private javax.swing.JLabel LB_textoVali;
    private javax.swing.JLabel LB_textoVali1;
    private javax.swing.JLabel LB_valiTorneo;
    private javax.swing.JPanel PN_InicioSec;
    private javax.swing.JPanel PN_InicioSec1;
    private javax.swing.JPanel PN_crearTorneoConfirm;
    private javax.swing.JPanel PN_pantallaCrearTorneo;
    private javax.swing.JPanel PN_salir;
    private javax.swing.JPanel PN_salirAdmin;
    private javax.swing.JPanel PN_salirCrearTorneo;
    private javax.swing.JPanel PN_salirPart;
    private javax.swing.JPanel PN_salirRegis;
    private javax.swing.JSpinner SP_rondasTrone;
    private javax.swing.JTextField TF_logContra;
    private javax.swing.JTextField TF_logUserName;
    private javax.swing.JTextField TF_nombreTorneo;
    private javax.swing.JTextField TF_regConfirmContra;
    private javax.swing.JTextField TF_regContra;
    private javax.swing.JTextField TF_regUserName;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    // End of variables declaration//GEN-END:variables
}
