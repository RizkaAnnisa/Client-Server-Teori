/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programmerzamannow.spring.core;
import org.springframework.context.annonation.Configuration;
import org.springframework.context.annonation.Import;

/**
 *
 * @author DELL
 */

@Configuration
@Import({
    FooConfiguration.class,
    BarConfiguration.class
})

public class MainConfiguration {
    
}
