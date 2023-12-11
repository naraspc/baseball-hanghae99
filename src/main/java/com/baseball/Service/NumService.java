package com.baseball.Service;

import java.util.*;

public class NumService {

    public List<Integer> getNum() {
        Random random = new Random();

        Set<Integer> set = new HashSet<Integer>();

        while (set.size() < 3) {
            set.add(random.nextInt(10));
        }

        return new ArrayList<Integer>(set);
    }

}
