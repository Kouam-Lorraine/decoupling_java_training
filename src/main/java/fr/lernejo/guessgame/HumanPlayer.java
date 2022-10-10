package fr.lernejo.guessgame;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

import java.util.Scanner;

public class HumanPlayer implements Player{

    private final Logger logHuman = new LoggerFactory().getLogger("player");
    Scanner sc = new Scanner(System.in);

    public long askNextGuess(){

        System.out.println("Enter the number of the next guess : ");
        return sc.nextLong();
    }

    public void respond(boolean lowerOrGreater){

        if(lowerOrGreater == true){
            logHuman.log("not found, it is great");
        }
        else{
            logHuman.log("not found, it is lower");
        }

    }
}
