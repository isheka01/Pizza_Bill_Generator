package pizza;

import java.util.Scanner;
import java.lang.String;

public class pizza
{
    static String x,y,u,k,p,z,f,n;
    static int d,l,i;
    public static void menu()
    {

        System.out.println("Pizza options:");

        System.out.println("1) Normal: ");
        System.out.println("Classic hand tossed thin crust pizza's");
        System.out.println("vegetarian");
        System.out.println("\t Tomato,Capsicum,onions and corns");
        System.out.println("Non-Vegetarian");
        System.out.println("\tGrilled Chicken Rashers,Peri-peri Chicken");

        System.out.println("2) Delux");
        System.out.println("Classic hand tossed Cheese Burst pizza's");
        System.out.println("vegetarian: ");
        System.out.println("\t Crunchy Onions,crispy capsicum,juicy tomatoes");
        System.out.println("Non-Vegetarian: ");
        System.out.println("\t The wholesome flavor of tandoori masala with chicken tikka,pepper bbq");
        System.out.println("Enter your choice [normal/delux]");
        Scanner sc=new Scanner(System.in);
        //String x;
        x=sc.next();
    }
    public static void choice()
    {
        System.out.println("Select: \n a.Vegetarian\n b.Non-vegetarian\n");
        Scanner o=new Scanner(System.in);
        System.out.println(" your choice [a/b]");
        //String y;
        y=o.next();


    }
    public static void addons()
    {
        System.out.println("do you want extra cheese? [yes/no]");

        Scanner g = new Scanner(System.in);
        //String u;
        u = g.next();
        if (u.contains("yes")) {
            System.out.println("Cheese added");
        }
        System.out.println("do you want extra toppings? [yes/no]");
        Scanner s = new Scanner(System.in);
        //String k;
        k = s.next();
        if (k.contains("yes")) {
            System.out.println("extra toppings added");

        }
        System.out.println("do you want water bottle? [yes/no]");
        Scanner v = new Scanner(System.in);
        //String p;

        p = v.next();
        if (p.contains("yes")) {
            System.out.println("how many no.of bottles u want");
            Scanner b = new Scanner(System.in);
            //int d;
            d = b.nextInt();
        }
        System.out.println("Do you want ketchup? [yes/no]");
        Scanner c = new Scanner(System.in);
        //String z;
        z = c.next();
        if (z.contains("yes"))
        {
            System.out.println("How many packets you want");
            Scanner j=new Scanner(System.in);
            //int l;
            l=j.nextInt();


        }
        System.out.println("do you want soft drinks? [yes/no]");
        Scanner e = new Scanner(System.in);
        //String f;

        f= e.next();
        if (f.contains("yes")) {
            System.out.println("how many no.of bottles u want");
            Scanner h = new Scanner(System.in);
            // int i;
            i= h.nextInt();
        }
        System.out.println("do you want take away[yes/no]");
        Scanner m=new Scanner(System.in);
        // String n;
        n=m.next();
        if(n.contains("yes"))
        {
            System.out.println("Takeaway accepted");

        }




    }
    public static void bill()
    {
        int price,ec,et,wb,ek,sd,bc;
        int sum=0;
        double gst,total;
        wb=d*20;
        ek=l*5;
        sd=i*75;
        System.out.println("******* BILL COPY ******* ");
        if(x.equals("normal"))
        {
            price=400;
            System.out.println("Base pizza prize:\t"+price);
        }
        else {
            price=600;
            System.out.println("Base pizza prize:\t"+price);
        }
        if(u.equals("yes"))
        {
            ec=100;
            System.out.println("Extra cheese charges:\t"+ec);
        }
        else{
            ec=0;

        }
        if(k.equals("yes"))
        {
            et=100;
            System.out.println("Extra toppings charges:\t"+et);
        }
        else{
            et=0;
        }
        if(p.equals("yes"))
        {
            System.out.println("Extra waterBottle charges:\t"+wb);
        }
        if(z.equals("yes"))
        {
            System.out.println("Extra ketchup charges:\t"+ek);
        }
        if(f.equals("yes"))
        {
            System.out.println("soft drink  charges:\t"+sd);
        }
        if(n.equals("yes")){
            bc=20;
            System.out.println("Extra Bag Charges For Takeaway:\t"+bc);
        }
        else{
            bc=0;
        }
        sum=price+ec+et+wb+ek+sd+bc;
        gst=sum*0.18;
        total=sum+gst;
        System.out.println("*****************");
        System.out.println("Bill Amount Has Come To:\n"+sum);
        System.out.println("Adding The Tax Amount:\n"+gst);
        System.out.println("*****************");
        System.out.println("Net Amount Payable:\n"+total);
        System.out.println("*****************");
        System.out.println("THANKYOU VISIT AGAIN");


    }

}