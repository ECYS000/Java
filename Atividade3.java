package atividades;

import java.util.Scanner;

public class Atividade3 {
	
	public static void main(String[] args) {
		
		Scanner data = new Scanner(System.in);
		
		double jurosAte10 = 1.10;
		double jurosMais10 = 1.60;
		
		System.out.print("---------Atvidade 3---------" + '\n');
		
		System.out.println("Preço de conta?");
		double custos = data.nextDouble();
		
		System.out.println("dia de vencer na conta?");
		int dataVen = data.nextInt();
		
		System.out.println("dia atual?");
		int dataAtual = data.nextInt();
	
			if (dataAtual <= dataVen) {
				System.out.println("Pagamento de conta: "+custos+" reais, sem multa de atrasos");
			} else if (dataAtual - dataVen <= 10) {
				int diaTotal = dataAtual - dataVen ;
				double novoPreco = diaTotal*jurosAte10 + custos;
				System.out.println("Pagamento de conta: "+novoPreco+" reais, com multa de atrasos "+diaTotal+" em dias");
			} else {
				int diaTotal = dataAtual - dataVen ;
				double novoPreco = diaTotal*jurosMais10 + custos;
				System.out.println("Pagamento de conta: "+novoPreco+" reais, com multa de atrasos "+diaTotal+" em dias");
			}
			
			
	}

}
