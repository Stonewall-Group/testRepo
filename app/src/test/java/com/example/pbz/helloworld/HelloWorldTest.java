package com.example.pbz.helloworld;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class HelloWorldTest {
    @Test
    public void sayHelloWorks() {
        String what = "test";
        assertTrue("", HelloWorld.sayHello(what).contains(what));
    }

}