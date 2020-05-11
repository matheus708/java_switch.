package java_switch;

import java.util.Scanner;

public class exer5 {

	public static void main(String[] args) {
		int cod;
		float valor;
		double Valor_Total, Valor3x, total;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o código do produto");
		cod = leitor.nextInt();
		
		System.out.println("Digite o valor do produto");
		valor = leitor.nextFloat();
		
		
		switch(cod){
			
			case 1:
			total = valor * 10 /100;
			Valor_Total = valor - total;
					System.out.println("Valor Total = " +Valor_Total+ " À vista em dinheiro ou cheque, com 10% de desconto ");
				break;
			case 2:
				total = valor * 5 /100;
				Valor_Total = valor - total;
						System.out.println("Valor Total = " +Valor_Total+ " À vista com cartão de crédito, com 5% de desconto ");
					break;
			case 3:
				Valor_Total = valor / 2;
						System.out.println("Valor Total = " +Valor_Total+ " Em 2 vezes, preço normal de etiqueta sem juros ");
					break;
			case 4:
				total = valor * 10 /100;
				Valor_Total = valor + total;
				Valor3x = Valor_Total / 3;
						System.out.println("Valor Total = " +Valor3x+ " Em 3 vezes, preço de etiqueta com acréscimo de 10% ");
					break;
				

	}

}
}
