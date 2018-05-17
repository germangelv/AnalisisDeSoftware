package recuperacion;

import java.io.*;

public class Recuperador {
	private File respaldo;
	private FileReader fr;
	private BufferedReader br;
	private FileWriter fw;
	private PrintWriter pw;	
	private static final String path = "./.bak~";
	private int numero;
	
	public Recuperador() {
		// Crea el objeto que se encargará de recuperar los datos en caso de un cierre anómalo
		numero = 0;
		respaldo = null;
		respaldo = new File(path);
	}
	
	public boolean hayDatos() {
		//Se encarga de verificar que haya un archivo de respaldo
		if( respaldo.exists() && respaldo.isFile() ) {
			// Verifica que el archivo de respaldo tenga datos
			if( respaldo.length() > 0 )
				return true;
		}
		return false;
	}
	
	public void leerDatos() {
		if(hayDatos()) {
			try {
				fr = new FileReader(respaldo);
				br = new BufferedReader(fr);
				String n;
				// Lee la linea que almacena el numero
				n = br.readLine();
				// Si la linea no estaba vacia
				if( n != null) {
					// Setea el numero
					this.numero = Integer.parseInt(n);					
				} else {
					// Si no pone un 0 por default
					this.numero = 0;
				}
				br.close();
			} catch (IOException e) {
				// Si ocurre un error escribe un 0
				this.numero = 0;
				System.err.println("Error al recuperar datos de respaldo.");
			} finally {
				limpiarDatos();
			}
			
		}
	}

	public int getNum() {
		// Devuelve el numero cargado
		return numero;
	}

	public void limpiarDatos() {
		// Borra el archivo de respaldo
		respaldo.delete();		
	}
	
	public void grabarNum(int num) {
		// Setea el numero a grabar
		this.numero = num;
		// Borra cualquier posible archivo anterior
		limpiarDatos();
		respaldo = new File(path);
		try {
			fw = new FileWriter(respaldo);
			pw = new PrintWriter(fw);
			// Escribe el numero
			pw.println(Integer.toString(this.numero));
			
		} catch (IOException e) {
			System.err.println("Error al escribir datos de respaldo.");
		} finally {
			if (null != fw) {
				try {
					// Cierra el stream
					fw.close();
				} catch (IOException e) {
					System.err.println("Error al cerrar archivo de respaldo.");
				}
			}
		}
		
	}
	
	
}
