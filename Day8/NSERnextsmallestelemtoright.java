package Day8;

public class NSERnextsmallestelemtoright {
    static int [] nser(int []arr){
        int [] NSER = new int [arr.length];
        int miniele = Integer.MAX_VALUE;
        for(int i =arr.length-1; i>=0 ; i--){
            if(miniele==Integer.MAX_VALUE){
                NSER[i]=0;
            }
            else{
                NSER[i]=miniele;
            }
            miniele=Math.min(miniele,arr[i]);
            
        }
        return NSER;
        
            
        
        
        
    }

    public static void main(String[] args) {
        int [] arr= {9,6,4,1,7,3,5,2,8};
        int [] NSER = nser (arr);    
        for (int i:NSER){
            System.out.print(i + " ");
        }

        
    }
}