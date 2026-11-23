package creational_patterns.singleton;

public class SingletonDemo {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.setFileName("This is a log message.");

        Logger other = Logger.getInstance();
        System.out.println(logger.getFileName());
        System.out.println(other.getFileName());
    }
}
