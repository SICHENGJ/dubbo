package org.apache.dubbo.common.extension.demo.test.commonExtension.getIocExtension;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Adaptive;
import org.apache.dubbo.common.extension.SPI;

@SPI
public interface Navigation {

    @Adaptive("navigation")
    void start(URL url);
}
