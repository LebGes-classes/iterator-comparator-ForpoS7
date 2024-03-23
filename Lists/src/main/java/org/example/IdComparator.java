package org.example;

import java.util.Comparator;

public class IdComparator implements Comparator<Storage> {
    @Override
    public int compare(Storage o1, Storage o2) {
        return o1.getId() - o2.getId();
    }
}
