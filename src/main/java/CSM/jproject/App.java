package CSM.jproject;

/**
 * Hello world!
 *
 */
import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.print("Enter your name: ");
    	String name=sc.next();
        System.out.println( "Hello World! " +name);
        sc.close();
    }
}
