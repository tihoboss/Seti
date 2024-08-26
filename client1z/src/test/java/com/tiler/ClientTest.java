package com.tiler;

import org.junit.Assert;
import org.testng.annotations.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ClientTest {
    @Test
    public void testFormatLog() {
        Client client = new Client(new Config(), "testuser");
        String message = "Проверка";
        String expected = "[2023-04-24 12:34:56] Проверка\n";
        String actual = client.formatLog(message);
        Assert.assertEquals(expected, actual);
    }
}
