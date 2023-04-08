package org.apache.dubbo.common.extension.demo.test.commonExtension.getIocExtension;

import org.apache.dubbo.common.URL;

public class RedCar implements Car {

    private Navigation navigation;
    @Override
    public void driver(URL url) {
        navigation.start(url);
        System.out.println("red");
    }

    public void setNavigation(Navigation navigation) {
        this.navigation = navigation;
    }

}
