interface A{
    int sq(int n);
}
public class Test {
    public static void main(String[] args){
        A i = n-> n*n;
        System.out.println(i.sq(5));

    }
}
