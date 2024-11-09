package Day24;

import java.util.Stack;

public class stk_NGE {
    static void Display(int [] arr){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();


    }
    public static void NGE(int [] arr){
        Stack<Integer> stk = new Stack<>();
        int [] ans = new int[arr.length];

        for(int i = 0; i<arr.length;i++){
            while(!stk.empty() && arr[i]>arr[stk.peek()]){
                ans[stk.pop()]=arr[i];
            }
            stk.push(i);

        }

        while(!stk.empty()){
            ans[stk.pop()]=-1;
        }
        Display(ans);
    }
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        stk.push(10);
        stk.push(20);
        stk.push(30);
        stk.push(40);

        NGE(new int [] {1,2,3,4,5});
        
    }
    
}
