package org.apache.dubbo.common.extension.demo.test.commonExtension.getByDefaultName;

public class RedCar implements Car {
    @Override
    public void driver() {
        System.out.println("red");
    }
}
