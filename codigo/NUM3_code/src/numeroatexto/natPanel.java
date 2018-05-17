package numeroatexto;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import autenticacion.Autenticador;
import recuperacion.Recuperador;

import java.awt.EventQueue;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Toolkit;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class natPanel extends JFrame {
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField txtElNumeroEs;
	JButton btnConvertir;
	private n2t numero;
	private int num = 0;
	String res;
	private static Recuperador recuperador;
	private static Autenticador auth;
	private JButton btnLogin;
	private JButton btnRegistrar;
	private JLabel lblUsr;
	private JLabel lblPass;
	private JTextField txtUsr;
	private JTextField txtPass;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				// Crea el objeto que se encargará de recuperar la información tras un cierre anómalo
				if (recuperador == null)
					recuperador = new Recuperador();
				
				// Crea el autenticador
				if (auth == null)
					auth = new Autenticador();
				
				try {
					// Crea el panel
					natPanel frame = new natPanel();
					// Escucha el intento de salir del programa
					frame.addWindowListener( new WindowAdapter() {
					    @Override
					    public void windowClosing(WindowEvent e) {
					    	// Preguntar si se desea salir realmente
					        int confirm = JOptionPane.showOptionDialog(
					             null, "Está seguro que desea abandonar la aplicación?", 
					             "Confirmar salir", JOptionPane.YES_NO_OPTION, 
					             JOptionPane.QUESTION_MESSAGE, null, null, null);
					        if (confirm == JOptionPane.OK_OPTION) {
					        	// Salida correcta, limpiar el respaldo
					        	recuperador.limpiarDatos();
					        	System.exit(0);
					        }
					    }
					});
					// ve si hay datos viejos
					if(recuperador.hayDatos()) {
						// Lee los datos
						recuperador.leerDatos();
						// Busca el dato
						frame.num = recuperador.getNum();
						// Carga el dato en el objeto
						frame.numero = new n2t(frame.num);
						// Carga el dato en el textField
						frame.textField.setText(Integer.toString(frame.num));
						// Carga el resultado con el numero convertido 
						frame.res = frame.numero.convertirLetras(frame.num);
						// Carga el label de resultado con el numero convertido
						frame.txtElNumeroEs.setText(frame.res);
						// Borra el archivo de respaldo
						recuperador.limpiarDatos();
					}
					
					
					// Lo muestra	
					frame.setVisible(true);
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	/**
	 * Create the panel.
	 */
	public natPanel() {
		// Se establecen las propiedades básicas de la ventana
		setTitle("NUM3");
		setIconImage(Toolkit.getDefaultToolkit().getImage("Icon.png"));
	    //setIconImage(new ImageIcon(ClassLoader.getSystemResource("Icon.png")).getImage());

	    
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(300, 300, 598, 186);
		this.setResizable(false);
		// Se establece cual sera el Layout
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{15, 287, 87, 0, 127, 0};
		gridBagLayout.rowHeights = new int[]{0, 16, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		
		// Se define el label que da instrucciones
		JLabel lblIngreseUnNmero = new JLabel("Ingrese un n\u00FAmero para convertir a texto :");
		GridBagConstraints gbc_lblIngreseUnNmero = new GridBagConstraints();
		gbc_lblIngreseUnNmero.anchor = GridBagConstraints.WEST;
		gbc_lblIngreseUnNmero.insets = new Insets(0, 0, 5, 5);
		gbc_lblIngreseUnNmero.gridx = 1;
		gbc_lblIngreseUnNmero.gridy = 1;
		getContentPane().add(lblIngreseUnNmero, gbc_lblIngreseUnNmero);
		
		//Se inicializa el textfield
		textField = new JTextField();
		textField.setEditable(false);
		textField.setEnabled(false);
		textField.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent arg0) {
				// Si se apretó en Enter se trata lo ingresado en el text field
				if(arg0.getKeyChar() == '\n'){
					convertir();
				}
			}
		});
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.gridx = 2;
		gbc_textField.gridy = 1;
		getContentPane().add(textField, gbc_textField);
		textField.setColumns(10);
		
		// Se setean las propiedades del boton convertir
		btnConvertir = new JButton("Convertir");
		btnConvertir.setEnabled(false);
		// Se programa la accion de dicho boton
		btnConvertir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Se accionó el botón de Convertir
				// Se llama a la rutina para convertir el numero
				convertir();
			}
		});
		GridBagConstraints gbc_btnConvertir = new GridBagConstraints();
		gbc_btnConvertir.anchor = GridBagConstraints.EAST;
		gbc_btnConvertir.insets = new Insets(0, 0, 5, 0);
		gbc_btnConvertir.gridx = 4;
		gbc_btnConvertir.gridy = 1;
		getContentPane().add(btnConvertir, gbc_btnConvertir);
		
		// Se setean las propiedades del Label
		// Correspondiente a la salida
		JLabel lblNewLabel = new JLabel("El n\u00FAmero ingresado se escribe: ");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 2;
		getContentPane().add(lblNewLabel, gbc_lblNewLabel);
		
		// Se setean las propiedades del textfield
		// donde se escribe la entrada
		txtElNumeroEs = new JTextField();
		txtElNumeroEs.setEditable(false);
		GridBagConstraints gbc_txtElNumeroEs = new GridBagConstraints();
		gbc_txtElNumeroEs.insets = new Insets(0, 0, 5, 0);
		gbc_txtElNumeroEs.gridwidth = 4;
		gbc_txtElNumeroEs.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtElNumeroEs.gridx = 1;
		gbc_txtElNumeroEs.gridy = 3;
		getContentPane().add(txtElNumeroEs, gbc_txtElNumeroEs);
		txtElNumeroEs.setColumns(10);
		
		// Se inicializa el label de usuario
		lblUsr = new JLabel("Usuario:");
		GridBagConstraints gbc_lblUsr = new GridBagConstraints();
		gbc_lblUsr.anchor = GridBagConstraints.EAST;
		gbc_lblUsr.insets = new Insets(0, 0, 5, 5);
		gbc_lblUsr.gridx = 1;
		gbc_lblUsr.gridy = 4;
		getContentPane().add(lblUsr, gbc_lblUsr);
		
		//Se inicializa el field de usuario
		txtUsr = new JTextField();
		GridBagConstraints gbc_txtUsr = new GridBagConstraints();
		gbc_txtUsr.insets = new Insets(0, 0, 5, 5);
		gbc_txtUsr.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtUsr.gridx = 2;
		gbc_txtUsr.gridy = 4;
		getContentPane().add(txtUsr, gbc_txtUsr);
		txtUsr.setColumns(10);
		
		// Se crea el boton de ingresar
		btnLogin = new JButton("Ingresar");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Ingresa al sistema con los datos proporcionados
				login(txtUsr.getText(),txtPass.getText());
			}
		});
		GridBagConstraints gbc_btnLogin = new GridBagConstraints();
		gbc_btnLogin.anchor = GridBagConstraints.WEST;
		gbc_btnLogin.insets = new Insets(0, 0, 5, 0);
		gbc_btnLogin.gridx = 4;
		gbc_btnLogin.gridy = 4;
		getContentPane().add(btnLogin, gbc_btnLogin);
		
		lblPass = new JLabel("Contrase\u00F1a:");
		GridBagConstraints gbc_lblPass = new GridBagConstraints();
		gbc_lblPass.anchor = GridBagConstraints.EAST;
		gbc_lblPass.insets = new Insets(0, 0, 0, 5);
		gbc_lblPass.gridx = 1;
		gbc_lblPass.gridy = 5;
		getContentPane().add(lblPass, gbc_lblPass);
		
		txtPass = new JTextField();
		GridBagConstraints gbc_txtPass = new GridBagConstraints();
		gbc_txtPass.insets = new Insets(0, 0, 0, 5);
		gbc_txtPass.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPass.gridx = 2;
		gbc_txtPass.gridy = 5;
		getContentPane().add(txtPass, gbc_txtPass);
		txtPass.setColumns(10);
		
		btnRegistrar = new JButton("Registrar");
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Se presiona el boton registrar y ejecuta la rutina
				if( registrar(txtUsr.getText(), txtPass.getText()) ) {
					JOptionPane.showMessageDialog(null, "Se ha creado con exito el nuevo usuario.","Registro", JOptionPane.PLAIN_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, "No se ha podido crear un nuevo usuario", "Error de registro", JOptionPane.ERROR_MESSAGE);		
				}
			}
		});
		btnRegistrar.setEnabled(false);
		GridBagConstraints gbc_btnRegistrar = new GridBagConstraints();
		gbc_btnRegistrar.anchor = GridBagConstraints.WEST;
		gbc_btnRegistrar.gridx = 4;
		gbc_btnRegistrar.gridy = 5;
		getContentPane().add(btnRegistrar, gbc_btnRegistrar);
		
	}
	
	private void login(String usr, String pw) {
		// Intenta loguear con los datos proporcionados
		if( auth.loguear(usr, pw) ) {
			// Habilita el uso del programa y muestra un mensaje de bienvenida.
			habilitar(true);
			JOptionPane.showMessageDialog(null, "Bienvenido " + usr + ".", "Bienvenido", JOptionPane.PLAIN_MESSAGE);
		} else {
			// Deshablita el uso del programa y muestra el mensaje de error de logueo
			habilitar(false);
			JOptionPane.showMessageDialog(null, "No se ha podido loguear con los datos ingresados", "Login error", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	private void habilitar(boolean flag) {
		// Cambia los estados de varios elementos interactivos y funcionales del programa
		// para que solo esten activos para los usuarios legitimos
		btnConvertir.setEnabled(flag);
		textField.setEnabled(flag);
		textField.setEditable(flag);
		btnRegistrar.setEnabled(flag);
		
	}
	
	private boolean registrar(String usr, String pw) {
		// Registra el usuario nuevo que se ingresa
		// Si no se ingreso nada en usuario falla
		if ( usr == null || usr.equals("") ) {
			return false;
		}
		// Si no se ingreso nada en password falla
		if ( pw == null || pw.equals("") ) {
			return false;
		}
		if (auth.nuevaEntrada(usr, pw)) {
			login(usr,pw);
			return true;			
		} else {
			return false;			
		}
	}
	
	private void convertir() {
		if(textField.getText().length() > 0){ //Si no hago esto tira una excepción cuando está vacío
			try{
				num = Integer.parseInt(textField.getText());
				if (num < 0 || num > 99999999){
					// Excede el limite del programa
					txtElNumeroEs.setText("El número ingresado excede la capacidad del programa");
				} else {
					// Realiza los pasos correspondientes para convertir el numero
					// Crea el numero
					numero = new n2t(num);
					// Lo convierte a letras
					res = numero.convertirLetras(num);
					// Lo escribe en la Salida
					txtElNumeroEs.setText(res);
					recuperador.grabarNum(num);
				}
			}
			catch (Exception e1){
				//e1.printStackTrace();
				txtElNumeroEs.setText("Error al intentar realizar la conversión, ingrese un valor válido");
			}
			finally{
			}
		}
	}

}
