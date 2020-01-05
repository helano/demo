package com.docker.demo;

public class Aula  implements Comparable<Aula>{
	private String titulo;
	private int tempo;
	
	
	public Aula(String titulo, int tempo) {
		super();
		this.titulo = titulo;
		this.tempo = tempo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getTempo() {
		return tempo;
	}
	public void setTempo(int tempo) {
		this.tempo = tempo;
	}

	/*
	 * @Override public String toString() { return "Aula [titulo=" + titulo + "]"; }
	 */	@Override
	public int compareTo(Aula arg0) {
		return this.titulo.compareTo(arg0.getTitulo());
		
	}
	
	
}
