package org.apache.dubbo.common.extension.demo.test.javaspi;

import java.util.Iterator;
import java.util.ServiceLoader;

public class Test {

    public static void main(String[] args) {
        ServiceLoader<Car> serviceLoader = ServiceLoader.load(Car.class);
        Iterator<Car> iterator = serviceLoader.iterator();
        while (iterator.hasNext()) {
            Car car = iterator.next();
            car.driver();
        }
    }
}


