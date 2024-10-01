package Day13;

public class Stringbuilder {
    StringBuilder bs = new StringBuilder();
    
    public static void main(String[] args) {
        //string builder - initialisation
        StringBuilder sb = new StringBuilder("Hello");

   
        // sb.append("Hello");
        sb.replace(2,5,"replaced");
        // sb.insert(2 , "Hey"); //can be used to add a string,number,character,double,float
        // sb.delete(2,5);
        // sb.ensureCapacity(100);
        // sb.append("Bye");
        // sb.reverse();
        System.out.println(sb);
        //String sb = new String ("Hello");
        // System.out.println(sb.length());
        //System.out.println(sb.capacity());
        //System.out.println(sb.substring(5));


        // StringBuilder sb = new StringBuilder(7);
        // System.out.println(sb.capacity());


    }
    
}
