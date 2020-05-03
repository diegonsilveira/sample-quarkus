package com.github.diegonsilveira.samples;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import io.quarkus.arc.config.ConfigProperties;

@ConfigProperties(prefix = "configs")
public class Config {

    @ConfigProperty(name = "prop")
    String prop;
    
    public String getProp() {
        return prop;
    }

    public void setProp(String prop) {
        this.prop = prop;
    }
    
}
