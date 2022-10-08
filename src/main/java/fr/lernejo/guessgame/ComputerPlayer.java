package fr.lernejo.guessgame;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

import java.security.SecureRandom;
import java.util.Scanner;

public class ComputerPlayer implements Player{ // implements Player

    private final Logger logger = new LoggerFactory().getLogger("computer");

   public long borneInf = 0;
    public long borneSup = Long.MAX_VALUE;

    /*SecureRandom random = new SecureRandom();
    long randomNumber = random.nextInt((int) borneSup); // génère un nombre entre 0 (inclus) et 100 (exclus)
    Scanner sc = new Scanner(System.in);*/

    public long askNextGuess(){

        return (borneSup + borneInf)/2;

    }

    public void respond(boolean lowerOrGreater){

        if(lowerOrGreater == true){
            logger.log("The number is greater than the previous");
        }
        else{
            logger.log("The number is lower than the previous");
        }

    }
}
