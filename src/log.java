


import java.util.Scanner;
import java.io.IOException;
import java.util.Scanner;
import java.io.IOException;

public class log {
    private char[] Eng;
    private String[] Code;

    public log() {
        char[] tempEng = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
                'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w',
                'x', 'y', 'z', ' '};

        String[] tempCode = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
                "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.",
                "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-",
                "-.--", "--..", "|"};
        Eng = tempEng;
        Code = tempCode;

    }

    public String EngSolve(String input) throws IllegalArgumentException{
        String i = "";
        for (int x = 0; x < input.length(); x++) {
            for (int y = 0; y < Eng.length; y++) {
                if (Eng[y] == input.charAt(x)) {
                    i += Code[y] + " ";
                    break;
                }

                if(y == Eng.length-1){
                    throw new IllegalArgumentException("Only alphabetical letters allowed.");
                }
            }
        }

        return i;
    }



    public String morseSolve(String input){
        String result = "";
        String[] arr = input.split(" ");
        for (int m = 0; m < arr.length; m++) {
            for (int y = 0; y < Code.length; y++) {
                if (Code[y].equals(arr[m])){
                    result += Eng[y];
                    break;
                }

                if(y == Code.length-1){
                    throw new IllegalArgumentException("Only morsie allowed.");
                }
            }
        }
        return result;
    }

    public  String toEnglish(String A){
        if (A =="-*"){
            return "N";
        }else {
            return "E";
        }
    }

    public  String toMorshe(String A){

        return "-";
    }

    public  String tesToeNG(String I){
        return "**";
    }

    public  String tesToMoshe(String N){
        return "N";
    }


}
