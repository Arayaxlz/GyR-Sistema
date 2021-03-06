package Vista.Paneles;

/**
 * Clase para el panel que contiene Orden, Entrega y Adjudicada
 *
 * @author
 */
public class Pnl_2 extends javax.swing.JPanel {

    /**
     * Constructor de la clase Pnl_2.<br>
     * Inicializa los objetos que hay dentro del panel. Como los 3 paneles de
     * orden, entrega y adjudicada<br>
     * No recibe ningún parametro.
     */
    public Pnl_2() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgDiasEntregaAdjudicada = new javax.swing.ButtonGroup();
        btgEstadoAdjudicada = new javax.swing.ButtonGroup();
        btgEmpresaAdjudicada = new javax.swing.ButtonGroup();
        btgEmpresaEntregada = new javax.swing.ButtonGroup();
        tbpContenedor = new javax.swing.JTabbedPane();
        pnlAdjudicada = new javax.swing.JPanel();
        scpAdjudicada = new javax.swing.JScrollPane();
        tblAdjudicada = new javax.swing.JTable();
        PanelControlAdj = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtBuscarAdjudicada = new javax.swing.JTextField();
        cmbBusquedaAdjudicada = new javax.swing.JComboBox<>();
        btnRefrescarAdjudicada = new javax.swing.JButton();
        PanelBaseAdj = new javax.swing.JPanel();
        PanelOpcionesAdj = new javax.swing.JPanel();
        btnInsertarAdjudicada = new javax.swing.JButton();
        btnModificarAdjudicada = new javax.swing.JButton();
        btnLimpiarAdjudicada = new javax.swing.JButton();
        btnEliminarAdjudicada = new javax.swing.JButton();
        PanelObjetosAdj = new javax.swing.JPanel();
        txtContratacionAdjudicada = new javax.swing.JTextField();
        txtEncargadoAdjudicada = new javax.swing.JTextField();
        txtInstituciónAdjudicada = new javax.swing.JTextField();
        txtDescripcionAdjudicada = new javax.swing.JTextField();
        cmbModalidadAdjudicada = new javax.swing.JComboBox<>();
        scpObservacionesAdjudicada = new javax.swing.JScrollPane();
        txaObservacionAdjudicada = new javax.swing.JTextArea();
        rbtPBAdjudicada = new javax.swing.JRadioButton();
        rbtGyRAdjudicada = new javax.swing.JRadioButton();
        rbtHabilesAdjudicada = new javax.swing.JRadioButton();
        rbtNaturalesAdjudicada = new javax.swing.JRadioButton();
        rbtDudaAdjudicada = new javax.swing.JRadioButton();
        rbtFirmeAdjudicada = new javax.swing.JRadioButton();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        lblLugarr8 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        spnDiasEntregaAdjudicaciones = new javax.swing.JSpinner();
        codAdjudicacion = new javax.swing.JLabel();
        pnlOrden = new javax.swing.JPanel();
        scpOrden = new javax.swing.JScrollPane();
        tblOrden = new javax.swing.JTable();
        PanelBaseOrden = new javax.swing.JPanel();
        PanelOpcionesOrden = new javax.swing.JPanel();
        btnInsertarOrden = new javax.swing.JButton();
        btnModificarOrden = new javax.swing.JButton();
        btnLimpiarOrden = new javax.swing.JButton();
        btnEliminarOrden = new javax.swing.JButton();
        PanelObjetosOrden = new javax.swing.JPanel();
        cmbModalidadOrden = new javax.swing.JComboBox<>();
        txtContratacionOrden = new javax.swing.JTextField();
        txtEncargadoOrden = new javax.swing.JTextField();
        txtDescripcionOrden = new javax.swing.JTextField();
        txtLugarEntregaOrden = new javax.swing.JTextField();
        txtNumOrden = new javax.swing.JTextField();
        scpObservacionesOrden = new javax.swing.JScrollPane();
        txaObservacionOrden = new javax.swing.JTextArea();
        jdcFechaLimiteOrden = new com.toedter.calendar.JDateChooser();
        jLabel95 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        lblLugarr9 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        spnDiasEntregaOrden = new javax.swing.JSpinner();
        spnVigenciaContratoOrden = new javax.swing.JSpinner();
        PanelControlOrden = new javax.swing.JPanel();
        txtBuscarOrden = new javax.swing.JTextField();
        cmbBusquedaOrden = new javax.swing.JComboBox<>();
        btnRefrescarOrden = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        codOrden = new javax.swing.JLabel();
        pnlEntregada = new javax.swing.JPanel();
        scpEntregada = new javax.swing.JScrollPane();
        tblEntregada = new javax.swing.JTable();
        PanelBaseEntregada = new javax.swing.JPanel();
        PanelOpcionesEntregada = new javax.swing.JPanel();
        btnInsertarEntregada = new javax.swing.JButton();
        btnModificarEntregada = new javax.swing.JButton();
        btnLimpiarEntregada = new javax.swing.JButton();
        btnEliminarEntregada = new javax.swing.JButton();
        PanelObjetosEntregada = new javax.swing.JPanel();
        cmbMedioEntregada = new javax.swing.JComboBox<>();
        txtContratacionEntregada = new javax.swing.JTextField();
        txtEncargadoEntregada = new javax.swing.JTextField();
        txtDescripcionEntregada = new javax.swing.JTextField();
        txtLugarEntregada = new javax.swing.JTextField();
        rbtGyREntregada = new javax.swing.JRadioButton();
        rbtPBEntregada = new javax.swing.JRadioButton();
        scpObservacionesEntregada = new javax.swing.JScrollPane();
        txaObservacionEntregada = new javax.swing.JTextArea();
        jdcFechaEntregada = new com.toedter.calendar.JDateChooser();
        jLabel96 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        lblLugarr10 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        spnDiasEntregaEntregada = new javax.swing.JSpinner();
        PanelControlEntregada = new javax.swing.JPanel();
        txtBuscarEntregada = new javax.swing.JTextField();
        cmbBusquedaEntregada = new javax.swing.JComboBox<>();
        btnRefrescarEntregada = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        codEntregada = new javax.swing.JLabel();

        scpAdjudicada.setViewportView(tblAdjudicada);

        PanelControlAdj.setBorder(javax.swing.BorderFactory.createTitledBorder("Control Tabla"));

        jLabel8.setText("Buscar");

        btnRefrescarAdjudicada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/refresh.png"))); // NOI18N
        btnRefrescarAdjudicada.setText("Refrescar");

        javax.swing.GroupLayout PanelControlAdjLayout = new javax.swing.GroupLayout(PanelControlAdj);
        PanelControlAdj.setLayout(PanelControlAdjLayout);
        PanelControlAdjLayout.setHorizontalGroup(
            PanelControlAdjLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelControlAdjLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtBuscarAdjudicada, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbBusquedaAdjudicada, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRefrescarAdjudicada, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelControlAdjLayout.setVerticalGroup(
            PanelControlAdjLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelControlAdjLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelControlAdjLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtBuscarAdjudicada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbBusquedaAdjudicada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRefrescarAdjudicada))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        PanelOpcionesAdj.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Sans", 1, 18))); // NOI18N

        btnInsertarAdjudicada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salvar.png"))); // NOI18N
        btnInsertarAdjudicada.setText("Agregar");

        btnModificarAdjudicada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificar.png"))); // NOI18N
        btnModificarAdjudicada.setText("Modificar");

        btnLimpiarAdjudicada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpiar.png"))); // NOI18N
        btnLimpiarAdjudicada.setText("Limpiar");

        btnEliminarAdjudicada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/borrar-archivo.png"))); // NOI18N
        btnEliminarAdjudicada.setText("Eliminar");

        javax.swing.GroupLayout PanelOpcionesAdjLayout = new javax.swing.GroupLayout(PanelOpcionesAdj);
        PanelOpcionesAdj.setLayout(PanelOpcionesAdjLayout);
        PanelOpcionesAdjLayout.setHorizontalGroup(
            PanelOpcionesAdjLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelOpcionesAdjLayout.createSequentialGroup()
                .addGroup(PanelOpcionesAdjLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelOpcionesAdjLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnEliminarAdjudicada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PanelOpcionesAdjLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnLimpiarAdjudicada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PanelOpcionesAdjLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnModificarAdjudicada, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE))
                    .addGroup(PanelOpcionesAdjLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(btnInsertarAdjudicada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PanelOpcionesAdjLayout.setVerticalGroup(
            PanelOpcionesAdjLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelOpcionesAdjLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(btnInsertarAdjudicada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(btnModificarAdjudicada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(btnLimpiarAdjudicada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(btnEliminarAdjudicada, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        PanelObjetosAdj.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingresar Adjudicada", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Sans", 1, 18))); // NOI18N
        PanelObjetosAdj.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        PanelObjetosAdj.add(txtContratacionAdjudicada, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 35, 250, -1));
        PanelObjetosAdj.add(txtEncargadoAdjudicada, new org.netbeans.lib.awtextra.AbsoluteConstraints(535, 129, 252, -1));
        PanelObjetosAdj.add(txtInstituciónAdjudicada, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 85, 250, -1));
        PanelObjetosAdj.add(txtDescripcionAdjudicada, new org.netbeans.lib.awtextra.AbsoluteConstraints(537, 35, 250, -1));

        cmbModalidadAdjudicada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cantidad definida", "Según demanda", "Del 50%", "Parcial" }));
        PanelObjetosAdj.add(cmbModalidadAdjudicada, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 205, 250, -1));

        txaObservacionAdjudicada.setColumns(20);
        txaObservacionAdjudicada.setRows(5);
        scpObservacionesAdjudicada.setViewportView(txaObservacionAdjudicada);

        PanelObjetosAdj.add(scpObservacionesAdjudicada, new org.netbeans.lib.awtextra.AbsoluteConstraints(535, 202, 252, -1));

        btgEmpresaAdjudicada.add(rbtPBAdjudicada);
        rbtPBAdjudicada.setText("Principal Brands");
        PanelObjetosAdj.add(rbtPBAdjudicada, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 275, -1, -1));

        btgEmpresaAdjudicada.add(rbtGyRAdjudicada);
        rbtGyRAdjudicada.setText("GyR Grupo Asesor");
        PanelObjetosAdj.add(rbtGyRAdjudicada, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, -1, -1));

        btgDiasEntregaAdjudicada.add(rbtHabilesAdjudicada);
        rbtHabilesAdjudicada.setText("Hábiles");
        PanelObjetosAdj.add(rbtHabilesAdjudicada, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 157, -1, -1));

        btgDiasEntregaAdjudicada.add(rbtNaturalesAdjudicada);
        rbtNaturalesAdjudicada.setText("Naturales");
        PanelObjetosAdj.add(rbtNaturalesAdjudicada, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 157, -1, -1));

        btgEstadoAdjudicada.add(rbtDudaAdjudicada);
        rbtDudaAdjudicada.setText("En duda");
        PanelObjetosAdj.add(rbtDudaAdjudicada, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 83, -1, -1));

        btgEstadoAdjudicada.add(rbtFirmeAdjudicada);
        rbtFirmeAdjudicada.setText("En firme");
        PanelObjetosAdj.add(rbtFirmeAdjudicada, new org.netbeans.lib.awtextra.AbsoluteConstraints(535, 83, -1, -1));

        jLabel87.setText("Modalidad entrega");
        PanelObjetosAdj.add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 205, -1, -1));

        jLabel88.setText("Empresa");
        PanelObjetosAdj.add(jLabel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        jLabel89.setText("Días de entrega");
        PanelObjetosAdj.add(jLabel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 130, -1, -1));

        jLabel90.setText("Número de Contratación");
        PanelObjetosAdj.add(jLabel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 38, -1, -1));

        jLabel91.setText("Descripción");
        PanelObjetosAdj.add(jLabel91, new org.netbeans.lib.awtextra.AbsoluteConstraints(457, 38, -1, -1));

        lblLugarr8.setText("Institución");
        PanelObjetosAdj.add(lblLugarr8, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 85, -1, -1));

        jLabel92.setText("Encargado");
        PanelObjetosAdj.add(jLabel92, new org.netbeans.lib.awtextra.AbsoluteConstraints(457, 132, -1, -1));

        jLabel93.setText("Estado");
        PanelObjetosAdj.add(jLabel93, new org.netbeans.lib.awtextra.AbsoluteConstraints(457, 85, -1, -1));

        jLabel94.setText("Observación");
        PanelObjetosAdj.add(jLabel94, new org.netbeans.lib.awtextra.AbsoluteConstraints(457, 205, -1, -1));

        spnDiasEntregaAdjudicaciones.setModel(new javax.swing.SpinnerNumberModel(1, 0, null, 1));
        PanelObjetosAdj.add(spnDiasEntregaAdjudicaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 250, -1));

        javax.swing.GroupLayout PanelBaseAdjLayout = new javax.swing.GroupLayout(PanelBaseAdj);
        PanelBaseAdj.setLayout(PanelBaseAdjLayout);
        PanelBaseAdjLayout.setHorizontalGroup(
            PanelBaseAdjLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBaseAdjLayout.createSequentialGroup()
                .addComponent(PanelObjetosAdj, javax.swing.GroupLayout.PREFERRED_SIZE, 846, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(PanelOpcionesAdj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelBaseAdjLayout.setVerticalGroup(
            PanelBaseAdjLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBaseAdjLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(PanelBaseAdjLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(PanelOpcionesAdj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelObjetosAdj, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        codAdjudicacion.setText("NA");

        javax.swing.GroupLayout pnlAdjudicadaLayout = new javax.swing.GroupLayout(pnlAdjudicada);
        pnlAdjudicada.setLayout(pnlAdjudicadaLayout);
        pnlAdjudicadaLayout.setHorizontalGroup(
            pnlAdjudicadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAdjudicadaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAdjudicadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAdjudicadaLayout.createSequentialGroup()
                        .addComponent(PanelControlAdj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(codAdjudicacion))
                    .addComponent(scpAdjudicada, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PanelBaseAdj, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        pnlAdjudicadaLayout.setVerticalGroup(
            pnlAdjudicadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAdjudicadaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelBaseAdj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAdjudicadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PanelControlAdj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codAdjudicacion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scpAdjudicada, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                .addContainerGap())
        );

        tbpContenedor.addTab("Adjudicada", pnlAdjudicada);

        scpOrden.setViewportView(tblOrden);

        PanelOpcionesOrden.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Sans", 1, 18))); // NOI18N

        btnInsertarOrden.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salvar.png"))); // NOI18N
        btnInsertarOrden.setText("Agregar");

        btnModificarOrden.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificar.png"))); // NOI18N
        btnModificarOrden.setText("Modificar");

        btnLimpiarOrden.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpiar.png"))); // NOI18N
        btnLimpiarOrden.setText("Limpiar");

        btnEliminarOrden.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/borrar-archivo.png"))); // NOI18N
        btnEliminarOrden.setText("Eliminar");

        javax.swing.GroupLayout PanelOpcionesOrdenLayout = new javax.swing.GroupLayout(PanelOpcionesOrden);
        PanelOpcionesOrden.setLayout(PanelOpcionesOrdenLayout);
        PanelOpcionesOrdenLayout.setHorizontalGroup(
            PanelOpcionesOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelOpcionesOrdenLayout.createSequentialGroup()
                .addGroup(PanelOpcionesOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelOpcionesOrdenLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnEliminarOrden, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PanelOpcionesOrdenLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnLimpiarOrden, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PanelOpcionesOrdenLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnModificarOrden, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE))
                    .addGroup(PanelOpcionesOrdenLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(btnInsertarOrden, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PanelOpcionesOrdenLayout.setVerticalGroup(
            PanelOpcionesOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelOpcionesOrdenLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(btnInsertarOrden)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(btnModificarOrden)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(btnLimpiarOrden)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(btnEliminarOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        PanelObjetosOrden.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingresar Orden", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Sans", 1, 18))); // NOI18N
        PanelObjetosOrden.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmbModalidadOrden.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Según demanda", "Cantidad definida", "Del 50%", "Parcial" }));
        PanelObjetosOrden.add(cmbModalidadOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 250, -1));
        PanelObjetosOrden.add(txtContratacionOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 35, 250, -1));
        PanelObjetosOrden.add(txtEncargadoOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 132, 252, -1));
        PanelObjetosOrden.add(txtDescripcionOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 85, 250, -1));
        PanelObjetosOrden.add(txtLugarEntregaOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 38, 250, -1));
        PanelObjetosOrden.add(txtNumOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 250, -1));

        txaObservacionOrden.setColumns(20);
        txaObservacionOrden.setRows(5);
        scpObservacionesOrden.setViewportView(txaObservacionOrden);

        PanelObjetosOrden.add(scpObservacionesOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 180, 252, -1));
        PanelObjetosOrden.add(jdcFechaLimiteOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 250, -1));

        jLabel95.setText("Fecha límite");
        PanelObjetosOrden.add(jLabel95, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        jLabel97.setText("Vigencia de Contrato");
        PanelObjetosOrden.add(jLabel97, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 132, -1, -1));

        jLabel98.setText("Número de Contratación");
        PanelObjetosOrden.add(jLabel98, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 38, -1, -1));

        jLabel99.setText("Descripción");
        PanelObjetosOrden.add(jLabel99, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 85, -1, -1));

        lblLugarr9.setText("Días de Entrega");
        PanelObjetosOrden.add(lblLugarr9, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 85, -1, -1));

        jLabel100.setText("Encargado");
        PanelObjetosOrden.add(jLabel100, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 132, -1, -1));

        jLabel101.setText("Lugar de Entrega");
        PanelObjetosOrden.add(jLabel101, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 38, -1, -1));

        jLabel102.setText("Observación");
        PanelObjetosOrden.add(jLabel102, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, -1, -1));

        jLabel1.setText("Número de Orden");
        PanelObjetosOrden.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        jLabel2.setText("Modalidad de Entrega");
        PanelObjetosOrden.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        spnDiasEntregaOrden.setModel(new javax.swing.SpinnerNumberModel(1, 0, null, 1));
        PanelObjetosOrden.add(spnDiasEntregaOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 250, -1));

        spnVigenciaContratoOrden.setModel(new javax.swing.SpinnerNumberModel(1, 0, null, 1));
        PanelObjetosOrden.add(spnVigenciaContratoOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 250, -1));

        javax.swing.GroupLayout PanelBaseOrdenLayout = new javax.swing.GroupLayout(PanelBaseOrden);
        PanelBaseOrden.setLayout(PanelBaseOrdenLayout);
        PanelBaseOrdenLayout.setHorizontalGroup(
            PanelBaseOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBaseOrdenLayout.createSequentialGroup()
                .addComponent(PanelObjetosOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 846, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(PanelOpcionesOrden, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelBaseOrdenLayout.setVerticalGroup(
            PanelBaseOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBaseOrdenLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(PanelBaseOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(PanelOpcionesOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelObjetosOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        PanelControlOrden.setBorder(javax.swing.BorderFactory.createTitledBorder("Control Tabla"));

        btnRefrescarOrden.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/refresh.png"))); // NOI18N
        btnRefrescarOrden.setText("Refrescar");

        jLabel9.setText("Buscar");

        javax.swing.GroupLayout PanelControlOrdenLayout = new javax.swing.GroupLayout(PanelControlOrden);
        PanelControlOrden.setLayout(PanelControlOrdenLayout);
        PanelControlOrdenLayout.setHorizontalGroup(
            PanelControlOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelControlOrdenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtBuscarOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbBusquedaOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRefrescarOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelControlOrdenLayout.setVerticalGroup(
            PanelControlOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelControlOrdenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelControlOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtBuscarOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbBusquedaOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRefrescarOrden))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        codOrden.setText("NA");

        javax.swing.GroupLayout pnlOrdenLayout = new javax.swing.GroupLayout(pnlOrden);
        pnlOrden.setLayout(pnlOrdenLayout);
        pnlOrdenLayout.setHorizontalGroup(
            pnlOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOrdenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlOrdenLayout.createSequentialGroup()
                        .addComponent(PanelControlOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(codOrden))
                    .addComponent(scpOrden, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PanelBaseOrden, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        pnlOrdenLayout.setVerticalGroup(
            pnlOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOrdenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelBaseOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PanelControlOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codOrden))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scpOrden, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                .addContainerGap())
        );

        tbpContenedor.addTab("Orden", pnlOrden);

        scpEntregada.setViewportView(tblEntregada);

        PanelOpcionesEntregada.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Sans", 1, 18))); // NOI18N

        btnInsertarEntregada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salvar.png"))); // NOI18N
        btnInsertarEntregada.setText("Agregar");

        btnModificarEntregada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificar.png"))); // NOI18N
        btnModificarEntregada.setText("Modificar");

        btnLimpiarEntregada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpiar.png"))); // NOI18N
        btnLimpiarEntregada.setText("Limpiar");

        btnEliminarEntregada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/borrar-archivo.png"))); // NOI18N
        btnEliminarEntregada.setText("Eliminar");

        javax.swing.GroupLayout PanelOpcionesEntregadaLayout = new javax.swing.GroupLayout(PanelOpcionesEntregada);
        PanelOpcionesEntregada.setLayout(PanelOpcionesEntregadaLayout);
        PanelOpcionesEntregadaLayout.setHorizontalGroup(
            PanelOpcionesEntregadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelOpcionesEntregadaLayout.createSequentialGroup()
                .addGroup(PanelOpcionesEntregadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelOpcionesEntregadaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnEliminarEntregada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PanelOpcionesEntregadaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnLimpiarEntregada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PanelOpcionesEntregadaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnModificarEntregada, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE))
                    .addGroup(PanelOpcionesEntregadaLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(btnInsertarEntregada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PanelOpcionesEntregadaLayout.setVerticalGroup(
            PanelOpcionesEntregadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelOpcionesEntregadaLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(btnInsertarEntregada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(btnModificarEntregada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(btnLimpiarEntregada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(btnEliminarEntregada, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        PanelObjetosEntregada.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingresar Orden", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Sans", 1, 18))); // NOI18N
        PanelObjetosEntregada.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmbMedioEntregada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Encomienda", "Proveedor", "Encargado" }));
        PanelObjetosEntregada.add(cmbMedioEntregada, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 250, -1));
        PanelObjetosEntregada.add(txtContratacionEntregada, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 35, 250, -1));
        PanelObjetosEntregada.add(txtEncargadoEntregada, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 132, 252, -1));
        PanelObjetosEntregada.add(txtDescripcionEntregada, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 85, 250, -1));
        PanelObjetosEntregada.add(txtLugarEntregada, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 38, 250, -1));

        btgEmpresaAdjudicada.add(rbtGyREntregada);
        rbtGyREntregada.setText("GyR Grupo Asesor");
        PanelObjetosEntregada.add(rbtGyREntregada, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, -1, -1));

        btgEmpresaAdjudicada.add(rbtPBEntregada);
        rbtPBEntregada.setText("Principal Brands");
        PanelObjetosEntregada.add(rbtPBEntregada, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, -1, -1));

        txaObservacionEntregada.setColumns(20);
        txaObservacionEntregada.setRows(5);
        scpObservacionesEntregada.setViewportView(txaObservacionEntregada);

        PanelObjetosEntregada.add(scpObservacionesEntregada, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 180, 252, -1));
        PanelObjetosEntregada.add(jdcFechaEntregada, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 132, 250, -1));

        jLabel96.setText("Fecha de Entrega");
        PanelObjetosEntregada.add(jLabel96, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 132, -1, -1));

        jLabel104.setText("Número de Contratación");
        PanelObjetosEntregada.add(jLabel104, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 38, -1, -1));

        jLabel105.setText("Descripción");
        PanelObjetosEntregada.add(jLabel105, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 85, -1, -1));

        lblLugarr10.setText("Días de Entrega");
        PanelObjetosEntregada.add(lblLugarr10, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 85, -1, -1));

        jLabel106.setText("Encargado");
        PanelObjetosEntregada.add(jLabel106, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 132, -1, -1));

        jLabel107.setText("Lugar de Entrega");
        PanelObjetosEntregada.add(jLabel107, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 38, -1, -1));

        jLabel108.setText("Observación");
        PanelObjetosEntregada.add(jLabel108, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, -1, -1));

        jLabel4.setText("Medio de Entrega");
        PanelObjetosEntregada.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        jLabel103.setText("Empresa");
        PanelObjetosEntregada.add(jLabel103, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        spnDiasEntregaEntregada.setModel(new javax.swing.SpinnerNumberModel(1, 0, null, 1));
        PanelObjetosEntregada.add(spnDiasEntregaEntregada, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 250, -1));

        javax.swing.GroupLayout PanelBaseEntregadaLayout = new javax.swing.GroupLayout(PanelBaseEntregada);
        PanelBaseEntregada.setLayout(PanelBaseEntregadaLayout);
        PanelBaseEntregadaLayout.setHorizontalGroup(
            PanelBaseEntregadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBaseEntregadaLayout.createSequentialGroup()
                .addComponent(PanelObjetosEntregada, javax.swing.GroupLayout.PREFERRED_SIZE, 846, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(PanelOpcionesEntregada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelBaseEntregadaLayout.setVerticalGroup(
            PanelBaseEntregadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBaseEntregadaLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(PanelBaseEntregadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(PanelOpcionesEntregada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelObjetosEntregada, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        PanelControlEntregada.setBorder(javax.swing.BorderFactory.createTitledBorder("Control Tabla"));

        btnRefrescarEntregada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/refresh.png"))); // NOI18N
        btnRefrescarEntregada.setText("Refrescar");

        jLabel10.setText("Buscar");

        javax.swing.GroupLayout PanelControlEntregadaLayout = new javax.swing.GroupLayout(PanelControlEntregada);
        PanelControlEntregada.setLayout(PanelControlEntregadaLayout);
        PanelControlEntregadaLayout.setHorizontalGroup(
            PanelControlEntregadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelControlEntregadaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtBuscarEntregada, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbBusquedaEntregada, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRefrescarEntregada, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelControlEntregadaLayout.setVerticalGroup(
            PanelControlEntregadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelControlEntregadaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelControlEntregadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtBuscarEntregada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbBusquedaEntregada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRefrescarEntregada))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        codEntregada.setText("NA");

        javax.swing.GroupLayout pnlEntregadaLayout = new javax.swing.GroupLayout(pnlEntregada);
        pnlEntregada.setLayout(pnlEntregadaLayout);
        pnlEntregadaLayout.setHorizontalGroup(
            pnlEntregadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEntregadaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEntregadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEntregadaLayout.createSequentialGroup()
                        .addComponent(PanelControlEntregada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(codEntregada))
                    .addComponent(scpEntregada, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PanelBaseEntregada, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        pnlEntregadaLayout.setVerticalGroup(
            pnlEntregadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEntregadaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelBaseEntregada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlEntregadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PanelControlEntregada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codEntregada))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scpEntregada, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                .addContainerGap())
        );

        tbpContenedor.addTab("Entregada", pnlEntregada);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tbpContenedor)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tbpContenedor)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelBaseAdj;
    private javax.swing.JPanel PanelBaseEntregada;
    private javax.swing.JPanel PanelBaseOrden;
    private javax.swing.JPanel PanelControlAdj;
    private javax.swing.JPanel PanelControlEntregada;
    private javax.swing.JPanel PanelControlOrden;
    private javax.swing.JPanel PanelObjetosAdj;
    private javax.swing.JPanel PanelObjetosEntregada;
    private javax.swing.JPanel PanelObjetosOrden;
    private javax.swing.JPanel PanelOpcionesAdj;
    private javax.swing.JPanel PanelOpcionesEntregada;
    private javax.swing.JPanel PanelOpcionesOrden;
    public javax.swing.ButtonGroup btgDiasEntregaAdjudicada;
    public javax.swing.ButtonGroup btgEmpresaAdjudicada;
    public javax.swing.ButtonGroup btgEmpresaEntregada;
    public javax.swing.ButtonGroup btgEstadoAdjudicada;
    public javax.swing.JButton btnEliminarAdjudicada;
    public javax.swing.JButton btnEliminarEntregada;
    public javax.swing.JButton btnEliminarOrden;
    public javax.swing.JButton btnInsertarAdjudicada;
    public javax.swing.JButton btnInsertarEntregada;
    public javax.swing.JButton btnInsertarOrden;
    public javax.swing.JButton btnLimpiarAdjudicada;
    public javax.swing.JButton btnLimpiarEntregada;
    public javax.swing.JButton btnLimpiarOrden;
    public javax.swing.JButton btnModificarAdjudicada;
    public javax.swing.JButton btnModificarEntregada;
    public javax.swing.JButton btnModificarOrden;
    public javax.swing.JButton btnRefrescarAdjudicada;
    public javax.swing.JButton btnRefrescarEntregada;
    public javax.swing.JButton btnRefrescarOrden;
    public javax.swing.JComboBox<String> cmbBusquedaAdjudicada;
    public javax.swing.JComboBox<String> cmbBusquedaEntregada;
    public javax.swing.JComboBox<String> cmbBusquedaOrden;
    public javax.swing.JComboBox<String> cmbMedioEntregada;
    public javax.swing.JComboBox<String> cmbModalidadAdjudicada;
    public javax.swing.JComboBox<String> cmbModalidadOrden;
    public javax.swing.JLabel codAdjudicacion;
    public javax.swing.JLabel codEntregada;
    public javax.swing.JLabel codOrden;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    public com.toedter.calendar.JDateChooser jdcFechaEntregada;
    public com.toedter.calendar.JDateChooser jdcFechaLimiteOrden;
    private javax.swing.JLabel lblLugarr10;
    private javax.swing.JLabel lblLugarr8;
    private javax.swing.JLabel lblLugarr9;
    private javax.swing.JPanel pnlAdjudicada;
    private javax.swing.JPanel pnlEntregada;
    private javax.swing.JPanel pnlOrden;
    public javax.swing.JRadioButton rbtDudaAdjudicada;
    public javax.swing.JRadioButton rbtFirmeAdjudicada;
    public javax.swing.JRadioButton rbtGyRAdjudicada;
    public javax.swing.JRadioButton rbtGyREntregada;
    public javax.swing.JRadioButton rbtHabilesAdjudicada;
    public javax.swing.JRadioButton rbtNaturalesAdjudicada;
    public javax.swing.JRadioButton rbtPBAdjudicada;
    public javax.swing.JRadioButton rbtPBEntregada;
    public javax.swing.JScrollPane scpAdjudicada;
    public javax.swing.JScrollPane scpEntregada;
    private javax.swing.JScrollPane scpObservacionesAdjudicada;
    private javax.swing.JScrollPane scpObservacionesEntregada;
    private javax.swing.JScrollPane scpObservacionesOrden;
    public javax.swing.JScrollPane scpOrden;
    public javax.swing.JSpinner spnDiasEntregaAdjudicaciones;
    public javax.swing.JSpinner spnDiasEntregaEntregada;
    public javax.swing.JSpinner spnDiasEntregaOrden;
    public javax.swing.JSpinner spnVigenciaContratoOrden;
    public javax.swing.JTable tblAdjudicada;
    public javax.swing.JTable tblEntregada;
    public javax.swing.JTable tblOrden;
    public javax.swing.JTabbedPane tbpContenedor;
    public javax.swing.JTextArea txaObservacionAdjudicada;
    public javax.swing.JTextArea txaObservacionEntregada;
    public javax.swing.JTextArea txaObservacionOrden;
    public javax.swing.JTextField txtBuscarAdjudicada;
    public javax.swing.JTextField txtBuscarEntregada;
    public javax.swing.JTextField txtBuscarOrden;
    public javax.swing.JTextField txtContratacionAdjudicada;
    public javax.swing.JTextField txtContratacionEntregada;
    public javax.swing.JTextField txtContratacionOrden;
    public javax.swing.JTextField txtDescripcionAdjudicada;
    public javax.swing.JTextField txtDescripcionEntregada;
    public javax.swing.JTextField txtDescripcionOrden;
    public javax.swing.JTextField txtEncargadoAdjudicada;
    public javax.swing.JTextField txtEncargadoEntregada;
    public javax.swing.JTextField txtEncargadoOrden;
    public javax.swing.JTextField txtInstituciónAdjudicada;
    public javax.swing.JTextField txtLugarEntregaOrden;
    public javax.swing.JTextField txtLugarEntregada;
    public javax.swing.JTextField txtNumOrden;
    // End of variables declaration//GEN-END:variables
}
