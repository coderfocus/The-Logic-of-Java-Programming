package generic;

/**
 * 泛型类
 * @param <T>
 */
public class Pair<T> implements IPair<String>{
    T first;
    T second;

    public Pair(T first,T second){
        this.first = first;
        this.second = second;
    }

    public T getFirst(){
        return first;
    }

    public T getSecond(){
        return second;
    }

    @Override
    public void print(String obj) {
        System.out.println(obj);
    }
}
