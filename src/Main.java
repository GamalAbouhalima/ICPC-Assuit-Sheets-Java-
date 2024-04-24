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
    static void Problem_L_The_Brothers(){
        Scanner scan=new Scanner(System.in);
        String p1F=scan.next();
        String p1S=scan.next();

        String p2F=scan.next();
        String p2S=scan.next();

        if (p1S.equals(p2S)){
            System.out.println("ARE Brothers");
        }else {
            System.out.println("NOT");

        }    }
    static void Problem_M_Capital_or_Small_or_Digit(){
        Scanner scan=new Scanner(System.in);
        char letter=scan.next().charAt(0);
        int letter_num=letter;
//        System.out.println(letter_num);
        if(letter_num >= 65 && letter_num <= 122){
            System.out.println("ALPHA");
            if(letter_num >= 97 && letter_num <= 122){
                System.out.println("IS SMALL");
            } else if (letter_num >= 65 && letter_num <= 90) {
                System.out.println("IS CAPITAL");
            }
        }else {
            System.out.println("IS DIGIT");
        }

    }
    static void Problem_N_Char(){
        Scanner scan =new Scanner(System.in);
        char in=scan.next().charAt(0);
        int inNum=in;
        if (inNum >= 97 && inNum <= 122) { // Small letters
            int diff = inNum - 32;
            char outputSmall = (char) diff;
            System.out.println(outputSmall);

        } else if (inNum >= 65 && inNum <= 90) { // Capital Letters
            int diff = inNum + 32;
            char outputCapital = (char) diff;
            System.out.println(outputCapital);
        }


    }
    static void Problem_O_Calculator(){
        char op='+';
        int count =0;
        Scanner scan=new Scanner(System.in);
        String str=scan.next();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='+'){
                op=str.charAt(i);
                String num1=str.substring(0,i);
                int num1Int=Integer.parseInt(num1);

                String num2=str.substring(i+1,str.length());
                int num2Int=Integer.parseInt(num2);
                int res=num1Int+num2Int;
                System.out.println(res);



            }else if(str.charAt(i)=='-'){
                op=str.charAt(i);
                String num1=str.substring(0,i);
                int num1Int=Integer.parseInt(num1);

                String num2=str.substring(i+1,str.length());
                int num2Int=Integer.parseInt(num2);
                int res=num1Int-num2Int;
                System.out.println(res);
            }else if(str.charAt(i)=='*'){
                op=str.charAt(i);
                String num1=str.substring(0,i);
                int num1Int=Integer.parseInt(num1);

                String num2=str.substring(i+1,str.length());
                int num2Int=Integer.parseInt(num2);
                int res=num1Int*num2Int;
                System.out.println(res);
            }
            else if(str.charAt(i)=='/'){
                op=str.charAt(i);
                String num1=str.substring(0,i);
                int num1Int=Integer.parseInt(num1);

                String num2=str.substring(i+1,str.length());
                int num2Int=Integer.parseInt(num2);
                int res=num1Int/num2Int;
                System.out.println(res);

            }
        }


//        int num1=Integer.parseInt(arrOfStr[0]);
//        char operation=arrOfStr[1].charAt(0);
//        int num2=Integer.parseInt(arrOfStr[2]);
//        System.out.println(num1+"   "+operation+"   "+num2);
//
//
    }
    static void Problem_P_First_digit(){
        Scanner scan =new Scanner(System.in);
        String input=scan.next();
        char inputInt=input.charAt(0);
        // to get first digit
        int firstDigit=Character.getNumericValue(inputInt);
        if(firstDigit % 2 == 0){
            System.out.println("EVEN");
        }else
            System.out.println("ODD");


    }
    static void Problem_Q_Coordinates_of_a_Point(){
        Scanner scan=new Scanner(System.in);
        double x=scan.nextDouble();
        double y=scan.nextDouble();
        if(x>0 && y>0){
            System.out.println("Q1");
        }else if(x<0 && y>0){
            System.out.println("Q2");
        }else if(x<0 && y<0){
            System.out.println("Q3");
        }else if(x>0 && y<0){
            System.out.println("Q4");
        }else if(x==0 && y==0){
            System.out.println("Origem");
        }else if(x==0 && y!=0){
            System.out.println("Eixo Y");

        }else if (y==0 && x!=0){
            System.out.println("Eixo X");
        }
    }
    static void Problem_R_Age_in_Days(){
       Scanner scan =new Scanner(System.in);
       int numOfDays=scan.nextInt();
       int numOfYears=(int)numOfDays/365;
       System.out.println(numOfYears+" years");
       int daysOfYears=numOfYears*365;
       int remainingDays=numOfDays-daysOfYears;
       int numOfMonths=(int) remainingDays/30;
       System.out.println(numOfMonths+" months");
       int days=remainingDays-(numOfMonths*30);
        System.out.println(days+" days");
    }
    static void Problem_S_Interval(){
        /*
          The symbol '(' represents greater than.
          The symbol ')' represents smaller than.
          The symbol '[' represents greater than or equal.
          The symbol ']' represents smaller than or equal.
         */
        /*
        * [0,25]   0<=X<=25
        * (25,50]  25<X<=50
        * (50,75]  50<X<=75
        * (75,100]    75<X<=100
        */
        Scanner scan=new Scanner(System.in);
        float x=scan.nextFloat();
        if(x>=0 && x<=25){  // [0,25]   0<=X<=25
            System.out.println("Interval [0,25]");
        }else if(x>25 && x<=50){ //25<X<=50
            System.out.println("Interval (25,50]");
        }else if(x>50 && x<=75){// (50,75]  50<X<=75
            System.out.println("Interval (50,75]");
        }else if(x>75 && x<=100){ // (75,100]    75<X<=100
            System.out.println("Interval (75,100]");
        }else {
            System.out.println("Out of Intervals");
        }

    }
    static void Problem_T_Sort_Numbers(){
        Scanner scan =new Scanner(System.in);
        int num1=scan.nextInt();
        int num2=scan.nextInt();
        int num3=scan.nextInt();
        int max,min,middleNum;
        if(num1>=num2 && num1>=num3){
            max=num1;
            if(num2>=num3){
                middleNum=num2;
                min=num3;
            }else{
                middleNum=num3;
                min=num2;
            }
        }else if(num2>=num1 && num2>=num3){
            max=num2;
            if(num1>=num3){
                middleNum=num1;
                min=num3;
            }else{
                middleNum=num3;
                min=num1;
            }

        }else {
            max=num3;
            if(num1>=num2){
                middleNum=num1;
                min=num2;
            }else{
                middleNum=num2;
                min=num1;
            }
        }
        System.out.println(min);
        System.out.println(middleNum);
        System.out.println(max);
        System.out.println();
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);


    }
    static void Problem_U_Float_or_int(){
        Scanner scan=new Scanner(System.in);
        double input=scan.nextDouble();
        // to check if the number is integer
        if(input % 1 == 0){
            System.out.println("int "+(int)input);
        }else {
            double res=input % 1;//0.958
            input=input-res;// 534.958-0.958 = 534.0
            System.out.printf("float "+(int)input+" "+"%,.3f",res);//%,.3f--> to print only 3 digit after zero

        }

    }
    static void Problem_V_Comparison(){
        Scanner scan=new Scanner(System.in);
        int num1=scan.nextInt();
        char op=scan.next().charAt(0);
        int num2=scan.nextInt();
        switch (op){
            case '<':
                if(num1<num2){
                    System.out.println("Right");
                }else
                    System.out.println("Wrong");
                break;
            case '>':
                if(num1>num2){
                    System.out.println("Right");
                }else
                    System.out.println("Wrong");
                break;
            case '=':
                if(num1==num2){
                    System.out.println("Right");
                }else
                    System.out.println("Wrong");
                break;

        }

    }
    static void Problem_W_Mathematical_Expression() {
        boolean flag =false;
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        char s = scan.next().charAt(0); // +,-,*
        int num2 = scan.nextInt();
        char q = scan.next().charAt(0); // =
        int result=scan.nextInt();

        int res1 = num1 + num2;
        int res2 = num1 - num2;
        int res3 = num1 * num2;
        if(res1 == result && s=='+'){
            System.out.println("Yes");
        }else if(res1 != result&& s=='+'){
            System.out.println(res1);
        }
        else if(res2 == result && s=='-'){
            System.out.println("Yes");
        }else if(res2 != result&& s=='-'){
            System.out.println(res2);
        }
        else if(res3 == result && s=='*'){
            System.out.println("Yes");
        }
        else if(res3 != result&& s=='*'){
            System.out.println(res3);
        }

    }
    static void Problem_X_Two_intervals(){
        Scanner scan =new Scanner(System.in);
        int l1=scan.nextInt(); // 1
        int r1=scan.nextInt(); // 15
        int l2=scan.nextInt(); // 5
        int r2=scan.nextInt(); // 27
        int start,end;
        if((l1>l2 && l1>r2)||(r1<l2 && r1<r2)) {// no inter action
            System.out.println(-1);
        }else{
            if(l1>l2) {
                start = l1;
            }else { // (l2>l1)
                start=l2;
            }if (r1<r2){
                end=r1;
            }else { // (r1>r2)
                end=r2;
            }
            System.out.println(start+" "+end);
        }
    }
    static void Problem_Y_The_last_2_digits(){
        Scanner scan =new Scanner(System.in);
        int num1=scan.nextInt();
        int num2=scan.nextInt();
        int num3=scan.nextInt();
        int num4=scan.nextInt();

        int newNum1 = num1 % 100; //301 mod 100=1
        int newNum2 = num2 % 100; //302 mod 100=2
        int newNum3 = num3 % 100; //303 mod 100=3
        int newNum4 = num4 % 100; //30 mod 100=4
                //= 1     * 2     * 3     * 4
        int result=(newNum1*newNum2*newNum3*newNum4)%100;
        if(result<=9){
            System.out.println("0"+result);
        }else
            System.out.println(result);

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
//        problem_K_Max_and_Min();
//        Problem_L_The_Brothers();
//        Problem_M_Capital_or_Small_or_Digit();
//        Problem_N_Char();
//        Problem_O_Calculator();
//        Problem_P_First_digit();
//        Problem_Q_Coordinates_of_a_Point();
//        Problem_R_Age_in_Days();
//        Problem_S_Interval();
//        Problem_T_Sort_Numbers();
//        Problem_U_Float_or_int();
//        Problem_V_Comparison();
//        Problem_W_Mathematical_Expression();
//        Problem_X_Two_intervals();
        Problem_Y_The_last_2_digits();
    }

}