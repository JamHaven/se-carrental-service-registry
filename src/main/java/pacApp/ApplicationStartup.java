package pacApp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class ApplicationStartup implements ApplicationListener<ApplicationReadyEvent> {

    private static final Logger log = LoggerFactory.getLogger(ApplicationStartup.class);

    public ApplicationStartup(){ }

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event){
        log.info(event.toString());
    }

    @EventListener
    public void onApplicationEvent(ContextRefreshedEvent event) {
        log.info(event.toString());
    }
}
