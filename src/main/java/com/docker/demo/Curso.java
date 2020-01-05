package com.docker.demo;

import java.util.LinkedList;
import java.util.List;

public class Curso {
	
	private String titulo ;
	private String instrutuor;
	private List<Aula> aulas = new LinkedList<>();
	
	
	
	public Curso(String titulo, String instrutuor) {
		super();
		this.titulo = titulo;
		this.instrutuor = instrutuor;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getInstrutuor() {
		return instrutuor;
	}
	public void setInstrutuor(String instrutuor) {
		this.instrutuor = instrutuor;
	}
	public List<Aula> getAulas() {
		return aulas;
	}
	public void setAulas(List<Aula> aulas) {
		this.aulas = aulas;
	}
	
	

}
