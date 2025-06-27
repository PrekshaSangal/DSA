class Solution {
    public String longestPrefix(String s) {
        char c[]=s.toCharArray();
        int n=c.length;
        int max=0; int i=1;
        int a[]=new int[n];
        while(i<n){
            if(c[max]==c[i]){
                max++;
                a[i]=max;
                i++;
            }else{
                if(max>0){
                max=a[max-1];
                }
            else{
                a[i]=0;
                i++;
            }
            }
        }
    return s.substring(0,a[n-1]);
}
}