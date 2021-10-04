public class ThreadSafeSingleton {

    private ThreadSafeSingleton() {
    }

    private static ThreadSafeSingleton INSTANCE;

    /*
    *
    * By adding synchronized we make all thread wait until its turn before they can enter the getInstance method. NO TWO THREADS MAY ENTER AT THE SAME TIME.
    *
    * */
    public static synchronized ThreadSafeSingleton getInstance() {
        if (INSTANCE == null)  INSTANCE = new ThreadSafeSingleton();
        return INSTANCE;
    }
}