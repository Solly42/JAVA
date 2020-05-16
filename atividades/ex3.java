package atividades;

/*Faça um programa que mostre uma contagem na tela de 233 a 456, só que contando de
3 em 3 quando estiver entre 300 e 400 e de 5 em 5 quando não estiver.*/

public class ex3 {

	public static void main(String[] args) {
		for (int i = 233; i < 457; i += 5) {
			if (i > 299 && i < 401) {
				i -= 2;
			}
			System.out.println(i);
		}

	}

}
