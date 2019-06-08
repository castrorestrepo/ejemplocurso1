package ejercicio1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/**
 *
 * @author julian andres restrepo castro
 */
public class CountOccurrences implements CountOccurrencesInt{

    @Override
    public List<String> countOccurrences(List<Integer> list) {
        List<String> result = new ArrayList<String>();
        int contador =1;
        for (int i= 0; i < list.size() -1 ; i++){
            if (list.get(i) == list.get(i+1)){
                contador = contador +1;
            }
            else {
                if (contador > 1)
                {
                result.add(list.get(i) + ":" + contador);
                contador = 1;
                }
                else
                {
                    result.add(list.get(i).toString());
                contador = 1;
                }
            }
        }
        result.add(list.get(list.size()-1).toString());
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        for (int i = 0 ; i < result.size(); i++)
        {
            System.out.println(result.get(i));
        }
        return result;
    }
    
   // @SuppressWarnings("empty-statement")
   public static void main(String[] args) {
    //Pruebas propias para probar le metodo desde el main sin el test  
//            int arr[] = {7,7,5,5,5,2,3};
//            List<Integer> list =  Arrays.stream(arr).boxed().collect(Collectors.toList());
//            CountOccurrencesInt instance = new CountOccurrences();
//            instance.countOccurrences(list);
    
   }
}
