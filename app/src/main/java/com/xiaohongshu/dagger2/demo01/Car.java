package com.xiaohongshu.dagger2.demo01;

import javax.inject.Inject;

/**
 * Created by wupengjian on 17/5/10.
 */
public class Car {

    @Inject
    Engine engine;

    public Car() {
        DaggerCarComponent.builder().build().inject(this);
    }

    public Engine getEngine() {
        return engine;
    }
}
