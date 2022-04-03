package com.idevs.desafio;

import java.util.Scanner;

public class StartApp {
	Scanner scanner = new Scanner(System.in);
	boolean controller = true;

	public void start() {
		System.out.println("🌐 IDevS - Emanuel Z Martins");
		System.out.println("📋 Menu");
		System.out.println(
				"  1 - Primeiro Desafio;\n  2 - Segundo Desafio;\n  3 - Terceiro Desafio;\n  S - Sair do sistema;");
		System.out.println("Escholha sua opção: ");
		String inputOption = scanner.nextLine().toUpperCase();

		DesafioUm desafio1 = new DesafioUm();
		DesafioDois desafio2 = new DesafioDois();
		DesafioTres desafio3 = new DesafioTres();

		do {
			switch (inputOption) {
			case "1":
				System.out.printf("✨ Resultado: %d\n\n", desafio1.challenge());
				exit();
				break;
			case "2":
				System.out.println("✨ Resultado:");
				System.out.println(desafio2.challenge());
				exit();
				break;
			case "3":
				System.out.printf("✨ Resultado: %d\n\n", desafio3.challenge());
				exit();
				break;
			case "S":
				exit();
				break;
			}
		} while (controller);
	}
	
	private void exit() {
		System.out.println("Aplicação finalizada ⛔");
		controller = false;
	}
}
