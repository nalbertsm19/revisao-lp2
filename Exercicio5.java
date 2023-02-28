package exercicios;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) 
	{
		

	}
	
	public static void Letras() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite uma palavra:");
		String palavra = sc.next();

		System.out.println("Digite um numero inteiro para linha:");
		int linha = sc.nextInt();

		System.out.println("Digite um numero inteiro para coluna:");
		int coluna= sc.nextInt();

		for (int i = 0; i < linha; i++) 
		{
		System.out.println("\n");

		}
		for (int j = 0; j < coluna; j++) 
		{
		System.out.printf(palavra);
       }
	}
	}
	
	

