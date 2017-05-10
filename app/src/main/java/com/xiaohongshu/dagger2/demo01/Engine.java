package com.xiaohongshu.dagger2.demo01;

import javax.inject.Inject;

/**
 * Created by wupengjian on 17/5/10.
 */
public class Engine {

    @Inject
    Engine() {

    }

    public void run() {
        System.out.println("start running.");
    }
}
