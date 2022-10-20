package kata2v5;
import java.util.Map;
import java.util.HashMap;

public class Histograma<T> {
    private final T[] data;

    public Histograma(T[] data) {
        this.data = data;
    }

    public T[] getData() {
        return this.data;
    }

    public Map<T, Integer> getHistogram() {
        Map<T, Integer> histo = new HashMap<>();
        for(T i : data) {
            histo.put(i, histo.containsKey(i) ? histo.get(i) + 1 : 1);
        }
        return histo;
    }
}