package com.patternprint.starprint;

public class Starprint {

    public static void main(String[] args) {


        int letter = 65;

        for (int i = 4; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {


                System.out.print((char) (letter + j) + " ");

            }
            System.out.println();
        }


        for (int i=0;i<=4;i++)
        {
            for (int j=0;j<=i;j++)
            {
                System.out.print((char)(letter+j)+ " ");
            }
            System.out.println();
        }




















    }
}
