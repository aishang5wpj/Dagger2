package com.xiaohongshu.dagger2.demo02;

import javax.inject.Inject;

/**
 * Created by wupengjian on 17/5/10.
 */
public class Car {

    @Inject
    Engine engine;

    Car() {
        DaggerCarComponent
                .builder()
                .markCarModule(new MarkCarModule())
                .build()
                .inject(this);
    }

    public Engine getEngine() {
        return engine;
    }
}
