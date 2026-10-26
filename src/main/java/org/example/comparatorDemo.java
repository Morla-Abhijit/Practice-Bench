package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class comparatorDemo {

    public class myComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o1-o2;
        }
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12, 45, 2, 19, 8);

    }
}
