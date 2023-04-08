package org.apache.dubbo.common.extension.demo.test.commonExtension.getIocExtension;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        ExtensionLoader<Car> extensionLoader = ExtensionLoader.getExtensionLoader(Car.class);
        Car red = extensionLoader.getExtension("red");
        URL url = URL.valueOf("cba://localhost/abc?navigation=amap");
        red.driver(url);



    }
}


//package org.apache.dubbo.common.extension.demo.test.commonExtension.getIocExtension;
//import org.apache.dubbo.common.extension.ExtensionLoader;
//public class Navigation$Adaptive implements org.apache.dubbo.common.extension.demo.test.commonExtension.getIocExtension.Navigation {
//    public void start(org.apache.dubbo.common.URL arg0)  {
//        if (arg0 == null) throw new IllegalArgumentException("url == null");
//        org.apache.dubbo.common.URL url = arg0;
//        String extName = url.getParameter("navigation");
//        if(extName == null) throw new IllegalStateException("Failed to get extension (org.apache.dubbo.common.extension.demo.test.commonExtension.getIocExtension.Navigation) name from url (" + url.toString() + ") use keys([navigation])");
//        org.apache.dubbo.common.extension.demo.test.commonExtension.getIocExtension.Navigation extension = (org.apache.dubbo.common.extension.demo.test.commonExtension.getIocExtension.Navigation)ExtensionLoader.getExtensionLoader(org.apache.dubbo.common.extension.demo.test.commonExtension.getIocExtension.Navigation.class).getExtension(extName);
//        extension.start(arg0);
//    }
//}

