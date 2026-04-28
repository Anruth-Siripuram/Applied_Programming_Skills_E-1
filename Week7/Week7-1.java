class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> graph=new ArrayList<>();
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        for(int[] edge:edges){
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }
        int[] visited=new int[n];
        return fun(graph,source,destination,visited);
    }
    boolean fun(List<List<Integer>> g,int s,int d,int[] v){
        if(s==d) return true;
        v[s]=1;
        for(int n:g.get(s)){
            if(v[n]==0){
                if(fun(g,n,d,v)) return true;
            }
        }
        return false;
    }
}
