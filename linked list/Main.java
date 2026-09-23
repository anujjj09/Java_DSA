
public class Main {
    public static void main(String[] args) {
        LL list = new LL();   
        
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(17);

        list.display();
        
        list.insertLast(20);
        list.insert(100, 3);
        list.display();
        // System.out.println(list.deleteFirst());
        // list.display();
        // list.deleteLast();
        // list.display();
        // list.display();
        // System.out.println(list.delete(2));
        // list.display();

        list.insertRec(88, 2);
        list.display();


//DLL
        // doublyLL list = new doublyLL();   
        
        // list.insertFirst(3);
        // list.insertFirst(2);
        // list.insertFirst(8);
        // list.insertFirst(17);
        // list.insertLast(99);

        // list.insert(8, 65);
        // list.display();



//CLL
        // circularLL list = new circularLL();
        // list.insert(23);
        // list.insert(3);
        // list.insert(19);
        // list.insert(75);
        // list.delete(23);
        // list.display();


    }
}
