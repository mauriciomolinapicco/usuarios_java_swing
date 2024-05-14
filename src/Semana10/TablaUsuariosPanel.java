package Semana10;
import java.util.*;
import javax.swing.*;
import java.awt.*;

public class TablaUsuariosPanel extends JPanel implements ActionListener{
	private JTable tablaUsuarios;
	private UsuarioTableModel modelo;
	
	private JScrollPane scrollPaneParaTable;
	private JButton botonAgregar;
	private JButton botonBorrar;
	
	public TablaUsuariosPanel() {
		super();
		armarPanel();
	}
	
	private void armarPanel() {
		this.setLayout(new FlowLayout());
		
		modelo = new UsuarioTableModel();
		tablaUsuarios = new JTable(modelo);
		
	}
}
