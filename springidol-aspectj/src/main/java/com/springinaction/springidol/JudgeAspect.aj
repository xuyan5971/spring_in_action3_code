package com.springinaction.springidol;

/**
 * Created by R9 on 2015/6/22.
 */
public aspect JudgeAspect {
    public JudgeAspect() {
    }

    pointcut performance():execution (* perform(..));

    after() returning:performance(){
        System.out.println("22222");
        //System.out.println(criticismEngine.getCriticism());
    }
    public CriticismEngine getCriticismEngine() {
        return criticismEngine;
    }

    //injected
    private CriticismEngine criticismEngine;

    public void setCriticismEngine(CriticismEngine criticismEngine) {
        this.criticismEngine = criticismEngine;
    }
}
