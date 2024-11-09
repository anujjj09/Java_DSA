package Day24;
import java.util.Stack;
public class stk_1 {
    static void insertAtfirst(Stack <Integer> stk,int y){
        if(stk.isEmpty()){
            stk.push(y);
            return;
        }
        int x = stk.pop();
        insertAtfirst(stk,y);
        stk.push(x);
    }

    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        stk.push(1);
        stk.push(2);
        stk.push(3);
        
        insertAtfirst(stk, 0);
        while(!stk.isEmpty()){
            System.out.println(stk.pop());
        }
    }
}