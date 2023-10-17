/*. Escrever uma aplicação que leia o nome (seu nome) de um vendedor, o seu salário fixo
(1.000,00), o total de vendas (20.000,00) por ele efetuadas e o porcentual que ganha sobre o
total de vendas (15%). Calcular o salário total do vendedor. Escrever nome do vendedor e o
salário total.*/

import java.util.Scanner;

public class SalarioTotal{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o Nome do vendedor");
		String nome = scanner.nextLine();

		System.out.println("Digite o valor do Salário Fixo");
		double fixo = scanner.nextDouble();

		System.out.println("Valor de vendas efetuadas");
		double vendas = scanner.nextDouble();

		System.out.println("Porcentagem de comissão");
		double comissao = scanner.nextDouble();

		double total;
		double total2;

		

		total = ((comissao/100)*vendas);

		total2 = fixo + total; 



		System.out.println(nome+" vendedor -- recebe_fixo "+fixo +" "+ nome+" vendeu " + vendas +" Salario mais comição " +total2);
		
	}

}