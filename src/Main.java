import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Random generator = new Random();

        boolean keepPlaying = true;

        String input = "";

        while(keepPlaying) {

            int dieOne, dieTwo, dieSum, pointSum; // Variable declarations

            boolean pointEvent = true;

            dieOne = generator.nextInt(6) + 1;

            dieTwo = generator.nextInt(6) + 1;

            dieSum = dieOne + dieTwo;

            System.out.printf("die one:%d  die two:%d  sum:%d  ",dieOne,dieTwo,dieSum);

            if (dieSum == 2 || dieSum == 3 || dieSum == 12) {

                System.out.println("What a loser... you crapped out...");

                pointEvent = false;

            } else if (dieSum == 7 || dieSum == 11) {

                System.out.println("Congrats!!! Natural! you won!!");

                pointEvent = false;
            } else {

                pointSum = dieSum;

                System.out.println("Trying for point, '" + pointSum + "'");

                while (pointEvent) {

                    dieOne = generator.nextInt(6) + 1;

                    dieTwo = generator.nextInt(6) + 1;

                    dieSum = dieOne + dieTwo;

                    System.out.printf("die one:%d  die two:%d  sum:%d  ", dieOne, dieTwo, dieSum);

                    if (pointSum == dieSum) {

                        System.out.println("Made point and won");

                        pointEvent = false;

                    } else if (dieSum == 7) {

                        System.out.println("Got a seven and lost");

                        pointEvent = false;

                    } else {

                        System.out.println("rolling again...");

                    }


                }
            }

            System.out.println("wanna play again??(y/n): ");

            input = in.next();

            keepPlaying = input.equalsIgnoreCase("y");


        }
        System.out.println("Bye bye");
    }}