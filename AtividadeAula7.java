package atividades;

import java.util.Scanner;

public class AtividadeAula7 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("---------------Atividade 1---------------");
		
		int totalNumero = 0;
		
		while (totalNumero <= 100){
			
			System.out.println("Digite um número:");
			int digiteNumero = entrada.nextInt();
			
			totalNumero += digiteNumero;
			
		}
		
		System.out.println("Soma numeros que foi digitado: "+totalNumero);
		
		System.out.println("---------------Atividade 2---------------");
		
		int totalNumero2 = 0;
		int outroNumero;
		
		do {
			System.out.println("Digite um número:");
			int digiteNumero = entrada.nextInt();
			
			totalNumero2 += digiteNumero;
			
			System.out.println("Quer digite mais um numero? \n 1- Sim 2- Não");
			outroNumero = entrada.nextInt();
		} while (outroNumero != 2);
		
		System.out.println("Soma numeros que foi digitado: "+totalNumero2);
		System.out.println("---------------Atividade 3---------------");
		
		int totalNumero3 = 0;
		
		for (int retry = 1; retry <= 4; retry++) {
			System.out.println(retry+"º - Digite um número do par:");
			int digiteNumero = entrada.nextInt();
			
			if (digiteNumero %2 == 0) { 
				totalNumero3 += digiteNumero;
			} else {
				retry--;
				System.out.println("Você digitou um numero de impar, por favor digite somente numero de par");
			}
		}
		System.out.println("Soma numeros que foi digitado: "+totalNumero3);
			
	}

}
