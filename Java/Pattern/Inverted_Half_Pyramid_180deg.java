// Write a program to Inverted_Half_Pyramid (Roted by 180 degree) 
/*
          *
        * *
      * * *
    * * * *  
 
*/


package Pattern;

public class Inverted_Half_Pyramid_180deg {
    public static void main(String G [])
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

