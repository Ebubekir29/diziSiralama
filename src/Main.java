import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("dizinin boyutunu giriniz : ");
        int size=scan.nextInt();
        System.out.println("dizinin elemanlarini giriniz : ");
        int[] arr=new int[size];
        for (int i=0; i<arr.length; i++)
        {
            arr[i]=scan.nextInt();
        }
        Arrays.sort(arr);
        System.out.print(Arrays.toString(arr));
    }
}