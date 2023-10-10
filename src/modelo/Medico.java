package modelo;

import java.util.ArrayList;

public class Medico {
	
	 String crm;
	 String nome;
	 String especialidade;
	 ArrayList<Atendimento> lista = new ArrayList<Atendimento>();

	public Medico(String nome, String especialidade, String crm) {
		this.nome = nome;
		this.especialidade = especialidade;
		this.crm = crm;
	}

	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome=nome;
	}
	
	public void adicionar(Atendimento a){
		lista.add(a);
	}
	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public void remover(Atendimento a) throws Exception {
		this.lista.remove(a);
}
	
	public ArrayList<Atendimento> getAtendimentos(){
		return this.lista;
	}
	@Override
	public String toString() {
		return "[nome=" + nome + ", crm=" + crm + ", especialidade= " + especialidade + ", lista=" + lista.toString() + "]";
	}
	
	public String ToStringPattern() {
		return String.format("Médico[ Nome=%s ]", this.nome);
	}
}
