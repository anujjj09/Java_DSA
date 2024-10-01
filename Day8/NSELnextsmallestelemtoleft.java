package Day8;

public class NSELnextsmallestelemtoleft {
    static int [] nsel(int []arr){
        int [] NSEL = new int [arr.length];
        int miniele = Integer.MAX_VALUE;
        for(int i =0; i<=arr.length ; i++){
            if(miniele==Integer.MAX_VALUE){
                NSEL[i]=0;
            }
            else{
                NSEL[i]=miniele;
            }
            miniele=Math.min(miniele,arr[i]);
            
        }
        return NSEL;
        
            
        
        
        
    }

    public static void main(String[] args) {
        int [] arr= {9,6,4,1,7,3,5,2,8};
        int [] NSEL = nsel (arr);    
        for (int i:NSEL){
            System.out.print(i + " ");
        }

        
    }
    
}
