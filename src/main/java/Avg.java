import java.util.ArrayList;
import java.util.Collection;

public class Avg {
    public static double collectionAvg(Collection <Integer> collection) {
        Integer sum = collection.stream().reduce(0, (a, b) -> a + b);
        return (double) sum/collection.size();
    }

    public static void main(String[] args) {
        ArrayList <Integer> arrayList = new ArrayList();
        for (int i = 1; i <= 10; i++) {
            arrayList.add(i);
        }
        System.out.println(collectionAvg(arrayList));
    }

}