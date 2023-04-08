package org.apache.dubbo.common.extension.demo.test.commonExtension.activateExtension;

import org.apache.dubbo.common.extension.SPI;

@SPI
public interface Car {

    void driver();
}
