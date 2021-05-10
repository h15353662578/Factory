package com.hs.ShengChengQi;

/**
 * @author Huasheng
 * @Date 2021/05/10/9:53
 * @Description
 */
public class GpsNavigator {

    private String route;

    public GpsNavigator(){
        this.route = "221 沣东新城街道";
    }

    public GpsNavigator(String manualRoutes){
        this.route = manualRoutes;
    }

    public String getRoute(){
        return route;
    }
}
