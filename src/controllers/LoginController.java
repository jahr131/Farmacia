package controllers;

// @author ALEJANDRO
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import models.Employees;
import models.EmployeesDao;
import views.SystemViews;
import views.login;

public class LoginController implements ActionListener {

    private Employees employee;
    private EmployeesDao employees_dao;
    private login login_view;

    public LoginController(Employees employee, EmployeesDao employees_dao, login login_view) {
        this.employee= employee;
        this.employees_dao = employees_dao;
        this.login_view = login_view;
        this.login_view.btn_enter.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Obtener los datos de la vista
        String user = login_view.txt_user.getText().trim();
        String pass = String.valueOf(login_view.txt_password.getPassword());

        if (e.getSource() == login_view.btn_enter) {
            // Validar que los campos no esten vacios
            if (!user.equals(" ") || !pass.equals(" ")) {
                // Pasar los parametros al metodo login
                employee = employees_dao.loginQuery(user, pass);
                // Verificar la existencia del usuario
                if (employee.getUsername() != null) {
                    if (employee.getRol().equals("Administrador")) {
                        SystemViews admin = new SystemViews();
                        admin.setVisible(true);
                    } else {
                        SystemViews aux = new SystemViews();
                        aux.setVisible(true);
                    }
                    this.login_view.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, " Usuario o contraseña incorrectos");
                }

            } else {
                JOptionPane.showMessageDialog(null, " Los campos estan vacios");
            }
        }
    }

}


