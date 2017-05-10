package com.xiaohongshu.dagger2.demo03.demo02;

import dagger.Module;
import dagger.Provides;

/**
 * Created by wupengjian on 17/5/10.
 */
@Module
public class MarkCarModule {

    public MarkCarModule() {
    }

    @QualifierA
    @Provides
    Engine provideEngineA() {
        return new Engine("black");
    }

    @QualifierB
    @Provides
    Engine provideEngineB() {
        return new Engine("yellow");
    }
}
