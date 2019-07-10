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
}
