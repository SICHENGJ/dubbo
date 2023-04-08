package org.apache.dubbo.common.extension.demo.test.commonExtension.getIocExtension;

import org.apache.dubbo.common.URL;

public class BlackCar implements Car {

    private Navigation navigation;

    @Override
    public void driver(URL url) {
        navigation.start(url);
        System.out.println("black");
    }

    public void setNavigation(Navigation navigation) {
        this.navigation = navigation;
    }
}
