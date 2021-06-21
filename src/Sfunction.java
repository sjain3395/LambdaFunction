import java.util.function.Function;

public class Sfunction {
    public static void main(String[] args){
        Function<String, String> f = str -> str+"@gmail.com";
        System.out.println(f.apply("sjain3395"));
        System.out.println(f.apply("rjain"));
        System.out.println(".................");

        Function<Integer , Integer> f1 =  n -> n*n;
        System.out.println(f1.apply(6));
        System.out.println(f1.apply(5));
        System.out.println(".............");



    }
}
