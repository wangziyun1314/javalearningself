package Demo02.Stream;

import java.util.*;
import java.util.stream.Stream;

public class Demo02GetStream {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Stream<String> stream1 = list.stream();

        HashSet<String> set = new HashSet<>();
        Stream<String> stream2 = set.stream();

        HashMap<String, String> map = new HashMap<>();
        Set<String> keySet = map.keySet();
        Stream<String> steam3 = keySet.stream();

        Set<Map.Entry<String, String>> entries = map.entrySet();
        Stream<Map.Entry<String, String>> stream4 = entries.stream();

        Stream<Integer> stream5 = Stream.of(1, 2, 3, 4, 5, 6);
        Integer[] arr ={1,2,3,4,5};
        Stream<Integer> stream6 = Stream.of(arr);
        String[] arr2={"a","bb","cccc"};
        Stream<String> stream8 = Stream.of(arr2);
        


    }
}
