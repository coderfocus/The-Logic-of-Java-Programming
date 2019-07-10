import generic.NumberPair;
import generic.Pair;
import generic.UVPair;

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

        NumberPair<Integer,Integer> numberPair = new NumberPair<Integer, Integer>(1,100);
        double sum = numberPair.sum();
        System.out.println(sum);


    }
}
