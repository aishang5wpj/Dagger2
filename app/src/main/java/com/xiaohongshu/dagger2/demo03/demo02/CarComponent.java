package com.xiaohongshu.dagger2.demo03.demo02;

import dagger.Component;

/**
 * Created by wupengjian on 17/5/10.
 */
@Component(modules = {MarkCarModule.class})
public interface CarComponent {
    void inject(Car car);
}
