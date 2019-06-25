class Solution {
    public static void BFS(int graph[][],int i,boolean visited[])
  {
    Queue<Integer> q = new LinkedList<>();
      q.add(i);
      visited[i] = true;
    int arr[] = new int [graph.length];
    for(int k=0;k<graph.length;k++)
    {
      arr[k] = -1;
    }
      while(q.size()!=0)
      {
        int u = q.remove();
        arr[u] =u;
        for(int j=0;j<graph.length;j++)
        {
          if(graph[u][j] == 1 && visited[j] != true)
          {
            q.add(j);
            visited[j] = true;
          }
        }
      }
  }
    public int findCircleNum(int[][] M) {
      
        int count = 0;
        int V = M.length;
      boolean visited[] = new boolean[V];
      
      for(int i=0;i<V;i++)
      {
        if(visited[i] == false)
        {
          count++;
          BFS(M,i,visited);
      }
      }
        return count;
    }
}