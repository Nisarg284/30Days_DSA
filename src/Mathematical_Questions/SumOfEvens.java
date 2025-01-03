package Mathematical_Questions;

public class SumOfEvens {
    public static int sumOfNatural(int n){

        int sum =0;
        for(int i=0;i<=n;i++)
        {
            if(i%2 == 0)
            {
                sum+=i;
            }
        }
        return sum;
    }


    public static void main(String[] args) {





        int n = 10;

        System.out.println(sumOfNatural(10));

    }
}
