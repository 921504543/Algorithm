package 蓝桥.DFS;

import java.util.Arrays;

public class Dtraverse {
    private static boolean []visited;//是否访问
    public static void DFSTraverse(IGragh G){
        visited=new boolean[G.getVexNum()];
        Arrays.fill(visited,false);//把数组全部为没有访问过
        for (int v=0;v<G.getVexNum();v++){//第一行的第一个点进行dfs
            if (!visited[v]){
              DFS(G,v);
            }
        }
    }
    public static void DFS(IGragh G,int v){//Dfs算法
        visited[v]=true;//数组先变为已访问过
        for (int w=G.firstAdjvex(v);w>=0;w=G.nextAdjvex(v,w)){//从第一个点开始 然后到下一个点
            if (!visited[w]){//dfs下一个点
                DFS(G,w);
            }
        }
    }
}
