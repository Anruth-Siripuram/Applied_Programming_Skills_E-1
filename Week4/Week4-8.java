class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq=new int[26];
        for(char c:tasks){
            freq[c-'A']++;
        }
        Arrays.sort(freq);
        int maxfreq=freq[25];
        int count=1;
        for(int i=24;i>=0;i--){
            if(freq[i]==maxfreq){
                count++;
            }
        }
        int task=(maxfreq-1)*(n+1)+count;
        return Math.max(tasks.length,task);
    }
}
