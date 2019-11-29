import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Collection;

public class Fltr {

    public static boolean specificFilter(Collection <String> collection) {
        collection.stream()
                .filter((u) -> u == u.toLowerCase())
                .filter((u) -> u.length() > 4)
                .forEach(System.out::println);
        return true;
    }

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("vova");
        arrayList.add("Marina");
        arrayList.add("Lena");
        arrayList.add("konstantin");
        arrayList.add("Olya");
        arrayList.add("denis");
        specificFilter(arrayList);
    }

}