package com.imcs.projects.Marketplace;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FirstSpringComponent {
    @Value("${environment}")
    private String environment;
    public  String getEnviroment(){
        return environment;
    }
}
