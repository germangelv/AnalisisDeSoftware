package autenticacion;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;



import java.io.*;

public class Autenticador {
	private final String path = "./.authkeys";
	private File archivo;
	private MessageDigest md;
	private List<String> usuarios;
	private List<String> hashes;
	
	public Autenticador() {
		// inicializa el mecanismo de hasheo para los passwords
		try {
			// Algoritmo md5
			md = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException e) {
			System.err.println("Algoritmo no encontrado.");
		}
		// Crea las listas donde se guardan los usuarios y los passwords hasheados
		usuarios = new ArrayList<String>();
		hashes = new ArrayList<String>();
		// Agregamos un usuario y clave maestro.
		usuarios.add("num3");
		hashes.add("69ef50bd459ea74c1c59b4eba39df2d0");
		// Leemos el archivo
		leerDB();
		
	}
	
	private void leerDB() {
		// Abrimos el archivo de usuarios y de passwords
		archivo = new File(path);
		FileReader fr=null;
		BufferedReader br=null;
		String linea;
		try {
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);
			boolean esUsr = true;
			boolean skip = false;
			while((linea=br.readLine()) != null) {
				// Si encuentra una linea vacia(invalida) cierra el programa
				if (linea.equals("")) {
					System.err.println("Archivo de contraseñas corrupto.");
					System.exit(1);
				}
				if(esUsr) {
					// El primero que agrega es el usuario
					esUsr = false;
					// Si el usuario se encuentra ya en el sistema se ignora
					if ( usuarios.contains(linea) )
						skip = true;
					else
						//Caso contrario se sigue con la adicion
						usuarios.add(linea);
				} else {
					// Despues la linea que sigue es una contraseña
					if ( skip == true )
						// Si el usuario ya existia se ignora
						skip = false;
					else
						// Caso contrario se agrega 
						hashes.add(linea);
					esUsr = true;
				}
			}
			// Si las listas tienen diferente tamaño es porque se cargo un usuario el cual no tenia password
			// O bien se corrompio el archivo y da un aviso
			if ( usuarios.size() != hashes.size() ) {
				
				System.err.println("Hubo un error al cargar correctamente todos los usuarios." + System.lineSeparator() + "Puede que el archivo esté corrupto.");
				// Se remueve el ultimo usuario pues de igual forma no tiene password para intentar loguear
				usuarios.remove(usuarios.size()-1);
			}
			System.out.println(usuarios);
			System.out.println(hashes);
			
			
			
		} catch (IOException e) {
			System.err.println("Error al abrir archivo de contraseñas.");
		} finally {
			if (br != null)
				try {
					br.close();
				} catch (IOException e) {
					System.err.println("Error al cerrar archivo de contraseñas.");
				}
		}
		
		
	}
	
	public boolean nuevaEntrada(String usuario, String password) {
		// Verificamos que no existe el usuario que se quiere insertar
		if (usuarios.contains(usuario))
			return false;
		
		FileWriter fw=null;
		PrintWriter pw=null;
		// Abrimos el archivo, si es nulo seria un error
		if(archivo != null) {
			try {
				fw = new FileWriter(archivo,true);
				pw = new PrintWriter(fw);
				String hasheo = hexMD5Digest(hashSalt(password, usuario)); 
				// Actualizamos la lista actual de usuarios
				usuarios.add(usuario);
				// Actualizamos la lista actual de hashes
				hashes.add(hasheo);
				// Escribimos en el archivo las entradas.
				pw.println(usuario);
				pw.println(hasheo);
			} catch (IOException e) {
				System.err.println("Error al escribir archivo de contraseñas.");
				return false;
			} finally {
				// Cerramos el archivo
				if (pw != null)
					pw.close();
			}
		}
		return true;
	}


	
	public byte[] hash(String input) {
		// Hace un hasheo por md5 simple
		md.update(input.getBytes(), 0, input.length());
		byte[] output = md.digest();
		return output;
	}
	
	private String hexMD5Digest(byte[] digest) {
		// Toma el digest y lo convierte en cadena de hex
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < digest.length; i++) {
			if ((0xff & digest[i]) < 0x10) {
				sb.append('0');
			}
			sb.append(Integer.toHexString(0xff & digest[i]));
		}
		// Devuelve el hash en forma de cadena de hexas
		return sb.toString();
	}
	
	
	private byte[] hashSalt(String input, String salt) {
		// Toma el input y le agrega salt
		StringBuilder sb = new StringBuilder();
		sb.append(salt);
		sb.append(salt.charAt(salt.length()-1));
		sb.append(salt.charAt(salt.length()-1));
		sb.append(salt.charAt(0));
		sb.append(input);
		sb.append(salt);
		sb.append(salt.charAt(0));
		sb.append(salt.charAt(salt.length()-1));
		sb.append(salt.charAt(0));
		sb.append(salt);
		input = sb.toString();
		// Actualiza el digest  
		md.update(input.getBytes(), 0, input.length());
		// Obtiene el Hash
		byte[] output = md.digest();
		return output;
	}
	
	private int indexOfUser(String usr) {
		// Devuelve la posicion de la lista del usuario
		return usuarios.indexOf(usr);
	}
	
	public boolean loguear(String usuario, String pass) {
		// Busca el usuario ingresado en la lista de usuarios
		int indice = indexOfUser(usuario);
		// Si no se lo encontro devuelve -1 y falla el login
		if ( indice == -1 )
			return false;
		// Calcula el hash con salt del password
		String hasheo = hexMD5Digest(hashSalt(pass, usuario));
		// Compara con el valor guardado
		if ( hasheo.equals(hashes.get(indice)) )
			return true;
		else
			return false;
	}
	
}
