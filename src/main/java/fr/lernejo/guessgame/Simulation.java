package fr.lernejo.guessgame;

import fr.lernejo.logger.ConsoleLogger;
import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Simulation {

private final Logger logger = LoggerFactory.getLogger(new ConsoleLogger(),"Simulation");
private final Player player;  //TODO add variable type
private long numberToGuess; //TODO add variable type
//private final ComputerPlayer computerPlayer = new ComputerPlayer();

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

    boolean b = true;
    long guess = player.askNextGuess();
    if(guess == numberToGuess){

        logger.log("Found");
        b = true;
    }
    else if(guess < numberToGuess){

        logger.log("not found");
        player.respond(false);
        b = false;

    }

    else if(guess > numberToGuess){

        logger.log("not found");
        player.respond(true);
        b = false;
    }
    return b;

}

public void loopUntilPlayerSucceed(long max_iter) { //long max_iter
    //TODO implement me
    long time1 = System.currentTimeMillis();
    while (max_iter != 0) {

        if(nextRound() == true) {
            //logger.log("");
            break;
        }
        max_iter--;
        nextRound();

    }

    //System.out.println(max_iter);
    long time2 = System.currentTimeMillis();
    long currentTime = time2 - time1;
    Date date = new Date(currentTime);
    String result = new SimpleDateFormat("mm:ss:SS").format(date);
    System.out.println(result);
}
}

