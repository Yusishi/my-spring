package com.example.demo.enums;


import com.example.demo.util.PointType;

import java.util.Objects;

public enum PointsEnum {


    CLICK_point(PointType.CLICK_TYPE, "ClickPointImpl"), LOGIN_POINT(PointType.LOGIN_TYPE, "LoginPointImpl"),
    ;


    private final Integer type;
    private final String serviceName;


    PointsEnum(Integer type, String serviceName) {
        this.type = type;
        this.serviceName = serviceName;
    }

    public static String getServiceName(Integer type) {
        for (PointsEnum pointsEnum : PointsEnum.values()) {
            if (Objects.equals(pointsEnum.type, type)) {
                return pointsEnum.serviceName;
            }
        }
        throw new RuntimeException("/传入type异常");
    }

}
