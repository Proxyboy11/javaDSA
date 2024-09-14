package MyPracticeQuestions;
public class googlePhoneNumber {
    public static void main(String[] args) {
        function("" , "23");
    }
    static void function(String p , String up){ // up is like "12" i.e, numbers dialed on the keypad
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit  = up.charAt(0) - '0' ; // converts character 'digit' to integer digit

        for (int i = (digit -1)*3; i < digit*3 ; i++) {

            char ch = (char)('a' + i);//create characters corresponding to the digit like "abc" for 1

            function(p + ch , up.substring(1));
        }
    }
}
