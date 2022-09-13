import java.util.Objects;
import java.util.Scanner;

public class Generator {

    Alphabet alphabet;
    public static Scanner keyboard;

    public Generator(Scanner scanner){
        keyboard = scanner;
    }

    public Generator(boolean IncludeUpper, boolean IncludeLower,
                     boolean IncludeNumber, boolean IncludeSymbol){

        alphabet = new Alphabet(IncludeUpper, IncludeLower, IncludeNumber, IncludeSymbol);

    }

    public void mainLoop(){
        System.out.println("Welcome");
        printMenu();
    }

}
