package com.app;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class AppTest {
   @Test
    public void showtest(){
        MainTest test = new MainTest();
        assertNotNull(test.getGreeting());
    }
}