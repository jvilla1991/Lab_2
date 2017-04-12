import java.util.Scanner;

public class Main {

    public static void ReturnStatements(int i, String name)
    {
        if (i % 2 != 0)
        {
            System.out.println(name + ", " + i + " is an odd number");
        }
        else if ((i % 2 == 0) && (i < 26) && (i > 1))
        {
            System.out.println(name + ", this is even and less than 25");
        }
        else if ((i % 2 == 0) && (i > 25) && (i < 61))
        {
            System.out.println(i + " Even, " + name);
        }
        else if (i % 2 != 0 && i > 60)
        {
            System.out.println("Odd and over 60");
        }

    }



    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        int i = 0;
        String name = "";
        boolean flag = true;
        String t = " ";

        System.out.println("What is your name?");
        name = scnr.nextLine();
        System.out.println("Hi, " + name +", please enter an integer between 1 and 100: ");
        i = scnr.nextInt();

        while (i < 1 || i > 100)
        {
            System.out.println("Try again, " + name + ". Enter and integer between 1 and 100: ");
            i = scnr.nextInt();
        }

        do {
            ReturnStatements(i, name);
            scnr.nextLine();
            System.out.println("Would you like to test another int? (y/n)?");
            t = scnr.nextLine();
            if ("n".equalsIgnoreCase(t))
            {
                flag = false;
            }
            else if ("y".equalsIgnoreCase(t))
            {
                System.out.println("Please give another integer: ");
                i = scnr.nextInt();
            }

        } while (flag == true);

        return;



    }
}
