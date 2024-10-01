package Day19;

public class ratinamaze {
    static int sol[][]=new int[100][100];
    //base case
    static boolean ratiam(char[][] maze, int i,int j,int n,int m){
        if(i==n-1 && j==m-1){
            sol[i][j]=1;
            display(n,m);
            return true;
        }
        if(i>=0 && i<n && j>=0 && j<m && maze[i][j]!='X' && sol[i][j]==0){
            sol[i][j]=1;
            //right
            ratiam(maze, i, j+1, n, m);
            //down
            ratiam(maze, i+1, j, n, m);
             //Left
             ratiam(maze, i, j, n, m);
             //Up
             ratiam(maze, i-1, j, n, m);
 
            //backtracking
            sol[i][j]=0;
        }
        return false;
    }
    static void display(int n,int m){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(sol[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        char[][] maze = {
            {'0', '0', '0', '0', 'X'},
            {'0', 'X', 'X', '0', 'X'},
            {'0', 'X', '0', '0', '0'},
            {'0', 'X', '0', 'X', '0'},
            {'0', '0', '0', 'X', '0'}
        };
        int n=5,m=5;
        ratiam(maze, 0, 0, n, m);
        
    }
    
}
