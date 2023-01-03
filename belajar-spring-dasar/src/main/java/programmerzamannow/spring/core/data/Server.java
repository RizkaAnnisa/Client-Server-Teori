/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programmerzamannow.spring.core.data;
import lombok.extern.slf4j.Slf4j
import 
/**
 *
 * @author DELL
 */
@Slf4j
public class Server implements InitializingBean, DisposableBean{
    
    @PostConstruct
    public void start(){
        log.info("Start Server");
    }
    @PreDestroy
    public void stop(){
        log.info("Stop Server");
    }
    @Override
    public void destory() throws Exception{
       stop(); 
    }
    @Override
    public void afterPropertiesSet()throws Exception{
        start();
    }
}
