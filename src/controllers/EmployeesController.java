package controllers;

// @author ALEJANDRO

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.Employees;
import models.EmployeesDao;
import static models.EmployeesDao.rol_user;
import views.SystemViews;

 
public class EmployeesController implements ActionListener, MouseListener, KeyListener {
    
    private Employees employee;
    private EmployeesDao employeeDao;
    private SystemViews views;
    
    //Rol
    
    String rol= rol_user;
    DefaultTableModel model =new DefaultTableModel();

    public EmployeesController(Employees employee, EmployeesDao employeeDao, SystemViews views) {
        this.employee = employee;
        this.employeeDao = employeeDao;
        this.views = views;
        
        //Botón registrar empleado
        this.views.btn_add_Employees.addActionListener(this);
        this.views.employees_table.addMouseListener(this);
        views.txt_employees_search.addKeyListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == views.btn_add_Employees){
            
            //Verificar si los campos estan vacios
            
            if(views.txt_Employees_identification.getText().equals("")
                    || views.txt_Employees_name.getText().equals("")
                    || views.txt_Employees_user.getText().equals("")
                    || views.txt_Employees_address.getText().equals("")
                    || views.txt_Employees_telephone.getText().equals("")
                    || views.txt_Employees_email.getText().equals("")
                    || views.cmb_Employees_rol.getSelectedItem().toString().equals("")
                    ||String.valueOf(views.txt_Employees_password.getPassword()).equals("")){
                
                JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
                
            } else {
                
                //Realizar la inserción
                
                employee.setId(Integer.parseInt(views.txt_Employees_identification.getText().trim()));
                employee.setFull_name(views.txt_Employees_name.getText().trim());
                employee.setUsername(views.txt_Employees_user.getText().trim());
                employee.setAddress(views.txt_Employees_address.getText().trim());
                employee.setTelephone(views.txt_Employees_telephone.getText().trim());
                employee.setEmail(views.txt_Employees_email.getText().trim());
                employee.setPassword(String.valueOf(views.txt_Employees_password.getPassword()));
                employee.setEmail(views.txt_Employees_email.getText().trim());
                employee.setRol(views.cmb_Employees_rol.getSelectedItem().toString());
                
                if (employeeDao.registerEmployeeQuery(employee)){
                    cleanTable();
                    JOptionPane.showMessageDialog(null, " Empleado registrado con éxito");
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Ha ocurrido un error! *-* ");
                }
            }
        }
    }
    
    
    // Lsitar todos los empleados
    
    public void listAllEmployees(){
        if (rol.equals("Aministrador")){
            List <Employees> list= employeeDao.listEmployeesQuery(views.txt_employees_search.getText());
            model= (DefaultTableModel) views.employees_table.getModel();
            Object[ ] row= new Object [7];
            
            for (int i= 0; i<list.size(); i++){
                row[0] = list.get(i).getId();
                row[1] = list.get(i).getFull_name();
                row[2] = list.get(i).getUsername();
                row[3] = list.get(i).getAddress();
                row[4] = list.get(i).getTelephone();
                row[5] = list.get(i).getEmail();
                row[6] = list.get(i).getRol();
                model.addRow(row);
            }
            
        }
        }

    @Override
    public void mouseClicked(MouseEvent e) {
        
        if (e.getSource() == views.employees_table){
            
            int row= views.employees_table.rowAtPoint(e.getPoint());
            
            views.txt_Employees_identification.setText(views.employees_table.getValueAt(row, 0).toString());
            views.txt_Employees_name.setText(views.employees_table.getValueAt(row, 1).toString());
            views.txt_Employees_user.setText(views.employees_table.getValueAt(row, 2).toString());
            views.txt_Employees_address.setText(views.employees_table.getValueAt(row, 3).toString());
            views.txt_Employees_telephone.setText(views.employees_table.getValueAt(row, 4).toString());
            views.txt_Employees_email.setText(views.employees_table.getValueAt(row, 5).toString());
            views.cmb_Employees_rol.setSelectedItem(views.employees_table.getValueAt(row, 6).toString());
            
            // Deshabilitar
            
            views.txt_Employees_identification.setEditable(false);
            views.txt_Employees_password.setEnabled(false);
            views.btn_add_Employees.setEnabled(false);
            
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
        if(e.getSource() == views.txt_employees_search){
            cleanTable();
            listAllEmployees();
        }
    }
    
    public void cleanTable(){
        for(int i=0; i<model.getRowCount();i++){
            model.removeRow(i);
            i = i-1;
        }
    }
  
    
}
