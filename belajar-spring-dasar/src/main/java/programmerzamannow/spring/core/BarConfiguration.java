/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programmerzamannow.spring.core;
import org.springframework.context.annotation.Configuration;
/**
 *
 * @author DELL
 */
@Configuration
public class BarConfiguration {
    
    @Bean
    public Bar bar(){
        return new Bar();
        
    }
}
