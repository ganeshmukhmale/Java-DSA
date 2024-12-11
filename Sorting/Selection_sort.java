import java.util.*;
public class Selection_sort {
    public static void Printarray(int arr[]){
        System.out.println("After Sorted: ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
        }   
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int size=sc.nextInt();

        int arr[]=new int[size];
        System.out.print("Insert array Element: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        // Selection Sourt.
        for(int i=0;i<arr.length-1;i++){
            int small=i;
            for(int j=0;j<arr.length;j++){
                if(arr[small]>arr[j])
                {
                    small=j;
                }
            }
            int temp=arr[small];
            arr[small]=arr[i];
            arr[i]=temp;
        }
        Printarray(arr);
    }
}
