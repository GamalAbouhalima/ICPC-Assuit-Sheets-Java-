Sheet #1 (Data type - Conditions)
ICPC Assiut Sheets (Java)
A problem is a function. If you want this problem to work, remove the comment. 
Example:- 
import java.util.Scanner;
public class Main {
    static void problem_A_Say_Hello(){
        String s="Hello,";
        String name;
        Scanner scan=new Scanner(System.in);
        name=scan.next();
        System.out.println(s+" "+name);
    }
    public static void main(String[] args) {
            problem_A_Say_Hello(); remove the comment "//" ---------> It's working.
      //    problem_B_Basic_Data_Types(); ---------> It's not working.
}
}

