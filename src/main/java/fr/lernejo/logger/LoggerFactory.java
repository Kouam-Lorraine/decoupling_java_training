package fr.lernejo.logger;

public class LoggerFactory {

    public static Logger logger;

    public LoggerFactory(Logger logger){

        this.logger = logger;
    }

    public static Logger getLogger(String name){

        return logger;
    }
}
