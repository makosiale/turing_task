import java.util.Scanner;

public class Main1
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        int values = scanner.nextInt();
        do
        {
            System.out.println(str);
            values--;
        }
        while(values>0);
    }
}