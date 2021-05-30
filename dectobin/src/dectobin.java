import java.util.*;

public class dectobin {
    
    
    public static void decimaltobinary(int dec) {


        // array to declare the size of the dec to bin conversion
        int arr [] = new int[8];
        int count = 0;

        while(dec > 0) {
            // assign the value at array index and increment the value of count
            arr[count++] = dec % 2;

            // divides the decimal by 2 
            dec = dec / 2;
        }
        for(int i = count - 1; i >= 0; i--) {
            
            System.out.print(arr[i]);
        }
            

    }

    public static void main(String[] args) throws Exception {
        int dec;
        
        System.out.print("Enter a non negative number up to 255: ");
        Scanner input = new Scanner (System.in);
        dec = input.nextInt();

        // checks for non negative number
        if (dec < 0) {
            System.out.println("enter a non negative number");
          }
      
        //   checks if number is greater than 256
          else if (dec > 256) {
            System.out.println("please enter a number smaller than 256");
          }
          
          // everything else
          else  {
            System.out.print("The binary representation for " + dec + " is ");
            decimaltobinary(dec);
          }
  
    }
}
