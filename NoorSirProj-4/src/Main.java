import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static int calculateSum(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    public static void maxNum(ArrayList<Integer> numbers){
        int max = numbers.get(0);
        for (int num : numbers) {
            if (num > max){
                max = num;
            }
        }
        System.out.println(max);
    }
    public static void minNum(ArrayList<Integer> numbers){
        int min = numbers.get(0);
        for (int num : numbers) {
            if (num < min){
                min = num;
            }
        }
        System.out.println(min);
    }
    public static void avarage(ArrayList<Integer> numbers){
        int sum = 0;
        int n = calculateSum(numbers);
        System.out.println(n/ numbers.size());
    }

    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();

        num.add(1);num.add(22);num.add(31);num.add(3);num.add(55);
        num.add(9);num.add(12);num.add(5);num.add(2);num.add(11);

        System.out.println(calculateSum(num));
        maxNum(num);
        minNum(num);
        avarage(num);

        HashSet<String> set = new HashSet<>();
        set.add("USA");set.add("Canada");set.add("France");set.add("Japan");set.add("Australia");

        for (String str : set) {
            System.out.println(str);
        }

        HashMap<Integer, Integer> employeeData = new HashMap<>();
        employeeData.put(1000001, 1000);
        employeeData.put(1000002, 2000);
        employeeData.put(1000003, 3000);
        employeeData.put(1000005, 4000);
        employeeData.put(1000004, 5000);

        for(int i : employeeData.keySet()){
            System.out.println("Key: " + i + " Value: " + employeeData.get(i));
        }
        int avg = 0;
        for(int i : employeeData.values()){
            avg += i;
        }
        avg /= employeeData.size();
        System.out.println(avg);

    }
}
