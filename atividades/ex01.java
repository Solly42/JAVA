package atividades;

/*Desenvolver um sistema que efetue a soma de todos os n�meros �mpares
que s�o m�ltiplos de tr�s e que se encontram no conjunto dos n�meros de 1
at� 500. */

public class ex01 {

	public static void main(String[] args) {
		int total = 0;

		for (int i = 0; i < 500; i = i + 3) {
			if (i % 2 == 1) {

				System.out.println(i);
				total = total + i;
			}
		}
		System.out.println("O valor total �: " + total);
	}

}
