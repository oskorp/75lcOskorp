import java.util.ArrayList;
import java.util.List;

public class kidsWithCandies {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        System.out.println(        code4(candies, extraCandies)
        );
    }
    public static List<Boolean> code4(int[] candies,int extraCandies){
       int max = -1;
        for(int i:candies){
            if(i>max){
                max=i;
            }
        }
        List<Boolean> ans = new ArrayList<>();
        for(int i:candies){
            if(i+extraCandies>=max){
                ans.add(true);
            }else{
                ans.add(false);
            }
        }
        return ans;
    }
    }

