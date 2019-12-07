package LeetCode;

public class addStrings {
    public String addStrings(String num1,String num2){
        StringBuilder s=new StringBuilder();
        int i=num1.length()-1,j=num2.length()-1,temp=0;
        while (i>0||j>0||temp!=0){
            if (i>0)temp+=num1.charAt(i--)-'0';
            if (j>0)temp+=num2.charAt(j--)-'0';
            s.append(temp%10);
            temp=temp/10;
        }
            return s.reverse().toString();
    }
}
