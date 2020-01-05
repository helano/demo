package com.docker.demo;

import java.util.LinkedList;
import java.util.List;

public class Teste {

	
	public static void main(String[] args) {
		
		
		Curso curso = new Curso("Curso de Docker", "Felipe");
		
		List<Aula> aulas = new LinkedList<Aula>();
		 aulas = curso.getAulas();
		
		curso.getAulas().add(new Aula("Como executar um container", 5));
		curso.getAulas().add(new Aula("Como executar um container", 10));
		curso.getAulas().add(new Aula("Como executar um container", 20));
		
		System.out.println(curso.getAulas());
		
		curso.getAulas().get(0).setTitulo("Mudando titulo");
		System.out.println(aulas);		
		aulas = null;
		System.out.println(aulas);
		System.out.println(curso.getAulas().get(0));
		
		
		int tempoTotal = curso.getAulas().stream().mapToInt(Aula::getTempo).sum();
		
		System.out.println(tempoTotal);
		

	}
}
