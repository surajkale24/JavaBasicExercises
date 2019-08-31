package com.yash.test;

import com.yash.java.HelloWorldDemo;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloWorldTest {

    @Test
    public void evaluateReturnedMe() {
        HelloWorldDemo hwDemo = new HelloWorldDemo();
        String message = hwDemo.sayHello();
        assertEquals("Hello World!", message);
    }
}
