package exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
	     

}
  public static void Frase2()
  {
	  Scanner sc= new Scanner(System.in);
		
      System.out.println("Informe um número inteiro:");
      int numero=sc.nextInt();

		System.out.println("Informe a frase desejada:");
		String frase= sc.nextLine();
		
		for(int i=0; i<numero; i++)
		{
			System.out.println(frase);
			
		}
}
  }
