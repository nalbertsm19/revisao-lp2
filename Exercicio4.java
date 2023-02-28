package exercicios;
import java.util.Scanner;
public class Exercicio4 {

	public static void main(String[] args) 
	{
		
		}
	public static void Calculo()
	{
	
		Scanner sc = new Scanner(System.in);

		System.out.println("CALCULO DA AREA DO RETÂNGULO");
		System.out.println("Informe a altura do retângulo:");
		double alt = sc.nextDouble();

		System.out.println("Informe a base do retangulo");
		double base = sc.nextDouble();

		double area = base * alt;
		double perimetro = (2 * base) + (2 * alt);

		System.out.println("Área do retângulo:"+area);
		System.out.println("Perímetro do retângulo:"+perimetro);
	}
	}


