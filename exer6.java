package java_switch;

import java.util.Scanner;

public class exer6 {

	public static void main(String[] args) {

		String cargo;
		int num;
		float salário, nv, dif, tt;
		
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite seu cargo");
		cargo = leitor.next();
		System.out.println("Digite o código");
		num = leitor.nextInt();
		System.out.println("Digite seu salário");
		salário = leitor.nextFloat();
		
		
		switch(num){
			
			case 001:
		tt = salário * 10 /100;
		nv = salário + tt;
		dif = nv - salário;
				System.out.println("Seu cargo é " +cargo);
				System.out.println("Salário antigo é de " +salário);
				System.out.println("Novo salário será de " +nv);
				System.out.println("Com diferença de " +dif+ " reais ");
				break;
			case 002:
		tt = salário * 20 /100;
		nv = salário + tt;
		dif = nv - salário;
				System.out.println("Seu cargo é " +cargo);
				System.out.println("Salário antigo é de " +salário);
				System.out.println("Novo salário será de " +nv);
				System.out.println("Com diferença de " +dif+ " reais ");
				break;
			case 003:
		tt = salário * 30 /100;
		nv = salário + tt;
		dif = nv - salário;
				System.out.println("Seu cargo é " +cargo);
				System.out.println("Salário antigo é de " +salário);
				System.out.println("Novo salário será de " +nv);
				System.out.println("Com diferença de " +dif+ " reais ");
				break;
			case 004:
		tt = salário * 10 /100;
		nv = salário + tt;
		dif = nv - salário;
				System.out.println("Seu cargo é " +cargo);
				System.out.println("Salário antigo é de " +salário);
				System.out.println("Novo salário será de " +nv);
				System.out.println("Com diferença de " +dif+ " reais ");
				break;
			case 005:
		tt = salário * 30 /100;
		nv = salário + tt;
		dif = nv - salário;
				System.out.println("Seu cargo é " +cargo);
				System.out.println("Salário antigo é de " +salário);
				System.out.println("Novo salário será de " +nv);
				System.out.println("Com diferença de " +dif+ " reais ");
				break;
			case 006:
		tt = salário * 20 /100;
		nv = salário + tt;
		dif = nv - salário;
				System.out.println("Seu cargo é " +cargo);
				System.out.println("Salário antigo é de " +salário);
				System.out.println("Novo salário será de " +nv);
				System.out.println("Com diferença de " +dif+ " reais ");
				break;
			default:
		tt = salário * 40 /100;
		nv = salário + tt;
		dif = nv - salário;
				System.out.println("Seu cargo é " +cargo);
				System.out.println("Salário antigo é de " +salário);
				System.out.println("Novo salário será de " +nv);
				System.out.println("Com diferença de " +dif+ " reais ");

	}

}
}
