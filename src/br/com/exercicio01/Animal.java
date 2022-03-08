package br.com.exercicio01;

public class Animal {
	
	private String nome;
	private int idadeAno;
	
	
	void emitirSom(String nome) {
		System.out.println("O "+nome+" esta emitindo som");
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getIdadeAno() {
		return idadeAno;
	}


	public void setIdadeAno(int idadeAno) {
		this.idadeAno = idadeAno;
	}
	
	
	
}
