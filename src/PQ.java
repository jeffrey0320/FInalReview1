import java.util.Comparator;
import java.util.PriorityQueue;

public class PQ implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2.compareTo(o1);
    }
}
