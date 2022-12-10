import java.util.Scanner;

public class HackhatonPrimeNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter A Number From 1 To 9:");
        int x = scanner.nextInt();

        int counter = 0, counter1=0;
        for (int num = 2; num <= 50; num++) {
            int control = 0;

            for (int i = 2; i < num; i++) {

                if (num%i==0){
                    control = 1;
                    break;
                }
            }

            if (control==0){
                if((num+5)%x==0){
                    System.out.println(num+5);
                    counter1++;
                }

                counter++;
            }

        }
        System.out.println("Number Of Prime Numbers Between 1-50: "+ counter);
        System.out.println("Number of Requested Number: " + counter1);
    }

}
