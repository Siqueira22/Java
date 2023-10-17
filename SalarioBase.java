/*Faça uma aplicação que receba o salário-base (1.000,00) de um funcionário, calcule e
mostre o seu salário a receber, sabendo-se que esse funcionário tem gratificação de R$ 50,00 e
paga imposto de 10% sobre o salário-base.*/

import java.util.Scanner;

public class SalarioBase{ 
	public static void main (String[] args){

		Scanner salariobase = new Scanner (System.in);
		double grati = 50;
		double imposto = 10.0;
		double desc;
		double total;
		System.out.println("Informe Salário");
		double salario = salariobase.nextDouble();

      

		desc=((imposto/100) * salario);
		total=salario-desc+grati;

		System.out.print("Salário "+ salario+ "- Imposto " +desc+" Total com gratificação "+ total);

	}

}