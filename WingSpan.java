
import java.util.Scanner;
public class WingSpan{
    public static void main(String [] args){
        int cWingSpan, mWingSpan, modWingSpan;
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter your arm span in centimeters: ");
        cWingSpan = userInput.nextInt();
        mWingSpan = cWingSpan / 100;
        modWingSpan = cWingSpan % 100;
        System.out.println();
        System.out.println("You're arm span is "+mWingSpan+" meter(s) and "+modWingSpan+" centimeters!");
    }
    
}
