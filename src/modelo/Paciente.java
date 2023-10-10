package modelo;

import java.util.ArrayList;

public class Paciente {

	 String cpf;
	 String nome;
	 ArrayList<Atendimento> lista= new ArrayList<>();

	public Paciente(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	public String getCPF() {
		return cpf;
	}
	
	public void setCPF(String cpf) {
		this.cpf=cpf;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String Nome) {
		this.nome=Nome;
	}
	
	public void adicionar(Atendimento a){
		this.lista.add(a);
	}
	
	public void remover(Atendimento atendimento) throws Exception {
		lista.remove(atendimento);
}
	public ArrayList<Atendimento> getAtendimentos(){
			return this.lista;
		}
	
	public void SetAtendimentos(ArrayList<Atendimento> lista ) {
			this.lista= lista;
		}

	@Override
	public String toString() {
		return "[CPF=" + cpf + ", Nome=" + nome + ", lista=" + lista.toString() + "]";
	}
	
	public String ToStringPattern(){
		return String.format("Paciente[ Nome=%s ]", this.nome);
	}	
}