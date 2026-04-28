class Solution {
    public int numIslands(char[][] grid) {
        int islands=0;
        int m=grid.length,n=grid[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1'){
                    islands++;
                    fun(grid,i,j);
                }
            }
        }
        return islands;
    }
    static void fun(char[][] grid,int i,int j){
        int m=grid.length,n=grid[0].length;
        if(i<0||j<0||i>=m||j>=n||grid[i][j]=='0'){
            return;
        }
        grid[i][j]='0';
        fun(grid,i,j-1);
        fun(grid,i,j+1);
        fun(grid,i-1,j);
        fun(grid,i+1,j);
    }
}
