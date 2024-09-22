package tareas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Peliculas {

	private JFrame frmPeliculas;
	private JTextField input;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Peliculas window = new Peliculas();
					window.frmPeliculas.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Peliculas() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPeliculas = new JFrame();
		frmPeliculas.setTitle("Peliculas");
		frmPeliculas.setBounds(100, 100, 535, 254);
		frmPeliculas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPeliculas.getContentPane().setLayout(null);
		
		JLabel texto = new JLabel("Escribe el titulo de una pelicula");
		texto.setFont(new Font("Arial", Font.BOLD, 12));
		texto.setBounds(24, 31, 265, 32);
		frmPeliculas.getContentPane().add(texto);
		
		JLabel texto2 = new JLabel("Peliculas");
		texto2.setFont(new Font("Arial", Font.BOLD, 12));
		texto2.setBounds(299, 31, 178, 32);
		frmPeliculas.getContentPane().add(texto2);
		
		input = new JTextField();
		input.setBounds(34, 83, 142, 26);
		frmPeliculas.getContentPane().add(input);
		input.setColumns(10);
		
		JButton boton = new JButton("Añadir");

		boton.setBounds(57, 135, 77, 23);
		frmPeliculas.getContentPane().add(boton);
		
		JComboBox combo = new JComboBox();
		combo.setModel(new DefaultComboBoxModel(new String[] {"Quantum of solace", "Avatar"}));
		combo.setBounds(282, 84, 142, 25);
		frmPeliculas.getContentPane().add(combo);
		
		
		
		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				combo.addItem( input.getText() );
				input.setText("");
				
				
				
			}
		});
	}
}
