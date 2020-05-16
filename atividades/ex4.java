package atividades;

/*Ler o nome de um aluno e as suas duas notas A e B, e após calcular a média
ponderada entre estas notas (A tem peso 1 e B tem peso 2). Verifique se a
nota digitada é valida, caso seja inválida, repita a leitura. Repetir este
procedimento para uma turma composta por cinco alunos, usando o comando
While.*/

import java.util.Scanner;

public class ex4 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int aluno = 1;
		double nota1 = 0;
		double nota2 = 0;
		String nome = "";

		while (aluno <= 5) {
			System.out.println("--------------------------");
			System.out.println("Insira seu nome:");
			nome = in.next();
			System.out.println(nome);

			System.out.println(nome + ", insira a sua primeira nota:");
			nota1 = in.nextDouble();

			if (nota1 >= 0 && nota1 <= 10) {
				System.out.println(nome + ", insira a sua segunda nota:");
				nota2 = in.nextDouble();
				System.out.println(nota2);
				if (nota2 >= 0 && nota2 <= 10) {
					double media = (nota1 + nota2 * 2) / 3;
					System.out.println(media);
					System.out.println(aluno);
					aluno++;
					System.out.println("Fim");
				} else {
					System.out.println(nome + " insira uma nota válida!");
				}
			}else {
				System.out.println(nome + ", insira uma nota valida!");
			}
		}

	}
}
