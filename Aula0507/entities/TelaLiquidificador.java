package entities;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class TelaLiquidificador {

	private JFrame frmLiquidificador;
	private JTextField tfEstado;
	private JTextField tfVelocidade;
	private Liquidificador liqui;
	private JButton btnEstado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLiquidificador window = new TelaLiquidificador();
					window.frmLiquidificador.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaLiquidificador() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void mostrar() {
		tfEstado.setText(liqui.isEstado()?"Ligado":"Desligado");
		tfVelocidade.setText(""+liqui.getVelocidade());
		btnEstado.setText(liqui.isEstado()?"Desligar":"Ligar");
	}
	private void initialize() {
		liqui = new Liquidificador();
		frmLiquidificador = new JFrame();
		frmLiquidificador.setTitle("Liquidificador");
		frmLiquidificador.getContentPane().setLayout(null);
		
		JButton btnAumentar = new JButton("+");
		btnAumentar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				liqui.velocidadeMais();
				mostrar();
			}
		});
		btnAumentar.setBounds(176, 42, 68, 55);
		frmLiquidificador.getContentPane().add(btnAumentar);
		
		JButton btnDiminuir = new JButton("-");
		btnDiminuir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				liqui.velocidadeMenos();
				mostrar();
			}
		});
		btnDiminuir.setBounds(176, 109, 68, 55);
		frmLiquidificador.getContentPane().add(btnDiminuir);
		
		btnEstado = new JButton("Ligar");
		btnEstado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				liqui.setEstado();
				mostrar();
			}
		});
		btnEstado.setBounds(27, 152, 96, 26);
		frmLiquidificador.getContentPane().add(btnEstado);
		
		JLabel lbEstado = new JLabel("Estado");
		lbEstado.setForeground(new Color(0, 0, 0));
		lbEstado.setBounds(27, 11, 139, 35);
		frmLiquidificador.getContentPane().add(lbEstado);
		
		JLabel lbVelocidade = new JLabel("Velocidade");
		lbVelocidade.setForeground(new Color(0, 0, 0));
		lbVelocidade.setBounds(27, 73, 139, 35);
		frmLiquidificador.getContentPane().add(lbVelocidade);
		
		tfEstado = new JTextField();
		tfEstado.setHorizontalAlignment(SwingConstants.CENTER);
		tfEstado.setEditable(false);
		tfEstado.setText("Desligado");
		tfEstado.setBounds(27, 42, 96, 20);
		frmLiquidificador.getContentPane().add(tfEstado);
		tfEstado.setColumns(10);
		
		tfVelocidade = new JTextField();
		tfVelocidade.setHorizontalAlignment(SwingConstants.CENTER);
		tfVelocidade.setText("0");
		tfVelocidade.setEditable(false);
		tfVelocidade.setBounds(27, 108, 96, 20);
		frmLiquidificador.getContentPane().add(tfVelocidade);
		tfVelocidade.setColumns(10);
	}
}
