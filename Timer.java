import static print.SystemOutPrint.sop;
import java.util.Scanner;
/**
 * Write a description of class Timer here.
 * 
 * Matthew Treece 
 * @version (a version number or a date)
 */
public class Timer
{
    public static void main (String[] args)
    {
        int time;
        Scanner scan = new Scanner(System.in);
        sop ("How long of a timer do you want?");
        time = scan.nextInt();
        sop("\n\n\n");
        for (int i = time; i >= 1; i--)
        {
            sop(i);
            try {
                Thread.sleep(1000); //1000 milliseconds is one second.
            } catch(InterruptedException ex){} 
            sop("\n\n\n");
        }
        sop("Time's up!");
    }
}
