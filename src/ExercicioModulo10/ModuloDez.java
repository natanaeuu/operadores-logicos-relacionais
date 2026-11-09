package ExercicioModulo10;

import java.util.Scanner;

public class ModuloDez {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número pro seu vetor:");
        int n = scanner.nextInt();
        int aux;
        int[] vet = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vet[i] = scanner.nextInt();
        }

        for(int i = 0; i < vet.length; i++) {
            for(int j = 0; j < (vet.length - 1); j++) {
                if(vet[j] > vet[j + 1]) {
                    aux = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = aux;
                }
            }
        }

        System.out.println("\nVetor ordenado:");

        for (int i = 0; i < n; i++) {
            System.out.print(vet[i] + " ");
        }

        scanner.nextLine();

        System.out.println("\nDigite o seu nome: ");
        String nome = scanner.nextLine();

        int vogais = 0;
        char[] letras = nome.toLowerCase().toCharArray();

        for (int i = 0; i < letras.length; i++) {
            if     (letras[i] == 'a' || letras[i] == 'e' || letras[i] == 'i' || letras[i] == 'o' || letras[i] == 'u'){
                        vogais++;
            }

        }
        System.out.println("Quantidade de vogais: " + vogais);

        scanner.close();

    }
}