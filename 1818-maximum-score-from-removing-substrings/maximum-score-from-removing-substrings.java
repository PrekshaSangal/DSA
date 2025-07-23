class Solution {
    public int maximumGain(String str, int x, int y) {
        StringBuilder s= new StringBuilder(str);
        if(x>y){
            return remove(s,"ab",x)+ remove(s,"ba",y);
        }else{
            return remove (s,"ba",y)+remove(s,"ab",x);
        }
    }
    public static int remove(StringBuilder sb,String pair,int value){
        int sum=0;
        int i=0;
        char first= pair.charAt(0);
        char sec= pair.charAt(1);
        while(i<sb.length()-1){
            char ch1=sb.charAt(i);
            char ch2=sb.charAt(i+1);
            if(ch1==first && ch2==sec){
                sb.deleteCharAt(i+1);
                sb.deleteCharAt(i);
                i=Math.max(0,i-1);
                sum=sum+value;
            }
            else{
                i++;
            }
        }
        return sum;
    }
}