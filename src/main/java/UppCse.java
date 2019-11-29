import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

class Pair {
    private String lowerCase;
    private String upperCase;

    public Pair(String lowerCase, String upperCase) {
        this.lowerCase = lowerCase;
        this.upperCase = upperCase;
    }

    public String getName() {
        return lowerCase + " " + upperCase;
    }

}

public class UppCse {

    public static Collection<Pair> pairConverter(Collection <String> collection) {
         List <Pair> list = collection.stream().map((u) ->
                new Pair(u.toLowerCase(),u.toUpperCase())).collect(Collectors.toList());
         return list;
    }

    public static void main(String[] args) {

        ArrayList <String> arrayList = new ArrayList<>();
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        arrayList.add("d");
        arrayList.add("e");

        List <Pair> list = (List<Pair>) pairConverter(arrayList);
        for(Pair pair : list) {
            System.out.println(pair.getName());
        }
    }

}