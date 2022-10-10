package fr.lernejo.logger;

public class LoggerFactory {

    public static Logger getLogger(String name){

        Logger logger1 = new ConsoleLogger();
        Logger logger2 = new ContextualLogger(logger1, name);
        Logger logger3 = new FileLogger("file.log");
        Logger logger4 = new FilteredLogger(logger3, message -> message.contains("simulation"));
        Logger logger5 = new ContextualLogger(logger4, name);

        return new CompositeLogger(logger5, logger2);

    }
}
