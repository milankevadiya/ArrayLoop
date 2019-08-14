import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortArray {
    public static void main(String[] args) {
        Integer []a = {199,102,30,40,59,60};
        Arrays.sort(a);
        System.out.println("Ascending numeric value"+Arrays.toString(a));

        List<Integer> myList = Arrays.asList(a);
        Collections.reverse(myList);
        myList.toArray(a);
        Collections.sort(myList, Collections.reverseOrder());
        System.out.println("Decending nummeric value" +myList);

        System.out.println();

        String []b = {"banana","mango","apple","orange","grapes"};
        Arrays.sort(b);
        System.out.println("Ascending string"+Arrays.toString(b));
        List<String> name = Arrays.asList(b);
        name.toArray(b);
        Collections.sort(name, Collections.reverseOrder());
        System.out.println("Decending string"+name);
    }
}


