package model.entities;


public class Pensao {
	
	
	private int NumeroQuarto;
	private Estudante estudante;
	
	public Pensao(int numeroQuarto, Estudante estudante) {
		
		this.NumeroQuarto = numeroQuarto;
		this.estudante = estudante;
	}

	public int getNumeroQuarto() {
		return NumeroQuarto;
	}

	public void setNumeroQuarto(int numeroQuarto) {
		NumeroQuarto = numeroQuarto;
	}

	public Estudante getEstudante() {
		return estudante;
	}

	public void setEstudante(Estudante estudante) {
		this.estudante = estudante;
	}

	@Override
	public String toString() {
		return "Pensao [Quarto: " + NumeroQuarto + ", estudante=" + estudante + "]";
	}
	
	
	
}
