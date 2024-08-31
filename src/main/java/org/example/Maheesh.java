package org.example;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class Maheesh {

    private  FoodItems fishBun;

    public void setFishBun(FishBun fishBun){
        this.fishBun=fishBun;
    }
}
