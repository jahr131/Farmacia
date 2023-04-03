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
import models.Categories;
import models.CategoriesDao;
import models.DynamicCombobox;
import static models.EmployeesDao.rol_user;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import views.SystemViews;

public class CategoriesController implements ActionListener, MouseListener, KeyListener {

    private Categories category;
    private CategoriesDao categoriesDao;
    private SystemViews views;
    String rol = rol_user;
    DefaultTableModel model = new DefaultTableModel();

    public CategoriesController(Categories category, CategoriesDao categoriesDao, SystemViews views) {
        this.category = category;
        this.categoriesDao = categoriesDao;
        this.views = views;
        //Botón registrar categorias
        this.views.btn_add_Categories.addActionListener(this);
        //Botón modificar categorias
        this.views.btn_update_Categories.addActionListener(this);
        //Botón eliminarcategorias
        this.views.btn_delete_Categories.addActionListener(this);
        //Botón cancelar
        this.views.btn_cancel_Categories.addActionListener(this);
        //Tabla
        this.views.Categories_table.addMouseListener(this);
        //Buscar
        this.views.txt_Categories_search.addKeyListener(this);
        //Label  en escucha
        this.views.jLabelCategories.addMouseListener(this);
        getCategoryName();
        AutoCompleteDecorator.decorate(views.cmb_product_categories);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == views.btn_add_Categories) {
            if (views.txt_Categories_name.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios.");
            } else {
                category.setName(views.txt_Categories_name.getText().trim());

                if (categoriesDao.registerCategoryQuery(category)) {
                    cleanFields();
                    cleanTable();
                    listAllCategories();
                    JOptionPane.showMessageDialog(null, "Categoria registrada con exito.");
                } else {
                    JOptionPane.showMessageDialog(null, "Ha ocurrido un error al registrar la categoria.");
                }
            }
        } else if (e.getSource() == views.btn_update_Categories) {

            if (views.txt_Categories_id.equals("")) {
                JOptionPane.showMessageDialog(null, "Selecciona una fila para continuar");
            } else {

                //Verificar si los campos estan vacios
                if (views.txt_Categories_name.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios.");

                } else {
                    //Realizar inserción
                    category.setName((views.txt_Categories_name.getText().trim()));
                    category.setId(Integer.parseInt(views.txt_Categories_id.getText()));

                    if (categoriesDao.updateCategoryQuery(category)) {
                        cleanTable();
                        listAllCategories();
                        cleanFields();
                        JOptionPane.showMessageDialog(null, "Categoria modificado con éxito.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Ha ocurrido un error al modificar la categoria.");
                    }
                }
            }
        } else if (e.getSource() == views.btn_delete_Categories) {
            int row = views.Categories_table.getSelectedRow();

            if (row == -1) {
                JOptionPane.showMessageDialog(null, "Se debe seleccionar una categoria para eliminar.");

            } else {
                int id = Integer.parseInt(views.Categories_table.getValueAt(row, 0).toString());
                int question = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea eliminar la categoria?.");
                
                 if (question == 0 && categoriesDao.deleteCategoryQuery(id) != false) {
                    cleanTable();
                    cleanFields();
                    views.btn_add_Categories.setEnabled(true);
                    listAllCategories();
                    JOptionPane.showMessageDialog(null, "Categoria eliminado con éxito.");
                }
            }
        } else if (e.getSource() == views.btn_cancel_Categories) {
            cleanFields();
        }
    }

    // Listar todos las categorias
    public void listAllCategories() {
        List<Categories> list = categoriesDao.listCategoriesQuery(views.txt_Categories_search.getText());
        model = (DefaultTableModel) views.Categories_table.getModel();
        Object[] row = new Object[2];

        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getId();
            row[1] = list.get(i).getName();
            model.addRow(row);
        }
        views.Categories_table.setModel(model);

    }

    //Limpiar campos
    public void cleanFields() {
        views.txt_Categories_id.setText(" ");
        views.txt_Categories_name.setText(" ");
        views.btn_add_Categories.setEnabled(true);
    }

    public void cleanTable() {
        for (int i = 0; i < model.getRowCount(); i++) {
            model.removeRow(i);
            i = i - 1;
        }
    }
    
    //Método para mostrar el nombre de las categorias
    
    public void getCategoryName(){
        List<Categories> list= categoriesDao.listCategoriesQuery(views.txt_Categories_search.getText());
        for (int i=0; i<list.size();i++){
            int id= list.get(i).getId();
            String name= list.get(i).getName();
            views.cmb_product_categories.addItem(new DynamicCombobox(id, name));
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == views.Categories_table) {

            int row = views.Categories_table.rowAtPoint(e.getPoint());

            views.txt_Categories_id.setText(views.Categories_table.getValueAt(row, 0).toString());
            views.txt_Categories_name.setText(views.Categories_table.getValueAt(row, 1).toString());

            // Deshabilitar
            views.txt_Categories_id.setEditable(false);
            views.btn_add_Categories.setEnabled(false);

        } else if (e.getSource() == views.jLabelCategories) {
            views.jTabbedPane1.setSelectedIndex(5);
            cleanTable();
            cleanFields();
            listAllCategories();

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
        if (e.getSource() == views.txt_Categories_search) {
            cleanTable();
            listAllCategories();
        }
    }

}
