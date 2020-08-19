package com.company;

public class Point {                                                                                                    // . Creating the class Point with the instances.

    private int x;
    private int y;


    // CONSTRUCTORS

    public Point() {                                                                                                    // . The first is an empty constructor.
    }

    public Point(int x, int y) {                                                                                        // . The second has 2 parameters (x,y) that changes it in the instances.
        this.x = x;
        this.y = y;
    }


    // GET METHODS

    public int getX() {                                                                                                 // . The first get method retrieve the value x.
        return x;
    }

    public int getY() {                                                                                                 // . The second get method retrieve the value y.
        return y;
    }


    // SET METHODS

    public void setX(int x) {                                                                                           // . The first set method sets the value x.
        this.x = x;
    }

    public void setY(int y) {                                                                                           // . The second set method sets the value y.
        this.y = y;
    }


    // OTHER METHODS

    public double distance() {                                                                                          // . First method that calculates the distance from 0 to the point.
        return Math.sqrt((x * x) + (y * y));                                                                            // . The formula is: distance(A,B) = √ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)
    }                                                                                                                   // . In the statement since is 0 the second point it can be simplified.


    public double distance(int x, int y) {                                                                              // . Second method that calculates the distance from the point giving the values x,y as parameters.
        return Math.sqrt(((x - this.x) * (x - this.x)) + ((y - this.y) * (y - this.y)));

    }


    public double distance(Point anotherPoint) {                                                                        // . Third method that calculates the distance from one point to another.
        return distance(anotherPoint.x, anotherPoint.y);                                                                // . to simplify we call the second method and we pass the as parameters the x,y values from the (anotherPoint) parameter obtained at third method.
    }                                                                                                                   // . Optimal solution.

}

   /* Alternative to third method.
    public double distance(Point another){
        return Math.sqrt(((another.x - this.x) * (another.x - this.x)) + ((another.y - this.y) * (another.y - this.y)));
    }
   */

