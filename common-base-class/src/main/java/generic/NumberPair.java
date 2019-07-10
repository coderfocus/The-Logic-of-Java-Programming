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
}
