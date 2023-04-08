package org.apache.dubbo.common.extension.demo.test.commonExtension.getByName;

public class BlackCar implements Car {
    @Override
    public void driver() {
        System.out.println("black");
    }
}
