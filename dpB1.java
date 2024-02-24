
public class dpB1 {
    public static void main(String[] args) {
       
        // HERE IS Obstacle is " -1 ";

        int grid[][] = { {0,0,0},
                        {0,-1,0},
                        {0,0,0} };
                                   
        
        int m = grid.length;
        int n = grid[0].length;  
        //edge condition:-
       for(int i=0;i<m;i++) {
            if(grid[i][0]==-1) break;
            if(grid[i][0] != -1) grid[i][0] = 1;
        }
        //edge condition :- 
        for(int j=0;j<n;j++) {
            if(grid[0][j]==-1) break;
            if(grid[0][j] != -1) grid[0][j] = 1;
        }
        
        for(int i=1;i<m;i++) {
            for(int j=1;j<n;j++) {
               if(grid[i][j] != -1) {
                if(grid[i-1][j]!=-1 && grid[i][j-1]!=-1) grid[i][j] = grid[i-1][j] + grid[i][j-1];
                else if(grid[i-1][j]==-1 && grid[i][j-1]==-1) continue;
                else if(grid[i-1][j]==-1) grid[i][j] = grid[i][j-1];
                else 
                 grid[i][j] = grid[i-1][j];
               }
               else 
               continue;
            }
        }
        System.out.println("Number of Unique Path is despite the obstacle :-> "+grid[m-1][n-1]);                
    }
}
