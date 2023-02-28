package exercicios;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) 
	{
       Scanner sc=new Scanner(System.in);
		
		System.out.println("______MENU______");
		System.out.println("Selecione um exercicio:");
		System.out.println("[01]- Diga Olá!");
		System.out.println("[02]- Repetindo a frase");
		System.out.println("[03]- Repetindo a frase v2");
		System.out.println("[04]- Geometria");
		System.out.println("[05]- Bidimensional");
		int opcao= sc.nextInt();
		
		if(opcao==1)
		{
			Exercicio1 exc1= new Exercicio1();
			exc1.Nome();
		}
		if(opcao==2)
		{
			Exercicio2 exc2= new Exercicio2();
			exc2.Frase();
		}
		if(opcao==3)
		{
			Exercicio3 exc3= new Exercicio3();
			exc3.Frase2();
		}
		if(opcao==4)
		{
			Exercicio4 exc4= new Exercicio4();
			exc4.Calculo();
		}
		if(opcao==5)
		{
			Exercicio5 exc5= new Exercicio5();
			exc5.Letras();
		}
		

	}

}
