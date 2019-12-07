package LeetCode;

public class findOcurrences {
    public String[] findOcurrences(String text, String first, String second) {
        String []textsplit=text.split(" ");
        String []res=new String[textsplit.length];
        int j=0;
        for (int i=0;i<textsplit.length;i++){
            if (first==textsplit[i]&&i+1<textsplit.length){
                if (second==textsplit[i+1]&&i+2<textsplit.length){
                    res[j]=textsplit[i+2];
                    j++;
                }
            }
        }
        return res;
    }
}
