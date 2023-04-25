import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.Timer;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.*;


public class Ventana  {
	private Timer cronometroTimer;
	 private long startTime;
	 
	private JFrame frame;
	ArrayList<JLabel> Botones2 = new ArrayList<JLabel>();
	ArrayList<String> Palabras = new ArrayList<String>();
	  JLabel selectedLabel = new JLabel();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana window = new Ventana();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ventana() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Palabras.add("Peyote");
		Palabras.add("Crayola");
		Palabras.add("Flores");
		Palabras.add("Marte");
		Palabras.add("Clamidia");
		Palabras.add("Ciruela");
		Palabras.add("Homoplato");
		Palabras.add("Adidas");
		Palabras.add("Zatura");
		Palabras.add("Hola");
		
		JTextField textField = new JTextField();
		
		
		frame = new JFrame();
		frame.setFocusable(true);
		
		for (JLabel lblNewLabel_32 : Botones2) {
		    lblNewLabel_32.setOpaque(true);
		}
		
		frame.setBounds(100, 100, 896, 571);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(145, 53, 53));
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel_34 = new JLabel("Escribe aqui -->");
		lblNewLabel_34.setFont(new Font("Tahoma", Font.PLAIN, 27));
		panel.add(lblNewLabel_34);
		
		JLabel lblNewLabel_33 = new JLabel("");
		lblNewLabel_33.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel.add(lblNewLabel_33);
		
		
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel.add(lblNewLabel_2);
		
		//JLabel que tendra el tiempo
		JLabel lblNewLabel_1 = new JLabel("00:00");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel.add(lblNewLabel_1);
		
		//Creamos el panel para agregar el tiempo el JLabel para escribir etc
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(23, 157, 181));
		frame.getContentPane().add(panel_1, BorderLayout.SOUTH);
		
		//Agregamos la opcion espacio
		JLabel lblNewLabel_32 = new JLabel("Espacio");
		lblNewLabel_32.setBackground(new Color(255, 255, 255));
		lblNewLabel_32.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_32.setOpaque(true);
		Botones2.add(lblNewLabel_32);
		panel_1.add(lblNewLabel_32);
		
		//randomizar las palabras
		JLabel lblNewLabel_3 = new JLabel("                                                                       ");
		panel_1.add(lblNewLabel_3);
		Random random = new Random();
		int indiceAleatorio = random.nextInt(Palabras.size());
		String textoAleatorio = Palabras.get(indiceAleatorio);
		lblNewLabel_2.setText(textoAleatorio); 
		
		
		//Agregamos la opcion eliminar
		JLabel btnNewButton_1 = new JLabel("Eliminar");
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_1.setOpaque(true);
		Botones2.add(btnNewButton_1);
		panel_1.add(btnNewButton_1);
		
		/*//el boton Aceptar para el juego
		JButton btnNewButton = new JButton("Aceptar");	
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel_1.add(btnNewButton);*/
		
		//Creamos el Panel donde iran las ociones "Eliminar","Espacio" y "Aceptar"
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(128, 64, 64));
		frame.getContentPane().add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new GridLayout(3, 9, 4, 2));
		
		
		
		//Teclado con las letras
		JLabel lblNewLabel_5 = new JLabel("              Q");
		lblNewLabel_5.setOpaque(true);
		panel_2.add(lblNewLabel_5);
		Botones2.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("              W");
		panel_2.add(lblNewLabel_6);
		lblNewLabel_6.setOpaque(true);
		Botones2.add(lblNewLabel_6);
		//////
		JLabel lblNewLabel_7 = new JLabel("              E");
		panel_2.add(lblNewLabel_7);
		lblNewLabel_7.setOpaque(true);
		Botones2.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("              R");
		panel_2.add(lblNewLabel_8);
		lblNewLabel_8.setOpaque(true);
		Botones2.add(lblNewLabel_8);
		
		JLabel lblNewLabel_4 = new JLabel("              A");
		lblNewLabel_4.setOpaque(true);
		panel_2.add(lblNewLabel_4);
		Botones2.add(lblNewLabel_4);
		
		JLabel lblNewLabel_10 = new JLabel("              T");
		panel_2.add(lblNewLabel_10);
		lblNewLabel_10.setOpaque(true);
		Botones2.add(lblNewLabel_10);
		
		JLabel lblNewLabel_9 = new JLabel("              Y");
		panel_2.add(lblNewLabel_9);
		lblNewLabel_9.setOpaque(true);
		Botones2.add(lblNewLabel_9);
		
		JLabel lblNewLabel_11 = new JLabel("              U");
		panel_2.add(lblNewLabel_11);
		lblNewLabel_11.setOpaque(true);
		Botones2.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("              I");
		panel_2.add(lblNewLabel_12);
		lblNewLabel_12.setOpaque(true);
		Botones2.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("              O");
		panel_2.add(lblNewLabel_13);
		lblNewLabel_13.setOpaque(true);
		Botones2.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("              P");
		panel_2.add(lblNewLabel_14);
		lblNewLabel_14.setOpaque(true);
		Botones2.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("              A");
		panel_2.add(lblNewLabel_15);
		lblNewLabel_15.setOpaque(true);
		Botones2.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("              S");
		panel_2.add(lblNewLabel_16);
		lblNewLabel_16.setOpaque(true);
		Botones2.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("              D");
		panel_2.add(lblNewLabel_17);
		lblNewLabel_17.setOpaque(true);
		Botones2.add(lblNewLabel_17);
		
		JLabel lblNewLabel_18 = new JLabel("              F");
		panel_2.add(lblNewLabel_18);
		lblNewLabel_18.setOpaque(true);
		Botones2.add(lblNewLabel_18);
		
		JLabel lblNewLabel_19 = new JLabel("              G");
		panel_2.add(lblNewLabel_19);
		lblNewLabel_19.setOpaque(true);
		Botones2.add(lblNewLabel_19);
		
		JLabel lblNewLabel_20 = new JLabel("              H");
		panel_2.add(lblNewLabel_20);
		lblNewLabel_20.setOpaque(true);
		Botones2.add(lblNewLabel_20);
		
		JLabel lblNewLabel_21 = new JLabel("              J");
		panel_2.add(lblNewLabel_21);
		lblNewLabel_21.setOpaque(true);
		Botones2.add(lblNewLabel_21);
		
		JLabel lblNewLabel_22 = new JLabel("              K");
		panel_2.add(lblNewLabel_22);
		lblNewLabel_22.setOpaque(true);
		Botones2.add(lblNewLabel_22);
		
		JLabel lblNewLabel_23 = new JLabel("              L");
		panel_2.add(lblNewLabel_23);
		lblNewLabel_23.setOpaque(true);
		Botones2.add(lblNewLabel_23);
		
		JLabel lblNewLabel_24 = new JLabel("              Ñ");
		panel_2.add(lblNewLabel_24);
		lblNewLabel_24.setOpaque(true);
		Botones2.add(lblNewLabel_24);
		
		JLabel lblNewLabel_25 = new JLabel("              Z");
		panel_2.add(lblNewLabel_25);
		lblNewLabel_25.setOpaque(true);
		Botones2.add(lblNewLabel_25);
		
		JLabel lblNewLabel_26 = new JLabel("              X");
		panel_2.add(lblNewLabel_26);
		lblNewLabel_26.setOpaque(true);
		Botones2.add(lblNewLabel_26);
		
		JLabel lblNewLabel_27 = new JLabel("              C");
		panel_2.add(lblNewLabel_27);
		lblNewLabel_27.setOpaque(true);
		Botones2.add(lblNewLabel_27);
		
		JLabel lblNewLabel_28 = new JLabel("              V");
		panel_2.add(lblNewLabel_28);
		lblNewLabel_28.setOpaque(true);
		Botones2.add(lblNewLabel_28);
		
		JLabel lblNewLabel_29 = new JLabel("              B");
		panel_2.add(lblNewLabel_29);
		lblNewLabel_29.setOpaque(true);
		Botones2.add(lblNewLabel_29);
		
		JLabel lblNewLabel_30 = new JLabel("              N");
		panel_2.add(lblNewLabel_30);
		lblNewLabel_30.setOpaque(true);
		Botones2.add(lblNewLabel_30);
		
		JLabel lblNewLabel_31 = new JLabel("              M");
		panel_2.add(lblNewLabel_31);
		lblNewLabel_31.setOpaque(true);
		Botones2.add(lblNewLabel_31);
		
		
		//Tecleo de letras, colores, correcto o incorrecto y reinicio 
				KeyListener keyListener = new KeyListener(){

					@Override
					public void keyTyped(KeyEvent e) {
						// TODO Auto-generated method stub
						 String currentText = lblNewLabel_33.getText();

			               
			                char newChar = e.getKeyChar();

			               
			                lblNewLabel_33.setText(currentText + newChar);
						
					}
					
					@Override
					public void keyPressed(KeyEvent e) {
						// TODO Auto-generated method stub
						
						
						 Object source = e.getSource();
			                if (source instanceof JLabel) {
			                    selectedLabel = (JLabel) source;
			                }
						///////*********************************************
			                JLabel ultimo = new JLabel();
						Random rand = new Random();
						for (JLabel label : Botones2) {
							int red = rand.nextInt(256);
						    int green = rand.nextInt(256);
						    int blue = rand.nextInt(256);
							 Color color = new Color(red, green, blue);
						    label.setBackground(color);
						}///////***********************************************
						
						if (e.getKeyChar() == KeyEvent.VK_ENTER) {
					        if (lblNewLabel_33.getText().trim().equalsIgnoreCase(lblNewLabel_2.getText().trim())) {
					            JOptionPane.showMessageDialog(frame, "Correcto");
					            Ventana ventana = new Ventana();
								frame.setVisible(false);
								ventana.main (null);
					        } else {
					            JOptionPane.showMessageDialog(frame, "Incorrecto");
					            Ventana ventana = new Ventana();
								frame.setVisible(false);
								ventana.main (null);
					        }
					    } else if (e.getKeyChar() == KeyEvent.VK_BACK_SPACE) {
					        String currentText = lblNewLabel_33.getText();
					        if (!currentText.isEmpty()) {
					            lblNewLabel_33.setText(currentText.substring(0, currentText.length() - 1));
					            
					            
					        }}
						
						System.out.println(e.getKeyChar());
						System.out.println(e.getKeyCode());
						
						
					}
					
					@Override
					public void keyReleased(KeyEvent e) {
						// TODO Auto-generated method stub
						
					}};
					
					
					panel.setFocusable(true);
					panel.addKeyListener(keyListener);
					frame.addKeyListener(keyListener);
					frame.setFocusable(true);
		
		
		//////cronometro
				cronometroTimer = new Timer(1000, new ActionListener() {
		            public void actionPerformed(ActionEvent e) {
		            	long elapsedTime = System.currentTimeMillis() - startTime;
		                int minutos = (int) ((elapsedTime / (1000 * 60)) % 60);
		                int segundos = (int) ((elapsedTime / 1000) % 60);
		                lblNewLabel_1.setText(String.format("%02d:%02d",  minutos, segundos));
		            }
		        });
				 startTime = System.currentTimeMillis();
			        cronometroTimer.start();
	}

}