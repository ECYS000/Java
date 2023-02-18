package atividades;

import java.util.Scanner;

public class Atividade2 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("--------------Atividade 2--------------" + '\n');
		
		System.out.println("Qual seu nota de Matematica?");
		double mat = entrada.nextDouble();
		System.out.println("Qual seu nota de Português?");
		double port = entrada.nextDouble();
		System.out.println("Qual seu nota de Historia?");
		double hist = entrada.nextDouble();
		
		double mediaNota = (mat+port+hist)/3;
		
		if (mediaNota >= 6) {
			System.out.println("Aprovado, seu nota de media é " + mediaNota);
		} else if (mediaNota >= 5 ) {
			System.out.println("Recuperação, seu nota de media é " + mediaNota);
		} else {
			System.out.println("Reaprovado, seu nota de media é " + mediaNota);
		}
		System.out.println('\n');

		System.out.println("--------------Calculadora--------------" + '\n');
		
		System.out.println("Informa um número:");
		int num1 = entrada.nextInt();
		System.out.println("Informa outro número:");
		int num2 = entrada.nextInt();
		System.out.println("Qual operação que você quer calcular?");
		String calculadora = entrada.next();
		
		if (calculadora.equals("+")) {
			System.out.println("O resultado:  " + (num1 + num2));
		} else if (calculadora.equals("-")) {
			System.out.println("O resultado: " + (num1 - num2));
		} else if (calculadora.equals("*")) {
			System.out.println("O resultado: " + (num1 * num2));
		} else if (calculadora.equals("/")) {
			System.out.println("O resultado: " + (num1 / num2));
		} else {
			System.out.println("O valor informado é inválido");
		}
		System.out.println('\n');
		
		System.out.println("-------------Dados Pessoais------------" + '\n');
		
		System.out.println("Informe seu nome:");
		String nome = entrada.next();

		System.out.println("Informe seu sobrenome:");
		String sobrenome = entrada.next();
		
		System.out.println("Informe seu idade:");
		String idade = entrada.next();
		
		System.out.println("Informe seu time de favorito:");
		String time = entrada.next();
		
		System.out.println("Seu nome é " + nome + " e seu sobrenome "+sobrenome + '\n'+ 
				"Você tem " + idade + " anos, seu time favorito é " + time);
		System.out.println('\n');
		
		System.out.println("--------------Par ou Impar-------------" + '\n');
		
		System.out.println("Informa um número para saber qual é par ou impar");
		int ParImpar = entrada.nextInt();
		
		
		if (ParImpar %2 == 0) {
			System.out.println("Então é par");
		}
			else {
				System.out.println("Então é impar");
			}
		entrada.close();	
	}

}
