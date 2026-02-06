import java.util.Scanner;

public class CountCharacters {    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        // initialized counters
        int vowels = 0, consonants = 0, digits = 0, special = 0;
        S = S.toLowerCase();

        // iterating through characters and update counters
        for(int i = 0; i< S.length(); i++){
            Character ch = S.charAt(i);
            if(Character.isDigit(ch)) digits++;
            else if(Character.isLetter(ch)){
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') vowels++;
                else consonants++;
            } else special++;
        }
        
        System.out.print(vowels+" "+consonants+" "+digits+" "+special);
    }
}
