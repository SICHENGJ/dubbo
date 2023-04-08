package org.apache.dubbo.common.extension.demo.test.commonExtension.activateExtension;

import org.apache.dubbo.common.extension.Activate;

@Activate(group = {"provider"}, value = "redCar")
public class RedCar implements Car {
    @Override
    public void driver() {
        System.out.println("red");
    }
}
