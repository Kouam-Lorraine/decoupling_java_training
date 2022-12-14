package fr.lernejo.logger;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ContextualLogger implements Logger{

    private final String callerClass;
    private final Logger delegateLogger;

    public ContextualLogger(Logger delegateLogger, String callerClass){

        this.delegateLogger = delegateLogger;
        this.callerClass = callerClass;
    }

    public void log(String message){

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("\"yyyy-MM-dd HH:mm:ss.SSS\"");
        delegateLogger.log(LocalDateTime.now().format(formatter) + " " + callerClass + " " + message);
    }
}
