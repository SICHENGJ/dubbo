package org.apache.dubbo.common.extension.demo.test.commonExtension.getByDefaultName;

import org.apache.dubbo.common.extension.ExtensionLoader;

public class Test {

    public static void main(String[] args) {
        ExtensionLoader<Car> extensionLoader = ExtensionLoader.getExtensionLoader(Car.class);
        Car red = extensionLoader.getExtension("black");
        red.driver();
    }
}


