import java.util.Comparator;
import java.util.TreeSet;

class MyComparator implements Comparator<Employeedetails>{
    @Override
    public int compare(Employeedetails emp1, Employeedetails emp2) {
        int val = emp1.ename.compareTo(emp2.ename);
        return val;
    }
}
class Employeedetails{
    int eno;
    String ename;
    float esal;
    String eadd;

    public Employeedetails(int eno , String ename, float esal, String eadd){
        this.eno = eno;
        this.ename = ename;
        this.esal = esal;
        this.eadd = eadd;

    }
    public String toString(){
        return "["+eno+", "+ename+" , "+esal+", "+eadd+"]\n";
    }




}
public class Employee {
    public static void main(String[] args){
        Employeedetails emp1 = new Employeedetails(101 , "Anup", 5000,"Udaipur");
        Employeedetails emp2 = new Employeedetails(102 , "Ankit", 6000,"Jaipur");
        Employeedetails emp3 = new Employeedetails(103 , "Rahul", 7000,"Jodhpur");
        Employeedetails emp4 = new Employeedetails(104 , "Summit", 8000,"Neemuch");

        TreeSet<Employeedetails> ts = new TreeSet<Employeedetails>((e1,e2)->e1.ename.compareTo(e2.ename ));
        ts.add(emp1);
        ts.add(emp2);
        ts.add(emp3);
        ts.add(emp4);
        System.out.println(ts);


    }
}
