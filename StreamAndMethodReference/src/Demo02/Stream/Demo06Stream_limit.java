package Demo02.Stream;

import java.util.stream.Stream;

public class Demo06Stream_limit {
    public static void main(String[] args) {
        String[] arr = {"喜羊羊","美羊羊","懒洋洋","灰太狼"} ;
        Stream<String> stream1 = Stream.of(arr);
        Stream<String> stream2 = stream1.limit(3);
        stream2.forEach(name-> System.out.println(name));
    }
}
