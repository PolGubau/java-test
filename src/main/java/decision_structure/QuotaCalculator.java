package decision_structure;

import java.util.Scanner;

public class QuotaCalculator {
    public static void main(String[] args) {
        int quota = 10;


        System.out.println("Enter the number of sales:");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        if(sales>=quota){
            System.out.println("Congrats");

        }else{

            int salesShort = quota -sales;
            System.out.println("More effort..."+
                    "You were "+salesShort + " sales short"
                    );

        }



    }
}
