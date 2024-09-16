package exercicios_estrutura_repetição;

import java.util.Random;
import java.util.Scanner;

public class ex1 {

	static Scanner scan = new Scanner (System.in);
	public static void main(String[] args) {
		//exercicio1();
		//exercicio2();
		//exercicio3();
		//exercicio4();
		//exercicio5();
		//exercicio6();
		//exercicio7();
		exercicio8();
		}
	
     public static void exercicio1 () {
		for (int i =51; i>=0; i-= 2) {
			System.out.println(i);
			
		}
	}
     
     public static void exercicio2() {
    	  
    	 for (int i = 1; i<10; i +=2) {
    		 System.out.println(i);
    	 }
     }
     
     public static void exercicio3() {
    	 double valor = 0;
    	 for (double i = 1; i<6; i++) {
    		 valor= Math.sqrt(i);
    	 }
    	 System.out.printf("%.10f%n",valor);
     }
     
     public static void exercicio4 () {
    	 double valor = 0;
    	 System.out.println("raiz quadrade de 2 a 10");
    	 for (int i = 2; i <=10; i++) {
    		 valor = Math.sqrt(i);
    		 System.out.printf("%d. %.5f%n",i,valor);
    	 }
     }
     
     public static void exercicio5() {
    	 int soma = 1;
    	 for (int i = 1; i<=50; i++) {
    		 soma = (i * i) / 2;
    		 System.out.println(soma);
    	 }
     }
     
     public static void exercicio6 (){
    	 /* partindo de um unico casal de coelhos filhotes e supondo que um casal de coelhos tornam-se fertil
    	  *  após dois meses de vida e, a partir de entao, produz um novo casal a cada mes e que os coelhos nunca morrem,
    	  *   a quantidade de casal de coelhos após n meses é dado pelo n-ésimo termo da sequencia.*/
    	 
    	 System.out.println("infome a quantidade de meses");
    	 int meses = scan.nextInt();
    	 if (meses == 0) {
    		 System.out.println("2 coelhos (casal inicial)");
    	 }
    	 else if (meses == 1) {
    		 System.out.println("o casal ainda nao se reproduziu");
    	 }
    	 else {
    		 int fib1 = 1;
    		 int fib2 = 1;
    		 int fibN = 0;
    		 
    		 for (int i = 2; i<= meses; i++) {
    			 fibN = fib1 + fib2;
    			 fib1 = fib2;
    			 fib2 = fibN;
    			 System.out.println("quantidade de coelhos no final de "+ meses+" meses: "+fibN);
    		 }
    	 }
     }
     public static void exercicio7() {
    	 System.out.println("informe um valor");
    	 int valor = 0;
    	 valor = scan.nextInt();
    	 for (int i = 0; i <= valor; i++) {
    		 valor = valor - 1;
    		 System.out.println(valor + 1);
    	 }
     }
     
     public static void exercicio8 () {
    	 
    	 for (int i = 1; i<=40; i++) {
    		 System.out.println("");
    		 System.out.println("time "+i);
    		 for (int j = 1; j <=23; j++) {
    		 Random rand = new Random();
    		 int pesoMin = 50;
    		 int pesoMax = 80;
    		 
    		 int idadeMin = 18;
    		 int idadeMax = 30;
    		 
    		int peso =  rand.nextInt((pesoMax - pesoMin) + 1) + pesoMin;
    		int idade =  rand.nextInt((idadeMax - idadeMin) + 1) + idadeMin;
    		System.out.println("jogador "+j +" peso: "+peso + "KG / idade: "+idade);
    	 }
    	 }
     }
     }
