import java.util.Scanner;
public class Grades
{
    public static void main(String[] args)
    {
        String[] guests = {"Paul", "Wendy", "Jared", "Eric", "Ayame", "Ian", "Isobel", "Hakem"};

        String name;
        boolean found = false;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a name: ");
        name = scan.nextLine();

        //Perform a linear search
        for (String guest : guests)
        {
            if (name.equals(guest))
            {
                found = true;
            }//end if
        }//end for
        if (found)
        {
            System.out.println(name + " is on the guest list." );
        }//end found if
        else
        {
            System.out.println(name + " is not on the guest list." );
        }//end found else
    }//end main method
}//end class grades
//Shannon Cascaddan