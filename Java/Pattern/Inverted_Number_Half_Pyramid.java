// Write a program to Inverted_Half_Pyramid 
/*

    1 2 3 4
    1 2 3
    1 2 
    1 
 
*/

package Pattern;

public class Inverted_Number_Half_Pyramid {
    public static void main(String[] args) {
        for(int i=5;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
