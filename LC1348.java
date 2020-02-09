class TweetCounts {
    
    HashMap<String, List<Integer>> hm;
    
    public TweetCounts() {
        hm = new HashMap<>();
    }
    
    public void recordTweet(String tweetName, int time) {
        if (hm.containsKey(tweetName)){
            hm.get(tweetName).add(time);
        } else {
            List<Integer> arr = new ArrayList<>();
            arr.add(time);
            hm.put(tweetName, arr);
        }
    }
    
    public List<Integer> getTweetCountsPerFrequency(String freq, String tweetName, int startTime, int endTime) {
        List<Integer> arr = 
        Arrays.sort(arr, 0, size);
        int interval;
        if (freq.compareTo("minute") == 0)
            interval = 60;
        else if (freq.compareTo("hour") == 0)
            interval = 3600;
        else
            interval = 60*60*24;
        int i = 0;
        for (; arr[i] < startTime; i++);
        List<Integer> temp = new ArrayList<>();
        while (startTime <= endTime){
            int prev = i;
            for (; i < size && arr[i] < startTime + interval && arr[i] <= endTime; i++);
            if (i - prev == 0) temp.add(null);
            else temp.add(i - prev);
            startTime = startTime + interval;
        }
        return temp;
    }
}

/**
 * Your TweetCounts object will be instantiated and called as such:
 * TweetCounts obj = new TweetCounts();
 * obj.recordTweet(tweetName,time);
 * List<Integer> param_2 = obj.getTweetCountsPerFrequency(freq,tweetName,startTime,endTime);
 */