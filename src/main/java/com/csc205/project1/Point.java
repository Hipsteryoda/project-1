package com.csc205.project1;

/*
 Working prompt with Llama 3.1-405B:
Generate a java class called Point. An object of this class represents a point on a Cartesian plane. A default and a parameterized constructor should be defined, of which points X and Y as type double are given as parameters. It should be able to get and set both X and Y coordinates individually, as well as a separate method that sets a Point at (X,Y) coordinates.Separately as well, there should be two methods which can shift the X and Y coordinate respectively by a given amount. Also, a method should be defined that returns the distance between two points named distance(). The distance between two points (X1,Y1) and (X2,Y2) is given by the formula: sqrt((X1-X2)^2 + (Y1-Y2)^2). Additionally, a method should be defined that rotates a point around the origin by a given angle in radians. The rotation of a point X is given by: x′=xcos(θ)−ysin(θ). The rotation of a point y is given by y'=xcos(θ)+ysin(θ). Finally, a toString() method should be defined that returns the point in the format (X,Y).
*/

public class Point {
    private double x;
    private double y;

    // Default constructor
    public Point() {
        this.x = 0.0;
        this.y = 0.0;
    }

    // Parameterized constructor
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getters
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // Setters
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Set both X and Y coordinates
    public void setPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Shift X coordinate by a given amount
    public void shiftX(double amount) {
        this.x += amount;
    }

    // Shift Y coordinate by a given amount
    public void shiftY(double amount) {
        this.y += amount;
    }

    // Calculate distance between two points
    public double distance(Point other) {
        double dx = this.x - other.x;
        double dy = this.y - other.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    // Rotate point around origin by a given angle in radians
    // x and y copied to newX and newY to avoid changing x and y before calculations are done 
    public void rotate(double angle) {
        double newX = this.x * Math.cos(angle) - this.y * Math.sin(angle);
        double newY = this.x * Math.sin(angle) + this.y * Math.cos(angle);
        this.x = newX;
        this.y = newY;
    }

    // toString method
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
