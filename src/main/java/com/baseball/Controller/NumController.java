package com.baseball.Controller;

import java.util.*;

public class NumController {

    public List<Integer> getNum() {
        Random random = new Random();

        Set<Integer> set = new HashSet<Integer>();

        while (set.size() < 3) {
            set.add(random.nextInt(10));
        }

        return new ArrayList<Integer>(set);
    }

}
