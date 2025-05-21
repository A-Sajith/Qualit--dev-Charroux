package com.example.demo.data;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class VoitureTest {

    @Test
    void creerVoiture(){
        assertEquals(1,1);
        Voiture v1 = new Voiture("Ferrari",2500);
        assertEquals("Ferrari",v1.getMarque());
        assertEquals(2500,v1.getPrix());
    }

}
