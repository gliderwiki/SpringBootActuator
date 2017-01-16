package com.libqa.actuator;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

/**
 * Created by Q u i c K
 * Date : 2017. 1. 2..
 * Description :
 */
@Component
public class HealthCheck implements HealthIndicator {
    @Override
    public Health health() {
        boolean isCheck = check();
        if (isCheck) {

            // 에러 코드 유형 정의
            int errorCode = 404;
            return Health.down().withDetail("Error Code", errorCode).build();
        }
        return Health.up().build();
    }

    public boolean check() {
        // 어플리케이션 체크 로직
        return false;
    }
}
