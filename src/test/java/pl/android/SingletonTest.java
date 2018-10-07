package pl.android;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Tests for {@link Singleton}
 *
 * @author Piotr Krzyminski
 */
public class SingletonTest {

    /**
     * Test if two singletons are equals (same references).
     */
    @Test
    public void testIsTwoSingletonsEquals() {
        Singleton singletonOne = Singleton.getInstance();
        Singleton singletonTwo = Singleton.getInstance();

        assertEquals(singletonOne, singletonTwo); // two singletons references to the same place in memory
    }

    /**
     * Test if set variable value in one singleton indicates change in others.
     * Singleton number two has not set value but when call get method it should return value set by first singleton.
     */
    @Test
    public void testChangeSingletonValueInOne() {
        Singleton singletonOne = Singleton.getInstance();
        singletonOne.setSomeVariable(12);

        Singleton singletonTwo = Singleton.getInstance();

        assertEquals(12, singletonOne.getSomeVariable());
        assertEquals(12, singletonTwo.getSomeVariable()); // singleton has set value
    }

    /**
     * Test if value set from other singleton updates value in others.
     * All two singletons set value of variable. But changed value in second singleton should change also value in first one.
     */
    @Test
    public void testChangeVariableValueInOtherSingleton() {
        Singleton singletonOne = Singleton.getInstance();
        singletonOne.setSomeVariable(10);

        Singleton singletonTwo = Singleton.getInstance();
        singletonTwo.setSomeVariable(12);

        assertEquals(12, singletonOne.getSomeVariable()); // someVariable has now value 12
        assertEquals(12, singletonTwo.getSomeVariable());
    }
}