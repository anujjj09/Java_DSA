package Day21;

public class Linked_List {
    class Node{
        int data;
        Node next;
        
    }
    Node head;
    private Node tail;
    private int size;
    //TC : O(1)

    public int removeIndex(int k){
        if(k==0) return removeFirst();
        else if (k==size-1) return removeLast();
        else{
            Node k_1th = getNode(k-1);
            Node k_th = k_1th.next;
            k_1th.next =k_th.next;
            k_th.next = null;
            size--;
            return k_th.data;
        }

    }


    public int removeLast(){
        if (size == 1){
            return removeFirst();
        } else{
            int rv = tail.data;
            Node sl = getNode(size-2);
            sl.next = null;
            tail = sl;
            size--;
            return rv;



        }
    }


    public int removeFirst(){
        int rv = head.data;
        if(size ==1){
            head = null;
            tail = null;
            size--;
        }else{
            Node temp = head;
            head = head.next;
            temp.next = null;

        }
        size--;
        return rv;
    }

    public int getIndex(int index){
        if(index<0 || index>=size) return -1;
        else if (index==0) return getFirst();
        else if (index == size-1) return getLast();
        else return getNode(index).data;

    }



    public int getFirst(){
        return head.data;
    }

    public int getLast(){
        return tail.data;
    }


    public void addAtIndex(int item , int index){
        if(index==0) addFirst(item);
        else if(index == size-1) addLast(item);
        else{
            Node nn = new Node();
            nn.data = item;
            Node k_1th = getNode(index-1);
            nn.next = k_1th.next;
            k_1th.next = nn;
            size++;

        }
    }



    public Node getNode(int k){
        Node temp = head;
        for(int i =0;i<k;i++){
            temp = temp.next;
        }
        return temp;

    }

    public void addFirst(int item){
        Node nn = new Node ();
        nn.data = item;
        if(size==0){
            head = nn;
            tail = nn;
        }else{
            nn.next = head;
            head = nn;
        }
        size++;
    }

    public void addLast(int item){
        if(size == 0){
            addFirst(item);
        }else{
            Node nn = new Node();
            nn.data = item;
            tail.next=nn;
            tail = nn;
            size++;
        }
    }

    //Display
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
    
}
