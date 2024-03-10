import java.util.Scanner;
public class Main {
    static void problem_A_Say_Hello(){
        String s="Hello,";
        String name;
        Scanner scan=new Scanner(System.in);
        name=scan.next();
        System.out.println(s+" "+name);
    }
    static void problem_B_Basic_Data_Types(){
        int a; long b;char c;float d;double e;
        Scanner scan=new Scanner(System.in);
        a=scan.nextInt();
        System.out.println(a);
        b=scan.nextLong();
        System.out.println(b);
        c=scan.next().charAt(0);
        System.out.println(c);
        d=scan.nextFloat();
        System.out.println(d);
        e=scan.nextDouble();
        System.out.printf("%.1f",e);


    }
    static void problem_C_Simple_Calculator(){
        long x,y;
        Scanner scan=new Scanner(System.in);
        x=scan.nextInt();
        y=scan.nextInt();
        long a=x+y;
        long b=x*y;
        long c=x-y; 
        System.out.println(x+" "+"+"+" "+y+" "+"= "+a);
        System.out.println(x+" "+"*"+" "+y+" "+"= "+b);
        System.out.println(x+" "+"-"+" "+y+" "+"= "+c);

    }
    public static void main(String[] args) {
//        problem_A_Say_Hello();
//        problem_B_Basic_Data_Types();
        problem_C_Simple_Calculator();
    }
}