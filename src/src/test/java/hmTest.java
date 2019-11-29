import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class hmTest {
    Avg avg = new Avg();
    Fltr fltr = new Fltr();
    ArrayList<Integer> arrayList;
    ArrayList<String> stringList;
    Pair pair;

    @Before
    public void init() {
        arrayList = new ArrayList();
        arrayList.add(5);
        arrayList.add(5);
        arrayList.add(5);
        arrayList.add(5);
        arrayList.add(5);
        stringList = new ArrayList<>();
        stringList.add("vova");
        pair = new  Pair("a","A");
    }

    @Test
    public void avgTest() {
        assertEquals(5,(int) (avg.collectionAvg(arrayList)));
    }

    @Test
    public void fltrTest() {
        assertTrue(fltr.specificFilter(stringList));
    }

    @Test
    public void getNameTest() {
        assertEquals("a"+" "+"A",pair.getName());
    }

}