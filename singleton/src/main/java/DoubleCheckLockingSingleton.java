public class DoubleCheckLockingSingleton {

    private DoubleCheckLockingSingleton() {
    }

    private volatile static DoubleCheckLockingSingleton INSTANCE;

    /*
    *
    * With double-checked locking, we first check to see if an instance is created, and if not, THEN we synchronize.
    * This way, we only synchronize the first time through, just what we want.
    *
    * */
    public static DoubleCheckLockingSingleton getInstance() {
        if (INSTANCE == null)  {
            synchronized (DoubleCheckLockingSingleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new DoubleCheckLockingSingleton();
                }
            }
        }
        return INSTANCE;
    }
}