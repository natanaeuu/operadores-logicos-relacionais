package ExercicioModulo8;

import java.util.Scanner;

public class ModuloOito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Digite um número positivo:");
        int numeroP = scanner.nextInt();

        System.out.println("CRESCENTE");

        for(int i = 0; i < numeroP; i++){
            System.out.println(i);

        }

        System.out.println("DECRESCENTE");

        for(int i = numeroP; i > 0; i--){
            System.out.println(i);

        }

        if(nome.length() > 6){
            for(int i = 0; i < numeroP; i++){
                System.out.println(nome);
            }
        }else{
            System.out.println((nome));
        }
    }
}



