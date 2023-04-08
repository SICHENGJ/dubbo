package org.apache.dubbo.common.extension.demo.test.javaspi;

public class RedCar implements Car {
    @Override
    public void driver() {
        System.out.println("red");
    }
}
