package generic;

/**
 * 类型参数的限定
 * 上界为某个具体类
 * @param <U>
 * @param <V>
 */
public class NumberPair<U extends Number,V extends Number> extends UVPair<U,V> {
    public NumberPair(U first, V second) {
        super(first, second);
    }

    public double sum(){
        return first.doubleValue() + second.doubleValue();
    }

    /**
     * 类型参数限定
     * 上界为某个接口
     * @param arr
     * @param <T>
     * @return
     */
    public <T extends Comparable<T>> T max(T[] arr){
        T max = arr[0];
        for (int i=1;i<arr.length;i++){
            if(arr[i].compareTo(max)>0){
                max = arr[i];
            }
        }
        return max;
    }
}
