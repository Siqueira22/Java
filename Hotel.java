/*Um hotel com 75 apartamentos deseja fazer uma promoção especial de final de semana,
concedendo um desconto de 25% na diária. Com isto, espera aumentar sua taxa de ocupa o de
50 para 80%. Sendo dado o valor normal da diária, calcular e imprimir:
a) o valor da diária promocional;
b) o valor total arrecadado com 80% de ocupação dos apartamentos o e diária promocional;
c) o valor total arrecadado com 50% de ocupação dos apartamentos o e diária normal;
d) a diferença entre estes dois valores. */ /*60 quarto*/

import java.util.Scanner;

public class Hotel{  
	public static void main (String[] args){
		Scanner scanner = new Scanner (System.in);

		int total = 75; /*Apartamentos Livres*/
		double desc = 25.0; /*Final de Semana*/ 
		System.out.println("Valor da Diaria");
		double diaria = scanner.nextDouble();
		double descTotal = ((desc/100)*diaria);
		double valorTotal = diaria - descTotal ;
		int aps = 60;
		double arre = aps * valorTotal;
		double arre2 = diaria * 37 ; 
		double arre3 = arre - arre2;
		System.out.println("Valor diaria = "+diaria+ " Valor do desconto  " + descTotal + " Valor final " + valorTotal);

		System.out.println("Se for ocupado os 80% dos apartamentos a arrecadação será de "+ arre);

		System.out.println("Se for ocupado os 50% dos apartamentos a arrecadação será de "+ arre2);
		System.out.println("A Diferença Valor arrecadado é "+arre3);

	}
	

	
}