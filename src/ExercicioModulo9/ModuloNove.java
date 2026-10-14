package ExercicioModulo9;

import java.util.Scanner;

public class ModuloNove {
    public void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero:");
        int numero = scanner.nextInt();
        int i = 0;
        int opcao;
        String frase;

        while(i <= 9){
            i++;
            int resultado = numero * i;
            System.out.println("a tabuada de 5 x " + i + " é igual a : " + resultado);
        }

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Continuar");
            System.out.println("2 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                System.out.println("Você escolheu continuar...");
                System.out.println("Escreva uma palavra ou frase: ");
                frase = scanner.nextLine();
                System.out.println(frase);



            } else if (opcao == 2) {
                System.out.println("Obrigado por utilizar nosso sistema, espero que tenha gostado.");
            } else {
                System.out.println("Opção inválida! Tente novamente.");
            }

        } while( opcao != 2);
             scanner.close();
    }
}