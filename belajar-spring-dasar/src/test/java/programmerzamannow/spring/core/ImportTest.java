/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programmerzamannow.spring.core;

import org.junit.jupiter.api.BeforeEach;
import org.springframework.context.ConfigurableApplicationContext;
/**
 *
 * @author DELL
 */

public class ImportTest {
   private ConfigurableApplicationContext applicationContext;
   
   @BeforeEach
   void setUp(){
       applicationContext = new AnnotationConfigApplicationContext(MainConfiguration.class);
       applicationContext.registerShutdownHook();
         
   }
   @Test
   void testImpmort(){
       Foo foo = applicationContext
   }
   
}
