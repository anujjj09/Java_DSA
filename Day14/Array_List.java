package Day14;
import java.util.ArrayList;
import java.util.Collections;
public class Array_List {
    public static void main(String[] args) {
        //1. Syntax
        ArrayList<Integer> arr = new ArrayList<>();

        //2. Add
        arr.add(10);
        arr.add(20);
        arr.add(30);

        //3. Get
        System.out.println(arr.get(0));

        //4. Remove
        arr.remove(1);

        //5. Update
        arr.set(1,100);

        //6. Size
        System.out.println(arr.size());

        //7. Display
        System.out.println(arr);

        //8. Sort
        Collections.sort(arr);
        System.out.println(arr);

        //9. Insert
        arr.add(1,50);
        System.out.println(arr);

        //10. Clear
        arr.clear();
        System.out.println(arr);

        
        

    }
    
}
