class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] visited = new boolean[n];

        int count =0;
        for(int i=0; i<n; i++){
            if(!visited[i]){
                count++;
                dfs(isConnected, i, visited,n);
            }
        }
        return count;
    }
    void dfs(int[][] adj, int node, boolean[] visited, int n){
        visited[node] = true;

        for(int i=0; i<n; i++){
            if(adj[node][i]==1 && !visited[i]){
                dfs(adj, i, visited,n);
            }
        }
    }
}