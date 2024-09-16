package exercicios_while_e_do_while;

import java.util.Scanner;

public class exercicio1 {
	/*enunciado: Suponha que no ano N a população americana seja maior que a brasileira.
	 * Sabendo-se que os Estados Unidos possuem um crescimento anual de 2% na sua população
	 *  e que o Brasil tem crescimento anual de 4%, determine o ano em que as duas populações
	 *  serão iguais (em quantidade)*/
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("em que ano deseja começar?");
		int ano = scan.nextInt();
		double poBR = 0;
		double poUSA = 0;
		double taxaCrescUSA = 0.02;
		double taxaCrescBR = 0.04;
		
		System.out.println("populacao brasileira: ");
		poBR = scan.nextInt();
		System.out.println("população americana: ");
		poUSA = scan.nextInt();
		
		if (poBR <= poUSA) {
		do {
		poUSA += poUSA * taxaCrescUSA;
		poBR += poBR * taxaCrescBR;
		System.out.println(ano);
		System.out.println("populacao BR: "+poBR);
		System.out.println("populacao USA: " + poUSA);
		ano++;
		} while (poBR <= poUSA);
		System.out.println("foi ate o ano de "+ ano);
		}
		else {
			System.out.println("a população brasileira deve ser menor do que a americana");
		}
	}
}
