package java_switch;

import java.util.Scanner;

public class exer6 {

	public static void main(String[] args) {

		String cargo;
		int num;
		float sal�rio, nv, dif, tt;
		
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite seu cargo");
		cargo = leitor.next();
		System.out.println("Digite o c�digo");
		num = leitor.nextInt();
		System.out.println("Digite seu sal�rio");
		sal�rio = leitor.nextFloat();
		
		
		switch(num){
			
			case 001:
		tt = sal�rio * 10 /100;
		nv = sal�rio + tt;
		dif = nv - sal�rio;
				System.out.println("Seu cargo � " +cargo);
				System.out.println("Sal�rio antigo � de " +sal�rio);
				System.out.println("Novo sal�rio ser� de " +nv);
				System.out.println("Com diferen�a de " +dif+ " reais ");
				break;
			case 002:
		tt = sal�rio * 20 /100;
		nv = sal�rio + tt;
		dif = nv - sal�rio;
				System.out.println("Seu cargo � " +cargo);
				System.out.println("Sal�rio antigo � de " +sal�rio);
				System.out.println("Novo sal�rio ser� de " +nv);
				System.out.println("Com diferen�a de " +dif+ " reais ");
				break;
			case 003:
		tt = sal�rio * 30 /100;
		nv = sal�rio + tt;
		dif = nv - sal�rio;
				System.out.println("Seu cargo � " +cargo);
				System.out.println("Sal�rio antigo � de " +sal�rio);
				System.out.println("Novo sal�rio ser� de " +nv);
				System.out.println("Com diferen�a de " +dif+ " reais ");
				break;
			case 004:
		tt = sal�rio * 10 /100;
		nv = sal�rio + tt;
		dif = nv - sal�rio;
				System.out.println("Seu cargo � " +cargo);
				System.out.println("Sal�rio antigo � de " +sal�rio);
				System.out.println("Novo sal�rio ser� de " +nv);
				System.out.println("Com diferen�a de " +dif+ " reais ");
				break;
			case 005:
		tt = sal�rio * 30 /100;
		nv = sal�rio + tt;
		dif = nv - sal�rio;
				System.out.println("Seu cargo � " +cargo);
				System.out.println("Sal�rio antigo � de " +sal�rio);
				System.out.println("Novo sal�rio ser� de " +nv);
				System.out.println("Com diferen�a de " +dif+ " reais ");
				break;
			case 006:
		tt = sal�rio * 20 /100;
		nv = sal�rio + tt;
		dif = nv - sal�rio;
				System.out.println("Seu cargo � " +cargo);
				System.out.println("Sal�rio antigo � de " +sal�rio);
				System.out.println("Novo sal�rio ser� de " +nv);
				System.out.println("Com diferen�a de " +dif+ " reais ");
				break;
			default:
		tt = sal�rio * 40 /100;
		nv = sal�rio + tt;
		dif = nv - sal�rio;
				System.out.println("Seu cargo � " +cargo);
				System.out.println("Sal�rio antigo � de " +sal�rio);
				System.out.println("Novo sal�rio ser� de " +nv);
				System.out.println("Com diferen�a de " +dif+ " reais ");

	}

}
}
