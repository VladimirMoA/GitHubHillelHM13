import java.util.ArrayList;

public class Avg {

    public static void main(String[] args) {

        ArrayList <Integer> arrayList = new ArrayList();
        for (int i = 1; i <= 1000; i++) {
            arrayList.add((Integer)i);
        }
        Integer sum = arrayList.stream().reduce(0,(left,right) -> left+right);
        System.out.println((double)sum / 1000);
    }

}
