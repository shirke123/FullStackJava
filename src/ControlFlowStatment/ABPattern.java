package ControlFlowStatment;

public class ABPattern {
    public  static  void main(String[]args){
        String str="aabbbcdde";
        char[]ch=str.toCharArray();
        int count;
        for(int i=0;i<ch.length;i++){
            count=1;
            for (int j=i+1;j<ch.length;j++){
                if (ch[i]==ch[j]) {
                    count++;
                }else {
                    break;
                }
               i=j;
            }
             System.out.println(i+ "" +count);
        }
    }
}
