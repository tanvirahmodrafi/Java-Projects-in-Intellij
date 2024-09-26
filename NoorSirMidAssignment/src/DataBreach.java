import java.util.HashSet;
import java.util.Objects;


public class DataBreach {
    private static HashSet<String> set = new HashSet<>();
    private static HashSet<String> multipleTime = new HashSet<>();
    public void percentageOfBreach(String inp){
        int x = 0;
        int count = 0;
        while (inp.length() != x++) {
            if (inp.charAt(x) == ',') {
                count++;
            }
        }
        double ans = ((double) count /11)*100;
        System.out.println("The percentage of data breach is " + ans +"% of a single student.");
    }

    public void inputBreachedData(String inp){
        if(set.contains(inp)){
            multipleTime.add(inp);
        }else{
            set.add(inp);
        }
    }

    public void numOfBreachedData(){
        System.out.println(set.size());
    }

    public void numOfSameDataBreachedMultipleTime(){
        System.out.println(multipleTime.size());
    }
}
