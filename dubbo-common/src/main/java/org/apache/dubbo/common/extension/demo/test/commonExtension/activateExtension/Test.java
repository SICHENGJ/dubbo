package org.apache.dubbo.common.extension.demo.test.commonExtension.activateExtension;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;

import java.util.List;

public class Test {

    public static void main(String[] args) {
        ExtensionLoader<Car> extensionLoader = ExtensionLoader.getExtensionLoader(Car.class);
        URL url = URL.valueOf("cba://localhost/abc?xxx=red");
        List<Car> provider = extensionLoader.getActivateExtension(url, "xxx", "provider");
        for (Car car : provider) {
            car.driver();
        }
    }
}


