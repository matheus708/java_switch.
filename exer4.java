package java_switch;

import java.util.Scanner;

public class exer4{

		public static void main(String[] args) {


		int cod;
		float nt1, nt2, nt3;
		float soma1, soma2;
		float média_aritmética, ponderada;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota");
		nt1 = leitor.nextFloat();
		
		System.out.println("Digite a segunda nota");
		nt2 = leitor.nextFloat();
		
		System.out.println("Digite a terceira nota");
		nt3 = leitor.nextFloat();
		
		System.out.println("Digite 1 (média aritmética) ou 2 (ponderada)");
		cod = leitor.nextInt();
		
		
		switch(cod){
			
			case 1:
				soma1 = nt1 + nt2 + nt3;
				média_aritmética = soma1 / 3;
				
					System.out.println("Valor Total = " +média_aritmética);
				break;
			case 2:
				soma2 = nt1 * 3 + nt2 * 3 + nt3 *4;
				ponderada = soma2 / 10;
				
					System.out.println("Valor Total = " +ponderada);
				break;
			
			
			
			

       }
}
}