import java.util.ArrayList;

public class WordWrap {

    public static String wordWrap(String input, int columnNumber) {

        ArrayList<Integer> spaces = new ArrayList<>();
        int i;
        int lastLF = 0;

        for (i = 0; i < input.length(); i++)
            if( input.charAt(i) == ' ' )  spaces.add(i);

        spaces.add(input.length()-1);

        for(i = 0; i < spaces.size()-1; i++ ) {
            if( spaces.get(i+1) > columnNumber + lastLF) {
                input = changeCharInPosition(spaces.get(i), '\n', input);
                lastLF = spaces.get(i) + 1 ;
            }
        }
        return input;
    }

    public static String changeCharInPosition(int position, char ch, String str){
        return str.substring(0,position) + ch + str.substring(position+1);
    }
}
