package fr.lernejo.guessgame;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

import java.util.Scanner;

public class HumanPlayer implements Player{

    public Logger logHuman = new LoggerFactory().getLogger("player");
    Scanner sc = new Scanner(System.in);

    public long askNextGuess(){

        System.out.println("Enter the number of the next guess : ");
        return sc.nextLong();
    }

    public void respond(boolean lowerOrGreater){

        if(lowerOrGreater == false){
            logHuman.log("greater");
        }
        else{
            logHuman.log("lower");
        }

    }
}
