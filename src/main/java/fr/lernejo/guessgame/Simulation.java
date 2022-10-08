package fr.lernejo.guessgame;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Simulation {

private final Logger logger = LoggerFactory.getLogger("simulation");
private final Player player;  //TODO add variable type
private  long numberToGuess; //TODO add variable type
private final ComputerPlayer computerPlayer = new ComputerPlayer();

//Date date = new Date(currentTime); //if you really have long
//String debut = new SimpleDateFormat("mm:ss:SSS").format(date.getTime());

public Simulation(Player player) {
    //TODO implement me
    this.player = player;
}

public void initialize(long numberToGuess) {
    //TODO implement me
    this.numberToGuess = numberToGuess;
}

private boolean nextRound() {
    //TODO implement me
    /*long nbr;
    System.out.println("Enter a number : ");
    nbr = sc.nextLong();*/

    if(player.askNextGuess() == numberToGuess){

        logger.log("You are right");
        return true;
    }
    else{
        if(player.askNextGuess() < numberToGuess){

            player.respond(false);
            computerPlayer.borneInf = computerPlayer.borneInf + 1;
            computerPlayer.borneSup = player.askNextGuess();
        }


        if(player.askNextGuess() > numberToGuess){

            player.respond(true);
            computerPlayer.borneInf = computerPlayer.borneInf + 1;
            computerPlayer.borneSup = player.askNextGuess();

        }

        logger.log("You are wrong");
        return false;
    }

}

public void loopUntilPlayerSucceed(long max_iter) { //long max_iter
    //TODO implement me
    long time1 = System.currentTimeMillis();
    while (nextRound() != true) {
        max_iter--;
        nextRound();
    }

    long time2 = System.currentTimeMillis();
    long currentTime = time2 - time1;
    Date date = new Date(currentTime);
    String result = new SimpleDateFormat("mm:ss:SS").format(date);
    System.out.println(result);
}
}

