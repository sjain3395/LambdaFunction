interface I{
int biggest(int i, int j);
}
public class BiggestLambda {
    public static void main(String[] args){
       I a =(i,j)-> i >j?i:j;
       System.out.println("Biggest :"+a.biggest(10 ,20));

    }
}
