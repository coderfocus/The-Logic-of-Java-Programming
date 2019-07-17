package generic;

public class UVPair<U,V> {
    U first;
    V second;
    public UVPair(U first,V second){
        this.first = first;
        this.second = second;
    }

    public U getFirst(){
        return first;
    }

    public V getSecond(){
        return second;
    }

    /**
     * 泛型方法
     */
    public static <T,H> UVPair<T,H> makePair(T first,H second){
        UVPair<T,H> pair = new UVPair<>(first,second);
        return pair;
    }
}
