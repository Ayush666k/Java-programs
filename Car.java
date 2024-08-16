package io.github.jiangdequan;

public class Car implements Engine, break {

    @Override
    public void brake (){
        System.out.println("I breake like normal cars");
    }

    @Override
    public void start(){
        System.out.println("I start like normal cars");
    }
    
    @Override
    public void stop(){
        System.out.println("I stop like normal car");
    }

    @Override
    public void acc(){
        System.out.println("I accelerate like normal car");
    }

    
}