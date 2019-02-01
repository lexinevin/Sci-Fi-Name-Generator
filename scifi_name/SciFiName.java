
/**
 * SciFiName gathers input from a user to generate a custom name that
 * sounds like it could be used in a science fiction book or movie.
 * 
 * @author ckinnard
 * @version 3/4/16
 */

public class SciFiName   
{
    /**
     * All input that you privide should be at least three letters long
     * or the program may crash (but feel free to test this!)
     * 
     * For best results, user lowercase letters and do not use spaces in your input
     */
    public static void main()
    {
        System.out.println("If you provide me some information I will provide a Science Fiction name for you.");
        System.out.println("Please have all responses  be at least three characters long.");
        System.out.println("For best results, user lowercase letters with no spaces.\n");

        // notice this methd (print) does not print a newline
        System.out.print("Enter your first name: ");
        String firstName = UserInput.getString();
        System.out.print("Enter your last name: ");
        String lastName = UserInput.getString();
        System.out.print("Enter the city where you or one of your parents were born: ");
        String city = UserInput.getString();
        System.out.print("Enter the name of your grammar school: ");
        String school = UserInput.getString();
        System.out.print("Enter the first name of a sibling or other relative: ");
        String relativeName1 = UserInput.getString();
        System.out.print("Enter the first name of a second sibling or relative: ");
        String relativeName2 = UserInput.getString();

        // generate a sciFi name
        //FIRST NAME
        String newFirstName = firstName.substring(0,3);
        String newLastName = lastName.substring(0,2);
        String completedFirstName = newFirstName.toLowerCase() + newLastName.toLowerCase();
        
        //LAST NAME
        String newCity = city.substring(0,2);
        String newSchool = school.substring(0,3);
        String completedLastName = newCity.toLowerCase() + newSchool.toLowerCase();
        
        //Random Number Relative 1
        int ranNumber = ((int) (Math.random() * (relativeName1.length() -1)));
        String lastLetters = relativeName1.substring(ranNumber);
        
        //Random Number Relative 2
        int ranNumber2 = ((int) (Math.random() * (relativeName2.length() -1)));
        String lastLetters2 = relativeName2.substring(ranNumber2);
        
        // Concatenation for Place of Origin
        String originPlace = lastLetters.toLowerCase() + lastLetters2.toLowerCase();
        
        // Printing the Final Message
        System.out.println("Hello " + newFirstName.substring(0, 1).toUpperCase() + newFirstName.substring(1) + " " + newLastName.substring(0, 1).toUpperCase() + newLastName.substring(1) + " of " + originPlace.substring(0, 1).toUpperCase() + originPlace.substring(1) + ". Welcome to Earth!");
        
        
        
    }
}
