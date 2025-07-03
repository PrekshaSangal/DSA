class Solution {
    public String simplifyPath(String path) {
        Stack<String> st=new Stack<>();
        String[] str=path.split("/");

        for(int i=0;i<str.length;i++){
            if(str[i].equals(".") || str[i].equals("")){
                continue;
            }
            else if(str[i].equals("..")){
                if(!st.isEmpty() ){
                    st.pop();
                }
            }
            else{
                st.push(str[i]);
            }
        }
        StringBuilder sb= new StringBuilder();
        for(String dir: st){
            sb.append("/").append(dir);
        }
        if(sb.length()==0){
            return "/";
        }else{
            return sb.toString();
        }
    }
}