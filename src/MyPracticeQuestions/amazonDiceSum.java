package MyPracticeQuestions;

public class amazonDiceSum {
    public static void main(String[] args) {
        function("" , 4);
    }
    static void function(String p , int sum){
        if(sum==0){
            System.out.println(p);
            return;
        }
        for (int i = 1; i <=6 && sum>=i; i++) {
            function(p + i  , sum - i );
        }
    }
}
