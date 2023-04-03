package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.DynamicCombobox;
import static models.EmployeesDao.rol_user;
import models.Products;
import models.ProductsDao;
import views.SystemViews;

public class ProductsController implements ActionListener, MouseListener, KeyListener {

    private Products product;
    private ProductsDao productDao;
    private SystemViews views;

    //Rol
    String rol = rol_user;
    DefaultTableModel model = new DefaultTableModel();

    public ProductsController(Products product, ProductsDao productDao, SystemViews views) {
        this.product = product;
        this.productDao = productDao;
        this.views = views;

        //Botón registrar proveedores
        this.views.btn_add_products.addActionListener(this);
        //Botón modificar
        this.views.btn_update_products.addActionListener(this);
        //Botón eliminar
        this.views.btn_delete_products.addActionListener(this);
        //Botón cancelar
        this.views.btn_cancel_products.addActionListener(this);
        //Tabla
        this.views.product_table.addMouseListener(this);
        //Buscar
        this.views.txt_product_search.addKeyListener(this);
        //Label proveedores en escucha
        this.views.jLabelProducts.addMouseListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == views.btn_add_products) {
            //Verificar si los campos estan vacios
            if (views.txt_product_code.getText().equals("") || views.txt_product_name.getText().equals("") || views.txt_product_description.getText().equals("") || views.txt_product_price_sale.getText().equals("") || views.cmb_product_categories.getSelectedItem().toString().equals("")) {
                JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios.");

            } else {
                //Realizar inserción
                product.setCode(Integer.parseInt(views.txt_product_code.getText()));
                product.setName((views.txt_product_name.getText().trim()));
                product.setDescription((views.txt_product_description.getText().trim()));
                product.setUnit_price(Double.parseDouble(views.txt_product_price_sale.getText()));
                DynamicCombobox category_id = (DynamicCombobox) views.cmb_product_categories.getSelectedItem();
                product.setCategory_id(category_id.getId());

                if (productDao.registerProductQuery(product)) {
                    cleanTable();
                    listAllproducts();
                    cleanFields();
                    JOptionPane.showMessageDialog(null, "Producto registrado con éxito.");
                } else {
                    JOptionPane.showMessageDialog(null, "Ha ocurrido un error al registrar al producto.");
                }
            }
        } else if (e.getSource() == views.btn_update_products) {
            if (views.txt_product_code.getText().equals("") || views.txt_product_name.getText().equals("") || views.txt_product_description.getText().equals("") || views.txt_product_price_sale.getText().equals("") || views.cmb_product_categories.getSelectedItem().toString().equals("")) {

                JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios.");

            } else {
                //Realizar inserción
                product.setCode(Integer.parseInt(views.txt_product_code.getText()));
                product.setName((views.txt_product_name.getText().trim()));
                product.setDescription((views.txt_product_description.getText().trim()));
                product.setUnit_price(Double.parseDouble(views.txt_product_price_sale.getText()));
                DynamicCombobox category_id = (DynamicCombobox) views.cmb_product_categories.getSelectedItem();
                product.setCategory_id(category_id.getId());
                product.setId(Integer.parseInt(views.txt_product_id.getText()));

                if (productDao.updateProductQuery(product)) {
                    cleanTable();
                    listAllproducts();
                    cleanFields();
                    JOptionPane.showMessageDialog(null, "Producto modificado con éxito.");
                } else {
                    JOptionPane.showMessageDialog(null, "Ha ocurrido un error al modificar el producto.");
                }
            }

        } else if (e.getSource() == views.btn_delete_products) {
            
            int row = views.product_table.getSelectedRow();
            if (row == -1) {
                
                JOptionPane.showMessageDialog(null, "Se debe seleccionar un producto para eliminar.");
                
            } else {
                int id = Integer.parseInt(views.product_table.getValueAt(row, 0).toString());
                int question = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea eliminar el producto?.");
                
                 if (question == 0 && productDao.deleteProductsQuery(id) != false) {
                    cleanTable();
                    cleanFields();
                    views.btn_add_products.setEnabled(true);
                    listAllproducts();
                    JOptionPane.showMessageDialog(null, "Producto eliminado con éxito.");
                }
            }
        }else if (e.getSource() == views.btn_cancel_products) {
            cleanFields();
             views.btn_add_products.setEnabled(true);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == views.product_table) {

            int row = views.product_table.rowAtPoint(e.getPoint());
            views.txt_product_id.setText(views.product_table.getValueAt(row, 0).toString());
            product = productDao.searchProduct(Integer.parseInt(views.txt_product_id.getText()));
            views.txt_product_code.setText("" + product.getCode());
            views.txt_product_name.setText(product.getName());
            views.txt_product_description.setText(product.getDescription());
            views.txt_product_price_sale.setText("" + product.getUnit_price());
            views.cmb_product_categories.setSelectedItem(new DynamicCombobox(product.getCategory_id(), product.getCategory_name()));

            // Deshabilitar
            views.btn_add_products.setEnabled(false);

        } else if (e.getSource() == views.jLabelProducts) {
            views.jTabbedPane1.setSelectedIndex(0);
            cleanTable();
            cleanFields();
            listAllproducts();
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getSource() == views.txt_product_search) {
            cleanTable();
            listAllproducts();
        }
    }

    //Listar todos los productos
    public void listAllproducts() {
        if (rol.equals("Administrador") || rol.equals("Auxiliar")) {
            List<Products> list = productDao.listProductsQuery(views.txt_product_search.getText());
            model = (DefaultTableModel) views.product_table.getModel();
            Object[] row = new Object[7];

            for (int i = 0; i < list.size(); i++) {
                row[0] = list.get(i).getId();
                row[1] = list.get(i).getCode();
                row[2] = list.get(i).getName();
                row[3] = list.get(i).getDescription();
                row[4] = list.get(i).getUnit_price();
                row[5] = list.get(i).getProduct_quantity();
                row[6] = list.get(i).getCategory_name();
                model.addRow(row);
            }
            views.product_table.setModel(model);

            if (rol.equals("Auxiliar")) {

                views.btn_add_products.setEnabled(false);
                views.btn_update_products.setEnabled(false);
                views.btn_delete_products.setEnabled(false);
                //views.btn_cancel_products.setEnabled(false);
                views.txt_product_name.setEnabled(false);
                views.txt_product_description.setEnabled(false);
                views.txt_product_code.setEnabled(false);
                views.txt_product_price_sale.setEnabled(false);
                //views.cmb_product_categories.setSelectedIndex(0);
                views.txt_product_id.setEnabled(false);

            }

        }
    }

    //Limpiar campos
    public void cleanFields() {
        views.txt_product_name.setText(" ");
        views.txt_product_description.setText(" ");
        views.txt_product_code.setText(" ");
        views.txt_product_price_sale.setText(" ");
        views.cmb_product_categories.setSelectedIndex(0);
        views.txt_product_id.setText(" ");
    }

    public void cleanTable() {
        for (int i = 0; i < model.getRowCount(); i++) {
            model.removeRow(i);
            i = i - 1;
        }
    }

}
