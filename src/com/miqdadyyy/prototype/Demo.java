package com.miqdadyyy.prototype;

public class Demo {
    public static void start(){
        ShapeCache.loadCache();

        Shape circleClone = ShapeCache.getShape("1");
        System.out.println(circleClone.getType());

        Shape squareClone = ShapeCache.getShape("2");
        System.out.println(squareClone.getType());

        Shape rectangelClone = ShapeCache.getShape("3");
        System.out.println(rectangelClone.getType());
    }
}
