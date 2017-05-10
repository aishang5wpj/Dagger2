package com.xiaohongshu.dagger2.demo01;

import dagger.Component;

/**
 * Created by wupengjian on 17/5/10.
 */
@Component
public interface CarComponent {
    void inject(Car car);
}
