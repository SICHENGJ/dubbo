package org.apache.dubbo.common.extension.demo.test.commonExtension.getIocExtension;

import org.apache.dubbo.common.URL;

public class AmapNavigation implements Navigation{

    @Override
    public void start(URL url) {
        System.out.println("高德地图开始导航...");
    }
}
