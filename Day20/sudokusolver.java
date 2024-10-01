package Day20;

import java.util.Scanner;

public class sudokusolver {
    //Validate Sudoku
    static boolean checkValid(int [][]mat,int i, int j,int n,int num){
        //check rows and col
        //check sub block
        for(int k =0;k<n;k++){
            if (mat[i][k] == num || mat[k][j] == num) {
                return false;
            }
        }

        n = mat.length;
        int root_n = (int)Math.sqrt(n);
        int ri = (i/root_n) * root_n;
        int rj = (j/root_n) * root_n;
        for(int x = ri;x<ri+root_n;x++){
            for(int y = rj ; y<rj + root_n; y++){
                if(x!=i && y!=j){
                    if(mat[x][y] == num){
                        return false;
                    }
                }
            }
        }
        return true;

    }
    public boolean isValidSudoku(int[][] mat) {
        int n = 9;
        for(int i =0;i<n;i++){
            for(int j =0;j<n;j++){
                if(mat[i][j] != 0 ){
                    if(!checkValid(mat,i,j,n,mat[i][j])){
                        return false;
                    }

                }
            }
        }
        return true;
        
    }



    //Recursive Code
    static boolean sudokuSolver(int [][]mat,int i,int j,int n){
        //base case
        if(i == n){
            return true; //found ans
        }
        if(j==n){
            return sudokuSolver(mat, i+1, 0, n);
        }
        if(mat[i][j] != 0){
            return sudokuSolver(mat, i, j+1, n);
        }
        for(int num=1;num<=9;num++){
            if(checkValid(mat,i,j,n,num)){
                mat[i][j] = num;
                if(sudokuSolver(mat, i, j+1, n)){
                    return true;
                }
            }
        }
        mat[i][j] = 0;
        return false;

    }



    //Main fxn to create and print sudoku
    public static void main(String[] args) {
        int n = 9;
        int mat[][] = new int [n][n];
        Scanner sc = new Scanner (System.in);
        for(int i =0;i<n;i++){
            for(int j =0;j<n;j++){
                mat[i][j] = sc.nextInt();
            }
        }
        sc.close();
        sudokuSolver(mat,0,0,n);
        System.out.println();
        System.out.println();

        //display
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    
}
