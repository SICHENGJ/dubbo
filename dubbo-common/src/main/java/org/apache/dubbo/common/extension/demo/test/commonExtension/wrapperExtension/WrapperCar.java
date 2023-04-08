package org.apache.dubbo.common.extension.demo.test.commonExtension.wrapperExtension;

public class WrapperCar implements Car {

    private Car car;

    public WrapperCar(Car car) {
        this.car = car;
    }

    @Override
    public void driver() {
        System.out.println("包装下");
        System.out.println("red");
    }
}
