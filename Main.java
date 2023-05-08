import javax.jws.soap.SOAPBinding;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
//        //-----------------------------------
//        HelloPrint();
//        //-------------------------------------
//        System.out.println(" Please Enter Two Strings: ");
//      String S1= scanner.nextLine();
//        String S2= scanner.nextLine();
//            TwoString(S1,S2);
        //--------------------------
       System.out.println("Enter 3 Numbers To Compare Them: ");
       try {
           int n1=scanner.nextInt();
           int n2=scanner.nextInt();
           int n3=scanner.nextInt();
           Compare(n1,n2,n3);
       }
       catch (InputMismatchException E)
       {
           System.out.println("Wrong input, numbers only");
       }

        //------------------------------
        System.out.println("Enter 3 Numbers To Get There AVG + SUM: ");
       try {
           int vn1=scanner.nextInt();
           int vn2=scanner.nextInt();
           int vn3=scanner.nextInt();
           SumAvg(vn1,vn2,vn3);
       }
       catch (InputMismatchException E1)
       {
           System.out.println("Wrong input. numbers only");
       }

        //-------------------------------
        System.out.println("Enter 2 Numbers To Do An Operations: ");
        try {
            int o1=scanner.nextInt();
            int o2=scanner.nextInt();
            operations(o1,o2);
        }
        catch (InputMismatchException E3)
        {
            System.out.println("Wrong input, numbers only");
        }


        //------------------------------------------
        System.out.println("Enter the string you want to count vowels in: ");
        try{
        scanner.nextLine();
        String str = scanner.nextLine();
        vowels(str);
        }
        catch(InputMismatchException E5)
         {
             System.out.println(E5.getMessage());
         }
        //------------------------------------------
        System.out.println("Enter the string you want to Split (put spaces between letters): ");
        try {
            String spltstr = scanner.nextLine();
            splitStr(spltstr);

        } catch (InputMismatchException E6)
        {
            System.out.println(E6.getMessage());
        }


    }

    public static void HelloPrint(){
        System.out.println("Hello World");
        // no try catch needed
    }

    public static void TwoString(String S1, String S2){
        System.out.println(S1+" "+S2);
    }
    //---------------------------------


    public static void Compare (int n1, int n2, int n3){
        int compare1= Math.max(n1,n2);
        int compare2= Math.max(compare1,n3);
        System.out.println("The Greatest Number IS: "+ compare2);



    }

    public static void SumAvg(int vn1, int vn2, int vn3)
    {

        int sum=vn1+vn2+vn3;
        int avg = sum/3;
        System.out.println("The Sum is : "+ sum + "\nThe Avg Is: "+ avg);


    }

    public static void operations(int o1, int o2) {
        Scanner scanner = new Scanner(System.in);
        int sum = o1 + o2;
        int avg = sum / 2;
        int mult = o1 * o2;
        int divide = o1 / o2;
        int power = o1 ^ o2;
        System.out.println("Select The Operation You Want");
        System.out.println("(1): Sum\n(2): AVG\n(3): Multiply\n(4): Divide\n(5): Power");

        int op = scanner.nextInt();

            switch (op) {

                case 1:
                    System.out.println("The Sum Result is: " + sum);
                    break;


                case 2:
                    System.out.println("The Avg Result is: " + avg);
                    break;


                case 3:
                    System.out.println("The Multiply Result is: " + mult);
                    break;


                case 4:

                    System.out.println("The Divide Result is: " + divide);
                    break;

                case 5:
                    System.out.println("The Power Result is: " + power);
                    break;

                default:
                    System.out.println(" Wrong choice");

            }


    }




    public static void vowels(String str)

    {
        int count=0;
        for (int i=0; i<str.length(); i++)
        {
            char ch=str.charAt(i);
            if(ch=='i'|| ch=='o'||ch=='a'||ch=='e'||ch=='u')
            {
                count++;
            }
        }
        System.out.println("Number of vowels in your String is "+count);
    }

    public static void splitStr(String spltstr)
    {

        String[] arr = spltstr.split(" ", 0);

        for (String x : arr)
            System.out.println(x);
    }

}
