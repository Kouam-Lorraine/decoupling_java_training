package fr.lernejo.logger;

public class LoggerFactory {

    public static Logger getLogger(Logger delegateLogger, String nameClass){

        return new ContextualLogger(delegateLogger, nameClass);
    }
}
