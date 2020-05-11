package java_switch;

import java.util.Scanner;

public class exer2 {

	public static void main(String[] args) {
		
			int cod, qt;
			double valor_total = 0;
		
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o código");
		cod = leitor.nextInt();
		
		System.out.println("Digite a quantidade");
		qt = leitor.nextInt();
		
		
		switch(cod){
			
			case 100:
				System.out.println("Cachorro quente");
				valor_total = qt * 3.2;
				break;
			case 101:
				System.out.println("Bauru Simples");
				valor_total = qt * 4.3;
				break;
			case 102:
				System.out.println("Bauru com ovo");
				valor_total = qt * 5.5;
				break;
			case 103:
				System.out.println("Hambúrguer");
				valor_total = qt * 3.2;
				break;
			case 104:
				System.out.println("Cheeseburguer");
				valor_total = qt * 4.3;
				break;
			case 105:
				System.out.println("Refrigerante");
				valor_total = qt * 4;
				break;

	}

		
		System.out.print("Valor total = " +valor_total);
		
		
		
		
		
		
		
}
}
