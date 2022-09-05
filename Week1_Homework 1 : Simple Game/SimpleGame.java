import java.util.Scanner;
class SimpleGame {
    static String convertTime(int seconds){
        // TODO: Your code goes here
        if (seconds<0){
            System.out.println("-1:-1:-1");
            return ("-1:-1:-1");
        }
        else {
            int S = seconds % 60;
            int H = seconds / 3600;
            int M = (seconds % 3600) / 60;
            System.out.println(H + ":" + M + ":" + S);
            return (H + ":" + M + ":" + S);
        }
    }
    static int digitsSum(int input){
        // TODO: Your code goes here
        int sum;
        for(sum=0; input!=0; input=input/10)
        {

            sum = sum + input % 10;
        }
        System.out.println("The Sum is : " + sum);
        return sum;
    }

    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.println("Type 1 to play Time Coversion Game or Type 2 to play DigitsSum Game");
        int op = i.nextInt();

        switch (op){
            case 1 :
                System.out.println("Enter a Time in Seconds : ");
                int time = i.nextInt();
                convertTime(time);
                break;

            case 2 :
                System.out.println("Enter a Number : ");
                int no = i.nextInt();
                digitsSum(no);
                break;
        }

    }

}
