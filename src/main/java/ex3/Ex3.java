package ex3;

import java.util.Collections;
import java.util.Scanner;

public class Ex3 {
    public static void listaMusicas() {
        System.out.println("MUSICAS DISPONIVEIS:");
        for(String m : Karaoke.musicas) {
            System.out.println(m);
        }
    }
    
    public static void buscarMusica(String musica) {
        if (Karaoke.musicas.contains(musica)) Karaoke.setFila(musica);
        else if (Karaoke.cantores.containsKey(musica)) Karaoke.setFila(Karaoke.cantores.get(musica));
        else System.out.print("\n---MUSICA NAO ENCONTRADA---");
    }
    
    public static void imprimirFila() {
        for (String m : Karaoke.fila) {
            System.out.print("->"+m+" ");
        }
        System.out.println("");
    }
    
    public static void tocarMusica() {
        if (Karaoke.fila.isEmpty()) System.out.println("\n---NAO HA MUSICAS NA FILA---");
        else {
            System.out.println("\nTOCANDO "+Karaoke.fila.element());
            Karaoke.fila.pop();
            System.out.println("\nPROXIMAS MUSICAS:");
            if (Karaoke.fila.isEmpty()) System.out.println("---FILA VAZIA---");
            else imprimirFila();
        }
    }
    
    public static void main(String[] args) {
        Karaoke karaoke = new Karaoke();
        Scanner teclado = new Scanner(System.in);
        String op;
        Collections.sort(Karaoke.musicas);
        listaMusicas();
        do {
            System.out.print("\nESCOLHA:\n(S) SELECIONAR MUSICA | (T) TOCAR MUSICA | (F) FECHAR PROGRAMA\nOP: ");
            op = teclado.next();
            teclado.nextLine();
            switch(op) {
                case "S" -> {
                    System.out.print("\nDIGITE O NOME DA MUSICA OU O NOME DO CANTOR/BANDA: ");
                    buscarMusica(teclado.nextLine());
                    imprimirFila();
                }
                case "T" -> tocarMusica();
                case "F" -> System.out.print("\n---PROGRAMA FINALIZADO---");
                default -> System.out.println("\n---COMANDO INVALIDO---");
            }
        } while(!op.equals("F"));
    }
}