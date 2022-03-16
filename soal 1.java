import java.util.Scanner;

class grade_3
{
    public static void main (String[] args)
    {
        Scanner enter = new Scanner(System.in);

        System.out.println (" look at this function >>> aX^3 + bX^2 + cX + d ");

        System.out.println ();
        System.out.println ();

        System.out.println (" input your valus for a , b , c , d ");
        

        System.out.println ();
        System.out.println ();
        System.out.print (" a = > ");
        int a = enter. nextInt();

        System.out.println ();
        System.out.println ();
        System.out.print (" b = > ");
        int b = enter. nextInt();

        System.out.println ();
        System.out.println ();
        System.out.print (" c = > ");
        int c = enter. nextInt();

        System.out.println ();
        System.out.println ();
        System.out.print (" d = > ");
        int d = enter. nextInt();

        System.out.println ();
        System.out.println ();
        System.out.println (" your first input is  >>> ");
        System.out.println ();
        System.out.println ();
        if (a!=0)
        {
            System.out.print (a+"X^3 ");
            System.out.print ("+ ");
        }
        if (b!=0)
        {
            
            System.out.print (b+"X^2 ");
            System.out.print ("+ ");
        }
        if (c!=0)
        {
            
            System.out.print (c+"X ");
            System.out.print ("+ ");
        }
        if (d!=0)
        {
            
            System.out.print (d);
        }

        System.out.println ();
        System.out.println ();
        System.out.println ("*******************************************");
        System.out.println ();
        System.out.println ();

        
        System.out.println (" input your next valeus for a , b , c , d ");
        

        System.out.println ();
        System.out.println ();
        System.out.print (" a = > ");
        int a2 = enter. nextInt();

        System.out.println ();
        System.out.println ();
        System.out.print (" b = > ");
        int b2 = enter. nextInt();

        System.out.println ();
        System.out.println ();
        System.out.print (" c = > ");
        int c2 = enter. nextInt();

        System.out.println ();
        System.out.println ();
        System.out.print (" d = > ");
        int d2 = enter. nextInt();

        System.out.println ();
        System.out.println ();
        System.out.println (" your second input is  >>> ");
        System.out.println ();
        System.out.println ();
        if (a2!=0)
        {
            System.out.print (a2+"X^3 ");
            System.out.print ("+ ");
        }
        if (b2!=0)
        {
            
            System.out.print (b2+"X^2 ");
            System.out.print ("+ ");
        }
        if (c2!=0)
        {
            
            System.out.print (c2+"X ");
        }
        if (d2!=0)
        {
            System.out.print ("+ ");
            System.out.print (d2);
        }

        System.out.println ();
        System.out.println ();
        System.out.println ("*******************************************");
        System.out.println ();
        System.out.println ();

        a = a + a2 ;
        b = b + b2 ;
        c = c + c2 ;
        d = d + d2 ;

        System.out.println ("addition of these two function is >>>>>>");
        System.out.println ();
        System.out.println ();


        if (a!=0)
        {
            System.out.print (a+"X^3 ");
            System.out.print ("+ ");
        }
        if (b!=0)
        {
            
            System.out.print (b+"X^2 ");
            System.out.print ("+ ");
        }
        if (c!=0)
        {
            
            System.out.print (c+"X ");
        }
        if (d!=0)
        {
            System.out.print ("+ ");
            System.out.println (d);
        }
        System.out.println ();
        System.out.println ();



        


    

    }
}