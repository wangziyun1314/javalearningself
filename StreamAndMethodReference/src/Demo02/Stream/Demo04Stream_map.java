package Demo02.Stream;

import java.util.stream.Stream;

public class Demo04Stream_map {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("1", "2", "3", "4");
        Stream<Integer> stream2 = stream1.map((String s) -> {
            return Integer.parseInt(s);
        });
        stream2.forEach(i-> System.out.println(i));

    }
}
