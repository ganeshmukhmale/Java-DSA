import java.util.*;
class Bubble_Sort
{
    public static void PrintArray(int arr[])
    {
        System.out.print("Sorted array is: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the array Size:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.print("Insert "+size+" Element: ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        // Bubbole sort
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-i-1;j++){
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        PrintArray(arr);
    }
}