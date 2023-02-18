package atividades;

public class Atividade1 {
	
	public static void main(String[]args) {
		
		double nota1 = 5.0;
		double nota2 = 7.0;
		double nota3 = 5.5;
		double nota4 = 6.0;
		
		double media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		if (media > 6) {
			System.out.println("Aprovado, seu nota de media é " + media);
		} else if (media > 5 ) {
			System.out.println("Recuperação, seu nota de media é " + media);
		} else {
			System.out.println("Reaprovado, seu nota de media é " + media);
		}
		
	}
	

}
