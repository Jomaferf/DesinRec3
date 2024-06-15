package desin;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaRepaso {

	private JFrame frame;
	private JTextField tf_texto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaRepaso window = new VentanaRepaso();
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
	public VentanaRepaso() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		tf_texto = new JTextField();
		tf_texto.setText("Selecciona un color.");
		tf_texto.setBounds(68, 28, 298, 20);
		frame.getContentPane().add(tf_texto);
		tf_texto.setColumns(10);
		
		JComboBox cbox_colores = new JComboBox();
		cbox_colores.setModel(new DefaultComboBoxModel(new String[] {"Azul", "Verde", "Rojo", "Negro"}));
		cbox_colores.setBounds(68, 109, 91, 22);
		frame.getContentPane().add(cbox_colores);
		
		JButton btn_cambiaColor = new JButton("Cambia el color");
		btn_cambiaColor.addActionListener(new ActionListener() {
			Color colorTexto = new Color(0);
			public void actionPerformed(ActionEvent e) {
				String colorSelec = (String) cbox_colores.getSelectedItem();
				
				switch (colorSelec) {
				case "Azul":
					tf_texto.setForeground(Color.blue);
					tf_texto.setText("Soy de color " + colorSelec);
					break;
					
				case "Verde":
					tf_texto.setForeground(Color.green);
					tf_texto.setText("Soy de color " + colorSelec);
					break;
				case "Rojo":
					tf_texto.setForeground(Color.red);
					tf_texto.setText("Soy de color " + colorSelec);
					break;
				case "Negro":
					tf_texto.setForeground(Color.black);
					tf_texto.setText("Soy de color " + colorSelec);
					break;
										
				
				
				}
				
				
			}
		});
		btn_cambiaColor.setBounds(218, 109, 148, 23);
		frame.getContentPane().add(btn_cambiaColor);
	}

}
