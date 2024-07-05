package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCalculadora {

	private JFrame frame;
	private JTextField tfN1;
	private JTextField tfN2;
	private JTextField tfResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCalculadora window = new TelaCalculadora();
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
	public TelaCalculadora() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 283, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lbN1 = new JLabel("Digite um número: ");
		lbN1.setBounds(25, 28, 113, 34);
		frame.getContentPane().add(lbN1);
		
		tfN1 = new JTextField();
		tfN1.setBounds(25, 61, 96, 20);
		frame.getContentPane().add(tfN1);
		tfN1.setColumns(10);
		
		JLabel lbN2 = new JLabel("Digite outro número: ");
		lbN2.setBounds(25, 92, 154, 34);
		frame.getContentPane().add(lbN2);
		
		tfN2 = new JTextField();
		tfN2.setBounds(25, 125, 96, 20);
		frame.getContentPane().add(tfN2);
		tfN2.setColumns(10);
		
		JButton btnSoma = new JButton("Somar");
		btnSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSoma.setBounds(25, 206, 89, 23);
		frame.getContentPane().add(btnSoma);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setBounds(124, 206, 89, 23);
		frame.getContentPane().add(btnLimpar);
		
		tfResult = new JTextField();
		tfResult.setEditable(false);
		tfResult.setBounds(25, 175, 96, 20);
		frame.getContentPane().add(tfResult);
		tfResult.setColumns(10);
		
		JLabel lbMResult = new JLabel("O resultado é: ");
		lbMResult.setBounds(25, 156, 86, 14);
		frame.getContentPane().add(lbMResult);
	}

}
