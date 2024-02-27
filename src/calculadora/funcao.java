package calculadora;
import java.util.Scanner;

public class funcao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o primeiro valor");
		double valor1 = sc.nextDouble(); 
		System.out.println("Informe o segundo valor");
		double valor2 = sc.nextDouble();
		
		System.out.println("Informe qual operação quer realizar:\n 1 - (+)\n 2 - (-)\n 3 - (*)\n 4 - (%)\n ");
		int sinal = sc.nextInt();
		switch(sinal) {
		case 1:
			double resultadoSoma = valor1 + valor2;
			System.out.println("O resultado é: " + resultadoSoma);
			break;
		case 2:
			double resultadoSub = valor1 - valor2;
			System.out.println("O resultado é: " + resultadoSub);
			break;
		case 3:
			double resultadoMult= valor1 * valor2;
			System.out.println("O resultado é: " + resultadoMult);
			break;
		case 4:
			double resultadoDiv= valor1 / valor2;
			System.out.println("O resultado é: " + resultadoDiv);
			break;
		default:
			System.out.println("Informe um valor correto");
			break;
		}
	sc.close();
		
	}

}
