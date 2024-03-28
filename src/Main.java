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
    static void problem_D_Difference(){
        long a,b,c,d;
        Scanner scan=new Scanner(System.in);
        a=scan.nextLong();
        b=scan.nextLong();
        c=scan.nextLong();
        d=scan.nextLong();
        long x=(a*b)-(c*d);
        System.out.println("Difference "+"= "+x);
    }
    static void problem_E_Area_of_a_Circle(){
        Scanner scan=new Scanner(System.in);
        double radius;
        radius=scan.nextFloat();
        double pi=3.141592653;
        double area=pi*Math.pow(radius,2);
        System.out.printf("%.9f",area);

    }
    static void problem_F_Digits_Summation(){
        Scanner scan=new Scanner(System.in);
        long n,m;
        n=scan.nextLong();
        m=scan.nextLong();
        long last_n=n%10;
        long last_m=m%10;
        long sum=last_n+last_m;
        System.out.println(sum);


    }
    static void problem_G_Summation_from_1_to_N(){
        long n;
        long sum=0L;
        Scanner scan =new Scanner(System.in);
        n=scan.nextLong();
        long x=n*(n+1)/2;
        System.out.println(x);

    }
    static void problem_H_Two_numbers(){
        double a,b;
        Scanner scan =new Scanner(System.in);
        a=scan.nextDouble();
        b=scan.nextDouble();
        double c = a/b;
        // function to get floor
        double d2=Math.floor(c);
        // convert from double to int
        int value1 = (int)d2;

        // function to get ceil
        double d3=Math.ceil(c);
        // convert from double to int
        int value2 = (int)d3;

        // function to get round
        double d4=Math.round(c);
        // convert from double to int
        int value3 = (int)d4;

        System.out.println("floor "+(int)a+" "+"/"+" "+(int)b+" "+"= "+value1);
        System.out.println("ceil "+(int)a+" "+"/"+" "+(int)b+" "+"= "+value2);
        System.out.println("round "+(int)a+" "+"/"+" "+(int)b+" "+"= "+value3);


    }
    static void problem_I_Welcome_for_you_with_Conditions(){
        int a,b;
        Scanner scan =new Scanner(System.in);
        a=scan.nextInt();
        b=scan.nextInt();
        if(a>=b){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
    static void problem_J_Multiples(){
        int a,b;
        Scanner scan =new Scanner(System.in);
        a=scan.nextInt();
        b=scan.nextInt();
        if(a%b==0 || b%a==0){
            System.out.println("Multiples");
        }else{
            System.out.println("No Multiples");
        }
    }
    static void problem_K_Max_and_Min(){
        Scanner scan=new Scanner(System.in);
        int num1=scan.nextInt();
        int num2=scan.nextInt();
        int num3=scan.nextInt();
        int max=Math.max(num1,Math.max(num2,num3));
        int min=Math.min(num1,Math.min(num2,num3));
        System.out.println(min+" "+max);
    }
    public static void main(String[] args) {
//        problem_A_Say_Hello();
//        problem_B_Basic_Data_Types();
//        problem_C_Simple_Calculator();
//        problem_D_Difference();
//        problem_E_Area_of_a_Circle();
//        problem_F_Digits_Summation();
//        problem_G_Summation_from_1_to_N();
//        problem_H_Two_numbers();
//        problem_I_Welcome_for_you_with_Conditions();
//        problem_J_Multiples();
        problem_K_Max_and_Min();

    }
}