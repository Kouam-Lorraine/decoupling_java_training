package fr.lernejo.logger;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ContextualLogger implements Logger{

    Logger delegateLogger;
    String callerClass = "";

    public ContextualLogger(Logger delegateLogger, String callerClass){
        this.delegateLogger = delegateLogger;
        this.callerClass = callerClass;

    }

    public void log(String message) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss:SS");
        delegateLogger.log(LocalDateTime.now().format(formatter) + " " + callerClass + " " + message);
    }
}
