package com.epam.mjc.stage0;

public class Bird extends Animal{
    public Bird(){
        super("blue",2,false);
    }
    @Override
    public String getDescription(){
        return super.getDescription()+" Moreover, it has 2 wings and can fly.";
    }

    public static void main(String[] args) {
        Bird bird=new Bird();
        bird.getDescription();
        System.out.println(bird.getDescription());
    }
}
