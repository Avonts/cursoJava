package model.entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import model.enums.NivelCargo;

public class Funcionario {

	private String nome;
	private NivelCargo nivelCargo;
	private double salario;

	private Departamento departamento;
	private List<Contrato> contratos = new ArrayList<>();

	public Funcionario() {

	}

	public Funcionario(String nome, NivelCargo nivelCargo, double salario, Departamento departamento) {

		this.nome = nome;
		this.nivelCargo = nivelCargo;
		this.salario = salario;
		this.departamento = departamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public NivelCargo getNivelCargo() {
		return nivelCargo;
	}

	public void setNivelCargo(NivelCargo nivelCargo) {
		this.nivelCargo = nivelCargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<Contrato> getContratos() {
		return contratos;
	}

	// Métodos
	public void adicionarContrato(Contrato contrato) {
		contratos.add(contrato);
	}

	public void removerContrato(Contrato contrato) {
		contratos.remove(contrato);
	}

	public double renda(int ano, int mes) {

		double sum = salario;

		Calendar cal = Calendar.getInstance();

		for (Contrato c : contratos) {

			cal.setTime(c.getDate());
			int c_ano = cal.get(Calendar.YEAR);
			int c_mes = 1 + cal.get(Calendar.MONTH);

			if (ano == c_ano && mes == c_mes) {
				sum += c.totalContrato();
			}
		}

		return sum;

	}

}
