package soundSystem;

import org.springframework.stereotype.Component;

@Component("component")

public class SgtPeppers implements CompactDisc{
    private String title ="title";
    private String artist = "artist";
    private CompactDisc cd;
    public SgtPeppers(CompactDisc cd){
        this.cd=cd;
    }
    @Override
    public void play() {
        System.out.println(title+" "+artist);
    }
}
