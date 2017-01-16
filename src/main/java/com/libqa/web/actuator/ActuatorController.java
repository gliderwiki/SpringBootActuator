package com.libqa.web.actuator;

import com.libqa.actuator.CustomEndPoint;
import com.libqa.actuator.HealthCheck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.Health;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Q u i c K
 * Date : 2017. 1. 2..
 * Description :
 */
@RestController
public class ActuatorController {

    @Autowired
    private HealthCheck healthCheck;

    @Autowired
    private CustomEndPoint customEndPoint;

    @RequestMapping("/healthInfo")
    public Health healthInfo() {
        return healthCheck.health();
    }

    @RequestMapping("/customEndPoint")
    public List<String> custom() {
        return customEndPoint.invoke();
    }
}