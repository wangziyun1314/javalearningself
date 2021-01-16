package Demo02.Stream;

import java.util.stream.Stream;

public class Demo03Stream_filter {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("张三丰", "张翠山", "赵敏", "周芷若", "张无忌");
        Stream<String> stream2 = stream1.filter((String name) -> {
            return name.startsWith("张");
        });
        stream2.forEach(name-> System.out.println(name));

    }
}
