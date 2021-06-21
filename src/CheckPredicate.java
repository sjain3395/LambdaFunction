import java.util.function.Predicate;

public class CheckPredicate {
    public static void main(String[] args){
        Predicate<Integer> p1 = n -> n%2==0;
        Predicate<Integer> p2 = n -> n<=50;
//        Check whether a number is even number or not and less than 50 or not
        Predicate<Integer> p3 = p1.and(p2);
        System.out.println(p3.test(20));
        System.out.println(p3.test(25));
        System.out.println(p3.test(60));

        System.out.println();
//        Check Whether a number is even or not "OR" less than 50 or not
        Predicate<Integer> p4 = p1.or(p2);
        System.out.println(p4.test(20));
        System.out.println(p4.test(23));
        System.out.println(p4.test(60));

    }
}
