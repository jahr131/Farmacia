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
import models.Customers;
import models.CustomersDao;
import views.SystemViews;

public class CustomersController implements ActionListener, MouseListener, KeyListener {

    private Customers customer;
    private CustomersDao customerDao;
    private SystemViews views;

    DefaultTableModel model = new DefaultTableModel();

    public CustomersController(Customers customer, CustomersDao customerDao, SystemViews views) {
        this.customer = customer;
        this.customerDao = customerDao;
        this.views = views;
        //Botón registrar clientes
        this.views.btn_add_Customers.addActionListener(this);
        //Botón modificar clientes
        this.views.btn_update_Customers.addActionListener(this);
        //Botón eliminar clientes
        this.views.btn_delete_Customers.addActionListener(this);
        //Botón cancelar  clientes
        this.views.btn_cancel_Customers.addActionListener(this);
        //Buscador
        this.views.txt_customers_search.addKeyListener(this);
        //Label en escucha
        this.views.jLabelCustomers.addMouseListener(this);
        //Poner tabla en escucha
        this.views.Customers_table.addMouseListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == views.btn_add_Customers) {
            //Verificar si los campos estan vacios
            if (views.txt_Customers_id.getText().equals("") || views.txt_Customers_name.getText().equals("") || views.txt_Customers_address.getText().equals("") || views.txt_Customers_telephone.getText().equals("") || views.txt_Customers_email.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios.");

            } else {
                customer.setId(Integer.parseInt(views.txt_Customers_id.getText().trim()));
                customer.setFull_name((views.txt_Customers_name.getText().trim()));
                customer.setAddress((views.txt_Customers_address.getText().trim()));
                customer.setTelephone((views.txt_Customers_telephone.getText().trim()));
                customer.setEmail((views.txt_Customers_email.getText().trim()));

                if (customerDao.registerCustomersQuery(customer)) {
                    cleanTable();
                    listAllCustomers();
                    cleanFields();
                    JOptionPane.showMessageDialog(null, "Cliente registrado con éxito.");
                } else {
                    JOptionPane.showMessageDialog(null, "Ha ocurrido un error al registrar al cliente.");
                }
            }
        } else if (e.getSource() == views.btn_update_Customers) {
            if (views.txt_Customers_id.getText().equals("") || views.txt_Customers_name.getText().equals("") || views.txt_Customers_address.getText().equals("") || views.txt_Customers_telephone.getText().equals("") || views.txt_Customers_email.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
            } else {
                customer.setId(Integer.parseInt(views.txt_Customers_id.getText().trim()));
                customer.setFull_name((views.txt_Customers_name.getText().trim()));
                customer.setAddress((views.txt_Customers_address.getText().trim()));
                customer.setTelephone((views.txt_Customers_telephone.getText().trim()));
                customer.setEmail((views.txt_Customers_email.getText().trim()));

                if (customerDao.updateCustomersQuery(customer)) {
                    cleanTable();
                    cleanFields();
                    listAllCustomers();
                    views.btn_add_Customers.setEnabled(true);
                    JOptionPane.showMessageDialog(null, "Modificación éxitosa. ");
                } else {
                    JOptionPane.showMessageDialog(null, "Ha ocurrido un error al modificar los datos del cliente. ");
                }
            }
        } else if (e.getSource() == views.btn_delete_Customers) {
            int row = views.Customers_table.getSelectedRow();

            if (row == -1) {
                JOptionPane.showMessageDialog(null, "Se debe seleccionar un cliente para eliminar.");
            } else {
                int id = Integer.parseInt(views.Customers_table.getValueAt(row, 0).toString());
                int question = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea eliminar el cliente?.");

                if (question == 0 && customerDao.deleteCustomerQuery(id) != false) {
                    cleanTable();
                    cleanFields();
                    views.btn_add_Employees.setEnabled(true);
                    listAllCustomers();
                    JOptionPane.showMessageDialog(null, "Cliente eliminado con éxito.");
                }
            }
        } else if (e.getSource() == views.btn_cancel_Customers) {
            cleanFields();
            views.btn_add_Customers.setEnabled(true);
        }

    }

    public void listAllCustomers() {
        List<Customers> list = customerDao.listCustomersQuery(views.txt_customers_search.getText());
        model = (DefaultTableModel) views.Customers_table.getModel();

        Object[] row = new Object[5];

        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getId();
            row[1] = list.get(i).getFull_name();
            row[2] = list.get(i).getAddress();
            row[3] = list.get(i).getTelephone();
            row[4] = list.get(i).getEmail();
            model.addRow(row);
        }
        views.Customers_table.setModel(model);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        if (e.getSource() == views.Customers_table) {
            int row = views.Customers_table.rowAtPoint(e.getPoint());
            views.txt_Customers_id.setText(views.Customers_table.getValueAt(row, 0).toString());
            views.txt_Customers_name.setText(views.Customers_table.getValueAt(row, 1).toString());
            views.txt_Customers_address.setText(views.Customers_table.getValueAt(row, 2).toString());
            views.txt_Customers_telephone.setText(views.Customers_table.getValueAt(row, 3).toString());
            views.txt_Customers_email.setText(views.Customers_table.getValueAt(row, 4).toString());

            //Deshabilitar botones
            views.btn_add_Customers.setEnabled(false);
            views.txt_Customers_id.setEnabled(false);
        } else if (e.getSource() == views.jLabelCustomers) {
            views.jTabbedPane1.setSelectedIndex(2);
            cleanTable();
            cleanFields();
            listAllCustomers();
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
        if (e.getSource() == views.txt_customers_search) {
            cleanTable();
            listAllCustomers();
        }
    }

    //Limpiar campos
    public void cleanFields() {
        views.txt_Customers_id.setText(" ");
        views.txt_Customers_id.setEditable(true);
        views.txt_Customers_id.setEnabled(true);
        views.txt_Customers_name.setText(" ");
        views.txt_Customers_address.setText(" ");
        views.txt_Customers_telephone.setText(" ");
        views.txt_Customers_email.setText(" ");
    }

    public void cleanTable() {
        for (int i = 0; i < model.getRowCount(); i++) {
            model.removeRow(i);
            i = i - 1;
        }
    }

}
