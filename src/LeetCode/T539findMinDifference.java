package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class T539findMinDifference {
    public static int caculate(String a,String b){
        int aHour=Integer.parseInt(a.substring(0,2));
        int aMin=Integer.parseInt(a.substring(3,5));
        int bHour=Integer.parseInt(b.substring(0,2));
        int bMin=Integer.parseInt(b.substring(3,5));
        int aMinTotal=aHour*60+aMin;
        int bMinTotal=bHour*60+bMin;
        int res=aMinTotal-bMinTotal;
        if(res<0){
            res=-res;
        }
        return res;
    }
    public static int findMinDifference(List<String> timePoints) {
        int subtract=Integer.MAX_VALUE;
        for(int i=0;i<timePoints.size();i++){
            for(int j=i+1;j<timePoints.size();j++){
                String a=timePoints.get(i);
                String b=timePoints.get(j);
                if(a=="00:00"){
                    a="24:00";
                }
                if (b=="00:00"){
                    b="24:00";
                }
                int res=caculate(a,b);
                if(res<subtract){
                    subtract=res;
                }
            }
        }
        return subtract;
    }
    public static void main(String[] args) {
        List<String> timePoints=new ArrayList<>();
        timePoints.add("23:59");
        timePoints.add("00:00");
//        timePoints.add("00:00");
        System.out.println(findMinDifference(timePoints));
    }
}
