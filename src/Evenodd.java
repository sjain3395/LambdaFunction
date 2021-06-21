interface B{
    boolean evenOrNot (int n);

}
public class Evenodd {
    public static void main(String[] args){
        B i = n-> n%2==0;
        System.out.println("Is 10 is Even ? :"+i.evenOrNot(10));
        System.out.println(" Is 5 is Even ? : "+i.evenOrNot(5));


    }
}
