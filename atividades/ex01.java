package atividades;

/*Desenvolver um sistema que efetue a soma de todos os números ímpares
que são múltiplos de três e que se encontram no conjunto dos números de 1
até 500. */

public class ex01 {

	public static void main(String[] args) {
		int total = 0;

		for (int i = 0; i < 500; i = i + 3) {
			if (i % 2 == 1) {

				System.out.println(i);
				total = total + i;
			}
		}
		System.out.println("O valor total é: " + total);
	}

}
