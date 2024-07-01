package entities;

import java.util.Objects;

public class Conta {
		private int numero;
		private String cpf;
		private double saldo;
		private double limite;
		public Conta() {
			numero = 0;
			cpf = null;
			saldo = 0.0;
			limite = 0.0;
		}
		public Conta(int numero, String cpf, double saldo, double limite) {
			super();
			this.numero = numero;
			this.cpf = cpf;
			this.saldo = saldo;
			this.limite = limite;
		}
		public int getNumero() {
			return numero;
		}
		public void setNumero(int numero) {
			this.numero = numero;
		}
		public String getCpf() {
			return cpf;
		}
		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
		public double getSaldo() {
			return saldo;
		}
		public double getLimite() {
			return limite;
		}
		public void setLimite(double limite) {
			this.limite = limite;
		}
		@Override
		public int hashCode() {
			return Objects.hash(numero);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Conta other = (Conta) obj;
			return numero == other.numero;
		}
		@Override
		public String toString() {
			return "Conta [numero=" + numero + ", cpf=" + cpf + ", saldo=" + saldo + ", limite=" + limite + "]";
		}
		public boolean saque(double valor) {
			if ((saldo+limite)>= valor) {
				saldo -= valor;
				return true;
			}
			return false;
	}
	public void deposito(double valor) {
		saldo += valor;
	}
}
