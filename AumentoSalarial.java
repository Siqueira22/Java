import java.util.Scanner;
/*1. Faça uma aplicação que receba o nome (seu nome) e o salário (1.000,00) de um funcionário,
calcule e mostre o novo salário, sabendo-se que este sofreu um aumento de 25%.*/


public class AumentoSalarial {

	public static void main(String[] args){

		Scanner aumento = new Scanner (System.in);


		System.out.println("Nome Funcionário");
		String nome = aumento.nextLine();

		System.out.println("Salário do Funcionário");
		double salario = aumento.nextDouble();

		salario = (((25.0/100)*salario) + salario);

		System.out.print("Salário novo do " + nome + " vai ser " + salario);


	}


}