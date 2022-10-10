package fr.lernejo.guessgame;

import java.security.SecureRandom;
import java.util.Scanner;

public class Launcher {

    public static void main(String[] args){

        //Scanner sc = new Scanner(System.in);

        if(args.length == 1 && args[0].equals("-interactive")){

            Player HPlayer1 = new HumanPlayer();
            Simulation simulation = new Simulation(HPlayer1);

            SecureRandom random = new SecureRandom();
            //long randomNumber = random.nextLong(); // génère un nombre entre Long.MIN_VALUE et Long.MAX_VALUE
            long randomNumber = random.nextInt(100); // génère un nombre entre 0 (inclus) et 100 (exclus)

            //System.out.println(randomNumber);
            simulation.initialize(randomNumber);
            simulation.loopUntilPlayerSucceed(Long.MAX_VALUE);
        }
        else if(args.length == 2 && args[0].equals("-auto") && ((Long) Long.parseLong(args[1])).getClass().getSimpleName().equals("Long")){

            Player CPlayer1 = new ComputerPlayer();
            Simulation simulation = new Simulation(CPlayer1);

            simulation.initialize(Long.parseLong(args[1]));
            simulation.loopUntilPlayerSucceed(1000);

        }

        else{

            System.out.print("Enter one argument :  \"-interactive \" ");
            System.out.println(" or two arguments : \"-auto and a number \" ");

            /*do{
                System.out.println("Enter one argument :  \"-interactive \" ");
                System.out.println("or two arguments : \"-auto and a number \" ");
            }
            while(args.length == 1 || args.length == 2 && (!(args[0].equals("-interactive")) || !(args[0].equals("-auto"))));*/
            /*while(args.length == 2 && (!(args[0].equals("-interactive")) || !(args[0].equals("-auto")))){

                System.out.println("Enter -interactive or -auto");
            }*/
        }


    }

}
