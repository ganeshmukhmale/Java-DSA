// Write a program to 4x4 Hollow_Rectangle Pattern

package Pattern;

public class Hollow_Rectangle {
    public static void main(String[] args) {
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=4;j++)
            {
                if(i==1||j==1 || i==4||j==4)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}