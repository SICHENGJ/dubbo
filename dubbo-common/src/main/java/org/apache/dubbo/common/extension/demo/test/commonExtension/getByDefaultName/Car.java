package org.apache.dubbo.common.extension.demo.test.commonExtension.getByDefaultName;

import org.apache.dubbo.common.extension.SPI;

@SPI(value = "red")
public interface Car {

    void driver();
}
