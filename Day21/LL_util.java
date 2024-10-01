package Day21;

public class LL_util {
    public static void main(String[] args) {
        Linked_List ll = new Linked_List();
        ll.addFirst(40);
        ll.addFirst(20);
        ll.addFirst(10);
        ll.display();
        ll.addLast(50);
        ll.display();
        ll.addAtIndex(30,2);
        ll.display();

        // ll.removeFirst();
        // ll.display();

        ll.removeLast();
        ll.display();

        System.out.println(ll.removeIndex(1));
        ll.display();



        // System.out.println(ll.getFirst() + " " + ll.getLast() + " " + ll.getIndex(2));

        // System.out.println(ll.getNode(3).data);
        
    }
    
}
