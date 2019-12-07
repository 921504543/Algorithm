package LeetCode;

import java.util.Arrays;

public class findContentChildren {
    public int findContentChildren(int []g,int[]s){
        Arrays.sort(g);
        Arrays.sort(s);
        int children=0,cookie=0;
        while (children<g.length&&cookie<s.length){
            if (g[children]<=s[cookie]){
                children++;
            }
            cookie++;
        }
        return children;
    }
}
