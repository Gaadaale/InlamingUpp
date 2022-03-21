
import java.util.Scanner;
import java.io.IOException;
public class MainMethod {
   //the author By: Osman Ismail
          public static void main(String[] args) throws IOException {
            Scanner scan = new Scanner(System.in);
            boolean run = true;
            while(run){
                System.out.println("Enter your choice: \nA. for English -> Morse Code \nB. for Morse Code -> English\nC. Exit");
                String choice = scan.nextLine();

                log inlamning = new log();

                if(choice.equals("A")){
                    //om användaren väljer att gå ifrån eng -> morse
                    System.out.println("Enter English");
                    String input = scan.nextLine();
                    String result = inlamning.EngSolve(input);
                    System.out.println(result);
                }
                 else if(choice.equals("B")){
                    //om användaren väljer att gå ifrån morse -> eng
                    System.out.println("Enter Morse");
                    String input = scan.nextLine();
                    String result = inlamning.morseSolve(input);
                    System.out.println(result);
                }
                 else if(choice.equals("C")) {
                    run = false;
                }

            }
        }

    }

