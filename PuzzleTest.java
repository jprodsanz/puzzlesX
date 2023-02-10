import java.util.Random;

public class PuzzleTest {
    public static void main(String[] args){
        
        PuzzleJava appLogic = new PuzzleJava();
        System.out.println("\n----- Get 10 Rolls-----");
            System.out.println(appLogic.getTenRolls());
        System.out.println("\n----- Get Random Alphabet Letter-----");
            System.out.println(appLogic.getRandomLetter());
        System.out.println("\n----- Generate Password-----");
            System.out.println(appLogic.generatePassword());
        System.out.println("\n----- New Password Set-----");
            System.out.println(appLogic.getNewPasswordSet(7));
    }
}