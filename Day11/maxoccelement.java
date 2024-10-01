package Day11;

public class maxoccelement {
    //Q3. find max occuring element in a sorted string.
    static char maxocc(String s){
        int countmaxelement=0;
        char maxelement='*';
        int countcurrelement =0;
        char currelement='*';
        for(int i =0;i<s.length();i++){
            if(s.charAt(i)!= currelement){
                if(countcurrelement>countmaxelement){
                    countmaxelement=countcurrelement;
                    maxelement=currelement;
                }
                currelement=s.charAt(i);
                countcurrelement=1;

            }
            else{
                countcurrelement++;
            }
        }
        if(countcurrelement>countmaxelement){
            countmaxelement=countcurrelement;
            maxelement=currelement;
        }
        return maxelement;
    }



    //Q4. find max occuring element in a string.
    static char maxocc2(String s){
        int [] arr =new int [26];
        for(int i =0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;

        }
        int index = 0;
        for(int i =1;i<arr.length;i++){
            if(arr[index] < arr[i]){
                index = i;
            }
        }
        return (char)('a' + index);
    }

    public static void main(String[] args) {
        // String s = "aaaabbcccdddddd";
        // System.out.println(maxocc(s));
        String s = "aabbsjhfewuibeiqbufiv";
        System.out.println(maxocc2(s));
    }

    
}
