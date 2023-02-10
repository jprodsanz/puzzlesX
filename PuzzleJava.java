import java.util.ArrayList;
import java.util.Random;

public class PuzzleJava {
    Random rand = new Random();

    public ArrayList<Integer> getTenRolls() {
        ArrayList<Integer> randArray = new ArrayList<Integer>();
        for (int i = 1; i<=10; i++) {
            randArray.add(rand.nextInt(20));
        }
        return randArray;
    }
    public String getRandomLetter() {
        String alphabetGroup = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String [] alphabet = new String [26];
        for (int i = 0; i < 26; i++) {
            alphabet[i] = String.valueOf(alphabetGroup.charAt(i));
    }
    String randomLetter = alphabet[rand.nextInt(26)];
    return randomLetter;
}
    public String generatePassword() {
        String password = "";
        for (int i = 1; i < 10; i++) {
            password += getRandomLetter();
    }
    return password;
    }
    public ArrayList<String> getNewPasswordSet(int length) {
        ArrayList<String> randArrayPassword = new ArrayList<String>();
        for (int i = 1; i <=length; i++){
            randArrayPassword.add(generatePassword());
        }
        return randArrayPassword;
    }
}