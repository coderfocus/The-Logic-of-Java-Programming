import generic.Pair;

public class Main {
    public static void main(String[] args){
        PackingClass.forExample();

        Pair<String> stringPair = new Pair<>("name","coderfocus");
        String key = stringPair.getFirst();
        String val  = stringPair.getSecond();

        Pair<Integer> integerPair = new Pair<>(1,100);
        int min = integerPair.getFirst();
        Integer max = integerPair.getSecond();
    }
}
