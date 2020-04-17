package com.huatec.hiot_cloud.test.dagger2Test;

import com.huatec.hiot_cloud.test.mvptest.TestMVPActivity;

import dagger.Module;
import dagger.Provides;

/**
 * degger2测试module类
 */
@Module
public class TestModule {
    @Provides
    public ThirdObj getThirdObj(){
        return  new ThirdObj();
    }
}
