package exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) 
	{
		

	}

	public static void  Frase()
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("Informe a frase desejada:");
	String frase= sc.nextLine();
	System.out.println("Informe um número inteiro:");
	int numero=sc.nextInt();
	
	for(int i=0; i<numero; i++)
	{
		System.out.println(frase);
		
	}
}
}
