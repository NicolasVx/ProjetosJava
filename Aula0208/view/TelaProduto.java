package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import entities.Produto;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaProduto {

	private JFrame frame;
	private final JLabel lblId = new JLabel("Id:");
	private JTextField TfId;
	private JTextField tFNome;
	private JTextField tFCategoria;
	private JTextField tFQuantidade;
	private JTextField tFPreco;
	private JTextField tFDisplay;
	private Produto[] produtos = new Produto[1000];
	private int i = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaProduto window = new TelaProduto();
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
	public TelaProduto() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 935, 491);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		lblId.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblId.setBounds(30, 0, 145, 41);
		frame.getContentPane().add(lblId);

		TfId = new JTextField();
		TfId.setFont(new Font("Tahoma", Font.PLAIN, 16));
		TfId.setBounds(30, 36, 82, 32);
		frame.getContentPane().add(TfId);
		TfId.setColumns(10);

		JLabel lbLNome = new JLabel("Nome:");
		lbLNome.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbLNome.setBounds(30, 61, 145, 41);
		frame.getContentPane().add(lbLNome);

		tFNome = new JTextField();
		tFNome.setFont(new Font("Tahoma", Font.PLAIN, 16));
		tFNome.setColumns(10);
		tFNome.setBounds(30, 97, 170, 31);
		frame.getContentPane().add(tFNome);

		JLabel lbLCategoria = new JLabel("Categoria:");
		lbLCategoria.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbLCategoria.setBounds(30, 125, 145, 41);
		frame.getContentPane().add(lbLCategoria);

		tFCategoria = new JTextField();
		tFCategoria.setFont(new Font("Tahoma", Font.PLAIN, 16));
		tFCategoria.setColumns(10);
		tFCategoria.setBounds(30, 163, 170, 31);
		frame.getContentPane().add(tFCategoria);

		JLabel lbLQuantidade = new JLabel("Quantidade:");
		lbLQuantidade.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbLQuantidade.setBounds(30, 187, 145, 41);
		frame.getContentPane().add(lbLQuantidade);

		tFQuantidade = new JTextField();
		tFQuantidade.setFont(new Font("Tahoma", Font.PLAIN, 16));
		tFQuantidade.setColumns(10);
		tFQuantidade.setBounds(30, 222, 82, 30);
		frame.getContentPane().add(tFQuantidade);

		JLabel lbLPreco = new JLabel("Preço:");
		lbLPreco.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbLPreco.setBounds(30, 249, 145, 41);
		frame.getContentPane().add(lbLPreco);

		tFPreco = new JTextField();
		tFPreco.setFont(new Font("Tahoma", Font.PLAIN, 16));
		tFPreco.setColumns(10);
		tFPreco.setBounds(30, 285, 170, 32);
		frame.getContentPane().add(tFPreco);

		JButton btn02 = new JButton("<");
		btn02.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int x = Integer.parseInt(tFDisplay.getText());
				if(x > 1) {
					tFDisplay.setText(String.valueOf(--x));
					mostrar();
				}
				
			}
		});
		btn02.setBounds(94, 347, 54, 41);
		frame.getContentPane().add(btn02);

		JButton btno1 = new JButton("|<");
		btno1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tFDisplay.setText(String.valueOf(1));
				mostrar();
			}
		});
		btno1.setBounds(30, 347, 54, 41);
		frame.getContentPane().add(btno1);

		JButton btn04 = new JButton(">");
		btn04.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int x = Integer.parseInt(tFDisplay.getText());
				if(x < i) {
					tFDisplay.setText(String.valueOf(++x));
					mostrar();
				}
			}
		});
		btn04.setBounds(222, 347, 54, 41);
		frame.getContentPane().add(btn04);

		JButton btn05 = new JButton(">|");
		btn05.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tFDisplay.setText(String.valueOf(i));
				mostrar();
			}
		});
		btn05.setBounds(295, 347, 54, 41);
		frame.getContentPane().add(btn05);

		tFDisplay = new JTextField();
		tFDisplay.setHorizontalAlignment(SwingConstants.CENTER);
		tFDisplay.setText("1");
		tFDisplay.setEditable(false);
		tFDisplay.setBounds(158, 347, 54, 41);
		frame.getContentPane().add(tFDisplay);
		tFDisplay.setColumns(10);

		JButton btnNovo = new JButton("Novo");
		btnNovo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNovo.setBounds(383, 345, 105, 41);
		frame.getContentPane().add(btnNovo);

		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cadastrar();
			}
		});
		btnCadastrar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCadastrar.setBounds(222, 285, 105, 32);
		frame.getContentPane().add(btnCadastrar);

		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
			}
		});
		btnLimpar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnLimpar.setBounds(340, 285, 105, 32);
		frame.getContentPane().add(btnLimpar);
	}

	private void cadastrar() {
		Produto p = new Produto();
		p.setId(Integer.parseInt(TfId.getText()));
		p.setNome(tFNome.getText());
		p.setCategoria(tFCategoria.getText());
		p.setQuantidade(Integer.parseInt(tFQuantidade.getText()));
		p.setPreco(Double.parseDouble(tFPreco.getText()));
		produtos[i] = p;
		i++;
		limpar();
	}

	private void limpar() {
		TfId.setText("");
		tFNome.setText("");
		tFCategoria.setText("");
		tFPreco.setText("");
		tFQuantidade.setText("");
		TfId.requestFocus();
	}
	private void mostrar() {
		int i = Integer.parseInt(tFDisplay.getText());
		i = i - 1;
		Produto p = produtos[i];
		TfId.setText(String.valueOf(p.getId()));
		tFNome.setText(p.getNome());
		tFCategoria.setText(p.getCategoria());
		tFQuantidade.setText(String.valueOf(p.getQuantidade()));
		tFPreco.setText(String.valueOf(p.getPreco()));
	}
}
