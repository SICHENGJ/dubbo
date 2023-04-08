package org.apache.dubbo.common.extension.demo.test.commonExtension.getByName;

import org.apache.dubbo.common.extension.ExtensionLoader;

public class Test {

    public static void main(String[] args) {
        ExtensionLoader<Car> extensionLoader = ExtensionLoader.getExtensionLoader(Car.class);
        Car red = extensionLoader.getExtension("red");
        red.driver();
    }
}


