package concert;

public class CriticismEngineImpl implements CriticismEngine{
    public CriticismEngineImpl(){}

    @Override
    public java.lang.String getCriticism() {
        int i=(int)(Math.random()*criticismPool.length);
        return criticismPool[i];
    }

    private String[] criticismPool;

    public void setCriticismPool(String[] criticismPool) {
        this.criticismPool = criticismPool;
    }

    private String test;

    public void setTest(String test) {
        this.test = test;
    }
}

