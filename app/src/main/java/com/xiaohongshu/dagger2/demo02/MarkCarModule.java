package com.xiaohongshu.dagger2.demo02;

import dagger.Module;
import dagger.Provides;

/**
 * Created by wupengjian on 17/5/10.
 */
@Module
public class MarkCarModule {

    public MarkCarModule() {

    }

    @Provides
    Engine provideEngine() {
        return new Engine("black");
    }
}
