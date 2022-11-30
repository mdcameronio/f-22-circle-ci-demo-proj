package com.example.f22circleciproject2;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class F22CircleCiProject2ApplicationTests {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate template;


    @Test
    void contextLoads()
    {

    }
    @Test
    public void homeTest()
    {
        String url = "http://localhost:" + port + "/api/v1/home";
        HttpEntity request = new HttpEntity(new HttpHeaders());
        ResponseEntity<String> response = template.exchange(url, HttpMethod.GET,
                request, String.class);

        //test whether it worked or not?!?!
        assertEquals(response.getStatusCode(), HttpStatus.OK);
        assertEquals(response.getBody(), "Hello, world!");
    }

}
