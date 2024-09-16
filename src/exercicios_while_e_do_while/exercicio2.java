package exercicios_while_e_do_while;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		/*Enunciado: Determinar o maximo divisor comum entre dois numeros inteiros positivos*/
		Scanner scan = new Scanner (System.in);
		int n1 = 0;
		int n2 = 0;
		int quociente = 0;
		int resto;
		System.out.println("informe o primeiro numero");
		n1 = scan.nextInt();
		System.out.println("informe o segundo numero");
		n2 = scan.nextInt();
		do {
			quociente = n1 / n2;
			resto = n1 % n2;

			System.out.println("dividendo = "+ n1);
			System.out.println("divisor = "+ n2);
			System.out.println("quociente = "+quociente);
			System.out.println("resto = "+ resto);
		} while (resto > 0);
		
		scan.close();
	}
}
