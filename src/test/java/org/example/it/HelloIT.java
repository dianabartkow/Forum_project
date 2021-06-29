package org.example.it;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import org.junit.Before;
import org.junit.Test;

public class HelloIT {

    private static String port, name;

    @Before
    public void setup() {
        port = System.getProperty("servlet.port", "8080");
    }

    @Test
    public void hello() throws IOException {


    }

}
