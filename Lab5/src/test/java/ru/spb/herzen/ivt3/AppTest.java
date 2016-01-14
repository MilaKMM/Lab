package ru.spb.herzen.ivt3;

import junit.framework.TestCase;

public class AppTest extends TestCase {
    App app;

    public void setUp() {
        app = new App();
    }

    public void testSum()
    {
        assertEquals(app.sum(1, 1), 2);
        assertEquals(app.sum(-1, -1), -2);
        assertEquals(app.sum(1, 6), 7);

        assertEquals(app.sum("test1", "test2"), "test3");
    }

    public void testMultiply()
    {
        assertEquals(app.multiply(0, 652), 0);

        assertEquals(app.multiply(5, 5), 25);
        assertEquals(app.multiply(-1, -6), 6);
        assertEquals(app.multiply(1, -2), -2);

        assertEquals(app.multiply(10, 0.1f), 1.0f, 0.001);
        assertEquals(app.multiply(0.01f, 10), 0.1f, 0.001);

        assertEquals(app.multiply(2.2f, 2f), 4.4f, 0.001);
        assertEquals(app.multiply(0f, -2.2f), 0f, 0.001);
        assertEquals(app.multiply(-2.25f, -2.25f), 5.0625f, 0.001);
    }

    public void testFunction()
    {
        assertEquals(app.function(1), 0.5f, 0.001);
        assertEquals(app.function(10), 50f, 0.001);
        assertEquals(app.function(12), 72f, 0.001);

    }
}