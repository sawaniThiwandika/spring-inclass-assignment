package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FishBun implements FoodItems{
void fishBun(){
    System.out.println("fish bun");
}


    @Override
    public void eat() {

    }
}
