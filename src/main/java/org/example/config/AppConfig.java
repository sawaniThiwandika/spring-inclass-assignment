package org.example.config;


import org.example.ChickenBun;
import org.example.ChickenRoll;
import org.example.FishBun;
import org.example.FishPastry;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = {ChickenBun.class, ChickenRoll.class, FishBun.class, FishPastry.class})
public class AppConfig {

}
