package atividades;

import java.util.Scanner;

public class Atividade4 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escreva novo um e-mail automático:");
		String corpoEmailLinha1 = entrada.nextLine();
		String corpoEmailLinha2 = entrada.nextLine();
		String corpoEmailLinha3 = entrada.nextLine();
		
		System.out.println("Destina para [PF] = Pessoa Física ou [PJ] = Pessoa Jurídica ?");
		String PFouPJ = entrada.next();
		
		System.out.println("Que horas deseja enviar esse e-mail?");
		int horas = entrada.nextInt();
		
		if (PFouPJ.equals("PF")) {
			System.out.println("Qual é nome essa pessoa?");
			String nome = entrada.next();
			if (horas <= 12) {
				System.out.println(nome+", bom dia!"+'\n'+
						corpoEmailLinha1+'\n'+
							corpoEmailLinha2+'\n'+
								corpoEmailLinha3+'\n'+
									"Att");
			} else if (horas <= 18) {
					System.out.println(nome+", boa tarde!"+'\n'+
							corpoEmailLinha1+'\n'+
								corpoEmailLinha2+'\n'+
									corpoEmailLinha3+'\n'+
										"Att");
				} else {
					System.out.println(nome+", boa noite!"+'\n'+
							corpoEmailLinha1+'\n'+
								corpoEmailLinha2+'\n'+
									corpoEmailLinha3+'\n'+
										"Att");
				}
			
		} else if (PFouPJ.equals("PJ")){
			System.out.println("Qual é nome essa empresa?");
			String empresa = entrada.next();
			if (horas <= 12) {
				System.out.println(empresa+", bom dia!"+'\n'+
						corpoEmailLinha1+'\n'+
							corpoEmailLinha2+'\n'+
								corpoEmailLinha3+'\n'+
									"Att");
			} else if (horas <= 18) {
					System.out.println(empresa+", boa tarde!"+'\n'+
							corpoEmailLinha1+'\n'+
								corpoEmailLinha2+'\n'+
									corpoEmailLinha3+'\n'+
										"Att");
				} else {
					System.out.println(empresa+", boa noite!"+'\n'+
							corpoEmailLinha1+'\n'+
								corpoEmailLinha2+'\n'+
									corpoEmailLinha3+'\n'+
										"Att");
				} 
		}	else {
			System.out.println("Invalido, por favor informar novamente");
		}
		entrada.close();
	}
}


