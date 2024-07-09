package application;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class Calculadora {

	private JFrame frmCalculadora;
	private JTextField jTFValor1;
	private JTextField jTFValor2;
	private JTextField jTFResultado;
	private JRadioButton jRBAdicao;
	private JRadioButton jRBSubtracao;
	private JRadioButton jRBMultiplicacao;
	private JRadioButton jRBDivisao;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora window = new Calculadora();
					window.frmCalculadora.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculadora() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculadora = new JFrame();
		frmCalculadora.setTitle("Calculadora");
		frmCalculadora.setBounds(100, 100, 319, 482);
		frmCalculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculadora.getContentPane().setLayout(null);
		
		JLabel jLBValor1 = new JLabel("Digite um número: ");
		jLBValor1.setBounds(25, 28, 113, 34);
		frmCalculadora.getContentPane().add(jLBValor1);
		
		jTFValor1 = new JTextField();
		jTFValor1.setBounds(25, 61, 96, 20);
		frmCalculadora.getContentPane().add(jTFValor1);
		jTFValor1.setColumns(10);
		
		JLabel jLBValoe2 = new JLabel("Digite outro número: ");
		jLBValoe2.setBounds(25, 92, 154, 34);
		frmCalculadora.getContentPane().add(jLBValoe2);
		
		jTFValor2 = new JTextField();
		jTFValor2.setBounds(25, 125, 96, 20);
		frmCalculadora.getContentPane().add(jTFValor2);
		jTFValor2.setColumns(10);
		
		JButton jBSoma = new JButton("Calcular");
		jBSoma.setBounds(25, 411, 89, 23);
		jBSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcular();
			}
		});
		frmCalculadora.getContentPane().add(jBSoma);
		
		JButton jBLimpar = new JButton("Limpar");
		jBLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
			}
		});
		jBLimpar.setBounds(141, 411, 89, 23);
		frmCalculadora.getContentPane().add(jBLimpar);
		
		jTFResultado = new JTextField();
		jTFResultado.setBounds(25, 377, 205, 23);
		jTFResultado.setEditable(false);
		frmCalculadora.getContentPane().add(jTFResultado);
		jTFResultado.setColumns(10);
		
		JLabel jLBResultado = new JLabel("O resultado é: ");
		jLBResultado.setBounds(25, 352, 86, 14);
		frmCalculadora.getContentPane().add(jLBResultado);
		
		jRBAdicao = new JRadioButton("Adição");
		buttonGroup.add(jRBAdicao);
		jRBAdicao.setBounds(25, 173, 111, 23);
		frmCalculadora.getContentPane().add(jRBAdicao);
		
		jRBSubtracao = new JRadioButton("Subtração");
		buttonGroup.add(jRBSubtracao);
		jRBSubtracao.setBounds(25, 209, 111, 23);
		frmCalculadora.getContentPane().add(jRBSubtracao);
		
		jRBMultiplicacao = new JRadioButton("Multiplicação");
		buttonGroup.add(jRBMultiplicacao);
		jRBMultiplicacao.setBounds(25, 246, 111, 23);
		frmCalculadora.getContentPane().add(jRBMultiplicacao);
		
		jRBDivisao = new JRadioButton("Divisão");
		buttonGroup.add(jRBDivisao);
		jRBDivisao.setBounds(25, 282, 111, 23);
		frmCalculadora.getContentPane().add(jRBDivisao);
	}
	private void limpar() {
		jTFValor1.setText("");
		jTFValor2.setText("");
		jTFResultado.setText("");
		jRBAdicao.setSelected(true);
		jTFValor1.requestFocus();
	}
	private void calcular() {
		double v1,v2,res = 0;
		v1 = Double.parseDouble(jTFValor1.getText());
		v2 = Double.parseDouble(jTFValor2.getText());
		if (jRBAdicao.isSelected())
		res = v1 + v2;
		else if (jRBSubtracao.isSelected())
		res = v1 - v2;
		else if (jRBMultiplicacao.isSelected())
		res = v1 * v2;
		else 
			res = v1 / v2;
		jTFResultado.setText(String.valueOf(res));
	}
}