package ex3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Karaoke {
    static protected List<String> musicas = new ArrayList<>();
    static protected Set<String> musicasDisponiveis = new HashSet<>();
    static protected Map<String, String> cantores = new HashMap<>();
    static protected LinkedList<String> fila = new LinkedList<>();
    
    public Karaoke() {
        musicas.add("DONT STOP ME NOW");
        cantores.put("QUEEN", "DONT STOP ME NOW");
        musicas.add("SHAPE OF YOU");
        cantores.put("ED SHEERAN", "SHAPE OF YOU");
        musicas.add("HIPS DONT LIE");
        cantores.put("SHAKIRA", "HIPS DONT LIE");
        musicas.add("UPTOWN FUNK");
        cantores.put("BRUNO MARS", "UPTOWN FUNK");
        musicas.add("THE NIGHT");
        cantores.put("AVICII", "THE NIGHT");
    }
    
    public static void setFila(String musica) {
        fila.add(musica);
    }
}
