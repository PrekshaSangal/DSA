class Solution {
    public int firstUniqChar(String s) {
        LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
            else{
                map.put(s.charAt(i),1);
            }
        }
        char x=' ';
        for(char i:map.keySet()){
            if(map.get(i)==1){
                x=i;
                break;
            }
        }
        if(x==' '){
            return -1;
        }
        for(int i=0;i<n;i++){
            if(s.charAt(i)==x){
                return i;
            }
        }
        return -1;
    }
}