package demo04.Supplier;

import java.util.function.Supplier;

public class Demo02Test {
    public static int getMax(Supplier<Integer> sup ){
        return sup.get();
    }

    public static void main(String[] args) {
        int[] arr = {100, 0, -50, 88,99,};
        int maxValue=getMax(()->{
            int max= arr[0];
            for (int i : arr) {
                if(i>max){
                    max=i;


                }
            }
            return max;



        });
        System.out.println("数组的最大值是："+maxValue);
    }
}
