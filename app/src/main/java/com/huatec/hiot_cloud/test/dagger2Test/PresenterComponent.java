package com.huatec.hiot_cloud.test.dagger2Test;

import com.huatec.hiot_cloud.test.mvptest.TestMVPActivity;

import dagger.Component;

/**
 * 注入方法，由degger2框架自行生成
 * @param
 */
@Component(modules = TestModule.class)
public interface PresenterComponent {
    void inject(TestMVPActivity testMVPActivity);
}
