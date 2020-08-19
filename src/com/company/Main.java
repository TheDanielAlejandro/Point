package com.company;

public class Main {

    public static void main(String[] args) {

        Point first = new Point(6, 5);                                                                             // . Creating a new object type point and passing the parameters
        Point second = new Point(3, 1);                                                                            // . Creating a new object type point and passing the parameters
        System.out.println("distance from point (0,0) = " + first.distance());
        System.out.println("distance from point (second) = " + first.distance(second));
        System.out.println("distance from point (2,2) = " + first.distance(2,2));
        Point point = new Point();                                                                                      // .Creating a new object type point with no parameters
        System.out.println("distance from point = " + point.distance());

    }
}
