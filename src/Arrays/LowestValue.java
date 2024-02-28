package Arrays;

public class LowestValue {
    public static void main(String[] args) {
        int [] array = {32,45,76,36,84,12};
        int minVal = array[0];

        for(int i : array){
            if(i < minVal){
                minVal = i;
            }
        }
        System.out.println(minVal);
    }
}
