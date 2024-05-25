package CreationalDesignPatterns.SingletonPattern;

public class LoggerSingleton {
    /* private static LoggerSingleton instance = new LoggerSingleton();

     private LoggerSingleton(){

     }
     public static LoggerSingleton getInstance(){
         if (instance==null){
             instance= new LoggerSingleton();
         }
         return instance;
     }
 }

  ------------------------------------------LAZY INITIALIZATION----------------------------------------------


    private static LoggerSingleton instance = null;

     private LoggerSingleton(){

     }
     public static LoggerSingleton getInstance(){
         if (instance==null){
             instance= new LoggerSingleton();
         }
         return instance;
     }
 }

 --------------------------------------------THREAD SAFE IMPLEMENTATION---------------------------------------

 */
    private static volatile LoggerSingleton instance = null;

    private LoggerSingleton() {
        if (instance != null) {
            throw new RuntimeException("Don't act smart");
        }

    }

    public static LoggerSingleton getInstance() {
        if (instance == null) {
            synchronized (LoggerSingleton.class) {
                if (instance == null) {
                    instance = new LoggerSingleton();
                }
            }
        }
        return instance;
    }
}
