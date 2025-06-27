class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<Integer>[] adj= new List[numCourses];
        int incomp[] = new int[numCourses];
    
        for(int[] i: prerequisites){
            int course= i[0];
            int prereq= i[1];
            if(adj[prereq]==null){
                adj[prereq]= new ArrayList<>();
            }
            adj[prereq].add(course);
            incomp[course]++;
        }
        Queue<Integer> q= new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(incomp[i]==0){
                q.offer(i);
            }
        }
        int[] res= new int[numCourses];
        int index=0;
        while(!q.isEmpty()){
            int compcou=q.poll();
            res[index++]=compcou;
            if(adj[compcou]!=null){
                for(int neigh: adj[compcou]){
                    incomp[neigh]--;
                    if(incomp[neigh]==0){
                        q.offer(neigh);
                    }
                }
            }
        }
        if(index==numCourses) return res;
        else return new int[0];
    }
}