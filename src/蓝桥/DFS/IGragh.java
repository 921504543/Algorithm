package 蓝桥.DFS;

public interface IGragh {
    void createGragh();
    int getVexNum();
    int getArcNum();
    Object getVex(int v);
    int locate(Object vex);
    int firstAdjvex(int v);
    int nextAdjvex(int v,int w);

}
