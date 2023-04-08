package org.apache.dubbo.common.extension.demo.test.commonExtension.activateExtension;

import org.apache.dubbo.common.extension.Activate;

@Activate(group = {"consumer"})
public class BlackCar implements Car {
    @Override
    public void driver() {
        System.out.println("black");
    }
}
