package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class TextManagerTest {

    @Test
    void replace() throws Exception {
        String text = "All I am is a man";
        String result = "All I am is man";
        Assertions.assertEquals(result, TextManager.replace(text));
    }

    @Test
    void isEmpty(){
        Throwable exception = assertThrows(Exception.class, () -> TextManager.replace(""));
        Assertions.assertEquals("Empty string", exception.getMessage());
    }
}