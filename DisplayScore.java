import java.util.Scanner;

public class DisplayScore
{
    public static void Display(String s, int p)
    {
        System.out.println(s+" has secured the position "+p+" on the high score table");
    }
    public static int position(int s)
    {
        if (s>1000)
            return 1;
        else if ( s>500)
            return 2;
        else
            return 3;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String n;
        do
            {
              System.out.println("Enter your name and score");
              n = sc.next();
              if (n.equals("bye") || n.equals("Bye"))
                  break;
              int s = sc.nextInt();
              Display(n, position(s));
        }while(n != "bye");
    }
}
