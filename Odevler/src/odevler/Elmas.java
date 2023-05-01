package odevler;

public class Elmas {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i += 2) {

            for (int j = 10; j > i; j -= 2) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println("");
        }
        
        
        for (int i = 10; i >0 ; i -= 2) {

            for (int j = 10; j >= i; j-=2) {
                System.out.print(" ");
            }
            
            for (int j = 1; j <i; j++) {
                System.out.print("*");
            }

            System.out.println("");
        }
    }
}
