package calculadora;

import java.util.Scanner;

public class calculadora_logica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      while (true) {
        System.out.print("Digite o primeiro operando (0 ou 1): ");
        int operando1 = obterOperando(scanner);

        System.out.print("Digite o segundo operando (0 ou 1): ");
        int operando2 = obterOperando(scanner);

        System.out.println("Informe qual operação quer realizar:");
        System.out.println("1: Ou (∨) – disjunção");
        System.out.println("2: E (∧) – conjunção");
        System.out.println("3: Não (~) – negação");
        System.out.println("4: Se-então (→) – condicional");
        System.out.println("5: Se somente se (↔) – bicondicional");

        int escolha = scanner.nextInt();
        
        int resultado = 0;

        switch (escolha) {
            case 1:
                resultado = operando1 | operando2;  // Operação OR
                break;
            case 2:
                resultado = operando1 & operando2;  // Operação AND
                break;
            case 3:
                resultado = ~operando1 & 1;  // Operação NOT
                break;
            case 4:
                resultado = condicional(operando1, operando2);  // Operação condicional
                break;
            case 5:
                resultado = bicondicional(operando1, operando2);  // Operação bicondicional
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }

        System.out.println("Resultado: " + resultado);
        
        System.out.println("Deseja realizar outra operação? (1: Sim, 0: Não): ");
        int continuar = scanner.nextInt();

        if (continuar == 0) {
            break;
        }
        }
        scanner.close();
}
    //Verificação se está entrando 1 ou 0.
    private static int obterOperando(Scanner scanner) {
        int operando;
        while (true) {
            if (scanner.hasNextInt()) {
                operando = scanner.nextInt();
                if (operando == 0 || operando == 1) {
                    break;
                } else {
                    System.out.println("Por favor, insira apenas 0 ou 1 como operandos.");
                }
            } else {
                System.out.println("Entrada inválida. Por favor, insira apenas números.");
                scanner.next();
            }
        }
        return operando;
    }

    // Implementação da operação condicional (Se-então)
    private static int condicional(int p, int q) {
        return (~p & 1) | q;
    }

    // Implementação da operação bicondicional (Se somente se)
    private static int bicondicional(int p, int q) {
        int cond1 =  condicional(p, q);
        int cond2 =  condicional(q, p);
        return cond1 & cond2;
    }
}
