import java.util.Scanner;

public class Main2
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int amount = scanner.nextInt();
        int litres = scanner.nextInt();
        if (litres<0 || amount<0)
        {
            System.out.println("Введены некорректные данные");
            return;
        }
        int amountOfLitres=0;
        for (int i = 0 ; i < 16; i++)
        {
            amountOfLitres+=litres*amount;
            System.out.println("К " + i + " неделе будет выпито " + amountOfLitres +
                    " литров жидкости");
        }

        if (amountOfLitres>=120)
            System.out.println("Студент принят в IT-Клуб");
        else
            System.out.println("К сожалению, студент не принят в клуб");
        return;
    }
}
