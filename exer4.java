package java_switch;

import java.util.Scanner;

public class exer4{

		public static void main(String[] args) {


		int cod;
		float nt1, nt2, nt3;
		float soma1, soma2;
		float m�dia_aritm�tica, ponderada;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota");
		nt1 = leitor.nextFloat();
		
		System.out.println("Digite a segunda nota");
		nt2 = leitor.nextFloat();
		
		System.out.println("Digite a terceira nota");
		nt3 = leitor.nextFloat();
		
		System.out.println("Digite 1 (m�dia aritm�tica) ou 2 (ponderada)");
		cod = leitor.nextInt();
		
		
		switch(cod){
			
			case 1:
				soma1 = nt1 + nt2 + nt3;
				m�dia_aritm�tica = soma1 / 3;
				
					System.out.println("Valor Total = " +m�dia_aritm�tica);
				break;
			case 2:
				soma2 = nt1 * 3 + nt2 * 3 + nt3 *4;
				ponderada = soma2 / 10;
				
					System.out.println("Valor Total = " +ponderada);
				break;
			
			
			
			

       }
}
}