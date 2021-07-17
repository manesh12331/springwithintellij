package com.java.JavaNewFeatures.javanew;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<Integer> consumer=t -> System.out.println("prinnting:"+t);
        consumer.accept(10);
        //change in Consumer file
    }
}
