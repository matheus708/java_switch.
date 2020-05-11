package java_switch;

import java.util.Scanner;

public class exer1 {

	public static void main(String[] args) {
		
		int num;
		
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o código");
		num = leitor.nextInt();
		
		
		switch(num){
			
			case 001:
				System.out.println("Parafuso");
				break;
			case 002:
				System.out.println("Porca");
				break;
			case 003:
				System.out.println("Prego");
				break;
			case 004:
				System.out.println("Ferramenta");
				break;
				
				default:
					System.out.println("Diversos");
		}
		
		
		
		
	}

}
