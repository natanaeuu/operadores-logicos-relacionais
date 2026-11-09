package ExercicioModulo10;

import java.util.Scanner;

public class ModuloDezIII {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um nome: ");

        String nome = input.nextLine();
        char[] usuario = nome.toCharArray();
        char aux;

        for(int i = 0; i < usuario.length/2; i++){
            aux = usuario[i];
            usuario[i] = usuario[usuario.length-i-1];
            usuario[usuario.length-i-1] = aux;


        }

        System.out.print(usuario);
        input.close();
    }
}
