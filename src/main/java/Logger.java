import java.util.Date;

public class Logger {
    protected int num = 1;
    private static Logger logger = new Logger();

    private Logger() {
    }

    public static Logger getInstance() {
//        logger = new Logger();
        return logger;
    }

    public void log(String msg) {
        System.out.println("[" + num++ + "] " + "[" + (new Date()).getTime() + "]" + msg);// Число миллисекунд
    }
}
