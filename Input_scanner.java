//Input and access array elements
import java.util.Scanner;//Program uses Scanner class
public class Input_scanner
 {
public static void main(String []arg)
{
    int[] numArray=new int[5];
    int i;
    //Create Scanner object to obtain input from keyboard
    Scanner input =new Scanner(System.in);
    System.out.println("Enter the array elements -->");
    for(i=0;i<5;i++)
    {
        numArray[i]=input.nextInt();//Read Number
    }
    for(i=0;i<5;i++)
    {
        System.out.println("Array element ["+i+"]="+numArray[i]);
    }
}    
}
