package java_switch;

import java.util.Scanner;

public class exer3 {

	public static void main(String[] args) {
		

		int cod;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("  Op��o |                   Mensagem                ");
		System.out.println("    1   |  Executa a rotina de Inclus�o de Alunos   ");
		System.out.println("    2   |  Executa a rotina de Altera��o de Alunos  ");
		System.out.println("    3   |  Executa a rotina de Exclus�o de Alunos   ");
		System.out.println("    4   |  Executa a rotina de Consulta de Alunos   ");
		System.out.println("Escolha seu c�digo ");
		cod = leitor.nextInt();
		
		
		switch(cod) {
			case 1:
				System.out.println("Executa a rotina de Inclus�o de Alunos");
				break;
			case 2:
				System.out.println("Executa a rotina de Altera��o de Alunos");
				break;
			case 3:
				System.out.println("Executa a rotina de Exclus�o de Alunos");
				break;
			case 4:
				System.out.println("Executa a rotina de Consulta de Alunos");
				break;
		}

	}

}
