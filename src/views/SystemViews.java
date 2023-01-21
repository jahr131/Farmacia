    package views;

//  @author ALEJANDRO

import controllers.EmployeesController;
import controllers.SettingsControllers;
import models.Employees;
import models.EmployeesDao;

 
public class SystemViews extends javax.swing.JFrame {
    
    Employees employee= new Employees();
    EmployeesDao employeeDao= new EmployeesDao();
    

    public SystemViews() {
        initComponents();
        setSize(1208,680);
        setResizable(false);
        setTitle("Panel principal");
        setLocationRelativeTo(null);
        
        //Controlador Settings
        SettingsControllers setting= new SettingsControllers (this);
        this.repaint();
        
        // Controlador Empleados
        EmployeesController employee_account= new EmployeesController(employee,employeeDao,this);
        employee_account.listAllEmployees();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanelProducts = new javax.swing.JPanel();
        jLabelProducts = new javax.swing.JLabel();
        jPanelPurchases = new javax.swing.JPanel();
        jLabelPurchases = new javax.swing.JLabel();
        jPanelCustomers = new javax.swing.JPanel();
        jLabelCustomers = new javax.swing.JLabel();
        jPanelEmployees = new javax.swing.JPanel();
        jLabelEmployees = new javax.swing.JLabel();
        jPanelSuppliers = new javax.swing.JPanel();
        jLabelSuppliers = new javax.swing.JLabel();
        jPanelCategories = new javax.swing.JPanel();
        jLabelCategories = new javax.swing.JLabel();
        jPanelReports = new javax.swing.JPanel();
        jLabelReports = new javax.swing.JLabel();
        jPanelSettings = new javax.swing.JPanel();
        jLabelSettings = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btn_photo = new javax.swing.JButton();
        btn_logout = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cmb_product_categories = new javax.swing.JComboBox<>();
        txt_product_code = new javax.swing.JTextField();
        txt_product_name = new javax.swing.JTextField();
        txt_product_price_sale = new javax.swing.JTextField();
        txt_product_description = new javax.swing.JTextField();
        txt_product_id = new javax.swing.JTextField();
        btn_product_register = new javax.swing.JButton();
        btn_product_delete = new javax.swing.JButton();
        btn_product_update = new javax.swing.JButton();
        btn_product_cancel = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txt_product_search = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        product_table = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cmb_purchase_supplier = new javax.swing.JComboBox<>();
        txt_purchases_amount = new javax.swing.JTextField();
        txt_purchases_product_name = new javax.swing.JTextField();
        txt_purchases_product_code = new javax.swing.JTextField();
        txt_purchases = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txt_purchases_price = new javax.swing.JTextField();
        txt_purchases_subtotal = new javax.swing.JTextField();
        txt_purchases_id = new javax.swing.JTextField();
        txt_purchases_total_to_pay = new javax.swing.JTextField();
        btn_add_product_to_buy = new javax.swing.JButton();
        btn_confirm_purchase = new javax.swing.JButton();
        btn_remove_purchase = new javax.swing.JButton();
        btn_new_purchase = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        purchases_table = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txt_Customers_name = new javax.swing.JTextField();
        txt_Customers_identification = new javax.swing.JTextField();
        txt_Customers_address = new javax.swing.JTextField();
        txt_Customers_telephone = new javax.swing.JTextField();
        txt_Customers_email = new javax.swing.JTextField();
        btn_add_Customers = new javax.swing.JButton();
        btn_update_Customers = new javax.swing.JButton();
        btn_delete_Customers = new javax.swing.JButton();
        btn_cancel_Customers = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        txt_Customers_search = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        Customers_table = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        txt_Employees_identification = new javax.swing.JTextField();
        txt_Employees_name = new javax.swing.JTextField();
        txt_Employees_user = new javax.swing.JTextField();
        txt_Employees_address = new javax.swing.JTextField();
        cmb_Employees_rol = new javax.swing.JComboBox<>();
        txt_Employees_telephone = new javax.swing.JTextField();
        txt_Employees_email = new javax.swing.JTextField();
        btn_add_Employees = new javax.swing.JButton();
        btn_update_Employees = new javax.swing.JButton();
        btn_delete_Employees = new javax.swing.JButton();
        btn_cancel_Employees = new javax.swing.JButton();
        txt_Employees_password = new javax.swing.JPasswordField();
        jLabel31 = new javax.swing.JLabel();
        txt_employees_search = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        employees = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        txt_Suppliers_name = new javax.swing.JTextField();
        txt_Suppliers_address = new javax.swing.JTextField();
        txt_Suppliers_telephone = new javax.swing.JTextField();
        txt_Suppliers_email = new javax.swing.JTextField();
        txt_Suppliers_description = new javax.swing.JTextField();
        cmb_Suppliers_city = new javax.swing.JComboBox<>();
        txt_Suppliers_id = new javax.swing.JTextField();
        btn_add_Suppliers = new javax.swing.JButton();
        btn_update_Suppliers = new javax.swing.JButton();
        btn_delete_Suppliers = new javax.swing.JButton();
        btn_cancel_Suppliers = new javax.swing.JButton();
        jLabel39 = new javax.swing.JLabel();
        txt_Suppliers_search = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        Suppliers_table = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        btn_add_Categories = new javax.swing.JButton();
        btn_update_Categories = new javax.swing.JButton();
        btn_delete_Categories = new javax.swing.JButton();
        btn_cancel_Categories = new javax.swing.JButton();
        txt_Categories_id = new javax.swing.JTextField();
        txt_Categories_name = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        txt_Categories_search = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        Categories_table = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        Reports_table = new javax.swing.JTable();
        jPanel11 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        btn_update_Profile = new javax.swing.JButton();
        txt_Profile_identification = new javax.swing.JTextField();
        txt_Profile_name = new javax.swing.JTextField();
        txt_Profile_address = new javax.swing.JTextField();
        txt_Profile_telephone = new javax.swing.JTextField();
        txt_Profile_email = new javax.swing.JTextField();
        txt_Profile_password = new javax.swing.JPasswordField();
        txt_Profile_confirm_password = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(18, 45, 61));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelProducts.setBackground(new java.awt.Color(18, 45, 61));

        jLabelProducts.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelProducts.setForeground(new java.awt.Color(255, 255, 255));
        jLabelProducts.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelProducts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/productos.png"))); // NOI18N
        jLabelProducts.setText("   Productos");

        javax.swing.GroupLayout jPanelProductsLayout = new javax.swing.GroupLayout(jPanelProducts);
        jPanelProducts.setLayout(jPanelProductsLayout);
        jPanelProductsLayout.setHorizontalGroup(
            jPanelProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelProducts, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        jPanelProductsLayout.setVerticalGroup(
            jPanelProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelProducts, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jPanel1.add(jPanelProducts, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 200, 35));

        jPanelPurchases.setBackground(new java.awt.Color(18, 45, 61));

        jLabelPurchases.setBackground(new java.awt.Color(18, 45, 61));
        jLabelPurchases.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelPurchases.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPurchases.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPurchases.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/compras.png"))); // NOI18N
        jLabelPurchases.setText("   Compras");

        javax.swing.GroupLayout jPanelPurchasesLayout = new javax.swing.GroupLayout(jPanelPurchases);
        jPanelPurchases.setLayout(jPanelPurchasesLayout);
        jPanelPurchasesLayout.setHorizontalGroup(
            jPanelPurchasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelPurchases, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        jPanelPurchasesLayout.setVerticalGroup(
            jPanelPurchasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelPurchases, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jPanel1.add(jPanelPurchases, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 200, 35));

        jPanelCustomers.setBackground(new java.awt.Color(18, 45, 61));

        jLabelCustomers.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelCustomers.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCustomers.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCustomers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clientes.png"))); // NOI18N
        jLabelCustomers.setText("   Clientes");

        javax.swing.GroupLayout jPanelCustomersLayout = new javax.swing.GroupLayout(jPanelCustomers);
        jPanelCustomers.setLayout(jPanelCustomersLayout);
        jPanelCustomersLayout.setHorizontalGroup(
            jPanelCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelCustomers, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        jPanelCustomersLayout.setVerticalGroup(
            jPanelCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelCustomers, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jPanel1.add(jPanelCustomers, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 200, 35));

        jPanelEmployees.setBackground(new java.awt.Color(18, 45, 61));

        jLabelEmployees.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelEmployees.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEmployees.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEmployees.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Empleados.png"))); // NOI18N
        jLabelEmployees.setText("   Empleados");

        javax.swing.GroupLayout jPanelEmployeesLayout = new javax.swing.GroupLayout(jPanelEmployees);
        jPanelEmployees.setLayout(jPanelEmployeesLayout);
        jPanelEmployeesLayout.setHorizontalGroup(
            jPanelEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelEmployees, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        jPanelEmployeesLayout.setVerticalGroup(
            jPanelEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelEmployees, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jPanel1.add(jPanelEmployees, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 200, 35));

        jPanelSuppliers.setBackground(new java.awt.Color(18, 45, 61));

        jLabelSuppliers.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelSuppliers.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSuppliers.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSuppliers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/proveedores.png"))); // NOI18N
        jLabelSuppliers.setText("   Proveedores");

        javax.swing.GroupLayout jPanelSuppliersLayout = new javax.swing.GroupLayout(jPanelSuppliers);
        jPanelSuppliers.setLayout(jPanelSuppliersLayout);
        jPanelSuppliersLayout.setHorizontalGroup(
            jPanelSuppliersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelSuppliers, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        jPanelSuppliersLayout.setVerticalGroup(
            jPanelSuppliersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelSuppliers, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jPanel1.add(jPanelSuppliers, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 200, 35));

        jPanelCategories.setBackground(new java.awt.Color(18, 45, 61));

        jLabelCategories.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelCategories.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCategories.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCategories.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/categorias.png"))); // NOI18N
        jLabelCategories.setText("   Categorias");

        javax.swing.GroupLayout jPanelCategoriesLayout = new javax.swing.GroupLayout(jPanelCategories);
        jPanelCategories.setLayout(jPanelCategoriesLayout);
        jPanelCategoriesLayout.setHorizontalGroup(
            jPanelCategoriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelCategories, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        jPanelCategoriesLayout.setVerticalGroup(
            jPanelCategoriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelCategories, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jPanel1.add(jPanelCategories, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 200, 35));

        jPanelReports.setBackground(new java.awt.Color(18, 45, 61));

        jLabelReports.setBackground(new java.awt.Color(18, 45, 61));
        jLabelReports.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelReports.setForeground(new java.awt.Color(255, 255, 255));
        jLabelReports.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelReports.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Reportes.png"))); // NOI18N
        jLabelReports.setText("   Reportes");

        javax.swing.GroupLayout jPanelReportsLayout = new javax.swing.GroupLayout(jPanelReports);
        jPanelReports.setLayout(jPanelReportsLayout);
        jPanelReportsLayout.setHorizontalGroup(
            jPanelReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelReports, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        jPanelReportsLayout.setVerticalGroup(
            jPanelReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelReports, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jPanel1.add(jPanelReports, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 200, 35));

        jPanelSettings.setBackground(new java.awt.Color(18, 45, 61));

        jLabelSettings.setBackground(new java.awt.Color(18, 45, 61));
        jLabelSettings.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelSettings.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSettings.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSettings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ajustes.png"))); // NOI18N
        jLabelSettings.setText("   Ajustes");

        javax.swing.GroupLayout jPanelSettingsLayout = new javax.swing.GroupLayout(jPanelSettings);
        jPanelSettings.setLayout(jPanelSettingsLayout);
        jPanelSettingsLayout.setHorizontalGroup(
            jPanelSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelSettings, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        jPanelSettingsLayout.setVerticalGroup(
            jPanelSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelSettings, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jPanel1.add(jPanelSettings, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 200, 35));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 200, 580));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Icono-Farmacia (1).png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 100));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 100));

        jPanel3.setBackground(new java.awt.Color(18, 45, 61));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_photo.setBackground(new java.awt.Color(0, 102, 102));
        btn_photo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/2922716 (1).png"))); // NOI18N
        jPanel3.add(btn_photo, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, -1, 80));

        btn_logout.setBackground(new java.awt.Color(0, 102, 102));
        btn_logout.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_logout.setText("Salir");
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });
        jPanel3.add(btn_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Freed from Desire");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 23, 430, 60));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 1010, 100));

        jTabbedPane1.setBackground(new java.awt.Color(0, 51, 51));
        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Productos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 11), new java.awt.Color(0, 102, 102))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Código:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Nombre:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Precio venta:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Descripción:");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Categoria:");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Id:");

        cmb_product_categories.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        cmb_product_categories.setForeground(new java.awt.Color(0, 0, 0));

        txt_product_id.setEditable(false);

        btn_product_register.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_product_register.setForeground(new java.awt.Color(0, 0, 0));
        btn_product_register.setText("Registrar");

        btn_product_delete.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_product_delete.setForeground(new java.awt.Color(0, 0, 0));
        btn_product_delete.setText("Eliminar");

        btn_product_update.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_product_update.setForeground(new java.awt.Color(0, 0, 0));
        btn_product_update.setText("Actualizar");

        btn_product_cancel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_product_cancel.setForeground(new java.awt.Color(0, 0, 0));
        btn_product_cancel.setText("Cancelar");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_product_price_sale, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(txt_product_name, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_product_code, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(60, 60, 60)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_product_id, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cmb_product_categories, 0, 160, Short.MAX_VALUE)
                        .addComponent(txt_product_description)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_product_update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_product_cancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_product_delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_product_register, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(60, 60, 60))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_product_code, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_product_description, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btn_product_register)))
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(txt_product_price_sale, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_product_id, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btn_product_delete)
                        .addGap(29, 29, 29)
                        .addComponent(btn_product_update))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_product_name, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmb_product_categories, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(9, 9, 9)
                .addComponent(btn_product_cancel)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 20, 920, 270));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel9.setText("Buscar:");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, -1, -1));
        jPanel4.add(txt_product_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 160, 25));

        product_table.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        product_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Código", "Nombre", "Descrición", "Precio", "Cantidad", "Categoria"
            }
        ));
        product_table.setEnabled(false);
        jScrollPane1.setViewportView(product_table);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 930, 150));

        jTabbedPane1.addTab("Productos", jPanel4);

        jPanel5.setBackground(new java.awt.Color(0, 102, 102));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Compras", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12), new java.awt.Color(0, 102, 102))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Código producto:");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Nombre:");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Cantidad:");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Proveedor:");

        cmb_purchase_supplier.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        cmb_purchase_supplier.setForeground(new java.awt.Color(0, 0, 0));

        txt_purchases_amount.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        txt_purchases_amount.setForeground(new java.awt.Color(0, 0, 0));

        txt_purchases_product_name.setEditable(false);
        txt_purchases_product_name.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        txt_purchases_product_name.setForeground(new java.awt.Color(0, 0, 0));

        txt_purchases_product_code.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        txt_purchases_product_code.setForeground(new java.awt.Color(0, 0, 0));

        txt_purchases.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        txt_purchases.setForeground(new java.awt.Color(0, 0, 0));
        txt_purchases.setText("Precio de compra:");

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Subtotal:");

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Id:");

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Total a pagar:");

        txt_purchases_price.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        txt_purchases_price.setForeground(new java.awt.Color(0, 0, 0));

        txt_purchases_subtotal.setEditable(false);
        txt_purchases_subtotal.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        txt_purchases_subtotal.setForeground(new java.awt.Color(0, 0, 0));

        txt_purchases_id.setEditable(false);
        txt_purchases_id.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        txt_purchases_id.setForeground(new java.awt.Color(0, 0, 0));

        txt_purchases_total_to_pay.setEditable(false);
        txt_purchases_total_to_pay.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        txt_purchases_total_to_pay.setForeground(new java.awt.Color(0, 0, 0));

        btn_add_product_to_buy.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btn_add_product_to_buy.setForeground(new java.awt.Color(0, 0, 0));
        btn_add_product_to_buy.setText("Agregar");

        btn_confirm_purchase.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btn_confirm_purchase.setForeground(new java.awt.Color(0, 0, 0));
        btn_confirm_purchase.setText("Comprar");

        btn_remove_purchase.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btn_remove_purchase.setForeground(new java.awt.Color(0, 0, 0));
        btn_remove_purchase.setText("Eliminar");

        btn_new_purchase.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btn_new_purchase.setForeground(new java.awt.Color(0, 0, 0));
        btn_new_purchase.setText("Nuevo");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_purchases_product_name, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_purchases_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_purchases_product_code, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_purchase_supplier, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(txt_purchases)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_purchases_id, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_purchases_subtotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_purchases_price, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_purchases_total_to_pay, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_add_product_to_buy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_confirm_purchase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_remove_purchase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_new_purchase, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(btn_add_product_to_buy)
                        .addGap(40, 40, 40)
                        .addComponent(btn_confirm_purchase)
                        .addGap(31, 31, 31)
                        .addComponent(btn_remove_purchase))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_purchases_product_code, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_purchases_product_name, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_purchases_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmb_purchase_supplier, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_purchases_price, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_purchases, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_purchases_subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_purchases_id, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_purchases_total_to_pay, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_new_purchase))))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        jPanel5.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 20, 920, 310));

        purchases_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre producto", "Cantidad", "Precio", "Subtotal", "Proveedor"
            }
        ));
        jScrollPane2.setViewportView(purchases_table);

        jPanel5.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 910, 130));

        jTabbedPane1.addTab("Compras", jPanel5);

        jPanel6.setBackground(new java.awt.Color(0, 102, 102));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Clientes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12), new java.awt.Color(0, 102, 102))); // NOI18N

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Nombre:");

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Identificación:");

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Dirección:");

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Teléfono:");

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("Correo:");

        txt_Customers_name.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txt_Customers_name.setForeground(new java.awt.Color(0, 0, 0));

        txt_Customers_identification.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txt_Customers_identification.setForeground(new java.awt.Color(0, 0, 0));

        txt_Customers_address.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txt_Customers_address.setForeground(new java.awt.Color(0, 0, 0));

        txt_Customers_telephone.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txt_Customers_telephone.setForeground(new java.awt.Color(0, 0, 0));

        txt_Customers_email.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txt_Customers_email.setForeground(new java.awt.Color(0, 0, 0));

        btn_add_Customers.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btn_add_Customers.setForeground(new java.awt.Color(0, 0, 0));
        btn_add_Customers.setText("Registrar");

        btn_update_Customers.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btn_update_Customers.setForeground(new java.awt.Color(0, 0, 0));
        btn_update_Customers.setText("Modificar");
        btn_update_Customers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_update_CustomersActionPerformed(evt);
            }
        });

        btn_delete_Customers.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btn_delete_Customers.setForeground(new java.awt.Color(0, 0, 0));
        btn_delete_Customers.setText("Eliminar");

        btn_cancel_Customers.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btn_cancel_Customers.setForeground(new java.awt.Color(0, 0, 0));
        btn_cancel_Customers.setText("Cancelar");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19))
                .addGap(36, 36, 36)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_Customers_identification, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Customers_name, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(78, 78, 78)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_Customers_email, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Customers_telephone, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txt_Customers_address, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btn_update_Customers, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                        .addComponent(btn_add_Customers, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                        .addComponent(btn_delete_Customers, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                    .addComponent(btn_cancel_Customers, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel20)
                    .addComponent(txt_Customers_name, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Customers_telephone, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_add_Customers))
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(jLabel21)
                            .addComponent(txt_Customers_identification, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Customers_email, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(btn_update_Customers)))
                .addGap(19, 19, 19)
                .addComponent(btn_delete_Customers)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(txt_Customers_address, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(btn_cancel_Customers)))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel6.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 20, 920, 270));

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("Buscar:");
        jPanel6.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 50, -1));

        txt_Customers_search.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        jPanel6.add(txt_Customers_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 160, 25));

        Customers_table.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        Customers_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Identificación", "Teléfono", "Dirección", "Correo"
            }
        ));
        jScrollPane3.setViewportView(Customers_table);

        jPanel6.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 930, 150));

        jTabbedPane1.addTab("Clientes", jPanel6);

        jPanel7.setBackground(new java.awt.Color(0, 102, 102));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Empleados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12), new java.awt.Color(0, 102, 102))); // NOI18N

        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel23.setText("Identificación:");

        jLabel24.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel24.setText("Nombre:");

        jLabel25.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel25.setText("Usuario:");

        jLabel26.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel26.setText("Rol:");

        jLabel27.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel27.setText("Dirección:");

        jLabel28.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel28.setText("Teléfono:");

        jLabel29.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel29.setText("Correo:");

        jLabel30.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel30.setText("Contraseña:");

        txt_Employees_identification.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        txt_Employees_name.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        txt_Employees_user.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        txt_Employees_address.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        cmb_Employees_rol.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cmb_Employees_rol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Auxiliar" }));

        txt_Employees_telephone.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        txt_Employees_email.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        btn_add_Employees.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btn_add_Employees.setText("Registrar");

        btn_update_Employees.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btn_update_Employees.setText("Modificar");

        btn_delete_Employees.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btn_delete_Employees.setText("Eliminar");

        btn_cancel_Employees.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btn_cancel_Employees.setText("Cancelar");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25)
                    .addComponent(jLabel26))
                .addGap(44, 44, 44)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_Employees_user, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Employees_name, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Employees_identification, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_Employees_rol, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27)
                    .addComponent(jLabel28)
                    .addComponent(jLabel29)
                    .addComponent(jLabel30))
                .addGap(38, 38, 38)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_Employees_address, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Employees_email, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Employees_telephone, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Employees_password, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_update_Employees, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_add_Employees, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_delete_Employees, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cancel_Employees, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(btn_add_Employees, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(btn_update_Employees, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btn_delete_Employees, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btn_cancel_Employees, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Employees_identification, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Employees_name, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Employees_telephone, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Employees_user, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Employees_email, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmb_Employees_rol, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Employees_password, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_Employees_address, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jPanel7.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 20, 920, 300));

        jLabel31.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel31.setText("Buscar:");
        jPanel7.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 50, 25));

        txt_employees_search.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel7.add(txt_employees_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 160, 25));

        employees.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        employees.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identificación", "Nombre ", "Usuario", "Dirección", "Teléfono", "Correo", "Rol"
            }
        ));
        jScrollPane4.setViewportView(employees);

        jPanel7.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 930, 130));

        jTabbedPane1.addTab("Empleados", jPanel7);

        jPanel8.setBackground(new java.awt.Color(0, 102, 102));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Proveedores", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12), new java.awt.Color(0, 102, 102))); // NOI18N

        jLabel32.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(0, 0, 0));
        jLabel32.setText("Nombre:");

        jLabel33.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(0, 0, 0));
        jLabel33.setText("Dirección:");

        jLabel34.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(0, 0, 0));
        jLabel34.setText("Teléfono:");

        jLabel35.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(0, 0, 0));
        jLabel35.setText("Correo:");

        jLabel36.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(0, 0, 0));
        jLabel36.setText("Descripción:");

        jLabel37.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(0, 0, 0));
        jLabel37.setText("Ciudad:");

        jLabel38.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(0, 0, 0));
        jLabel38.setText("Id:");

        txt_Suppliers_name.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txt_Suppliers_name.setForeground(new java.awt.Color(0, 0, 0));

        txt_Suppliers_address.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txt_Suppliers_address.setForeground(new java.awt.Color(0, 0, 0));

        txt_Suppliers_telephone.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txt_Suppliers_telephone.setForeground(new java.awt.Color(0, 0, 0));

        txt_Suppliers_email.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txt_Suppliers_email.setForeground(new java.awt.Color(0, 0, 0));

        txt_Suppliers_description.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txt_Suppliers_description.setForeground(new java.awt.Color(0, 0, 0));

        cmb_Suppliers_city.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cmb_Suppliers_city.setForeground(new java.awt.Color(0, 0, 0));
        cmb_Suppliers_city.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bogotá", "Barranquilla", "Cali", "Medellín" }));

        txt_Suppliers_id.setEditable(false);
        txt_Suppliers_id.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txt_Suppliers_id.setForeground(new java.awt.Color(0, 0, 0));

        btn_add_Suppliers.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btn_add_Suppliers.setForeground(new java.awt.Color(0, 0, 0));
        btn_add_Suppliers.setText("Registrar");

        btn_update_Suppliers.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btn_update_Suppliers.setForeground(new java.awt.Color(0, 0, 0));
        btn_update_Suppliers.setText("Modificar");

        btn_delete_Suppliers.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btn_delete_Suppliers.setForeground(new java.awt.Color(0, 0, 0));
        btn_delete_Suppliers.setText("Eliminar");

        btn_cancel_Suppliers.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btn_cancel_Suppliers.setForeground(new java.awt.Color(0, 0, 0));
        btn_cancel_Suppliers.setText("Cancelar");
        btn_cancel_Suppliers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancel_SuppliersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel32)
                    .addComponent(jLabel33)
                    .addComponent(jLabel34)
                    .addComponent(jLabel35))
                .addGap(51, 51, 51)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_Suppliers_telephone, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Suppliers_address, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Suppliers_name, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(87, 87, 87)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel36)
                            .addComponent(jLabel37)
                            .addComponent(jLabel38))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_Suppliers_description, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Suppliers_id, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmb_Suppliers_city, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txt_Suppliers_email, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_delete_Suppliers, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_update_Suppliers, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_add_Suppliers, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cancel_Suppliers, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Suppliers_name, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Suppliers_description, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_add_Suppliers, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Suppliers_address, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_Suppliers_city, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_update_Suppliers, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Suppliers_telephone, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Suppliers_id, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_delete_Suppliers, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Suppliers_email, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cancel_Suppliers, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jPanel8.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 20, 920, 270));

        jLabel39.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(0, 0, 0));
        jLabel39.setText("Buscar:");
        jPanel8.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 50, 25));

        txt_Suppliers_search.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txt_Suppliers_search.setForeground(new java.awt.Color(0, 0, 0));
        jPanel8.add(txt_Suppliers_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 160, 25));

        Suppliers_table.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Suppliers_table.setForeground(new java.awt.Color(0, 0, 0));
        Suppliers_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Dirección", "Teléfono", "Correo", "Descripción", "Ciudad"
            }
        ));
        jScrollPane5.setViewportView(Suppliers_table);

        jPanel8.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 920, 160));

        jTabbedPane1.addTab("Proveedores", jPanel8);

        jPanel9.setBackground(new java.awt.Color(0, 102, 102));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Categorias", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12), new java.awt.Color(0, 102, 102))); // NOI18N

        jLabel40.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel40.setText("Id:");

        jLabel41.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel41.setText("Nombre:");

        btn_add_Categories.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btn_add_Categories.setText("Registrar");

        btn_update_Categories.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btn_update_Categories.setText("Modificar");
        btn_update_Categories.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_update_CategoriesActionPerformed(evt);
            }
        });

        btn_delete_Categories.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btn_delete_Categories.setText("Eliminar");

        btn_cancel_Categories.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btn_cancel_Categories.setText("Cancelar");

        txt_Categories_id.setEditable(false);
        txt_Categories_id.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txt_Categories_id.setForeground(new java.awt.Color(0, 0, 0));

        txt_Categories_name.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txt_Categories_name.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel41)
                    .addComponent(jLabel40))
                .addGap(50, 50, 50)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_Categories_name, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Categories_id, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_cancel_Categories, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_update_Categories, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_add_Categories, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_delete_Categories, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(btn_add_Categories, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btn_update_Categories, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_delete_Categories, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Categories_id, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Categories_name, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_cancel_Categories, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jPanel9.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 520, 270));

        jLabel42.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(0, 0, 0));
        jLabel42.setText("Buscar:");
        jPanel9.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 100, -1, -1));

        txt_Categories_search.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel9.add(txt_Categories_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 90, 160, 25));

        Categories_table.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Categories_table.setForeground(new java.awt.Color(0, 0, 0));
        Categories_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre"
            }
        ));
        jScrollPane6.setViewportView(Categories_table);

        jPanel9.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 150, 380, 210));

        jTabbedPane1.addTab("Categorias", jPanel9);

        jPanel10.setBackground(new java.awt.Color(0, 102, 102));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel43.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("Compras realizadas");
        jPanel10.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 350, -1));

        Reports_table.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Reports_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Factura", "Proveedor", "Total", "Fecha de compra"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane7.setViewportView(Reports_table);

        jPanel10.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 820, 330));

        jTabbedPane1.addTab("Reportes", jPanel10);

        jPanel11.setBackground(new java.awt.Color(0, 102, 102));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Editar perfil", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12), new java.awt.Color(0, 102, 102))); // NOI18N

        jLabel44.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(0, 0, 0));
        jLabel44.setText("Identificación:");

        jLabel45.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(0, 0, 0));
        jLabel45.setText("Nombre completo:");

        jLabel46.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(0, 0, 0));
        jLabel46.setText("Dirección:");

        jLabel47.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(0, 0, 0));
        jLabel47.setText("Teléfono:");

        jLabel48.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(0, 0, 0));
        jLabel48.setText("Correo:");

        jLabel49.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(0, 0, 0));
        jLabel49.setText("Nueva contraseña:");

        jLabel50.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(0, 0, 0));
        jLabel50.setText("Confirmar contraseña:");

        btn_update_Profile.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_update_Profile.setForeground(new java.awt.Color(0, 0, 0));
        btn_update_Profile.setText("Modificar");

        txt_Profile_identification.setEditable(false);
        txt_Profile_identification.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txt_Profile_identification.setForeground(new java.awt.Color(0, 0, 0));

        txt_Profile_name.setEditable(false);
        txt_Profile_name.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txt_Profile_name.setForeground(new java.awt.Color(0, 0, 0));

        txt_Profile_address.setEditable(false);
        txt_Profile_address.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txt_Profile_address.setForeground(new java.awt.Color(0, 0, 0));

        txt_Profile_telephone.setEditable(false);
        txt_Profile_telephone.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txt_Profile_telephone.setForeground(new java.awt.Color(0, 0, 0));

        txt_Profile_email.setEditable(false);
        txt_Profile_email.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txt_Profile_email.setForeground(new java.awt.Color(0, 0, 0));

        txt_Profile_password.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        txt_Profile_confirm_password.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                        .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_Profile_name, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                        .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_Profile_identification, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_Profile_address, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Profile_telephone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(58, 58, 58)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel48)
                    .addComponent(jLabel49)
                    .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_Profile_email, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Profile_password, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Profile_confirm_password, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(168, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_update_Profile, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Profile_email, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Profile_identification, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Profile_name, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Profile_password, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(btn_update_Profile, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Profile_address, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Profile_confirm_password, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Profile_telephone, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        jPanel11.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 60, 930, 400));

        jTabbedPane1.addTab("Ajustes", jPanel11);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 1010, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_update_CustomersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_update_CustomersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_update_CustomersActionPerformed

    private void btn_cancel_SuppliersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancel_SuppliersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_cancel_SuppliersActionPerformed

    private void btn_update_CategoriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_update_CategoriesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_update_CategoriesActionPerformed

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        // TODO add your handling code here:
        if (evt.getSource() == btn_logout){
            dispose();
            login login= new login();
            login.setVisible(true);
            
        }
    }//GEN-LAST:event_btn_logoutActionPerformed

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
            java.util.logging.Logger.getLogger(SystemViews.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SystemViews.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SystemViews.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SystemViews.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SystemViews().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable Categories_table;
    public javax.swing.JTable Customers_table;
    public javax.swing.JTable Reports_table;
    public javax.swing.JTable Suppliers_table;
    public javax.swing.JButton btn_add_Categories;
    public javax.swing.JButton btn_add_Customers;
    public javax.swing.JButton btn_add_Employees;
    public javax.swing.JButton btn_add_Suppliers;
    public javax.swing.JButton btn_add_product_to_buy;
    public javax.swing.JButton btn_cancel_Categories;
    public javax.swing.JButton btn_cancel_Customers;
    public javax.swing.JButton btn_cancel_Employees;
    public javax.swing.JButton btn_cancel_Suppliers;
    public javax.swing.JButton btn_confirm_purchase;
    public javax.swing.JButton btn_delete_Categories;
    public javax.swing.JButton btn_delete_Customers;
    public javax.swing.JButton btn_delete_Employees;
    public javax.swing.JButton btn_delete_Suppliers;
    public javax.swing.JButton btn_logout;
    public javax.swing.JButton btn_new_purchase;
    public javax.swing.JButton btn_photo;
    public javax.swing.JButton btn_product_cancel;
    public javax.swing.JButton btn_product_delete;
    public javax.swing.JButton btn_product_register;
    public javax.swing.JButton btn_product_update;
    public javax.swing.JButton btn_remove_purchase;
    public javax.swing.JButton btn_update_Categories;
    public javax.swing.JButton btn_update_Customers;
    public javax.swing.JButton btn_update_Employees;
    public javax.swing.JButton btn_update_Profile;
    public javax.swing.JButton btn_update_Suppliers;
    public javax.swing.JComboBox<String> cmb_Employees_rol;
    public javax.swing.JComboBox<String> cmb_Suppliers_city;
    public javax.swing.JComboBox<Object> cmb_product_categories;
    public javax.swing.JComboBox<Object> cmb_purchase_supplier;
    public javax.swing.JTable employees;
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
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JLabel jLabelCategories;
    public javax.swing.JLabel jLabelCustomers;
    public javax.swing.JLabel jLabelEmployees;
    public javax.swing.JLabel jLabelProducts;
    public javax.swing.JLabel jLabelPurchases;
    public javax.swing.JLabel jLabelReports;
    public javax.swing.JLabel jLabelSettings;
    public javax.swing.JLabel jLabelSuppliers;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    public javax.swing.JPanel jPanelCategories;
    public javax.swing.JPanel jPanelCustomers;
    public javax.swing.JPanel jPanelEmployees;
    public javax.swing.JPanel jPanelProducts;
    public javax.swing.JPanel jPanelPurchases;
    public javax.swing.JPanel jPanelReports;
    public javax.swing.JPanel jPanelSettings;
    public javax.swing.JPanel jPanelSuppliers;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    public javax.swing.JTabbedPane jTabbedPane1;
    public javax.swing.JTable product_table;
    private javax.swing.JTable purchases_table;
    public javax.swing.JTextField txt_Categories_id;
    public javax.swing.JTextField txt_Categories_name;
    public javax.swing.JTextField txt_Categories_search;
    public javax.swing.JTextField txt_Customers_address;
    public javax.swing.JTextField txt_Customers_email;
    public javax.swing.JTextField txt_Customers_identification;
    public javax.swing.JTextField txt_Customers_name;
    public javax.swing.JTextField txt_Customers_search;
    public javax.swing.JTextField txt_Customers_telephone;
    public javax.swing.JTextField txt_Employees_address;
    public javax.swing.JTextField txt_Employees_email;
    public javax.swing.JTextField txt_Employees_identification;
    public javax.swing.JTextField txt_Employees_name;
    public javax.swing.JPasswordField txt_Employees_password;
    public javax.swing.JTextField txt_Employees_telephone;
    public javax.swing.JTextField txt_Employees_user;
    public javax.swing.JTextField txt_Profile_address;
    public javax.swing.JPasswordField txt_Profile_confirm_password;
    public javax.swing.JTextField txt_Profile_email;
    public javax.swing.JTextField txt_Profile_identification;
    public javax.swing.JTextField txt_Profile_name;
    public javax.swing.JPasswordField txt_Profile_password;
    public javax.swing.JTextField txt_Profile_telephone;
    public javax.swing.JTextField txt_Suppliers_address;
    public javax.swing.JTextField txt_Suppliers_description;
    public javax.swing.JTextField txt_Suppliers_email;
    public javax.swing.JTextField txt_Suppliers_id;
    public javax.swing.JTextField txt_Suppliers_name;
    public javax.swing.JTextField txt_Suppliers_search;
    public javax.swing.JTextField txt_Suppliers_telephone;
    public javax.swing.JTextField txt_employees_search;
    public javax.swing.JTextField txt_product_code;
    public javax.swing.JTextField txt_product_description;
    public javax.swing.JTextField txt_product_id;
    public javax.swing.JTextField txt_product_name;
    public javax.swing.JTextField txt_product_price_sale;
    public javax.swing.JTextField txt_product_search;
    private javax.swing.JLabel txt_purchases;
    public javax.swing.JTextField txt_purchases_amount;
    public javax.swing.JTextField txt_purchases_id;
    public javax.swing.JTextField txt_purchases_price;
    public javax.swing.JTextField txt_purchases_product_code;
    public javax.swing.JTextField txt_purchases_product_name;
    public javax.swing.JTextField txt_purchases_subtotal;
    public javax.swing.JTextField txt_purchases_total_to_pay;
    // End of variables declaration//GEN-END:variables
}
