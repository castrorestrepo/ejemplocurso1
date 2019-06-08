package ejercicio1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author julian nadres restrepo castro
 */
public class CountOccurrencesIntTest {
    
    public CountOccurrencesIntTest() {
    }

    /**
     * Test of countOccurrences method, of class CountOccurrencesInt.
     */
    @Test
    public void testCountOccurrences() {
        System.out.println("countOccurrences");
        int arr[] = { 7,7,5,5,5,2,3};
        String exp[] = { "7:2", "5:3", "2", "3"};
        List<Integer> list =  Arrays.stream(arr).boxed().collect(Collectors.toList());
        CountOccurrencesInt instance = new CountOccurrences();
        List<String> expResult = Arrays.stream(exp).collect(Collectors.toList());;
        List<String> result = instance.countOccurrences(list);
        assertEquals(expResult, result);
    }
    
       @Test
    public void testCountOccurrences2() {
        System.out.println("countOccurrences");
        int arr[] = { 7,7,7,5,5,5,2,3};
        String exp[] = { "7:3", "5:3", "2", "3"};
        List<Integer> list =  Arrays.stream(arr).boxed().collect(Collectors.toList());
        CountOccurrencesInt instance = new CountOccurrences();
        List<String> expResult = Arrays.stream(exp).collect(Collectors.toList());;
        List<String> result = instance.countOccurrences(list);
        assertEquals(expResult, result);
    }
    
    public class CountOccurrencesIntImpl implements CountOccurrencesInt {

        public List<String> countOccurrences(List<Integer> list) {
            return null;
        }
    }
    
}
