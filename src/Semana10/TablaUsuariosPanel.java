package Semana10;
import java.util.*;
import java.util.List;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TablaUsuariosPanel extends JPanel implements ActionListener{
	private JTable tablaUsuarios;
	private UsuarioTableModel modelo;
	
	private JScrollPane scrollPaneParaTabla;
	private JButton botonAgregar;
	private JButton botonBorrar;
	
	public TablaUsuariosPanel() {
		super();
		armarPanel();
	}
	
	private void armarPanel() {
		this.setLayout(new FlowLayout());
		
		//Esta union entre el modelo y la grilla del jtable, jtable va a llamar al modelo para saber dibujarse
		modelo = new UsuarioTableModel();
		tablaUsuarios = new JTable(modelo); 
		
		scrollPaneParaTabla = new JScrollPane(tablaUsuarios);
		this.add(scrollPaneParaTabla);
		
		botonBorrar = new JButton("Borrar fila");
		botonBorrar.addActionListener(this);
		this.add(botonBorrar);
		
		botonAgregar = new JButton("Cargar fila");
		botonAgregar.addActionListener(this);
		this.add(botonBorrar);

		Usuario u1 = new Usuario("Mauricio", "maurimolina", "mauri@gmail.com", 123);
		Usuario u2 = new Usuario("Ezequiel", "ezemolina", "eze@gmail.com", 456);
		List<Usuario> lista = new ArrayList<Usuario>();
		lista.add(u1);
		lista.add(u2);
		
		modelo.setContenido(lista);
		
		/*a todas las JTables registradas para ver el contenido del modelo
		avisales que el contenido cambió
		*/
		modelo.fireTableDataChanged();
		
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == botonAgregar) {
			Random r = new Random();
			int x = r.nextInt(100);
			int dni = r.nextInt(1000) * r.nextInt(1000);
		
			Usuario u1 = new Usuario("nombre"+x, "test"+x, "mail"+x, dni);
			modelo.getContenido().add(u1);
			modelo.fireTableDataChanged();
		} else if (e.getSource() == botonBorrar) {
			//Obtengo la fila seleccionada (o sea la que se quiere borrar)
			int filaSeleccionada = this.tablaUsuarios.getSelectedRow();
			Usuario usuario = this.modelo.getContenido().get(filaSeleccionada);
			System.out.println(usuario);
			this.modelo.getContenido().remove(filaSeleccionada);
			modelo.fireTableDataChanged();
		}
	}
}
