package kata2v5;

import java.util.Map;

public class Kata2V5 {

    public static void main(String[] args) {    // Represents the keys
        String[] data = {"Rosa", "Pepe", "María", "Pepe", "Pepe", "Rosa"};
        Histograma histo = new Histograma(data);
        Map<String, Integer> histogr = histo.getHistogram();
    
        for(Map.Entry<String, Integer> entry : histogr.entrySet()) {
            System.out.println(entry.getKey() + " --> " + entry.getValue());
            }
        
    }
}