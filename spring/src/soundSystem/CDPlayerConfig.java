package soundSystem;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan
@ComponentScans({})
@Import(CDPlayerConfig.class)
@ImportResource("classpath:config.xml")
@Profile("dev")
public class CDPlayerConfig {
    //@Bean(destroyMethod ="shutdown" )
    public CompactDisc compactDisc(){
        return new CompactDisc() {
            @Override
            public void play() {

            }
        };
    }
    @Bean
    public SgtPeppers sgtPeppers(CompactDisc compactDisc){
        return new SgtPeppers(compactDisc);
    }
}
