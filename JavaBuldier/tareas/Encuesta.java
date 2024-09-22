package tareas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JSlider;
import javax.swing.JButton;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class Encuesta {
	String Sistema = "ninguno";

	private JFrame frmMiniEncuesta;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Encuesta window = new Encuesta();
					window.frmMiniEncuesta.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Encuesta() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMiniEncuesta = new JFrame();
		frmMiniEncuesta.setTitle("Mini encuesta");
		frmMiniEncuesta.setBounds(100, 100, 268, 501);
		frmMiniEncuesta.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMiniEncuesta.getContentPane().setLayout(null);
		
		JLabel textonull = new JLabel("Elige un sistema operativo");
		textonull.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textonull.setBounds(23, 42, 180, 14);
		frmMiniEncuesta.getContentPane().add(textonull);
		
		JRadioButton rdb1 = new JRadioButton("Windows");
		rdb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sistema = "Windows";
			}
		});

		buttonGroup.add(rdb1);
		rdb1.setBounds(23, 76, 134, 23);
		frmMiniEncuesta.getContentPane().add(rdb1);
		rdb1.setAlignmentY(0.0f);
		
		JRadioButton rdb2 = new JRadioButton("Linux");
		rdb2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sistema = "Linux";
			}
		});
		buttonGroup.add(rdb2);
		rdb2.setBounds(23, 114, 154, 23);
		frmMiniEncuesta.getContentPane().add(rdb2);
		
		JRadioButton rdb3 = new JRadioButton("Mac");
		rdb3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sistema = "Mac";
			}
		});
		buttonGroup.add(rdb3);
		rdb3.setBounds(23, 148, 134, 23);
		frmMiniEncuesta.getContentPane().add(rdb3);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 191, 205, 2);
		frmMiniEncuesta.getContentPane().add(separator_1);
		
		JLabel textonull_2 = new JLabel("Elige tu especialidad");
		textonull_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textonull_2.setBounds(23, 204, 180, 14);
		frmMiniEncuesta.getContentPane().add(textonull_2);
		
		JCheckBox rdb6 = new JCheckBox("Mac");
		rdb6.setBounds(23, 309, 134, 23);
		frmMiniEncuesta.getContentPane().add(rdb6);
		
		JCheckBox rdb5 = new JCheckBox("Linux");
		rdb5.setBounds(23, 275, 154, 23);
		frmMiniEncuesta.getContentPane().add(rdb5);
		
		JCheckBox rdb4 = new JCheckBox("Windows");
		rdb4.setAlignmentY(0.0f);
		rdb4.setBounds(23, 237, 134, 23);
		frmMiniEncuesta.getContentPane().add(rdb4);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(10, 346, 205, 2);
		frmMiniEncuesta.getContentPane().add(separator_1_1);
		
		JLabel textonull_3 = new JLabel("Horas que dedicas en el ordenador");
		textonull_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textonull_3.setBounds(20, 359, 180, 14);
		frmMiniEncuesta.getContentPane().add(textonull_3);
		
		JSlider slider = new JSlider();
		
		slider.setValue(4);
		slider.setMinimum(1);
		slider.setMaximum(10);
		slider.setBounds(55, 393, 148, 23);
		frmMiniEncuesta.getContentPane().add(slider);
		
		JButton boton = new JButton("generar");
		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String especialidades ="";
				if(rdb6.isSelected()) {
					especialidades = especialidades + " Windows ";
				}
				if(rdb4.isSelected()) {
					especialidades = especialidades + " Linux ";
				}	
				if(rdb3.isSelected()) {
					especialidades = especialidades + " Mac ";
				}
				
	
				String salida = "tu sistema operativo preferido es " + 	Sistema + " y tu especialidades son " + especialidades + " y el numero de horas dedicadas al ordenador son de " + slider.getValue();
				JOptionPane.showMessageDialog(boton, salida);
			}
		});
		boton.setBounds(73, 428, 89, 23);
		frmMiniEncuesta.getContentPane().add(boton);
		
		JLabel con = new JLabel("4");
		con.setFont(new Font("Tahoma", Font.PLAIN, 14));
		con.setBounds(30, 387, 19, 29);
		frmMiniEncuesta.getContentPane().add(con);
		
		
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				con.setText( String.valueOf(slider.getValue()));
			}
		});
	}
}
