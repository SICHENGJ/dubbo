package org.apache.dubbo.common.extension.demo.test.javaspi;

public class BlackCar implements Car {
    @Override
    public void driver() {
        System.out.println("black");
    }
}
