package fr.lernejo.guessgame;

import fr.lernejo.logger.ConsoleLogger;
import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

import java.security.SecureRandom;
import java.util.Scanner;

public class ComputerPlayer implements Player{ // implements Player

    private final Logger logComputer = new LoggerFactory().getLogger("computer");

    public long borneInf = Long.MIN_VALUE;
    public long borneSup = Long.MAX_VALUE;//Long.MAX_VALUE

    public long askNextGuess(){

        return (borneSup + borneInf) / 2;

    }

    public void respond(boolean lowerOrGreater){

        if(lowerOrGreater == false){
            logComputer.log("The number is greater than the previous");
            borneInf = askNextGuess() + 1;
        }
        else{
            logComputer.log("The number is lower than the previous");
            borneSup = askNextGuess() - 1;
        }

    }
}
