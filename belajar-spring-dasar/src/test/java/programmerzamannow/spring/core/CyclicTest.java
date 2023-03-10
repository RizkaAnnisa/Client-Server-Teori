/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programmerzamannow.spring.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author DELL
 */
public class CyclicTest {
    
    @Test
    void testCyclic(){
        Assertions.assertThrows(Throwable.class, () -> {
        ApplicationContext context = new AnnotationConfigApplicationContext(CyclicConfiguration.class);
    });
    
    }
}
