package Day11;

public class revwords {
    //Q5. function to reverse words of a string.
        //Eg - the bird is flying ==> flying is bird the
    static void  rev(String s){
        String [] arr = s.split("\\s");
        for(int i = arr.length-1;i>=0;i--){
            System.out.print(arr[i] + " ");

        }
    }
    
    public static void main(String[] args) {
        String s = "I am batman";
        rev(s);
    }
    
    
}
