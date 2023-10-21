package com.yinhai.homework_.homework09;

public class LabeledPoint extends Point{
    private String labels;

    public LabeledPoint(double xcoordinate, double ycoordinate, String labels) {
        super(xcoordinate, ycoordinate);
        this.labels = labels;
    }
}
