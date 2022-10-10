package fr.lernejo.logger;

public class CompositeLogger implements Logger{

    public final Logger log1;
    public final Logger log2;

    public CompositeLogger(Logger log1, Logger log2){

        this.log1 = log1;
        this.log2 = log2;

    }

    public void log(String message){

        log1.log(message);
        log2.log(message);

    }
}
