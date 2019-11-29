import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class hmTest {
    Avg avg = new Avg();
    ArrayList<Integer> arrayList;

    @Before
    public void init() {
        arrayList = new ArrayList();
        arrayList.add(5);
        arrayList.add(5);
        arrayList.add(5);
        arrayList.add(5);
        arrayList.add(5);
    }

    @Test
    public void avgTest() {
        System.out.println(avg.collectionAvg(arrayList));
        assertEquals(5,(int) (avg.collectionAvg(arrayList)));
    }

}