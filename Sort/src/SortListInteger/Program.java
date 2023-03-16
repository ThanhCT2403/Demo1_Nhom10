package SortListInteger;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 2, 7, 1, 3);
        System.out.println("Input: "+list);

        Collections.sort(list);
        System.out.println("Sort: "+list);

        Collections.sort(list,Collections.reverseOrder());
        System.out.println("Decending sort: "+list);
    }
}
