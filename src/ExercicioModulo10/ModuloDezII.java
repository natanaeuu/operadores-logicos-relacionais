package ExercicioModulo10;

import java.util.Scanner;

public class ModuloDezII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor para o vetor: ");

        int n = scanner.nextInt();
        int[] vet = new int[n];

        for(int i = 0; i < vet.length; i++){
            System.out.println("Digite um numero: ");
            vet[i] = scanner.nextInt();
        }

        for(int i = 0; i < vet.length; i++){
                if(vet[i] % 2 == 0){
                    vet[i] = vet[i] * 2;
                }
                else if(vet[i] % 2 != 0){
                    vet[i] = (int)Math.pow(vet[i], 2);
            }
            System.out.println( vet[i] );
        }
    }
}
