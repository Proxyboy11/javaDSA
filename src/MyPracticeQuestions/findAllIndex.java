package MyPracticeQuestions;

import java.util.ArrayList;

public class findAllIndex {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,4,8};
        int target = 4 ;
        System.out.println(boss(array , target , 0 , new ArrayList<>()));
    }
    static ArrayList<Integer> boss(int[] arr , int target , int index , ArrayList<Integer> list){
        if(index == arr.length){
            return list ;
        }
        if(target == arr[index]){
            list.add(index) ;
        }
        return boss(arr,target , index + 1 , list);
    }
}
