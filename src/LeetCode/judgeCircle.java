package LeetCode;

public class judgeCircle {
    public boolean judgeCircle(String moves) {
        int []a=new int[4];
        for (int i=0;i<moves.length();i++){
            switch (moves.charAt(i)){
                case 'L':
                    a[0]++;
                    break;
                case 'R':
                    a[1]++;
                    break;
                case 'U':
                    a[2]++;
                    break;
                case 'D':
                    a[3]++;
                    break;
            }
        }
        if (a[0]==a[1]&&a[2]==a[3]){
            return true;
        }
        else return false;
    }
}
