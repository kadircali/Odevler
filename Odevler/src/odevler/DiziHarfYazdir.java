package odevler;

public class DiziHarfYazdir {

    public static void main(String[] args) {
        String harf[][] = new String[9][6];

        for (int i = 0; i < harf.length; i++) {

            for (int j = 0; j < harf[i].length; j++) {

                if ((i == 0 && j != 5) || (i == 4 && j != 5) || (i == 8 && j != 5)) {
                    harf[i][j] = "*";
                } else if (j == 0) {
                    harf[i][j] = "*";
                } else if (j == 5 && (i != 0 && i != 8)) {
                    harf[i][j] = "*";
                } else {
                    harf[i][j] = " ";
                }

            }
        }

        for (int i = 0; i < harf.length; i++) {

            for (int j = 0; j < harf[i].length; j++) {

                System.out.print(harf[i][j]);

            }
            System.out.println();
        }

    }
}
