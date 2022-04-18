package DTcourseDataStructure;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;

public class p20BubbleSort {
    public static void main(String[] args) {
        int[] arr=new int[]{9,8,7,6,5,4,3,2,1};
        int temp=0;
//        一共多少轮
        for (int i=0;i<arr.length;i++){
//        每一轮的次数
            for (int j=0;j<arr.length-1-i;j++){
                if (arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
