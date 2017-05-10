package com.xiaohongshu.dagger2.demo03.demo02;

import javax.inject.Inject;

/**
 * Created by wupengjian on 17/5/10.
 */
public class Car {

    @QualifierA
    @Inject
    Engine engineA;
    @QualifierB
    @Inject
    Engine engineB;

    public Car() {
        DaggerCarComponent.builder().markCarModule(new MarkCarModule())
                .build().inject(this);
    }

    public Engine getEngineA() {
        return this.engineA;
    }

    public Engine getEngineB() {
        return this.engineB;
    }
}
