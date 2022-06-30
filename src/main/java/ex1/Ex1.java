package ex1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Ex1 {
    public static int contadorPalavras(String palavra, Map<Integer,String> contarPalavras) {
        int c = 0;
        for(Integer i : contarPalavras.keySet()) {
            if (contarPalavras.get(i).equals(palavra)) c++;
        }
        return c;
    }
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Map<Integer,String> contarPalavras = new HashMap<>();
        Set<String> palavrasDif = new HashSet<>();
        System.out.print("Insira uma frase: ");
        String frase = teclado.nextLine();
        String[] palavras = frase.split(" ");
        for(int i=0; i<palavras.length; i++) {
           palavrasDif.add(palavras[i]);
           contarPalavras.put(i+1, palavras[i]);
        }
        for(String palavra : palavrasDif) {
            System.out.println(palavra+": "+contadorPalavras(palavra, contarPalavras));
        }
    }
}