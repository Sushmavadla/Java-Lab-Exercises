package inheritance;
interface Logger {
	 void log(String message);
	 default void defaultLog() {
	     System.out.println("Logging default message");
	 }
	}

	class FileLogger implements Logger {
	 @Override
	 public void log(String message) {
	     System.out.println("Logging to file: " + message);
	 }
	}
	class ConsoleLogger implements Logger {
	 
	 @Override
	 public void log(String message) {
	     System.out.println("Logging to console: " + message);
	 }
	}
public class InterfaceLabExer {
	 public static void main(String[] args) {

		 FileLogger fileLogger = new FileLogger();
	        ConsoleLogger consoleLogger = new ConsoleLogger();
	        fileLogger.log("Message logged in file");
	        consoleLogger.log("Message logged in console");
	        fileLogger.defaultLog();
	        consoleLogger.defaultLog();
	    }
}

