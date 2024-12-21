package graph;

import java.util.*;

public class GetWatchedVideoByFriends {

    public static void main(String[] args) {

    }
    class Pair implements Comparable<Pair> {
        String video;
        int freq;
        Pair(String video, int freq){
            this.video = video;
            this.freq = freq;
        }

        @Override
        public int compareTo(Pair that) {
            if(this.freq == that.freq){
             return this.video.compareTo(that.video);
            }
            return this.freq-that.freq;
        }
    }
    public List<String> watchedVideosByFriends(List<List<String>> watchedVideos,int[][] friends,int id,int level) {
        Queue<Integer> queue = new LinkedList<Integer>();
        HashSet<Integer> visited = new HashSet<>();
        queue.add(id);
        visited.add(id);
        int currLevel = 0;
        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                int curId = queue.poll();
                for (int friend : friends[curId]) {
                    if(!visited.contains(friend)) {
                        queue.add(friend);
                        visited.add(friend);
                    }
                }
            }
            currLevel++;
            if(currLevel == level) {
                break;
            }
        }
        HashMap<String,Integer> freqMap = new HashMap<>();
        while(!queue.isEmpty()) {
            int curId = queue.poll();
            for (String video : watchedVideos.get(curId)) {
                freqMap.put(video, freqMap.getOrDefault(video, 0) + 1);
            }
        }
        List<Pair> videoList = new ArrayList<>();
        for (String video : freqMap.keySet()) {
            videoList.add(new Pair(video, freqMap.get(video)));

        }
        Collections.sort(videoList);
        List<String> res = new ArrayList<>();
        for (Pair pair : videoList) {
            res.add(pair.video);
        }
        return res;
    }
}
