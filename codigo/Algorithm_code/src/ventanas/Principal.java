package ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JTextPane;
import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.border.LineBorder;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Principal {

	private JFrame frmAlgoritmoCalidad;
	private JPanel panelPrincipal;
	private JPanel panelPortInstalabilidad;
	private JPanel panelPortAdaptabilidad;
	private JPanel panelUsabAtractivo;
	private JPanel panelFuncAdecuacion;
	private JPanel panelEficRecursos;
	private JPanel panelMantCambiado;
	private JPanel panelMantEstabilidad;
	private JPanel panelUsabEntendido;
	private JPanel panelUsabOperado;
	private JPanel panelMantAnal;
	private JPanel panelFiabErrores;
	private JPanel panelFiabFallos;
	private JPanel panelEficTiempo;
	private JPanel panelFuncSeguridad;
	private JPanel PanelResultadoEvaluacion;
	
	private ButtonGroup rbtGroupPortInstalabilidad;
	private ButtonGroup rbtGroupPortAdaptabilidad;
	private ButtonGroup rbtGroupUsabAtractivo;
	private ButtonGroup rbtGroupFuncAdecuacion;
	private ButtonGroup rbtGroupEficRecursos;
	private ButtonGroup rbtGroupMantCambiado;
	private ButtonGroup rbtGroupMantEstabilidad;
	private ButtonGroup rbtGroupUsabEntendido;
	private ButtonGroup rbtGroupUsabOperado;
	private ButtonGroup rbtGroupMantAnal;
	private ButtonGroup rbtGroupFiabErrores;
	private ButtonGroup rbtGroupFiabFallos;
	private ButtonGroup rbtGroupEficTiempo;
	private ButtonGroup rbtGroupFuncSeguridad;
	
	private JTextField txtResFuncA;
	private JTextField txtResFuncB;
	private JTextField txtResEfiA;
	private JTextField txtResEfiB;
	private JTextField txtResFiaA;
	private JTextField txtResFiaB;
	private JTextField txtResManA;
	private JTextField txtResManB;
	private JTextField txtResManC;
	private JTextField txtResUsabA;
	private JTextField txtResUsabB;
	private JTextField txtResUsabC;
	private JTextField txtResPortaA;
	private JTextField txtResPortaB;
	
	private int valorResFuncA;
	private int valorResFuncB;
	private int valorResEfiA;
	private int valorResEfiB;
	private int valorResFiaA;
	private int valorResFiaB;
	private int valorResManA;
	private int valorResManB;
	private int valorResManC;
	private int valorResUsabA;
	private int valorResUsabB;
	private int valorResUsabC;
	private int valorResPortaA;
	private int valorResPortaB;
	
	private int notaFuncionalidad;
	private int notaEficiencia;
	private int notaFiabilidad;
	private int notaMantenibilidad;
	private int notaUsabilidad;
	private int notaPortabilidad;
	
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal window = new Principal();
					window.frmAlgoritmoCalidad.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Principal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAlgoritmoCalidad = new JFrame();
		//frmAlgoritmoCalidad.setIconImage(Toolkit.getDefaultToolkit().getImage(Principal.class.getResource("/icono.png")));
		frmAlgoritmoCalidad.setResizable(false);
		frmAlgoritmoCalidad.setTitle("Algoritmo de calidad (Grupo 14)");
		frmAlgoritmoCalidad.setIconImage(Toolkit.getDefaultToolkit().getImage("Icon.png"));
		frmAlgoritmoCalidad.setBounds(100, 100, 547, 336);
		//frmAlgoritmoCalidad.setBounds(100, 100, 550, 458);
		frmAlgoritmoCalidad.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAlgoritmoCalidad.getContentPane().setLayout(null);
		
		rbtGroupPortInstalabilidad = new ButtonGroup();
		
		rbtGroupPortAdaptabilidad = new ButtonGroup();
		
		rbtGroupUsabAtractivo = new ButtonGroup();
		
		rbtGroupFuncAdecuacion = new ButtonGroup();
		
		rbtGroupEficRecursos = new ButtonGroup();
		
		rbtGroupMantCambiado = new ButtonGroup();
		
		rbtGroupMantEstabilidad = new ButtonGroup();
		
		rbtGroupUsabEntendido = new ButtonGroup();
		
		rbtGroupUsabOperado = new ButtonGroup();
		
		rbtGroupMantAnal = new ButtonGroup();
		
		rbtGroupFiabErrores = new ButtonGroup();
		
		rbtGroupFiabFallos = new ButtonGroup();
		
		rbtGroupEficTiempo = new ButtonGroup();
		
		rbtGroupFuncSeguridad = new ButtonGroup();
		
		valorResFuncA = -1;
		valorResFuncB = -1;
		valorResEfiA = -1;
		valorResEfiB = -1;
		valorResFiaA = -1;
		valorResFiaB = -1;
		valorResManA = -1;
		valorResManB = -1;
		valorResManC = -1;
		valorResUsabA = -1;
		valorResUsabB = -1;
		valorResUsabC = -1;
		valorResPortaA = -1;
		valorResPortaB = -1;
		
		panelEficTiempo = new JPanel();
		panelEficTiempo.setLayout(null);
		panelEficTiempo.setBounds(0, 0, 546, 433);
		panelEficTiempo.setVisible(false);
		
		panelMantEstabilidad = new JPanel();
		panelMantEstabilidad.setLayout(null);
		panelMantEstabilidad.setBounds(0, 0, 546, 433);
		panelMantEstabilidad.setVisible(false);
		
		panelFiabErrores = new JPanel();
		panelFiabErrores.setLayout(null);
		panelFiabErrores.setBounds(0, 0, 546, 433);
		panelFiabErrores.setVisible(false);
		
		panelMantAnal = new JPanel();
		panelMantAnal.setLayout(null);
		panelMantAnal.setBounds(0, 0, 546, 433);
		panelMantAnal.setVisible(false);
		
		panelMantCambiado = new JPanel();
		panelMantCambiado.setLayout(null);
		panelMantCambiado.setBounds(0, 0, 546, 433);
		panelMantCambiado.setVisible(false);
		
		panelFiabFallos = new JPanel();
		panelFiabFallos.setLayout(null);
		panelFiabFallos.setBounds(0, 0, 546, 433);
		panelFiabFallos.setVisible(false);
		
		panelUsabOperado = new JPanel();
		panelUsabOperado.setLayout(null);
		panelUsabOperado.setBounds(0, 0, 546, 433);
		panelUsabOperado.setVisible(false);
		
		panelUsabEntendido = new JPanel();
		panelUsabEntendido.setLayout(null);
		panelUsabEntendido.setBounds(0, 0, 546, 433);
		panelUsabEntendido.setVisible(false);
		frmAlgoritmoCalidad.getContentPane().add(panelUsabEntendido);
		
		JLabel lblUsabilidadCapacidad = new JLabel("5. Usabilidad: Capacidad de ser entendido\r\n");
		lblUsabilidadCapacidad.setFont(new Font("Arial", Font.BOLD, 14));
		lblUsabilidadCapacidad.setBounds(20, 11, 384, 40);
		panelUsabEntendido.add(lblUsabilidadCapacidad);
		
		JTextPane txtpnCapacidadQuePosee = new JTextPane();
		txtpnCapacidadQuePosee.setEditable(false);
		txtpnCapacidadQuePosee.setText("Se busca evaluar si hay documentación o ayuda provista al usuario para que este use la aplicaci\u00F3n.");
		txtpnCapacidadQuePosee.setBackground(new Color(211, 211, 211));
		txtpnCapacidadQuePosee.setBounds(30, 57, 485, 47);
		panelUsabEntendido.add(txtpnCapacidadQuePosee);
		
		JSeparator separator_9 = new JSeparator();
		separator_9.setBounds(20, 115, 504, 14);
		panelUsabEntendido.add(separator_9);
		
		JTextPane txtpnCaractersticasA_2 = new JTextPane();
		txtpnCaractersticasA_2.setEditable(false);
		txtpnCaractersticasA_2.setText("\u2022 Caracter\u00EDsticas a medir:\r\n\t- Posee un documento de manual de usuario.\r\n\t- Ayuda incorporada al sistema como un men\u00FA dedicado.\r\n\t- Provee ayuda contextual sobre las acciones y campos del sistema. \r\n\r\n");
		txtpnCaractersticasA_2.setBackground(new Color(211, 211, 211));
		txtpnCaractersticasA_2.setBounds(30, 135, 485, 76);
		panelUsabEntendido.add(txtpnCaractersticasA_2);
		
		JPanel panel_10 = new JPanel();
		panel_10.setLayout(null);
		panel_10.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_10.setBounds(30, 232, 485, 142);
		panelUsabEntendido.add(panel_10);
		
		JLabel label_10 = new JLabel("Puntuaci\u00F3n:");
		label_10.setBounds(10, 11, 76, 14);
		panel_10.add(label_10);
		
		JRadioButton rdbtnUsabEntendido_0 = new JRadioButton("No cumple con ninguna caracter\u00EDstica.");
		rdbtnUsabEntendido_0.setBounds(10, 30, 469, 23);
		panel_10.add(rdbtnUsabEntendido_0);
		
		JRadioButton rdbtnUsabEntendido_1 = new JRadioButton("Cumple con una caracter\u00EDstica.");
		rdbtnUsabEntendido_1.setBounds(10, 69, 469, 23);
		panel_10.add(rdbtnUsabEntendido_1);
		
		/*JRadioButton rdbtnUsabEntendido_2 = new JRadioButton("Cumple con 2 caracter\u00EDsticas.");
		rdbtnUsabEntendido_2.setBounds(10, 82, 469, 23);
		panel_10.add(rdbtnUsabEntendido_2);*/
		
		JRadioButton rdbtnUsabEntendido_3 = new JRadioButton("Cumple con dos o tres caracter\u00EDsticas.");
		rdbtnUsabEntendido_3.setBounds(10, 108, 456, 23);
		panel_10.add(rdbtnUsabEntendido_3);
		
		rbtGroupUsabEntendido.add(rdbtnUsabEntendido_0);
		rbtGroupUsabEntendido.add(rdbtnUsabEntendido_1);
		//rbtGroupUsabEntendido.add(rdbtnUsabEntendido_2);
		rbtGroupUsabEntendido.add(rdbtnUsabEntendido_3);
		
		rdbtnUsabEntendido_0.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	valorResUsabA=0;

	        }
	    });
		
		rdbtnUsabEntendido_1.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	valorResUsabA=1;

	        }
	    });
		
		/*rdbtnUsabEntendido_2.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	valorResUsabA=2;

	        }
	    });*/
		
		rdbtnUsabEntendido_3.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	valorResUsabA=2;

	        }
	    });
		
		JButton button_25 = new JButton("Atras");
		button_25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				vuelvePantalla(panelUsabEntendido, panelMantEstabilidad);
			}
		});
		button_25.setBounds(181, 391, 95, 31);
		panelUsabEntendido.add(button_25);
		
		JButton button_26 = new JButton("Siguiente");
		button_26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cambiaPantalla(panelUsabEntendido, panelUsabOperado, rbtGroupUsabEntendido);
			}
		});
		button_26.setBounds(286, 391, 95, 31);
		panelUsabEntendido.add(button_26);
		
		JButton button_27 = new JButton("Salir");
		button_27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ejecutaSalir();
			}
		});
		button_27.setBounds(441, 391, 95, 31);
		panelUsabEntendido.add(button_27);
		
		JSeparator separator_25 = new JSeparator();
		separator_25.setBounds(20, 383, 504, 2);
		panelUsabEntendido.add(separator_25);
		frmAlgoritmoCalidad.getContentPane().add(panelUsabOperado);
		
		JLabel lblUsabilidadCapacidad_1 = new JLabel("5. Usabilidad: Capacidad de ser operado");
		lblUsabilidadCapacidad_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblUsabilidadCapacidad_1.setBounds(20, 11, 478, 40);
		panelUsabOperado.add(lblUsabilidadCapacidad_1);
		
		JTextPane txtpnEsLaCapacidad_2 = new JTextPane();
		txtpnEsLaCapacidad_2.setEditable(false);
		txtpnEsLaCapacidad_2.setText("Es la Capacidad del producto software de ser utilizado sin asistencia adicional. Se eval\u00FAa qu\u00E9 requiere el usuario para operar correctamente el producto.");
		txtpnEsLaCapacidad_2.setBackground(new Color(211, 211, 211));
		txtpnEsLaCapacidad_2.setBounds(30, 57, 485, 47);
		panelUsabOperado.add(txtpnEsLaCapacidad_2);
		
		JSeparator separator_10 = new JSeparator();
		separator_10.setBounds(20, 115, 504, 14);
		panelUsabOperado.add(separator_10);
		
		JPanel panel_11 = new JPanel();
		panel_11.setLayout(null);
		panel_11.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_11.setBounds(33, 140, 482, 142);
		panelUsabOperado.add(panel_11);
		
		JLabel label_11 = new JLabel("Puntuaci\u00F3n:");
		label_11.setBounds(10, 11, 76, 14);
		panel_11.add(label_11);
		
		JRadioButton rdbtnUsabOperado_0 = new JRadioButton("Necesita consultar a personal especializado para operar el producto.");
		rdbtnUsabOperado_0.setBounds(10, 30, 469, 23);
		panel_11.add(rdbtnUsabOperado_0);
		
		JRadioButton rdbtnUsabOperado_1 = new JRadioButton("Requiere ayuda en pantalla y manual de uso para operar el producto.");
		rdbtnUsabOperado_1.setBounds(10, 69, 469, 23);
		panel_11.add(rdbtnUsabOperado_1);
		
		/*JRadioButton rdbtnUsabOperado_2 = new JRadioButton("Requiere un documento de manual de usuario para operar el producto.");
		rdbtnUsabOperado_2.setBounds(10, 82, 469, 23);
		panel_11.add(rdbtnUsabOperado_2);*/
		
		JRadioButton rdbtnUsabOperado_3 = new JRadioButton("Se puede operar el producto software sin asistencia.");
		rdbtnUsabOperado_3.setBounds(10, 108, 456, 23);
		panel_11.add(rdbtnUsabOperado_3);
		
		rbtGroupUsabOperado.add(rdbtnUsabOperado_0);
		rbtGroupUsabOperado.add(rdbtnUsabOperado_1);
		//rbtGroupUsabOperado.add(rdbtnUsabOperado_2);
		rbtGroupUsabOperado.add(rdbtnUsabOperado_3);
		
		rdbtnUsabOperado_0.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	valorResUsabB=0;

	        }
	    });
		
		rdbtnUsabOperado_1.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	valorResUsabB=1;

	        }
	    });
		
		/*rdbtnUsabOperado_2.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	valorResUsabB=2;

	        }
	    });*/
		
		rdbtnUsabOperado_3.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	valorResUsabB=2;

	        }
	    });
		
		JButton button_28 = new JButton("Atras");
		button_28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				vuelvePantalla(panelUsabOperado, panelUsabEntendido);
			}
		});
		button_28.setBounds(181, 391, 95, 31);
		panelUsabOperado.add(button_28);
		
		JButton button_29 = new JButton("Siguiente");
		button_29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cambiaPantalla(panelUsabOperado, panelUsabAtractivo, rbtGroupUsabOperado);
			}
		});
		button_29.setBounds(286, 391, 95, 31);
		panelUsabOperado.add(button_29);
		
		JButton button_30 = new JButton("Salir");
		button_30.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ejecutaSalir();
			}
		});
		button_30.setBounds(441, 391, 95, 31);
		panelUsabOperado.add(button_30);
		
		JSeparator separator_26 = new JSeparator();
		separator_26.setBounds(20, 378, 504, 2);
		panelUsabOperado.add(separator_26);
		frmAlgoritmoCalidad.getContentPane().add(panelFiabFallos);
		
		JLabel lblFiabilidadTolerancia = new JLabel("3. Fiabilidad: Tolerancia a fallos");
		lblFiabilidadTolerancia.setFont(new Font("Arial", Font.BOLD, 14));
		lblFiabilidadTolerancia.setBounds(20, 11, 285, 40);
		panelFiabFallos.add(lblFiabilidadTolerancia);
		
		JTextPane txtpnEsLaCapacidad = new JTextPane();
		txtpnEsLaCapacidad.setEditable(false);
		txtpnEsLaCapacidad.setText("Es la capacidad del producto software de mantener la integridad de los datos cuando se producen fallas del sistema.");
		txtpnEsLaCapacidad.setBackground(new Color(211, 211, 211));
		txtpnEsLaCapacidad.setBounds(30, 57, 485, 47);
		panelFiabFallos.add(txtpnEsLaCapacidad);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(20, 115, 504, 14);
		panelFiabFallos.add(separator_4);
		
		JTextPane txtpnCaractersticasA_1 = new JTextPane();
		txtpnCaractersticasA_1.setEditable(false);
		txtpnCaractersticasA_1.setText("\u2022 Caracter\u00EDsticas a medir:\r\n\t- Cuando sucede un error, los datos ya salvados no se pierden.\r\n\t- Cuando sucede un error se pueden recuperar los datos ingresados por el usuario que no fueron salvados.\r\n\r\n");
		txtpnCaractersticasA_1.setBackground(new Color(211, 211, 211));
		txtpnCaractersticasA_1.setBounds(30, 135, 485, 76);
		panelFiabFallos.add(txtpnCaractersticasA_1);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_5.setBounds(30, 228, 485, 142);
		panelFiabFallos.add(panel_5);
		
		JLabel label_4 = new JLabel("Puntuaci\u00F3n:");
		label_4.setBounds(10, 11, 76, 14);
		panel_5.add(label_4);
		
		JRadioButton rdbtnFiabFallos_0 = new JRadioButton("No cumple con ninguna de las caracter\u00EDsticas.");
		rdbtnFiabFallos_0.setBounds(10, 30, 469, 23);
		panel_5.add(rdbtnFiabFallos_0);
		
		JRadioButton rdbtnFiabFallos_1 = new JRadioButton("Cumple con una caracter\u00EDstica.");
		rdbtnFiabFallos_1.setBounds(10, 69, 469, 23);
		panel_5.add(rdbtnFiabFallos_1);
		
		/*JRadioButton rdbtnFiabFallos_2 = new JRadioButton("Cumple con 2 caracter\u00EDsticas.");
		rdbtnFiabFallos_2.setBounds(10, 82, 469, 23);
		panel_5.add(rdbtnFiabFallos_2);*/
		
		JRadioButton rdbtnFiabFallos_3 = new JRadioButton("Cumple con las dos caracter\u00EDsticas.");
		rdbtnFiabFallos_3.setBounds(10, 108, 456, 23);
		panel_5.add(rdbtnFiabFallos_3);
		
		rbtGroupFiabFallos.add(rdbtnFiabFallos_0);
		rbtGroupFiabFallos.add(rdbtnFiabFallos_1);
		//rbtGroupFiabFallos.add(rdbtnFiabFallos_2);
		rbtGroupFiabFallos.add(rdbtnFiabFallos_3);
		
		rdbtnFiabFallos_0.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	valorResFiaA=0;

	        }
	    });
		
		rdbtnFiabFallos_1.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	valorResFiaA=1;

	        }
	    });
		
		/*rdbtnFiabFallos_2.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	valorResFiaA=2;

	        }
	    });*/
		
		rdbtnFiabFallos_3.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	valorResFiaA=2;

	        }
	    });
		
		JButton button_10 = new JButton("Atras");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				vuelvePantalla(panelFiabFallos, panelEficTiempo);
			}
		});
		button_10.setBounds(181, 391, 95, 31);
		panelFiabFallos.add(button_10);
		
		JButton button_11 = new JButton("Siguiente");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cambiaPantalla(panelFiabFallos, panelFiabErrores, rbtGroupFiabFallos);
			}
		});
		button_11.setBounds(286, 391, 95, 31);
		panelFiabFallos.add(button_11);
		
		JButton button_12 = new JButton("Salir");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ejecutaSalir();
			}
		});
		button_12.setBounds(441, 391, 95, 31);
		panelFiabFallos.add(button_12);
		
		JSeparator separator_20 = new JSeparator();
		separator_20.setBounds(20, 381, 504, 2);
		panelFiabFallos.add(separator_20);
		
		PanelResultadoEvaluacion = new JPanel();
		PanelResultadoEvaluacion.setBounds(0, 0, 546, 433);
		frmAlgoritmoCalidad.getContentPane().add(PanelResultadoEvaluacion);
		PanelResultadoEvaluacion.setLayout(null);
		PanelResultadoEvaluacion.setVisible(false);
		
		JButton btnResultadoSalir = new JButton("Salir");
		btnResultadoSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ejecutaSalir();
			}
		});
		btnResultadoSalir.setBounds(439, 391, 95, 31);
		PanelResultadoEvaluacion.add(btnResultadoSalir);
		
		JLabel lblNewLabel_1 = new JLabel("   Funcionabilidad (a) -> Seguridad de acceso..........................");
		lblNewLabel_1.setBackground(new Color(230, 230, 250));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(12, 49, 362, 15);
		PanelResultadoEvaluacion.add(lblNewLabel_1);
		
		JLabel lblFuncionabilidadb = new JLabel("   Funcionabilidad (b) -> Exactitud de los resultados.................");
		lblFuncionabilidadb.setBackground(new Color(230, 230, 250));
		lblFuncionabilidadb.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblFuncionabilidadb.setBounds(12, 69, 362, 15);
		PanelResultadoEvaluacion.add(lblFuncionabilidadb);
		
		JLabel lblEficiencia = new JLabel("   Eficiencia (a) -> Utilizaci\u00F3n de recursos................................");
		lblEficiencia.setBackground(new Color(230, 230, 250));
		lblEficiencia.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEficiencia.setBounds(12, 89, 362, 15);
		PanelResultadoEvaluacion.add(lblEficiencia);
		
		JLabel lblEficienciaComportamiento_1 = new JLabel("   Eficiencia (b) -> Comportamiento frente al tiempo...............");
		lblEficienciaComportamiento_1.setBackground(new Color(230, 230, 250));
		lblEficienciaComportamiento_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEficienciaComportamiento_1.setBounds(12, 109, 362, 15);
		PanelResultadoEvaluacion.add(lblEficienciaComportamiento_1);
		
		JLabel lblFiabilidada = new JLabel("   Fiabilidad (a) -> Tolerancia a Fallos......................................");
		lblFiabilidada.setBackground(new Color(230, 230, 250));
		lblFiabilidada.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblFiabilidada.setBounds(12, 129, 362, 15);
		PanelResultadoEvaluacion.add(lblFiabilidada);
		
		JLabel lblFiabilidadb = new JLabel("   Fiabilidad (b) -> Capacidad de recuperaci\u00F3n de errores...........");
		lblFiabilidadb.setBackground(new Color(230, 230, 250));
		lblFiabilidadb.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblFiabilidadb.setBounds(12, 149, 362, 15);
		PanelResultadoEvaluacion.add(lblFiabilidadb);
		
		JLabel lblFiabilidadc = new JLabel("   Mantenibilidad (a) -> Capacidad del c\u00F3digo de ser analizado.....");
		lblFiabilidadc.setBackground(new Color(230, 230, 250));
		lblFiabilidadc.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblFiabilidadc.setBounds(12, 169, 362, 15);
		PanelResultadoEvaluacion.add(lblFiabilidadc);
		
		JLabel lblMantenibilidadb = new JLabel("   Mantenibilidad (b) -> Capacidad del c\u00F3digo de ser cambiado....");
		lblMantenibilidadb.setBackground(new Color(230, 230, 250));
		lblMantenibilidadb.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblMantenibilidadb.setBounds(12, 189, 362, 15);
		PanelResultadoEvaluacion.add(lblMantenibilidadb);
		
		JLabel lblMantenibilidadc = new JLabel("   Mantenibilidad (c) -> Estabilidad........................................");
		lblMantenibilidadc.setBackground(new Color(230, 230, 250));
		lblMantenibilidadc.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblMantenibilidadc.setBounds(12, 209, 362, 15);
		PanelResultadoEvaluacion.add(lblMantenibilidadc);
		
		JLabel lblUsabilidada = new JLabel("   Usabilidad (a) -> Capacidad de ser entendido........................");
		lblUsabilidada.setBackground(new Color(230, 230, 250));
		lblUsabilidada.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblUsabilidada.setBounds(12, 229, 362, 15);
		PanelResultadoEvaluacion.add(lblUsabilidada);
		
		JLabel lblUsabilidadb = new JLabel("   Usabilidad (b) -> Capacidad de ser operado...........................");
		lblUsabilidadb.setBackground(new Color(230, 230, 250));
		lblUsabilidadb.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblUsabilidadb.setBounds(12, 249, 362, 15);
		PanelResultadoEvaluacion.add(lblUsabilidadb);
		
		JLabel lblUsabilidadc = new JLabel("   Usabilidad (c) -> Capacidad de ser atractivo para el usuario......");
		lblUsabilidadc.setBackground(new Color(230, 230, 250));
		lblUsabilidadc.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblUsabilidadc.setBounds(12, 269, 362, 15);
		PanelResultadoEvaluacion.add(lblUsabilidadc);
		
		JLabel lblPortabilidada = new JLabel("   Portabilidad (a) -> Adaptabilidad.........................................");
		lblPortabilidada.setBackground(new Color(230, 230, 250));
		lblPortabilidada.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPortabilidada.setBounds(12, 289, 362, 15);
		PanelResultadoEvaluacion.add(lblPortabilidada);
		
		JLabel lblPortabilidadb = new JLabel("   Portabilidad (b) -> Instalabilidad..........................................");
		lblPortabilidadb.setBackground(new Color(230, 230, 250));
		lblPortabilidadb.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPortabilidadb.setBounds(12, 309, 362, 15);
		PanelResultadoEvaluacion.add(lblPortabilidadb);
		
		JButton btnResultadoAtras = new JButton("Atras");
		btnResultadoAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				vuelvePantalla(PanelResultadoEvaluacion, panelPortInstalabilidad);
			}
		});
		btnResultadoAtras.setBounds(334, 391, 95, 31);
		PanelResultadoEvaluacion.add(btnResultadoAtras);
		
		JButton btnVolverAEmepezar = new JButton("Volver a emepezar");
		btnVolverAEmepezar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				rbtGroupPortInstalabilidad.clearSelection();
				rbtGroupPortAdaptabilidad.clearSelection();
				rbtGroupUsabAtractivo.clearSelection();
				rbtGroupFuncAdecuacion.clearSelection();
				rbtGroupEficRecursos.clearSelection();
				rbtGroupMantCambiado.clearSelection();
				rbtGroupMantEstabilidad.clearSelection();
				rbtGroupUsabEntendido.clearSelection();
				rbtGroupUsabOperado.clearSelection();
				rbtGroupMantAnal.clearSelection();
				rbtGroupFiabErrores.clearSelection();
				rbtGroupFiabFallos.clearSelection();
				rbtGroupEficTiempo.clearSelection();
				rbtGroupFuncSeguridad.clearSelection();
				
				frmAlgoritmoCalidad.setBounds(100, 100, 547, 336);
				vuelvePantalla(PanelResultadoEvaluacion, panelPrincipal);
			}
		});
		btnVolverAEmepezar.setBounds(184, 391, 140, 31);
		PanelResultadoEvaluacion.add(btnVolverAEmepezar);
		
		JLabel lblResultado = new JLabel("RESULTADO");
		lblResultado.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblResultado.setBounds(211, 11, 113, 21);
		PanelResultadoEvaluacion.add(lblResultado);
		
		JSeparator separator_14 = new JSeparator();
		separator_14.setBounds(24, 378, 499, 2);
		PanelResultadoEvaluacion.add(separator_14);
		
		txtResFuncA = new JTextField();
		txtResFuncA.setEditable(false);
		txtResFuncA.setBackground(new Color(255, 255, 255));
		txtResFuncA.setBounds(365, 49, 166, 15);
		PanelResultadoEvaluacion.add(txtResFuncA);
		txtResFuncA.setColumns(10);
		
		txtResFuncB = new JTextField();
		txtResFuncB.setEditable(false);
		txtResFuncB.setColumns(10);
		txtResFuncB.setBackground(Color.WHITE);
		txtResFuncB.setBounds(365, 67, 166, 15);
		PanelResultadoEvaluacion.add(txtResFuncB);
		
		txtResEfiA = new JTextField();
		txtResEfiA.setEditable(false);
		txtResEfiA.setColumns(10);
		txtResEfiA.setBackground(Color.WHITE);
		txtResEfiA.setBounds(365, 87, 166, 15);
		PanelResultadoEvaluacion.add(txtResEfiA);
		
		txtResEfiB = new JTextField();
		txtResEfiB.setEditable(false);
		txtResEfiB.setColumns(10);
		txtResEfiB.setBackground(Color.WHITE);
		txtResEfiB.setBounds(365, 107, 166, 15);
		PanelResultadoEvaluacion.add(txtResEfiB);
		
		txtResFiaA = new JTextField();
		txtResFiaA.setEditable(false);
		txtResFiaA.setColumns(10);
		txtResFiaA.setBackground(Color.WHITE);
		txtResFiaA.setBounds(365, 127, 166, 15);
		PanelResultadoEvaluacion.add(txtResFiaA);
		
		txtResFiaB = new JTextField();
		txtResFiaB.setEditable(false);
		txtResFiaB.setColumns(10);
		txtResFiaB.setBackground(Color.WHITE);
		txtResFiaB.setBounds(365, 147, 166, 15);
		PanelResultadoEvaluacion.add(txtResFiaB);
		
		txtResManA = new JTextField();
		txtResManA.setEditable(false);
		txtResManA.setColumns(10);
		txtResManA.setBackground(Color.WHITE);
		txtResManA.setBounds(365, 167, 166, 15);
		PanelResultadoEvaluacion.add(txtResManA);
		
		txtResManB = new JTextField();
		txtResManB.setEditable(false);
		txtResManB.setColumns(10);
		txtResManB.setBackground(Color.WHITE);
		txtResManB.setBounds(365, 187, 166, 15);
		PanelResultadoEvaluacion.add(txtResManB);
		
		txtResManC = new JTextField();
		txtResManC.setEditable(false);
		txtResManC.setColumns(10);
		txtResManC.setBackground(Color.WHITE);
		txtResManC.setBounds(365, 207, 166, 15);
		PanelResultadoEvaluacion.add(txtResManC);
		
		txtResUsabA = new JTextField();
		txtResUsabA.setEditable(false);
		txtResUsabA.setColumns(10);
		txtResUsabA.setBackground(Color.WHITE);
		txtResUsabA.setBounds(365, 227, 166, 15);
		PanelResultadoEvaluacion.add(txtResUsabA);
		
		txtResUsabB = new JTextField();
		txtResUsabB.setEditable(false);
		txtResUsabB.setColumns(10);
		txtResUsabB.setBackground(Color.WHITE);
		txtResUsabB.setBounds(365, 247, 166, 15);
		PanelResultadoEvaluacion.add(txtResUsabB);
		
		txtResUsabC = new JTextField();
		txtResUsabC.setEditable(false);
		txtResUsabC.setColumns(10);
		txtResUsabC.setBackground(Color.WHITE);
		txtResUsabC.setBounds(365, 267, 166, 15);
		PanelResultadoEvaluacion.add(txtResUsabC);
		
		txtResPortaA = new JTextField();
		txtResPortaA.setEditable(false);
		txtResPortaA.setColumns(10);
		txtResPortaA.setBackground(Color.WHITE);
		txtResPortaA.setBounds(365, 287, 166, 15);
		PanelResultadoEvaluacion.add(txtResPortaA);
		
		txtResPortaB = new JTextField();
		txtResPortaB.setEditable(false);
		txtResPortaB.setColumns(10);
		txtResPortaB.setBackground(Color.WHITE);
		txtResPortaB.setBounds(365, 307, 166, 15);
		PanelResultadoEvaluacion.add(txtResPortaB);
		
		final JTextPane txtpnAprobo = new JTextPane();
		txtpnAprobo.setEditable(false);
		txtpnAprobo.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtpnAprobo.setBounds(118, 336, 297, 31);
		PanelResultadoEvaluacion.add(txtpnAprobo);
		
		panelPrincipal = new JPanel();
		panelPrincipal.setBounds(0, 0, 546, 308);
		frmAlgoritmoCalidad.getContentPane().add(panelPrincipal);
		panelPrincipal.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Algor\u00EDtmo de calidad");
		lblNewLabel.setBounds(177, 27, 217, 36);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 18));
		panelPrincipal.add(lblNewLabel);
		
		JTextPane txtpnAContinuacinPodr = new JTextPane();
		txtpnAContinuacinPodr.setBounds(24, 78, 499, 78);
		txtpnAContinuacinPodr.setBackground(new Color(220, 220, 220));
		txtpnAContinuacinPodr.setEditable(false);
		txtpnAContinuacinPodr.setText("El siguiente aplicatvio le permitir\u00E1 evaluar la calidad de software de un producto. Durante el proceso, deber\u00E1 calificar cada t\u00F3pico planteado. Al final podr\u00E1 ver, de acuerdo a las puntuaciones totales, si el producto califica como SATISFACTORIO o INSATISFACTORIO, seg\u00FAn el modelo de calidad planteado.");
		panelPrincipal.add(txtpnAContinuacinPodr);
		
		JButton btnIniciar = new JButton("Iniciar!");
		btnIniciar.setBackground(new Color(154, 205, 50));
		btnIniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmAlgoritmoCalidad.setBounds(100, 100, 550, 458);
				panelFuncSeguridad.setVisible(true);
				panelPrincipal.setVisible(false);
			}
		});
		btnIniciar.setBounds(202, 264, 142, 36);
		btnIniciar.setFont(new Font("Arial", Font.BOLD, 15));
		panelPrincipal.add(btnIniciar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ejecutaSalir();
			}
		});
		btnSalir.setBounds(428, 268, 95, 31);
		panelPrincipal.add(btnSalir);
		
		JTextPane txtpnCadaSeccinPedir = new JTextPane();
		txtpnCadaSeccinPedir.setText("Cada secci\u00F3n pedir\u00E1 la evaluaci\u00F3n de una sub-caracter\u00EDstica, perteneciente a una de las seis caracter\u00EDsticas, a trav\u00E9s de una puntuaci\u00F3n realizada en base a cuatro diferentes posibilidades (de peor a mejor), siendo obligatoria una elecci\u00F3n en cada caso.");
		txtpnCadaSeccinPedir.setEditable(false);
		txtpnCadaSeccinPedir.setBackground(new Color(211, 211, 211));
		txtpnCadaSeccinPedir.setBounds(24, 172, 499, 63);
		panelPrincipal.add(txtpnCadaSeccinPedir);
		
		JSeparator separator_15 = new JSeparator();
		separator_15.setBounds(24, 251, 499, 2);
		panelPrincipal.add(separator_15);
		
		panelPortInstalabilidad = new JPanel();
		panelPortInstalabilidad.setLayout(null);
		panelPortInstalabilidad.setBounds(0, 0, 546, 433);
		frmAlgoritmoCalidad.getContentPane().add(panelPortInstalabilidad);
		
		JLabel lblUsabilidadCapacidad_2 = new JLabel("6. Portabilidad: Instalabilidad\r\n");
		lblUsabilidadCapacidad_2.setFont(new Font("Arial", Font.BOLD, 14));
		lblUsabilidadCapacidad_2.setBounds(20, 11, 478, 40);
		panelPortInstalabilidad.add(lblUsabilidadCapacidad_2);
		
		JTextPane txtpnEsLaAgrupacin = new JTextPane();
		txtpnEsLaAgrupacin.setEditable(false);
		txtpnEsLaAgrupacin.setText("El producto software debe poder ser instalado en una cantidad m\u00EDnima de pasos.");
		txtpnEsLaAgrupacin.setBackground(new Color(211, 211, 211));
		txtpnEsLaAgrupacin.setBounds(30, 57, 485, 47);
		panelPortInstalabilidad.add(txtpnEsLaAgrupacin);
		
		JSeparator separator_11 = new JSeparator();
		separator_11.setBounds(20, 115, 504, 14);
		panelPortInstalabilidad.add(separator_11);
		
		JPanel panel_12 = new JPanel();
		panel_12.setLayout(null);
		panel_12.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_12.setBounds(32, 140, 483, 142);
		panelPortInstalabilidad.add(panel_12);
		panelPortInstalabilidad.setVisible(false);
		
		JLabel label_12 = new JLabel("Puntuaci\u00F3n:");
		label_12.setBounds(10, 11, 76, 14);
		panel_12.add(label_12);
		
		JRadioButton rdbtnPortInstalab_0 = new JRadioButton("El producto se instala en 9 o m\u00E1s pasos.");
		rdbtnPortInstalab_0.setBounds(10, 30, 469, 23);
		panel_12.add(rdbtnPortInstalab_0);
		
		JRadioButton rdbtnPortInstalab_1 = new JRadioButton("El producto se instala entre 4 y 8 pasos.");
		rdbtnPortInstalab_1.setBounds(10, 69, 469, 23);
		panel_12.add(rdbtnPortInstalab_1);
		
		/*JRadioButton rdbtnPortInstalab_2 = new JRadioButton("El producto se instala entre 3 y 5 pasos.");
		rdbtnPortInstalab_2.setBounds(10, 82, 469, 23);
		panel_12.add(rdbtnPortInstalab_2);*/
		
		JRadioButton rdbtnPortInstalab_3 = new JRadioButton("El producto se instala en 3 o menos pasos.");
		rdbtnPortInstalab_3.setBounds(10, 108, 456, 23);
		panel_12.add(rdbtnPortInstalab_3);
		
		rbtGroupPortInstalabilidad.add(rdbtnPortInstalab_0);
		rbtGroupPortInstalabilidad.add(rdbtnPortInstalab_1);
		//rbtGroupPortInstalabilidad.add(rdbtnPortInstalab_2);
		rbtGroupPortInstalabilidad.add(rdbtnPortInstalab_3);
		
		rdbtnPortInstalab_0.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	            valorResPortaB=0;

	        }
	    });
		
		rdbtnPortInstalab_1.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	 valorResPortaB=1;

	        }
	    });
		
		/*rdbtnPortInstalab_2.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	valorResPortaB=2;

	        }
	    });*/
		
		rdbtnPortInstalab_3.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	valorResPortaB=2;

	        }
	    });
		
		JButton button_31 = new JButton("Atras");
		button_31.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				vuelvePantalla(panelPortInstalabilidad, panelPortAdaptabilidad);
			}
		});
		button_31.setBounds(181, 391, 95, 31);
		panelPortInstalabilidad.add(button_31);
		
		JButton btnEvaluar = new JButton("Evaluar!");
		btnEvaluar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//evaluamos cada grupo de radio button para ver que le ponemos en su evaluación
				
				escribeResultadoCaracteristica(valorResFuncA, txtResFuncA);
				escribeResultadoCaracteristica(valorResFuncB, txtResFuncB);
				escribeResultadoCaracteristica(valorResEfiA, txtResEfiA);
				escribeResultadoCaracteristica(valorResEfiB, txtResEfiB);
				escribeResultadoCaracteristica(valorResFiaA, txtResFiaA);
				escribeResultadoCaracteristica(valorResFiaB, txtResFiaB);
				escribeResultadoCaracteristica(valorResManA, txtResManA);
				escribeResultadoCaracteristica(valorResManB, txtResManB);
				escribeResultadoCaracteristica(valorResManC, txtResManC);
				escribeResultadoCaracteristica(valorResUsabA, txtResUsabA);
				escribeResultadoCaracteristica(valorResUsabB, txtResUsabB);
				escribeResultadoCaracteristica(valorResUsabC, txtResUsabC);
				escribeResultadoCaracteristica(valorResPortaA, txtResPortaA);
				escribeResultadoCaracteristica(valorResPortaB, txtResPortaB);
				
				//evaluamos cada caractersitica
				
//				poneNotaCaracteristicaCon2Sub(valorResFuncA, valorResFuncB, notaFuncionalidad);
				//if (valorResFuncA == valorResFuncB)
				//	notaFuncionalidad = valorResFuncA;
				if (valorResFuncA == 0 || valorResFuncB == 0)
					notaFuncionalidad=0;
				else if  (valorResFuncA == 1 || valorResFuncB == 1)
					notaFuncionalidad=2;
				else if (valorResFuncA == 2 || valorResFuncB == 2)
					notaFuncionalidad = 3;
				
				
//				poneNotaCaracteristicaCon2Sub(valorResEfiA, valorResEfiB, notaEficiencia);
				//if (valorResEfiA == valorResEfiB)
				//	notaEficiencia = valorResEfiA;
				if (valorResEfiA == 0 || valorResEfiB == 0)
					notaEficiencia=0;
				else if  (valorResEfiA == 1 || valorResEfiB == 1) 
					notaEficiencia=2;
				else if (valorResEfiA == 2 || valorResEfiB == 2) 
					notaEficiencia = 3;				
		
				
//				poneNotaCaracteristicaCon2Sub(valorResFiaA, valorResFiaB, notaFiabilidad);
				
				//if (valorResFiaA == valorResFiaB)
				//	notaFiabilidad = valorResFiaA;
				if (valorResFiaA == 0 || valorResFiaB == 0)
					notaFiabilidad=0;
				else if  (valorResFiaA == 1 || valorResFiaB == 1)
					notaFiabilidad=2;
				else if (valorResFiaA == 2 || valorResFiaB == 2)
					notaFiabilidad = 3;
				
//				poneNotaCaracteristicaCon3Sub(valorResManA, valorResManB, valorResManC, notaMantenibilidad);
				
				//if (valorResManA == valorResManB && valorResManB == valorResManC)
				//	notaMantenibilidad = valorResManA;
				if (valorResManA == 0 || valorResManB == 0 || valorResManC == 0)
					notaMantenibilidad=0;
				else if  ((valorResManA == 1 && valorResManB == 1) || (valorResManA == 1 && valorResManC == 1) || (valorResManB == 1 && valorResManC == 1))
					notaMantenibilidad=2;
				else if (valorResManA == 1 || valorResManB == 1 || valorResManC == 1)
					notaMantenibilidad = 2;
				else if ((valorResManA == 2 && valorResManB == 2) || (valorResManA == 2 && valorResManC == 2) || (valorResManB == 2 && valorResManC == 2))
					notaMantenibilidad = 3;
				else if ((valorResManA == 3 && valorResManB == 3) || (valorResManA == 3 && valorResManC == 3) || (valorResManB == 3 && valorResManC == 3))
					notaMantenibilidad = 3;
				
				
//				poneNotaCaracteristicaCon3Sub(valorResUsabA, valorResUsabB, valorResUsabC, notaUsabilidad);
				
				//if (valorResUsabA == valorResUsabB && valorResUsabB == valorResUsabC)
				//	notaUsabilidad = valorResUsabA;
				if (valorResUsabA == 0 || valorResUsabB == 0 || valorResUsabC == 0)
					notaUsabilidad=0;
				else if  ((valorResUsabA == 1 && valorResUsabB == 1) || (valorResUsabA == 1 && valorResUsabC == 1) || (valorResUsabB == 1 && valorResUsabC == 1))
					notaUsabilidad=2;
				else if (valorResUsabA == 1 || valorResUsabB == 1 || valorResUsabC == 1)
					notaUsabilidad = 2;
				else if ((valorResUsabA == 2 && valorResUsabB == 2) || (valorResUsabA == 2 && valorResUsabC == 2) || (valorResUsabB == 2 && valorResUsabC == 2))
					notaUsabilidad = 3;
				else if ((valorResUsabA == 3 && valorResUsabB == 3) || (valorResUsabA == 3 && valorResUsabC == 3) || (valorResUsabB == 3 && valorResUsabC == 3))
					notaUsabilidad = 3;
				
				
//				poneNotaCaracteristicaCon2Sub(valorResPortaA, valorResPortaB, notaPortabilidad);
				
				//if (valorResPortaA == valorResPortaB)
				//	notaPortabilidad = valorResPortaA;
				if (valorResPortaA == 0 || valorResPortaB == 0)
					notaPortabilidad=0;
				else if  (valorResPortaA == 1 || valorResPortaB == 1)
					notaPortabilidad=2;
				else if (valorResPortaA == 2 || valorResPortaB == 2)
					notaPortabilidad = 3;
				
//				System.out.println("notaFuncionalidad =" + notaFuncionalidad);
//				System.out.println("notaEficiencia =" + notaEficiencia);
//				System.out.println("notaFiabilidad =" + notaFiabilidad);
//				System.out.println("notaMantenibilidad =" + notaMantenibilidad);
//				System.out.println("notaUsabilidad =" + notaUsabilidad);
//				System.out.println("notaPortabilidad =" + notaPortabilidad);
				
				//nota final
				if (notaFuncionalidad >= 2 && notaEficiencia >= 2 && notaFiabilidad >= 1 && notaMantenibilidad >= 1 && notaUsabilidad >= 2 && notaPortabilidad >= 1){
					txtpnAprobo.setText("            SATISFACTORIO");
					txtpnAprobo.setBackground(new Color(0,255,0));
				}else{
					txtpnAprobo.setText("          INSATISFACTORIO");
					txtpnAprobo.setBackground(new Color(255,0,0));
				}
				
				cambiaPantalla(panelPortInstalabilidad, PanelResultadoEvaluacion, rbtGroupPortInstalabilidad);
			}
		});
		btnEvaluar.setBackground(new Color(173, 216, 230));
		btnEvaluar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnEvaluar.setBounds(286, 391, 95, 31);
		panelPortInstalabilidad.add(btnEvaluar);
		
		JButton button_33 = new JButton("Salir");
		button_33.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ejecutaSalir();
			}
		});
		button_33.setBounds(441, 391, 95, 31);
		panelPortInstalabilidad.add(button_33);
		
		JSeparator separator_29 = new JSeparator();
		separator_29.setBounds(20, 378, 504, 2);
		panelPortInstalabilidad.add(separator_29);
		
		panelUsabAtractivo = new JPanel();
		panelUsabAtractivo.setLayout(null);
		panelUsabAtractivo.setBounds(0, 0, 546, 433);
		frmAlgoritmoCalidad.getContentPane().add(panelUsabAtractivo);
		
		JLabel label_7 = new JLabel("5. Usabilidad: Capacidad de ser atractivo para el usuario");
		label_7.setFont(new Font("Arial", Font.BOLD, 14));
		label_7.setBounds(20, 11, 478, 40);
		panelUsabAtractivo.add(label_7);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setEditable(false);
		textPane_2.setText("Es la agrupaci\u00F3n correcta de funcionalidad del producto software en su interfaz gr\u00E1fica, desde su agrupaci\u00F3n l\u00F3gica hasta el n\u00FAmero promedio de pasos para alcanzar una funci\u00F3n o contenido espec\u00EDfico.");
		textPane_2.setBackground(new Color(211, 211, 211));
		textPane_2.setBounds(30, 57, 485, 59);
		panelUsabAtractivo.add(textPane_2);
		
		JSeparator separator_12 = new JSeparator();
		separator_12.setBounds(20, 127, 504, 2);
		panelUsabAtractivo.add(separator_12);
		
		JPanel panel_13 = new JPanel();
		panel_13.setLayout(null);
		panel_13.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_13.setBounds(29, 152, 486, 142);
		panelUsabAtractivo.add(panel_13);
		panelUsabAtractivo.setVisible(false);
		
		JLabel label_13 = new JLabel("Puntuaci\u00F3n:");
		label_13.setBounds(10, 11, 76, 14);
		panel_13.add(label_13);
		
		JRadioButton rdbtnUsabAtractivo_0 = new JRadioButton("Hay 7 o m\u00E1s pasos promedio sin organizaci\u00F3n de categor\u00EDa.");
		rdbtnUsabAtractivo_0.setBounds(10, 30, 469, 23);
		panel_13.add(rdbtnUsabAtractivo_0);
		
		JRadioButton rdbtnUsabAtractivo_1 = new JRadioButton("Hay entre 3 y 6 pasos promedio y distribuidos en categor\u00EDas.");
		rdbtnUsabAtractivo_1.setBounds(10, 69, 469, 23);
		panel_13.add(rdbtnUsabAtractivo_1);
		
		/*JRadioButton rdbtnUsabAtractivo_2 = new JRadioButton("Hay entre 3 y 5 pasos promedio y distribuidos en categor\u00EDas.");
		rdbtnUsabAtractivo_2.setBounds(10, 82, 469, 23);
		panel_13.add(rdbtnUsabAtractivo_2);*/
		
		JRadioButton rdbtnUsabAtractivo_3 = new JRadioButton("Hay 1 o 2 pasos promedio y distribuidos en categor\u00EDas.");
		rdbtnUsabAtractivo_3.setBounds(10, 108, 456, 23);
		panel_13.add(rdbtnUsabAtractivo_3);
		
		rbtGroupUsabAtractivo.add(rdbtnUsabAtractivo_0);
		rbtGroupUsabAtractivo.add(rdbtnUsabAtractivo_1);
		//rbtGroupUsabAtractivo.add(rdbtnUsabAtractivo_2);
		rbtGroupUsabAtractivo.add(rdbtnUsabAtractivo_3);
		
		
		rdbtnUsabAtractivo_0.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	            valorResUsabC=0;

	        }
	    });
		
		rdbtnUsabAtractivo_1.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	valorResUsabC=1;

	        }
	    });
		
		/*rdbtnUsabAtractivo_2.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	valorResUsabC=2;

	        }
	    });*/
		
		rdbtnUsabAtractivo_3.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	valorResUsabC=2;

	        }
	    });
		
		
		JButton button_34 = new JButton("Atras");
		button_34.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				vuelvePantalla(panelUsabAtractivo, panelUsabOperado);
			}
		});
		button_34.setBounds(181, 391, 95, 31);
		panelUsabAtractivo.add(button_34);
		
		JButton button_35 = new JButton("Siguiente");
		button_35.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cambiaPantalla(panelUsabAtractivo, panelPortAdaptabilidad, rbtGroupUsabAtractivo);
			}
		});
		button_35.setBounds(286, 391, 95, 31);
		panelUsabAtractivo.add(button_35);
		
		JButton button_36 = new JButton("Salir");
		button_36.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ejecutaSalir();
			}
		});
		button_36.setBounds(441, 391, 95, 31);
		panelUsabAtractivo.add(button_36);
		
		JSeparator separator_27 = new JSeparator();
		separator_27.setBounds(20, 379, 504, 2);
		panelUsabAtractivo.add(separator_27);
		frmAlgoritmoCalidad.getContentPane().add(panelMantCambiado);
		
		JLabel lblMantenibilidadCapacidad = new JLabel("4. Mantenibilidad: Capacidad del C\u00F3digo para ser cambiado\r\n");
		lblMantenibilidadCapacidad.setFont(new Font("Arial", Font.BOLD, 14));
		lblMantenibilidadCapacidad.setBounds(20, 11, 478, 40);
		panelMantCambiado.add(lblMantenibilidadCapacidad);
		
		JTextPane txtpnParaEvaluarLa = new JTextPane();
		txtpnParaEvaluarLa.setEditable(false);
		txtpnParaEvaluarLa.setText("Para evaluar la capacidad que tiene el c\u00F3digo para ser cambiado se tomar\u00E1n cuenta la complejidad ciclom\u00E1tica del m\u00E9todo.");
		txtpnParaEvaluarLa.setBackground(new Color(211, 211, 211));
		txtpnParaEvaluarLa.setBounds(30, 57, 485, 47);
		panelMantCambiado.add(txtpnParaEvaluarLa);
		
		JSeparator separator_7 = new JSeparator();
		separator_7.setBounds(20, 115, 504, 14);
		panelMantCambiado.add(separator_7);
		
		JPanel panel_8 = new JPanel();
		panel_8.setLayout(null);
		panel_8.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_8.setBounds(30, 140, 485, 142);
		panelMantCambiado.add(panel_8);
		
		JLabel label_8 = new JLabel("Puntuaci\u00F3n:");
		label_8.setBounds(10, 11, 76, 14);
		panel_8.add(label_8);
		
		JRadioButton rdbtnMantCambiado_0 = new JRadioButton("La complejidad ciclom\u00E1tica es mayor o igual a 20.");
		rdbtnMantCambiado_0.setBounds(10, 30, 469, 23);
		panel_8.add(rdbtnMantCambiado_0);
		
		JRadioButton rdbtnMantCambiado_1 = new JRadioButton("La complejidad ciclom\u00E1tica es entre 11 y 19.");
		rdbtnMantCambiado_1.setBounds(10, 69, 469, 23);
		panel_8.add(rdbtnMantCambiado_1);
		
		/*JRadioButton rdbtnMantCambiado_2 = new JRadioButton("La complejidad ciclom\u00E1tica es entre 5 y 11.");
		rdbtnMantCambiado_2.setBounds(10, 82, 469, 23);
		panel_8.add(rdbtnMantCambiado_2);*/
		
		JRadioButton rdbtnMantCambiado_3 = new JRadioButton("La complejidad ciclom\u00E1tica es menor o igual a 10.");
		rdbtnMantCambiado_3.setBounds(10, 108, 456, 23);
		panel_8.add(rdbtnMantCambiado_3);
		
		rbtGroupMantCambiado.add(rdbtnMantCambiado_0);
		rbtGroupMantCambiado.add(rdbtnMantCambiado_1);
		//rbtGroupMantCambiado.add(rdbtnMantCambiado_2);
		rbtGroupMantCambiado.add(rdbtnMantCambiado_3);
		
		rdbtnMantCambiado_0.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	valorResManB=0;

	        }
	    });
		
		rdbtnMantCambiado_1.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	valorResManB=1;

	        }
	    });
		
		/*rdbtnMantCambiado_2.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	valorResManB=2;

	        }
	    });*/
		
		rdbtnMantCambiado_3.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	valorResManB=2;

	        }
	    });
		
		JButton button_19 = new JButton("Atras");
		button_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				vuelvePantalla(panelMantCambiado, panelMantAnal);
			}
		});
		button_19.setBounds(181, 391, 95, 31);
		panelMantCambiado.add(button_19);
		
		JButton button_20 = new JButton("Siguiente");
		button_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cambiaPantalla(panelMantCambiado, panelMantEstabilidad, rbtGroupMantCambiado);
			}
		});
		button_20.setBounds(286, 391, 95, 31);
		panelMantCambiado.add(button_20);
		
		JButton button_21 = new JButton("Salir");
		button_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ejecutaSalir();
			}
		});
		button_21.setBounds(441, 391, 95, 31);
		panelMantCambiado.add(button_21);
		
		JSeparator separator_23 = new JSeparator();
		separator_23.setBounds(20, 378, 504, 2);
		panelMantCambiado.add(separator_23);
		frmAlgoritmoCalidad.getContentPane().add(panelMantAnal);
		
		JLabel lblFiabilidadCapacidad = new JLabel("4. Mantenibilidad: Capacidad del c\u00F3digo para ser analizado\r\n");
		lblFiabilidadCapacidad.setFont(new Font("Arial", Font.BOLD, 14));
		lblFiabilidadCapacidad.setBounds(20, 11, 478, 40);
		panelMantAnal.add(lblFiabilidadCapacidad);
		
		JTextPane txtpnEsLaCapacidad_1 = new JTextPane();
		txtpnEsLaCapacidad_1.setEditable(false);
		txtpnEsLaCapacidad_1.setText("Para evaluar la capacidad que tiene el c\u00F3digo para ser analizado se tiene en cuenta el porcentaje de comentarios que posee por cada m\u00E9todo y en general.");
		txtpnEsLaCapacidad_1.setBackground(new Color(211, 211, 211));
		txtpnEsLaCapacidad_1.setBounds(30, 57, 485, 47);
		panelMantAnal.add(txtpnEsLaCapacidad_1);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setBounds(21, 115, 504, 14);
		panelMantAnal.add(separator_5);
		
		JPanel panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_6.setBounds(30, 140, 485, 142);
		panelMantAnal.add(panel_6);
		
		JLabel label_5 = new JLabel("Puntuaci\u00F3n:");
		label_5.setBounds(10, 11, 76, 14);
		panel_6.add(label_5);
		
		JRadioButton rdbtnMantAnal_0 = new JRadioButton("Hay 10% o menos del c\u00F3digo comentado.");
		rdbtnMantAnal_0.setBounds(10, 30, 469, 23);
		panel_6.add(rdbtnMantAnal_0);
		
		JRadioButton rdbtnMantAnal_1 = new JRadioButton("Hay entre 10 y 20% del c\u00F3digo comentado.");
		rdbtnMantAnal_1.setBounds(10, 69, 469, 23);
		panel_6.add(rdbtnMantAnal_1);
		
		/*JRadioButton rdbtnMantAnal_2 = new JRadioButton("Hay entre 13 y 20% del c\u00F3digo comentado.");
		rdbtnMantAnal_2.setBounds(10, 82, 469, 23);
		panel_6.add(rdbtnMantAnal_2);*/
		
		JRadioButton rdbtnMantAnal_3 = new JRadioButton("Hay 21% o m\u00E1s del c\u00F3digo comentado.");
		rdbtnMantAnal_3.setBounds(10, 108, 456, 23);
		panel_6.add(rdbtnMantAnal_3);
		
		rbtGroupMantAnal.add(rdbtnMantAnal_0);
		rbtGroupMantAnal.add(rdbtnMantAnal_1);
		//rbtGroupMantAnal.add(rdbtnMantAnal_2);
		rbtGroupMantAnal.add(rdbtnMantAnal_3);
		
		rdbtnMantAnal_0.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	valorResManA=0;

	        }
	    });
		
		rdbtnMantAnal_1.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	valorResManA=1;

	        }
	    });
		
		/*rdbtnMantAnal_2.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	valorResManA=2;

	        }
	    });*/
		
		rdbtnMantAnal_3.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	valorResManA=2;

	        }
	    });
		
		JButton button_13 = new JButton("Atras");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				vuelvePantalla(panelMantAnal, panelFiabErrores);
			}
		});
		button_13.setBounds(181, 391, 95, 31);
		panelMantAnal.add(button_13);
		
		JButton button_14 = new JButton("Siguiente");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cambiaPantalla(panelMantAnal, panelMantCambiado, rbtGroupMantAnal);
			}
		});
		button_14.setBounds(286, 391, 95, 31);
		panelMantAnal.add(button_14);
		
		JButton button_15 = new JButton("Salir");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ejecutaSalir();
			}
		});
		button_15.setBounds(441, 391, 95, 31);
		panelMantAnal.add(button_15);
		
		JSeparator separator_22 = new JSeparator();
		separator_22.setBounds(20, 378, 504, 2);
		panelMantAnal.add(separator_22);
		frmAlgoritmoCalidad.getContentPane().add(panelFiabErrores);
		
		JLabel label = new JLabel("3. Fiabilidad: Capacidad de Recuperaci\u00F3n de Errores");
		label.setFont(new Font("Arial", Font.BOLD, 14));
		label.setBounds(20, 11, 404, 40);
		panelFiabErrores.add(label);
		
		JTextPane textPane = new JTextPane();
		textPane.setEditable(false);
		textPane.setText("Es la capacidad del sistema de reanudar sus actividades cuando se producen errores cr\u00EDticos.");
		textPane.setBackground(new Color(211, 211, 211));
		textPane.setBounds(30, 57, 485, 47);
		panelFiabErrores.add(textPane);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setBounds(20, 115, 504, 14);
		panelFiabErrores.add(separator_6);
		
		JTextPane txtpnCaractersticasA_3 = new JTextPane();
		txtpnCaractersticasA_3.setEditable(false);
		txtpnCaractersticasA_3.setText("\u2022 Caracter\u00EDsticas a medir:\r\n\t- El programa no se cierra y puede reanudar sus actividades normalmente.\r\n\t-  El programa vuelve al estado en el que estaba.\r\n\r\n");
		txtpnCaractersticasA_3.setBackground(new Color(211, 211, 211));
		txtpnCaractersticasA_3.setBounds(30, 120, 485, 76);
		panelFiabErrores.add(txtpnCaractersticasA_3);
		
		JPanel panel_7 = new JPanel();
		panel_7.setLayout(null);
		panel_7.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_7.setBounds(30, 228, 485, 142);
		panelFiabErrores.add(panel_7);
		
		JLabel label_6 = new JLabel("Puntuaci\u00F3n:");
		label_6.setBounds(10, 11, 76, 14);
		panel_7.add(label_6);
		
		JRadioButton rdbtnFiabErrores_0 = new JRadioButton("No cumple con ninguna de las caracter\u00EDsticas.");
		rdbtnFiabErrores_0.setBounds(10, 30, 469, 23);
		panel_7.add(rdbtnFiabErrores_0);
		
		JRadioButton rdbtnFiabErrores_1 = new JRadioButton("Cumple con una caracter\u00EDstica.");
		rdbtnFiabErrores_1.setBounds(10, 69, 469, 23);
		panel_7.add(rdbtnFiabErrores_1);
		
		/*JRadioButton rdbtnFiabErrores_2 = new JRadioButton("Cumple con las dos caracter\u00EDsticas.");
		rdbtnFiabErrores_2.setBounds(10, 82, 469, 23);
		panel_7.add(rdbtnFiabErrores_2);*/
		
		JRadioButton rdbtnFiabErrores_3 = new JRadioButton("Cumple con las dos caracter\u00EDsticas.");
		rdbtnFiabErrores_3.setBounds(10, 108, 456, 23);
		panel_7.add(rdbtnFiabErrores_3);
		
		rbtGroupFiabErrores.add(rdbtnFiabErrores_0);
		rbtGroupFiabErrores.add(rdbtnFiabErrores_1);
		//rbtGroupFiabErrores.add(rdbtnFiabErrores_2);
		rbtGroupFiabErrores.add(rdbtnFiabErrores_3);
		
		rdbtnFiabErrores_0.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	valorResFiaB=0;

	        }
	    });
		
		rdbtnFiabErrores_1.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	valorResFiaB=1;

	        }
	    });
		
		/*rdbtnFiabErrores_2.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	valorResFiaB=2;

	        }
	    });*/
		
		rdbtnFiabErrores_3.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	valorResFiaB=2;

	        }
	    });
		
		JButton button_16 = new JButton("Atras");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				vuelvePantalla(panelFiabErrores, panelFiabFallos);
			}
		});
		button_16.setBounds(181, 391, 95, 31);
		panelFiabErrores.add(button_16);
		
		JButton button_17 = new JButton("Siguiente");
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cambiaPantalla(panelFiabErrores, panelMantAnal, rbtGroupFiabErrores);
			}
		});
		button_17.setBounds(286, 391, 95, 31);
		panelFiabErrores.add(button_17);
		
		JButton button_18 = new JButton("Salir");
		button_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ejecutaSalir();
			}
		});
		button_18.setBounds(441, 391, 95, 31);
		panelFiabErrores.add(button_18);
		
		JSeparator separator_21 = new JSeparator();
		separator_21.setBounds(20, 381, 504, 2);
		panelFiabErrores.add(separator_21);
		
		panelFuncAdecuacion = new JPanel();
		panelFuncAdecuacion.setBounds(0, 0, 546, 433);
		frmAlgoritmoCalidad.getContentPane().add(panelFuncAdecuacion);
		panelFuncAdecuacion.setLayout(null);
		
		JLabel lblFuncionalidadAdecuacin = new JLabel("1. Funcionalidad: Exactitud de los resultados.");
		lblFuncionalidadAdecuacin.setFont(new Font("Arial", Font.BOLD, 14));
		lblFuncionalidadAdecuacin.setBounds(20, 11, 285, 40);
		panelFuncAdecuacion.add(lblFuncionalidadAdecuacin);
		
		JTextPane txtpnCapacidadDelProducto_1 = new JTextPane();
		txtpnCapacidadDelProducto_1.setEditable(false);
		txtpnCapacidadDelProducto_1.setText("Busca evaluar la capacidad del producto de entregar los resultados con cierto grado de precisi\u00F3n.");
		txtpnCapacidadDelProducto_1.setBackground(new Color(211, 211, 211));
		txtpnCapacidadDelProducto_1.setBounds(30, 57, 485, 47);
		panelFuncAdecuacion.add(txtpnCapacidadDelProducto_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(20, 115, 504, 14);
		panelFuncAdecuacion.add(separator_1);
		
		JTextPane txtpnCaractersticasA = new JTextPane();
		txtpnCaractersticasA.setEditable(false);
		//txtpnCaractersticasA.setText("\u2022 Caracter\u00EDsticas a medir:\r\n\t1. Los usuarios pueden realizar la carga de los pacientes\r\n\t2. Los usuarios pueden realizar la carga de los m\u00E9dicos.\r\n\t3. Los usuarios pueden realizar la carga del diagn\u00F3stico del paciente.\r\n\t4. Los usuarios pueden ver los listados de los pacientes por m\u00E9dico.\r\n\t5. Los usuarios pueden ver el listado de los pacientes del sistema.\r\n");
		//txtpnCaractersticasA.setBackground(new Color(211, 211, 211));
		//txtpnCaractersticasA.setBounds(30, 125, 485, 102);
		panelFuncAdecuacion.add(txtpnCaractersticasA);
		panelFuncAdecuacion.setVisible(false);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(30, 125, 485, 142);
		panelFuncAdecuacion.add(panel_1);
		
		JLabel label_1 = new JLabel("Puntuaci\u00F3n:");
		label_1.setBounds(10, 11, 76, 14);
		panel_1.add(label_1);
		
		JRadioButton rdbtnFuncAdecuacion_0 = new JRadioButton("Los resultados tienen un error del orden de 10^-3 o superior.");
		rdbtnFuncAdecuacion_0.setBounds(10, 30, 469, 23);
		panel_1.add(rdbtnFuncAdecuacion_0);
		
		JRadioButton rdbtnFuncAdecuacion_1 = new JRadioButton("Los resultados tienen un error del orden entre 10^-4 y 10^-6.");
		rdbtnFuncAdecuacion_1.setBounds(10, 69, 469, 23);
		panel_1.add(rdbtnFuncAdecuacion_1);
		
		/*JRadioButton rdbtnFuncAdecuacion_2 = new JRadioButton("Solo se pueden realizar las caracter\u00EDsticas 1, 2, 3 y 4.");
		rdbtnFuncAdecuacion_2.setBounds(10, 82, 469, 23);
		panel_1.add(rdbtnFuncAdecuacion_2);*/
		
		JRadioButton rdbtnFuncAdecuacion_3 = new JRadioButton("Los resultados tienen un error del orden de 10^-7 o inferior.");
		rdbtnFuncAdecuacion_3.setBounds(10, 108, 456, 23);
		panel_1.add(rdbtnFuncAdecuacion_3);
		
		rbtGroupFuncAdecuacion.add(rdbtnFuncAdecuacion_0);
		rbtGroupFuncAdecuacion.add(rdbtnFuncAdecuacion_1);
		//rbtGroupFuncAdecuacion.add(rdbtnFuncAdecuacion_2);
		rbtGroupFuncAdecuacion.add(rdbtnFuncAdecuacion_3);
		
		rdbtnFuncAdecuacion_0.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	valorResFuncB=0;

	        }
	    });
		
		rdbtnFuncAdecuacion_1.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	valorResFuncB=1;

	        }
	    });
		
		/*rdbtnFuncAdecuacion_2.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	valorResFuncB=2;

	        }
	    });*/
		
		rdbtnFuncAdecuacion_3.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	valorResFuncB=2;

	        }
	    });
		
		JButton button_1 = new JButton("Atras");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				vuelvePantalla(panelFuncAdecuacion, panelFuncSeguridad);
			}
		});
		button_1.setBounds(181, 391, 95, 31);
		panelFuncAdecuacion.add(button_1);
		
		JButton button_2 = new JButton("Siguiente");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cambiaPantalla(panelFuncAdecuacion, panelEficRecursos, rbtGroupFuncAdecuacion);
			}
		});
		button_2.setBounds(286, 391, 95, 31);
		panelFuncAdecuacion.add(button_2);
		
		JButton button_3 = new JButton("Salir");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ejecutaSalir();
			}
		});
		button_3.setBounds(441, 391, 95, 31);
		panelFuncAdecuacion.add(button_3);
		
		JSeparator separator_17 = new JSeparator();
		separator_17.setBounds(20, 385, 504, 2);
		panelFuncAdecuacion.add(separator_17);
		
		panelFuncSeguridad = new JPanel();
		panelFuncSeguridad.setBounds(0, 0, 546, 433);
		frmAlgoritmoCalidad.getContentPane().add(panelFuncSeguridad);
		panelFuncSeguridad.setLayout(null);
		panelFuncSeguridad.setVisible(false);
		
		JLabel lblFuncionalidad = new JLabel("1. Funcionalidad: Seguridad de acceso");
		lblFuncionalidad.setFont(new Font("Arial", Font.BOLD, 14));
		lblFuncionalidad.setBounds(20, 11, 285, 40);
		panelFuncSeguridad.add(lblFuncionalidad);
		
		JTextPane txtpnCapacidadDelProducto = new JTextPane();
		txtpnCapacidadDelProducto.setEditable(false);
		txtpnCapacidadDelProducto.setBackground(new Color(211, 211, 211));
		txtpnCapacidadDelProducto.setText("Capacidad del producto software para asegurar la integridad de los datos y la confidencialidad de estos.");
		txtpnCapacidadDelProducto.setBounds(30, 57, 485, 47);
		panelFuncSeguridad.add(txtpnCapacidadDelProducto);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(20, 115, 504, 14);
		panelFuncSeguridad.add(separator);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(30, 199, 485, 142);
		panelFuncSeguridad.add(panel);
		panel.setLayout(null);
		
		JLabel lblPuntuacin = new JLabel("Puntuaci\u00F3n:");
		lblPuntuacin.setBounds(10, 11, 76, 14);
		panel.add(lblPuntuacin);
		
		JRadioButton rdbtnFuncSeguridad_0 = new JRadioButton("No hay inicio de sesi\u00F3n por usuario y no se encriptan los datos almacenados.");
		rdbtnFuncSeguridad_0.setBounds(10, 30, 469, 23);
		panel.add(rdbtnFuncSeguridad_0);
		
		JRadioButton rdbtnFuncSeguridad_1 = new JRadioButton("Cumple sólo con una caracter\u00EDstica.");
		rdbtnFuncSeguridad_1.setBounds(10, 69, 469, 23);
		panel.add(rdbtnFuncSeguridad_1);
		
		/*JRadioButton rdbtnFuncSeguridad_2 = new JRadioButton("Cumple solo con el inicio de sesi\u00F3n de usuarios.");
		rdbtnFuncSeguridad_2.setBounds(10, 82, 469, 23);
		panel.add(rdbtnFuncSeguridad_2);*/
		
		JRadioButton rdbtnFuncSeguridad_3 = new JRadioButton("Cumple con las dos caracter\u00EDsticas.");
		rdbtnFuncSeguridad_3.setBounds(10, 108, 456, 23);
		panel.add(rdbtnFuncSeguridad_3);
		
		rbtGroupFuncSeguridad.add(rdbtnFuncSeguridad_0);
		rbtGroupFuncSeguridad.add(rdbtnFuncSeguridad_1);
		//rbtGroupFuncSeguridad.add(rdbtnFuncSeguridad_2);
		rbtGroupFuncSeguridad.add(rdbtnFuncSeguridad_3);
		
		rdbtnFuncSeguridad_0.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	            valorResFuncA=0;
	        }
	    });
		
		rdbtnFuncSeguridad_1.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	valorResFuncA=1;

	        }
	    });
		
		/*rdbtnFuncSeguridad_2.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	valorResFuncA=2;

	        }
	    });*/
		
		rdbtnFuncSeguridad_3.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	valorResFuncA=2;

	        }
	    });
		
		JButton button = new JButton("Salir");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ejecutaSalir();
			}
		});
		button.setBounds(441, 391, 95, 31);
		panelFuncSeguridad.add(button);
		
		JButton btnSiguiente = new JButton("Siguiente");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cambiaPantalla(panelFuncSeguridad, panelFuncAdecuacion, rbtGroupFuncSeguridad);
			}
		});
		
		
		btnSiguiente.setBounds(218, 391, 95, 31);
		panelFuncSeguridad.add(btnSiguiente);
		
		JTextPane txtpnCaractersticasAMedir = new JTextPane();
		txtpnCaractersticasAMedir.setEditable(false);
		txtpnCaractersticasAMedir.setBackground(new Color(211, 211, 211));
		txtpnCaractersticasAMedir.setText("Caracter\u00EDsticas a medir:\r\n\t- Encriptaci\u00F3n de datos\r\n\t- Inicio de sesi\u00F3n de usuarios\r\n");
		txtpnCaractersticasAMedir.setBounds(30, 135, 485, 53);
		panelFuncSeguridad.add(txtpnCaractersticasAMedir);
		
		JSeparator separator_16 = new JSeparator();
		separator_16.setBounds(20, 378, 504, 2);
		panelFuncSeguridad.add(separator_16);
		
		panelPortAdaptabilidad = new JPanel();
		panelPortAdaptabilidad.setLayout(null);
		panelPortAdaptabilidad.setBounds(0, 0, 546, 433);
		frmAlgoritmoCalidad.getContentPane().add(panelPortAdaptabilidad);
		
		JLabel label_14 = new JLabel("6. Portabilidad: Adaptabilidad\r\n");
		label_14.setFont(new Font("Arial", Font.BOLD, 14));
		label_14.setBounds(20, 11, 478, 40);
		panelPortAdaptabilidad.add(label_14);
		
		JTextPane textPane_3 = new JTextPane();
		textPane_3.setEditable(false);
		textPane_3.setText("Es la capacidad del producto de adaptarse a diferentes SO. En caso de ser un producto web, sera la cantidad de browsers en los que funciona correctamente");
		textPane_3.setBackground(new Color(211, 211, 211));
		textPane_3.setBounds(30, 57, 485, 47);
		panelPortAdaptabilidad.add(textPane_3);
		
		JSeparator separator_13 = new JSeparator();
		separator_13.setBounds(20, 115, 504, 14);
		panelPortAdaptabilidad.add(separator_13);
		
		JPanel panel_14 = new JPanel();
		panel_14.setLayout(null);
		panel_14.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_14.setBounds(30, 140, 485, 142);
		panelPortAdaptabilidad.add(panel_14);
		panelPortAdaptabilidad.setVisible(false);
		
		JLabel label_15 = new JLabel("Puntuaci\u00F3n:");
		label_15.setBounds(10, 11, 76, 14);
		panel_14.add(label_15);
		
		JRadioButton rdbtnPortAdapta_0 = new JRadioButton("Compatible con 1 sistema operativo o browser.");
		rdbtnPortAdapta_0.setBounds(10, 30, 469, 23);
		panel_14.add(rdbtnPortAdapta_0);
		
		JRadioButton rdbtnPortAdapta_1 = new JRadioButton("Compatible con 2 sistemas operativos o browsers.");
		rdbtnPortAdapta_1.setBounds(10, 69, 469, 23);
		panel_14.add(rdbtnPortAdapta_1);
		
		/*JRadioButton rdbtnPortAdapta_2 = new JRadioButton("Compatible con 3 sistemas operativos.");
		rdbtnPortAdapta_2.setBounds(10, 82, 469, 23);
		panel_14.add(rdbtnPortAdapta_2);*/
		
		JRadioButton rdbtnPortAdapta_3 = new JRadioButton("Compatible con 3 o m\u00E1s sistemas operativos o browsers.");
		rdbtnPortAdapta_3.setBounds(10, 108, 456, 23);
		panel_14.add(rdbtnPortAdapta_3);
		
		rbtGroupPortAdaptabilidad.add(rdbtnPortAdapta_0);
		rbtGroupPortAdaptabilidad.add(rdbtnPortAdapta_1);
		//rbtGroupPortAdaptabilidad.add(rdbtnPortAdapta_2);
		rbtGroupPortAdaptabilidad.add(rdbtnPortAdapta_3);
		
		rdbtnPortAdapta_0.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	valorResPortaA=0;

	        }
	    });
		
		rdbtnPortAdapta_1.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	valorResPortaA=1;

	        }
	    });
		
		/*rdbtnPortAdapta_2.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	valorResPortaA=2;

	        }
	    });*/
		
		rdbtnPortAdapta_3.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	valorResPortaA=2;

	        }
	    });
		
		JButton button_37 = new JButton("Atras");
		button_37.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				vuelvePantalla(panelPortAdaptabilidad, panelUsabAtractivo);
			}
		});
		button_37.setBounds(181, 391, 95, 31);
		panelPortAdaptabilidad.add(button_37);
		
		JButton button_38 = new JButton("Siguiente");
		button_38.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cambiaPantalla(panelPortAdaptabilidad, panelPortInstalabilidad, rbtGroupPortAdaptabilidad);
			}
		});
		button_38.setBounds(286, 391, 95, 31);
		panelPortAdaptabilidad.add(button_38);
		
		JButton button_39 = new JButton("Salir");
		button_39.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			ejecutaSalir();
			}
		});
		button_39.setBounds(441, 391, 95, 31);
		panelPortAdaptabilidad.add(button_39);
		
		JSeparator separator_28 = new JSeparator();
		separator_28.setBounds(20, 378, 504, 2);
		panelPortAdaptabilidad.add(separator_28);
		frmAlgoritmoCalidad.getContentPane().add(panelMantEstabilidad);
		
		JLabel lblMantenibilidadEstabilidad = new JLabel("4. Mantenibilidad: Estabilidad\r\n");
		lblMantenibilidadEstabilidad.setFont(new Font("Arial", Font.BOLD, 14));
		lblMantenibilidadEstabilidad.setBounds(20, 11, 478, 40);
		panelMantEstabilidad.add(lblMantenibilidadEstabilidad);
		
		JTextPane txtpnParaDeterminarLa = new JTextPane();
		txtpnParaDeterminarLa.setEditable(false);
		txtpnParaDeterminarLa.setText("Para determinar la estabilidad del software se eval\u00FAa el promedio de fallas que presenta el producto por prueba.");
		txtpnParaDeterminarLa.setBackground(new Color(211, 211, 211));
		txtpnParaDeterminarLa.setBounds(30, 57, 485, 47);
		panelMantEstabilidad.add(txtpnParaDeterminarLa);
		
		JSeparator separator_8 = new JSeparator();
		separator_8.setBounds(20, 115, 504, 14);
		panelMantEstabilidad.add(separator_8);
		
		JPanel panel_9 = new JPanel();
		panel_9.setLayout(null);
		panel_9.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_9.setBounds(27, 140, 488, 142);
		panelMantEstabilidad.add(panel_9);
		
		JLabel label_9 = new JLabel("Puntuaci\u00F3n:");
		label_9.setBounds(10, 11, 76, 14);
		panel_9.add(label_9);
		
		JRadioButton rdbtnMantEstabilidad_0 = new JRadioButton("El software presenta un promedio 6 o m\u00E1s errores por prueba.");
		rdbtnMantEstabilidad_0.setBounds(10, 30, 469, 23);
		panel_9.add(rdbtnMantEstabilidad_0);
		
		JRadioButton rdbtnMantEstabilidad_1 = new JRadioButton("El software presenta un promedio entre 2 y 5 errores por prueba.");
		rdbtnMantEstabilidad_1.setBounds(10, 69, 469, 23);
		panel_9.add(rdbtnMantEstabilidad_1);
		
		/*JRadioButton rdbtnMantEstabilidad_2 = new JRadioButton("El software presenta un promedio entre 2 y 3 errores por prueba.");
		rdbtnMantEstabilidad_2.setBounds(10, 82, 469, 23);
		panel_9.add(rdbtnMantEstabilidad_2);*/
		
		JRadioButton rdbtnMantEstabilidad_3 = new JRadioButton("El software presenta un promedio entre 0 y 1 error por prueba.");
		rdbtnMantEstabilidad_3.setBounds(10, 108, 456, 23);
		panel_9.add(rdbtnMantEstabilidad_3);
		
		rbtGroupMantEstabilidad.add(rdbtnMantEstabilidad_0);
		rbtGroupMantEstabilidad.add(rdbtnMantEstabilidad_1);
		//rbtGroupMantEstabilidad.add(rdbtnMantEstabilidad_2);
		rbtGroupMantEstabilidad.add(rdbtnMantEstabilidad_3);
		
		rdbtnMantEstabilidad_0.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	valorResManC=0;

	        }
	    });
		
		rdbtnMantEstabilidad_1.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	valorResManC=1;

	        }
	    });
		
		/*rdbtnMantEstabilidad_2.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	valorResManC=2;

	        }
	    });*/
		
		rdbtnMantEstabilidad_3.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	valorResManC=2;

	        }
	    });
		
		JButton button_22 = new JButton("Atras");
		button_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				vuelvePantalla(panelMantEstabilidad, panelMantCambiado);
			}
		});
		button_22.setBounds(181, 391, 95, 31);
		panelMantEstabilidad.add(button_22);
		
		JButton button_23 = new JButton("Siguiente");
		button_23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cambiaPantalla(panelMantEstabilidad, panelUsabEntendido, rbtGroupMantEstabilidad);
			}
		});
		button_23.setBounds(286, 391, 95, 31);
		panelMantEstabilidad.add(button_23);
		
		JButton button_24 = new JButton("Salir");
		button_24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ejecutaSalir();
			}
		});
		button_24.setBounds(441, 391, 95, 31);
		panelMantEstabilidad.add(button_24);
		
		JSeparator separator_24 = new JSeparator();
		separator_24.setBounds(20, 378, 504, 2);
		panelMantEstabilidad.add(separator_24);
		frmAlgoritmoCalidad.getContentPane().add(panelEficTiempo);
		
		JLabel lblEficienciaComportamiento = new JLabel("2. Eficiencia: Comportamiento frente al tiempo");
		lblEficienciaComportamiento.setFont(new Font("Arial", Font.BOLD, 14));
		lblEficienciaComportamiento.setBounds(20, 11, 375, 40);
		panelEficTiempo.add(lblEficienciaComportamiento);
		
		JTextPane txtpnSeEvaluarEl = new JTextPane();
		txtpnSeEvaluarEl.setEditable(false);
		txtpnSeEvaluarEl.setText("Se evaluar\u00E1 el tiempo que est\u00E1 el producto software sin informarle al usuario del estado en que se encuentra la solicitud que realiz\u00F3.");
		txtpnSeEvaluarEl.setBackground(new Color(211, 211, 211));
		txtpnSeEvaluarEl.setBounds(30, 57, 485, 47);
		panelEficTiempo.add(txtpnSeEvaluarEl);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(20, 115, 505, 14);
		panelEficTiempo.add(separator_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_4.setBounds(30, 140, 485, 166);
		panelEficTiempo.add(panel_4);
		
		JLabel label_3 = new JLabel("Puntuaci\u00F3n:");
		label_3.setBounds(10, 21, 76, 14);
		panel_4.add(label_3);
		
		JRadioButton rdbtnEficTiempo_0 = new JRadioButton("Est\u00E1 4 o m\u00E1s segundos sin informar al usuario el estado de la solicitud.");
		rdbtnEficTiempo_0.setBounds(10, 40, 469, 23);
		panel_4.add(rdbtnEficTiempo_0);
		
		JRadioButton rdbtnEficTiempo_1 = new JRadioButton("Est\u00E1 entre 2 y 3 segundos sin informar el estado de la solicitud.");
		rdbtnEficTiempo_1.setBounds(10, 81, 469, 23);
		panel_4.add(rdbtnEficTiempo_1);
		
		/*JRadioButton rdbtnEficTiempo_2 = new JRadioButton("Est\u00E1 menos de 2 segundos sin informar al usuario el estado de la solicitud.");
		rdbtnEficTiempo_2.setBounds(10, 94, 469, 23);
		panel_4.add(rdbtnEficTiempo_2);*/
		
		JRadioButton rdbtnEficTiempo_3 = new JRadioButton("Est\u00E1 menos de 1 segundo sin informar al usuario el estado de la solicitud.");
		rdbtnEficTiempo_3.setBounds(10, 120, 469, 23);
		panel_4.add(rdbtnEficTiempo_3);
		
		rbtGroupEficTiempo.add(rdbtnEficTiempo_0);
		rbtGroupEficTiempo.add(rdbtnEficTiempo_1);
		//rbtGroupEficTiempo.add(rdbtnEficTiempo_2);
		rbtGroupEficTiempo.add(rdbtnEficTiempo_3);
		
		rdbtnEficTiempo_0.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	valorResEfiB=0;

	        }
	    });
		
		rdbtnEficTiempo_1.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	valorResEfiB=1;

	        }
	    });
		
		/*rdbtnEficTiempo_2.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	valorResEfiB=2;

	        }
	    });*/
		
		rdbtnEficTiempo_3.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	valorResEfiB=2;

	        }
	    });
		
		JButton button_7 = new JButton("Atras");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				vuelvePantalla(panelEficTiempo, panelEficRecursos);
			}
		});
		button_7.setBounds(181, 391, 95, 31);
		panelEficTiempo.add(button_7);
		
		JButton button_8 = new JButton("Siguiente");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cambiaPantalla(panelEficTiempo, panelFiabFallos, rbtGroupEficTiempo);
			}
		});
		button_8.setBounds(286, 391, 95, 31);
		panelEficTiempo.add(button_8);
		
		JButton button_9 = new JButton("Salir");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ejecutaSalir();
			}
		});
		button_9.setBounds(441, 391, 95, 31);
		panelEficTiempo.add(button_9);
		
		JSeparator separator_19 = new JSeparator();
		separator_19.setBounds(20, 378, 504, 2);
		panelEficTiempo.add(separator_19);
		
		panelEficRecursos = new JPanel();
		panelEficRecursos.setLayout(null);
		panelEficRecursos.setBounds(0, 0, 546, 433);
		frmAlgoritmoCalidad.getContentPane().add(panelEficRecursos);
		
		JLabel lblEficienciaUtilizacin = new JLabel("2. Eficiencia: Utilizaci\u00F3n de recursos");
		lblEficienciaUtilizacin.setFont(new Font("Arial", Font.BOLD, 14));
		lblEficienciaUtilizacin.setBounds(20, 11, 285, 40);
		panelEficRecursos.add(lblEficienciaUtilizacin);
		
		JTextPane txtpnSeEvaluarLa = new JTextPane();
		txtpnSeEvaluarLa.setEditable(false);
		txtpnSeEvaluarLa.setText("Se evaluar\u00E1 el porcentaje del consumo promedio del procesador por parte del programa.");
		txtpnSeEvaluarLa.setBackground(new Color(211, 211, 211));
		txtpnSeEvaluarLa.setBounds(30, 57, 485, 47);
		panelEficRecursos.add(txtpnSeEvaluarLa);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(20, 115, 504, 14);
		panelEficRecursos.add(separator_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBounds(30, 140, 485, 142);
		panelEficRecursos.add(panel_3);
		panelEficRecursos.setVisible(false);
		
		JLabel label_2 = new JLabel("Puntuaci\u00F3n:");
		label_2.setBounds(10, 11, 76, 14);
		panel_3.add(label_2);
		
		JRadioButton rdbtnEficRecursos_0 = new JRadioButton("Consume 40% o m\u00E1s de uso de procesador.");
		rdbtnEficRecursos_0.setBounds(10, 30, 469, 23);
		panel_3.add(rdbtnEficRecursos_0);
		
		JRadioButton rdbtnEficRecursos_1 = new JRadioButton("Consume entre 11% a 40% de uso de procesador.");
		rdbtnEficRecursos_1.setBounds(10, 69, 469, 23);
		panel_3.add(rdbtnEficRecursos_1);
		
		/*JRadioButton rdbtnEficRecursos_2 = new JRadioButton("Consume desde el 6% a 10% de uso de procesador.");
		rdbtnEficRecursos_2.setBounds(10, 82, 469, 23);
		panel_3.add(rdbtnEficRecursos_2);*/
		
		JRadioButton rdbtnEficRecursos_3 = new JRadioButton("Consume 10% o menos de uso de procesador.");
		rdbtnEficRecursos_3.setBounds(10, 108, 456, 23);
		panel_3.add(rdbtnEficRecursos_3);
		
		rbtGroupEficRecursos.add(rdbtnEficRecursos_0);
		rbtGroupEficRecursos.add(rdbtnEficRecursos_1);
		//rbtGroupEficRecursos.add(rdbtnEficRecursos_2);
		rbtGroupEficRecursos.add(rdbtnEficRecursos_3);
		
		rdbtnEficRecursos_0.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	valorResEfiA=0;		
	        }
	    });
		
		rdbtnEficRecursos_1.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	valorResEfiA=1;		
	        }
	    });
		
		/*rdbtnEficRecursos_2.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	valorResEfiA=2;

	        }
	    });*/
		
		rdbtnEficRecursos_3.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	valorResEfiA=2;
	        }
	    });
		
		JButton button_4 = new JButton("Atras");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				vuelvePantalla(panelEficRecursos, panelFuncAdecuacion);
			}
		});
		button_4.setBounds(181, 391, 95, 31);
		panelEficRecursos.add(button_4);
		
		JButton button_5 = new JButton("Siguiente");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cambiaPantalla(panelEficRecursos, panelEficTiempo, rbtGroupEficRecursos);
			}
		});
		button_5.setBounds(286, 391, 95, 31);
		panelEficRecursos.add(button_5);
		
		JButton button_6 = new JButton("Salir");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ejecutaSalir();
			}
		});
		button_6.setBounds(441, 391, 95, 31);
		panelEficRecursos.add(button_6);
		
		JSeparator separator_18 = new JSeparator();
		separator_18.setBounds(20, 380, 504, 2);
		panelEficRecursos.add(separator_18);
		
	}
	
	private void cambiaPantalla (JPanel anterior, JPanel siguiente, ButtonGroup grupoRB){

		if (grupoRB.getSelection() == null){
			JOptionPane.showMessageDialog(null, "¡Debe seleccionar una puntuación para esta categoría antes de continuar!","Error", JOptionPane.ERROR_MESSAGE);
		}else{
			siguiente.setVisible(true);
			anterior.setVisible(false);
		}
		
	}
	
	private void vuelvePantalla (JPanel actual, JPanel siguiente){
		siguiente.setVisible(true);
		actual.setVisible(false);
	}
	
	
	private void escribeResultadoCaracteristica (int resultado, JTextField cajaRes){
		
		switch (resultado){
		
		case 0:
			cajaRes.setText("                       MALO");
			cajaRes.setBackground(new Color(255,0,0));
			break;
		case 1:
			cajaRes.setText("                  ACEPTABLE");
			cajaRes.setBackground(new Color(255,215,0));
			break;
		case 2:
			cajaRes.setText("                      BUENO");
			cajaRes.setBackground(new Color(50,205,50));
			break;
		default:
			cajaRes.setText("                      FALLO");
			cajaRes.setBackground(new Color(0,255,0));
			break;
		}
		
	}
	
	private void ejecutaSalir (){
		int seleccion = JOptionPane.showOptionDialog(
				   null,
				   "¿Está seguro que desea salir?", 
				   "Confirmación",
				   JOptionPane.OK_CANCEL_OPTION,
				   JOptionPane.QUESTION_MESSAGE,
				   null,    // null para icono por defecto.
				   null,
				   -1);
				 
				if (seleccion == 0)
				   System.exit(0);
	}
}
