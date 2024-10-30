package concert;

public aspect CriticAspect {

    pointcut performance():execution(* concert.Performance.perform(..));
    after():performance(){
        System.out.println(criticismEngine.getCriticism());
    }

    private CriticismEngine criticismEngine;

    public void setCriticismEngine(CriticismEngine criticismEngine) {
        this.criticismEngine = criticismEngine;
    }

    private String te;

    public void setTe(String te) {
        this.te = te;
    }
}
