package br.com.cod3r.cm.modelo;

public class ResultadoDoEvento {

	private boolean ganhou;

	public ResultadoDoEvento(boolean ganhou) {
		this.ganhou = ganhou;
	}

	public boolean isGanhou() {
		return ganhou;
	}

	public void setGanhou(boolean ganhou) {
		this.ganhou = ganhou;
	}
	
	
}
