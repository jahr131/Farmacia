package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static models.EmployeesDao.rol_user;
import models.Suppliers;
import models.SuppliersDao;
import views.SystemViews;

public class SuppliersController implements ActionListener, MouseListener, KeyListener {

    private Suppliers supplier;
    private SuppliersDao supplierDao;
    private SystemViews views;

    //Rol
    String rol = rol_user;
    DefaultTableModel model = new DefaultTableModel();

    public SuppliersController(Suppliers supplier, SuppliersDao supplierDao, SystemViews views) {
        this.supplier = supplier;
        this.supplierDao = supplierDao;
        this.views = views;
        //Botón registrar proveedores
        this.views.btn_add_Suppliers.addActionListener(this);
        //Botón modificar
        this.views.btn_update_Suppliers.addActionListener(this);
        //Botón eliminar
        this.views.btn_delete_Suppliers.addActionListener(this);
        //Botón cancelar
        this.views.btn_cancel_Suppliers.addActionListener(this);
        //Tabla
        this.views.Suppliers_table.addMouseListener(this);
        //Buscar
        this.views.txt_Suppliers_search.addKeyListener(this);
        //Label proveedores en escucha
        this.views.jLabelSuppliers.addMouseListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == views.btn_add_Suppliers) {
            //Verificar si los campos estan vacios
            if (views.txt_Suppliers_name.getText().equals("") || views.txt_Suppliers_description.getText().equals("") || views.txt_Suppliers_address.getText().equals("") || views.txt_Suppliers_telephone.getText().equals("") || views.txt_Suppliers_email.getText().equals("") || views.cmb_Suppliers_city.getSelectedItem().toString().equals("")) {
                JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios.");

            } else {
                //Realizar inserción
                supplier.setName((views.txt_Suppliers_name.getText().trim()));
                supplier.setDescription((views.txt_Suppliers_description.getText().trim()));
                supplier.setAddress((views.txt_Suppliers_address.getText().trim()));
                supplier.setTelephone((views.txt_Suppliers_telephone.getText().trim()));
                supplier.setEmail((views.txt_Suppliers_email.getText().trim()));
                supplier.setCity(views.cmb_Suppliers_city.getSelectedItem().toString());

                if (supplierDao.registerSuppliersQuery(supplier)) {
                    cleanTable();
                    listAllSuppliers();
                    cleanFields();
                    JOptionPane.showMessageDialog(null, "Proveedor registrado con éxito.");
                } else {
                    JOptionPane.showMessageDialog(null, "Ha ocurrido un error al registrar al proveedor.");
                }
            }
        } else if (e.getSource() == views.btn_update_Suppliers) {

            if (views.txt_Suppliers_id.equals(" ")) {
                JOptionPane.showMessageDialog(null, "Selecciona una fila para continuar");
            } else {

                //Verificar si los campos estan vacios
                if (views.txt_Suppliers_name.getText().equals("") || views.txt_Suppliers_address.getText().equals("") || views.txt_Suppliers_telephone.getText().equals("") || views.txt_Suppliers_email.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios.");

                } else {
                    //Realizar inserción
                    supplier.setName((views.txt_Suppliers_name.getText().trim()));
                    supplier.setDescription((views.txt_Suppliers_description.getText().trim()));
                    supplier.setAddress((views.txt_Suppliers_address.getText().trim()));
                    supplier.setTelephone((views.txt_Suppliers_telephone.getText().trim()));
                    supplier.setEmail((views.txt_Suppliers_email.getText().trim()));
                    supplier.setCity(views.cmb_Suppliers_city.getSelectedItem().toString());
                    supplier.setId(Integer.parseInt(views.txt_Suppliers_id.getText()));

                    if (supplierDao.updateSuppliersQuery(supplier)) {
                        cleanTable();
                        listAllSuppliers();
                        cleanFields();
                        JOptionPane.showMessageDialog(null, "Proveedor modificado con éxito.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Ha ocurrido un error al modificar al proveedor.");
                    }
                }
            }
        } else if (e.getSource() == views.btn_delete_Suppliers) {
            int row = views.Suppliers_table.getSelectedRow();

            if (row == -1) {
                JOptionPane.showMessageDialog(null, "Se debe seleccionar un proveedor para eliminar.");

            } else {
                int id = Integer.parseInt(views.Suppliers_table.getValueAt(row, 0).toString());
                int question = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea eliminar el usuario?.");

                if (question == 0 && supplierDao.deleteSuppliersQuery(id) != false) {
                    cleanTable();
                    cleanFields();
                    views.btn_add_Suppliers.setEnabled(true);
                    listAllSuppliers();
                    JOptionPane.showMessageDialog(null, "Proveedor eliminado con éxito.");
                }
            }
        } else if (e.getSource() == views.btn_cancel_Suppliers) {
            cleanFields();
            views.btn_add_Suppliers.setEnabled(true);
        }

    }

    // Listar todos los empleados
    public void listAllSuppliers() {
        if (rol.equals("Administrador")) {
            List<Suppliers> list = supplierDao.listSuppliersQuery(views.txt_Suppliers_search.getText());
            model = (DefaultTableModel) views.Suppliers_table.getModel();
            Object[] row = new Object[7];

            for (int i = 0; i < list.size(); i++) {
                row[0] = list.get(i).getId();
                row[1] = list.get(i).getName();
                row[2] = list.get(i).getDescription();
                row[3] = list.get(i).getAddress();
                row[4] = list.get(i).getTelephone();
                row[5] = list.get(i).getEmail();
                row[6] = list.get(i).getCity();
                model.addRow(row);
            }
            views.Suppliers_table.setModel(model);

        }
    }

    //Limpiar campos
    public void cleanFields() {
        views.txt_Suppliers_name.setText(" ");
        views.txt_Suppliers_description.setText(" ");
        views.txt_Suppliers_address.setText(" ");
        views.txt_Suppliers_telephone.setText(" ");
        views.txt_Suppliers_email.setText(" ");
        views.cmb_Suppliers_city.setSelectedIndex(0);
        views.txt_Suppliers_id.setText(" ");
    }

    public void cleanTable() {
        for (int i = 0; i < model.getRowCount(); i++) {
            model.removeRow(i);
            i = i - 1;
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        if (e.getSource() == views.Suppliers_table) {

            int row = views.Suppliers_table.rowAtPoint(e.getPoint());

            views.txt_Suppliers_id.setText(views.Suppliers_table.getValueAt(row, 0).toString());
            views.txt_Suppliers_name.setText(views.Suppliers_table.getValueAt(row, 1).toString());
            views.txt_Suppliers_description.setText(views.Suppliers_table.getValueAt(row, 2).toString());
            views.txt_Suppliers_address.setText(views.Suppliers_table.getValueAt(row, 3).toString());
            views.txt_Suppliers_telephone.setText(views.Suppliers_table.getValueAt(row, 4).toString());
            views.txt_Suppliers_email.setText(views.Suppliers_table.getValueAt(row, 5).toString());
            views.cmb_Suppliers_city.setSelectedItem(views.Suppliers_table.getValueAt(row, 6).toString());

            // Deshabilitar
            views.txt_Suppliers_id.setEditable(false);
            views.btn_add_Suppliers.setEnabled(false);
        } else if (e.getSource() == views.jLabelSuppliers) {
            if (rol.equals("Administrador")) {
                views.jTabbedPane1.setSelectedIndex(4);
                cleanTable();
                cleanFields();
                listAllSuppliers();
            } else {
                views.jTabbedPane1.setEnabledAt(4, false);
                views.jLabelSuppliers.setEnabled(false);
                JOptionPane.showMessageDialog(null, "¡ Debes tener permisos de administrador para acceder !.");
            }
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
        if (e.getSource() == views.txt_Suppliers_search) {
            cleanTable();
            listAllSuppliers();
        }

    }

}
