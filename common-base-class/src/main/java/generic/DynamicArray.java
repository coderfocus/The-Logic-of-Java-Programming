package generic;

public class DynamicArray<E> {

    /**
     * 参数类型限定
     * 上界为其他类型
     * @param c
     * @param <T>
     */
//    public <T extends E> void addAll(DynamicArray<T> c){
//
//    }

    /**
     * 通配符
     * @param c
     */
    public void addAll(DynamicArray<? extends E> c){

    }
}
