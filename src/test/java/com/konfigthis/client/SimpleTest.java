package com.konfigthis.client;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;

public class SimpleTest {
    final String MOCK_SERVER_URL = "http://localhost:4010";

    @Test
    public void initClientTest() {
        Configuration configuration = new Configuration();
        configuration.host = "https://api2.crowd4cash.ch";
        
        configuration.bearer  = "YOUR API KEY";
        Crowd4Cash client = new Crowd4Cash(configuration);
        assertNotNull(client);
    }
}
