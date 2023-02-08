public class LogLevels {

    public static String message(String logLine) {
        return logLine.substring(logLine.indexOf("]:")+2).trim();
    }

    public static String logLevel(String logLine) {
        return logLine.substring(logLine.indexOf('[')+1,logLine.indexOf(']')).toLowerCase();
    }

    public static String reformat(String logLine) {
        return message(logLine) + " ("+logLevel(logLine)+')';
    }
}

class LogLevelsTest{
    public static void main(String[] args) {
        System.out.println(LogLevels.logLevel("[WARNING]: Unsafe password"));
        System.out.println(LogLevels.message("[WARNING]: Unsafe password"));
        System.out.println(LogLevels.reformat("[WARNING]: Unsafe password"));
    }
}