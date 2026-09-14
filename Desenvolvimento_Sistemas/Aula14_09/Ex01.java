package Aula14_09;
import java.util.ArrayList;
import java.util.Scanner;
public class Ex01 {
    public static void main(String[] args) {
        
        ArrayList<String> nomes = new ArrayList<>();

        //Adicionar
        nomes.add("Ana");
        nomes.add("Carlos");
        nomes.add("Marcos");

        //LISTAR
        System.out.println("Lista");
        for (String nome : nomes) {
            System.out.println(nome);

            
        }
        //ALTERAR


        nomes.set(1, "edivancidecleide");

        System.out.println("Listar após alterar");
        for (String nome : nomes); {
            System.out.println(nome);
        }

        //REMOVER
        nomes.remove(0);

        System.out.println("Lista após remover");
        for (String nome: nomes) {
            System.out.println(nome);
        }
    }
}
