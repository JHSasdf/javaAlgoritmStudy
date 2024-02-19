package _07_generic;

import java.util.ArrayList;

public class PairRunner {
    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("One", 1);
        Pair<Integer, String> pair2 = new Pair<>(2, "Two");
        ArrayList<Pair> pairArrayList = new ArrayList<>();
        pairArrayList.add(pair1);
        pairArrayList.add(pair2);
        for(Pair pair: pairArrayList) {
            System.out.println("Key: " + pair.getKey() + ", Value: " + pair.getValue());
        }
    }
}
