package hello.world;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

public class RunTest {



    @BeforeEach
    public void before() {


    }


    @Test
    public void someTest_one() throws IOException, InterruptedException {

        assertEquals("abc", "abc");

    }

   
}

