import generic.DynamicArray;
import generic.NumberPair;
import generic.Pair;
import generic.UVPair;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        PackingClass.forExample();

        Pair<String> stringPair = new Pair<>("name","coderfocus");
        String key = stringPair.getFirst();
        String val  = stringPair.getSecond();

        Pair<Integer> integerPair = new Pair<>(1,100);
        int min = integerPair.getFirst();
        Integer max = integerPair.getSecond();

        UVPair<String,Integer> uvPair = new UVPair<>("age",18);
        String u = uvPair.getFirst();
        Integer v = uvPair.getSecond();
        UVPair<Integer,Integer> integerUVPair = UVPair.makePair(100,200);

        //参数类型限定-具体类
        NumberPair<Integer,Integer> numberPair = new NumberPair<Integer, Integer>(1,100);
        double sum = numberPair.sum();
        System.out.println(sum);

        //参数类型限定-接口
        Integer[] arr = {1,2,3,4,5};
        int arrMax = numberPair.max(arr);
        System.out.println(arrMax);

        //参数类型限定-其他类型
        DynamicArray<Number> numberDynamicArray = new DynamicArray<>();
        DynamicArray<Integer> integerDynamicArray = new DynamicArray<>();
        numberDynamicArray.addAll(integerDynamicArray);

//        不知道具体类型，如果允许写入，就无法保证类型安全
//        DynamicArray<? extends Number> dynamicArray = new DynamicArray<>();
//        dynamicArray.addAll(integerDynamicArray);

    }
}
