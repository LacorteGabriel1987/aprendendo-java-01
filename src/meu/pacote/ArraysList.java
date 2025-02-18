package meu.pacote;

import java.util.ArrayList;

public class ArraysList {

    public static void main(String[] args) {
        // Lista de nomes
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Gabriel");
        nomes.add("Mariana");
        nomes.add("Simone");

        // Lista de idades
        ArrayList<Integer> idades = new ArrayList<>();
        idades.add(25);
        
        idades.add(2);
        idades.add(22);

        // Usando o for tradicional com índice
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println("Nome: " + nomes.get(i));
            System.out.println("Idade: " + idades.get(i));  // Usando o índice i diretamente
        }
    }
}
