package pl.android;

/**
 * Singeleton class.
 *
 * @author Piotr Krzyminski
 */
public class Singleton {

    private static Singleton instance = null;

    private int someVariable;

    /**
     * private constructor.
     */
    private Singleton() {

    }

    /**
     * Returns instance of class. If object is created for the first time then create it and return.
     *
     * @return Singleton class instance.
     */
    public static synchronized Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }

        return instance;
    }

    public int getSomeVariable() {
        return someVariable;
    }

    public void setSomeVariable(int someVariable) {
        this.someVariable = someVariable;
    }
}
