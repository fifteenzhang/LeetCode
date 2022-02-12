package com.neil.javaleetcode.q1200_1299.q1244_design_a_leaderboard;

import java.util.*;



class design_a_leaderboard {
    private Map<Integer, Integer> playerScores;

    public design_a_leaderboard() {
        playerScores = new HashMap<>();
    }
    
    public void addScore(int playerId, int score) {
        playerScores.put(playerId, playerScores.getOrDefault(playerId, 0) + score);
    }
    
    public int top(int K) {
        List<Integer> scores = new ArrayList<>(playerScores.values());
        Collections.sort(scores, Collections.reverseOrder());
        int res = 0;
        for (int i = 0; i < K; ++i) {
            res += scores.get(i);
        }
        return res;
    }
    
    public void reset(int playerId) {
        playerScores.put(playerId, 0);
    }
}

/**
 * Your Leaderboard object will be instantiated and called as such:
 * Leaderboard obj = new Leaderboard();
 * obj.addScore(playerId,score);
 * int param_2 = obj.top(K);
 * obj.reset(playerId);
 */
