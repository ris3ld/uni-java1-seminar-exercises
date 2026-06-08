import java.util.Arrays;

class Arrayexc {

    public static void main(String[] args) {

        int[] weights = {12, 7, 3, 19, 5, 14, 88};

        int total_weight = 0;
        int max_weight = weights[0];
        for(int i : weights){
            System.out.println(i);
            total_weight += i;
            if(i > max_weight){
                max_weight = i;
            }
        }
        System.out.println("Total weight is: " + total_weight);
        System.out.println("Average weight is: " + (total_weight / weights.length));
        System.out.println("Max weight is: " + max_weight);
        Arrays.sort(weights);

        for(int i : weights){
            System.out.println(i);
        }
    }
}