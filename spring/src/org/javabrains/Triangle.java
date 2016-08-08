package org.javabrains;

public class Triangle {
    private Point pointA;
    private Point pointB;
    private Point pointC;

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    public void draw() {
        System.out.format("A - \tx = %d,  \ty = %d, \nB - \tx = %d, \ty = %d, \nC - \tx = %d, \ty = %d", getPointA().getX(), getPointA().getY(), getPointB().getX(), getPointB().getY(), getPointC().getX(), getPointC().getY() );
    }
}
