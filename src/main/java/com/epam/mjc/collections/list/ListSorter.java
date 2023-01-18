package com.epam.mjc.collections.list;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        Collections.sort(sourceList, new ListComparator());

    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int A, B;
        if (Integer.valueOf(a) < 0) {
            A = Integer.valueOf(a) * -1;
        }
        else {
            A = Integer.valueOf(a);
        }

        if (Integer.valueOf(b) < 0) {
            B = Integer.valueOf(b) * -1;
        }
        else {
            B = Integer.valueOf(b);
        }


        if (A == B) {
            if (Integer.valueOf(a) < Integer.valueOf(b)) {
                return -1;
            }
            else {
                return 0;
            }
        }
        else if (A > B) {
            return 1;
        }
        else {
            return -1;
        }
}
}
