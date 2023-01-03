/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programmerzamannow.spring.core;

/**
 *
 * @author DELL
 */
public class LifeCycleTest {
    private ApplicationContext applicationContext;
    
    @BeforeEach
    void setUp(){
        applicationContext = new AnnotationConfigApplicationContext(LifeCycleConfiguration.class);   
        applicationContext.registerShutdownHook();
        
    }
    
    @AfterEach
    void tearDown(){
       // applicationContext.close();
    }
    
    @Test
    void testConnection(){
        Connection connection = applicationContext.getBean(Connection.class);
    }
    
    @Test
    void testServer(){
        Server server = applicationContext.getBean(Server.class);
    }
}
