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
	
	//Nombres de las columnas
	private String[] nombreColumnas = {"Login", "Nombre", "Email", "Dni"};
	
	//Tipos de cada columna
	private Class[] tiposColumnas = {String.class, String.class, String.class, Integer.class};s
	
	//contenido = valores de la tabla
	private List<Usuario> contenido;
	
	public UsuarioTableModel() {
		contenido = new ArrayList<Usuario>();
	}
	
	public UsuarioTableModel(List<Usuario> contenidoInicial) {
		contenido = contenidoInicial;
	}
	
	//METODOS Q DEBO PISAR
	public int getColumnCount() {
		return nombreColumnas.length;
		//yo nunca voy a llamar este metodo pero JTable si
	}
	
	public int getRowCount() {
		return contenido.size();
	}
	
	public String getColumnName(int col) {
		return nombreColumnas[col];
	}
	
	public Object getValueAt(int rowIndex, int columnIndex) {
		Usuario u = contenido.get(rowIndex);
		
		Object result = null;
		switch(columnIndex) {
		case COLUMNA_LOGIN:
			result = u.getUser();
			break;
		case COLUMNA_NOMBRE:
			result = u.getNombre();
			break;
		case COLUMNA_EMAIL:
			result = u.getEmail();
			break;
		case COLUMNA_DNI:
			result = u.getDni();
			break;
		default:
			result = new String("");
		}
		return result;
	}
	
	
	
	
	public Class getColumnClass(int col) {
		return tiposColumnas[col];
	}
}
