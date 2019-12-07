package 蓝桥.DFS;

import javafx.scene.shape.Arc;

import java.util.Scanner;

public class Mygragh implements IGragh {
    int VexNum,ArcNum;//顶点个数，边数
    Object []Vexs;//顶点集
    int [][]Arcs;//邻接矩阵
    public Mygragh(){//构造函数 下同
        this(0,0,null,null);
    }
    public Mygragh(int VexNum,int ArcNum,Object[]Vexs,int [][]Arcs){
        this.VexNum=VexNum;
        this.ArcNum=ArcNum;
        this.Vexs=Vexs;
        this.Arcs=Arcs;
    }
    @Override
    public void createGragh() {//建立一个图
        Scanner reader=new Scanner(System.in);
        VexNum=reader.nextInt();
        ArcNum=reader.nextInt();
        for (int v=0;v<VexNum;v++){
            Vexs[v]=reader.next();
        }//顶点集输入
        Arcs=new int[VexNum][VexNum];//顶点个数*顶点个数的矩阵；
        for (int v=0;v<VexNum;v++){//把矩阵全部弄成无穷大；理解成数组中的值都是无穷大就行
            for (int u=0;u<VexNum;u++){
             Arcs[v][u]=Integer.MAX_VALUE;
            }
        }
        for (int k=0;k<ArcNum;k++){
            int v=intdexOf(reader.next());
            int u=intdexOf(reader.next());
            Arcs[v][u]=Arcs[u][v]=reader.nextInt();//这是无向图，有向图就分方向了
        }
    }
    public  int  intdexOf(Object Vex){//顶点所在的数组的位置
        for (int v=0;v<VexNum;v++){
            if (Vexs[v].equals(Vex)){
                return v;//返回所在的位置
            }
        }
        return -1;
    }
    @Override
    public int getVexNum() {//获得顶点数
        return VexNum;
    }
    public int getArcNum(){//获得边数
        return ArcNum;
    }
    public Object getVex(int v){//获得数组中的顶点
        return Vexs[v];
    }

    @Override
    public int locate(Object vex) {//无视就行
        return 0;
    }

    @Override
    public int firstAdjvex(int v) {//第一个顶点
        for (int j=0;j<VexNum;j++){
            if (Arcs[v][j]!=0&&Arcs[v][j]<Integer.MAX_VALUE){//0为走不通，无穷大为走不通
                return j;
            }
        }
        return -1;
    }

    @Override
    public int nextAdjvex(int v, int w) {//后继顶点
        for (int j=w+1;j<VexNum;j++){//从w开始算
            if (Arcs[v][j]!=0&&Arcs[v][j]<Integer.MAX_VALUE){
                return j;
            }
        }
        return -1;
    }
}
