package com.vitorcamara.projetos;

import java.util.Scanner;

public class NotasMedia {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Quantas notas vc deseja inserir?");
		int notas = scan.nextInt();

		double soma = 0;
		double media;
		double nota;

		for (int i = 0; i < notas; i++) {
			System.out.println("Entre com a nota " + (i + 1) + ":");
			nota = scan.nextDouble();

			soma += nota;

		}

		media = soma / notas;

		System.out.println("Soma: " + soma);
		System.out.println("Média: " + media);

	}

}
