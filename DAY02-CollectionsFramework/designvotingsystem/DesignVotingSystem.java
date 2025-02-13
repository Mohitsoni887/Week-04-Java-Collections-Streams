/*
Design a Voting System
Description: Design a system where:
Votes are stored in a HashMap (Candidate -> Votes).
TreeMap is used to display the results in sorted order.
LinkedHashMap is used to maintain the order of votes.
*/
package com.designvotingsystem;
import java.util.*;

class VotingSystem {
    private final Map<String, Integer> voteMap = new HashMap<>();
    private final Map<String, Integer> voteLinkedMap = new LinkedHashMap<>();
    private final TreeMap<String, Integer> voteTreeMap = new TreeMap<>();

    // Cast a vote for a candidate
    public void castVote(String candidate) {
        voteMap.put(candidate, voteMap.getOrDefault(candidate, 0) + 1);
        voteLinkedMap.put(candidate, voteLinkedMap.getOrDefault(candidate, 0) + 1);
        voteTreeMap.put(candidate, voteTreeMap.getOrDefault(candidate, 0) + 1);
    }

    // Get votes in insertion order (LinkedHashMap)
    public Map<String, Integer> getVotesInOrder() {
        return new LinkedHashMap<>(voteLinkedMap);
    }

    // Get votes in sorted order (TreeMap)
    public Map<String, Integer> getVotesSorted() {
        return new TreeMap<>(voteTreeMap);
    }

    // Get votes sorted by highest count (Descending order)
    public Map<String, Integer> getVotesByCount() {
        List<Map.Entry<String, Integer>> list = new ArrayList<>(voteMap.entrySet());
        list.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        Map<String, Integer> sortedByVotes = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedByVotes.put(entry.getKey(), entry.getValue());
        }
        return sortedByVotes;
    }
}

public class DesignVotingSystem {
    public static void main(String[] args) {
        VotingSystem system = new VotingSystem();

        system.castVote("Alice");
        system.castVote("Bob");
        system.castVote("Alice");
        system.castVote("Charlie");
        system.castVote("Bob");
        system.castVote("Alice");

        System.out.println("Votes in insertion order:");
        System.out.println(system.getVotesInOrder());

        System.out.println("\nVotes in sorted order:");
        System.out.println(system.getVotesSorted());

        System.out.println("\nVotes sorted by highest count:");
        System.out.println(system.getVotesByCount());
    }
}

