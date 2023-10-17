import java.util.Scanner;

public class Calculadorateste {

	public static void main(String[] args) {

		Scanner menu = new Scanner (System.in);

		while (true) {            

			System.out.print("##--Teste da Calculadora--##\n\n");
			System.out.print("|-----------------------------|\n");
			System.out.print("| Opção 1 - Soma              |\n");
			System.out.print("| Opção 2 - Divisão           |\n");
			System.out.print("| Opção 3 - Subtração         |\n");
			System.out.print("| Opção 4 - Multiplicação     |\n");
			System.out.print("| Opção 5 - Porcentagem       |\n");
			System.out.print("| Opção 6 - sair              |\n");
			System.out.print("|-----------------------------|\n");
			System.out.print("Digite uma opção: ");

			int opcao = menu.nextInt();

			if (opcao == 6) {
				System.out.print("\nAté logo!");
				menu.close(); 
			}

			switch (opcao) {
			case 1:
				Scanner Soma = new Scanner(System.in);


				System.out.println("Digite um numero ");
                //double é o tipo de dado
				double Num1 = Soma.nextDouble();

				System.out.println("Digite outro numero ");
				double Num2 = Soma.nextDouble();

				System.out.println("Resultado da Soma " + (Num1+Num2));

				break;

			case 2:
				Scanner Divisao = new Scanner(System.in);

				double div;
				double quo;

				System.out.println("Digite o dividendo ");
				div = Divisao.nextDouble();

				System.out.println("Digite o quociente ");
				quo = Divisao.nextDouble();

				System.out.println("Resultado da Divisão " + (div / quo));

				break;

			case 3:
				Scanner Subtracao = new Scanner(System.in);


				System.out.println("Digite um numero ");
				double Num3 = Subtracao.nextDouble();

				System.out.println("Digite outro numero ");
				double Num4 = Subtracao.nextDouble();

				System.out.print((Num3 - Num4));

				System.out.println("Resultado da Subtração " + (Num3 - Num4));
				break;


			case 4:
				Scanner Multiplicação = new Scanner(System.in);


				System.out.println("Digite um Numero");
				double Num5 = Multiplicação.nextDouble();

				System.out.println("Agora outro numero");
				double Num6 = Multiplicação.nextDouble();

				System.out.println("Resultado da Multiplicação " + (Num5 * Num6));
				break;

			case 5:
				Scanner Porcentagem = new Scanner(System.in);


				System.out.println("Digite a Porcentagem");
				double Num7 = Porcentagem.nextDouble();

				System.out.println("Agora o numero");
				double Num8 = Porcentagem.nextDouble();

				System.out.println("Resultado da Porcentagem " + ((Num7/100)*Num8));
				break;

			default:
				System.out.print("\nOpção Inválida!");
				break;
			}
		}
	}


}