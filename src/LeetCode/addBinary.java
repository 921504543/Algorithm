package LeetCode;

import java.math.BigInteger;

public class addBinary {
    public String addBinary(String a,String b){
        BigInteger c=new BigInteger(a,2);
        BigInteger d=new BigInteger(b,2);
        BigInteger e=c.add(d);
        String s=e.toString(2);
        return s;
    }
}
