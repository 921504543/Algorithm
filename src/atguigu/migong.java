package atguigu;

import java.util.Map;

public class migong {

    //0 has not been
    //1 wall
    //2 can go
    //3 position where cant go
    public static boolean setWay(int[][] map,int i,int j){
        if (map[4][4]==2){
            return true;}
        else {if (map[i][j]==0){
                map[i][j]=2;
                if (setWay(map,i+1,j)){
                    return true;
                }
                else if (setWay(map,i,j+1)){
                    return true;
                }
                else if (setWay(map,i-1,j)){
                    return true;
                }
                else if (setWay(map,i,j-1)){
                    return true;
                }
                else {
                    map[i][j]=3;
                    return false;
                }
            }
            else return false;
        }
    }

    public static void main(String[] args) {
        int[][]map=new int[6][6];
        for (int i =0;i<map.length;i++){
            map[0][i]=1;
            map[5][i]=1;
            map[i][0]=1;
            map[i][5]=1;
        }

        for (int i =0;i<map[4].length;i++){
            map[4][i]=1;
        }
        for (int i =1;i<map[1].length;i++){
            map[1][i]=1;
        }
        map[2][2]=1;
        map[2][4]=1;
        map[1][1]=0;
        map[4][4]=2;
        for (int i=0;i<map.length;i++){
            System.out.println();
            for (int j=0;j<map[0].length;j++){
                System.out.print(map[i][j]);
            }
        }
        setWay(map,1,1);
        for (int i=0;i<map.length;i++){
            System.out.println();
            for (int j=0;j<map[0].length;j++){
                System.out.print(map[i][j]);
            }
        }
    }
}
