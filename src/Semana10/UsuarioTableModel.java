package Semana10;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class UsuarioTableModel extends AbstractTableModel {
	//indices de las columnas
	private static final int COLUMNA_LOGIN = 0;
	private static final int COLUMNA_NOMBRE = 1;
	private static final int COLUMNA_EMAIL = 2;
	private static final int COLUMNA_DNI = 3;
	
	private String[] nombreColumnas = {"Login", "Nombre", "Email", "Dni"};
	
	private Class[] tiposColumna = {String.class, String.class, String.class, Integer.class};s
	
	private List<Usuario> contenido;
	
	public UsuarioTableModel() {
		contenido = new ArrayList<Usuario>();
	}
}
