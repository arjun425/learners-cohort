package com.kotari;

public class MovingAverage {
    private double[] window; // use this data structure

    // you can add other fields here
    int windowSizeLocal;

    /*
     * Always invoked with windowSize > 0
     */
    public MovingAverage(final int windowSize) {
        window = new double[windowSize];
        windowSizeLocal = windowSize;
    }

    /*
     * Adds a new number to window and if window is full
     * then replace the oldest added number in the window
     */
    public void addNumberToWindow(final double number) {

        double[]  window2 = new double[windowSizeLocal];

        int size = window.length;

        if(size==windowSizeLocal) {
            // resize
            for (int i=1;i<size;i++) {
                window2[i] = window[i];
            }
            window2[window2.length] = number;

            // copy window2 to window
            window = window2;

        } else {
            // array size is still less than window size
            window[size] = number;
        }
    }

    /*
     * Return the average of the numbers added that are currently present in the window
     * and which are larger than the value of 2.0d. Otherwise return 0.0d
     */
    public double getAverage() {
        //TODO
        int sum = 0;
        int size = window.length;

        for (int i=0;i<size;i++) {
            if(window[i]>2.0d) {
                sum+=window[i];
            }
        }

        if (size>0) {
            return  sum/size;
        } else {
            return 0;
        }
    }

    /*
     * Example of how a client would use this class
     */
    public static void main(String[] args) {

        int windowSize = 5;
        final MovingAverage movingAverage = new MovingAverage(windowSize);
        //
        movingAverage.addNumberToWindow(1.5d);
        movingAverage.addNumberToWindow(2.5d);
        System.out.println(movingAverage.getAverage()); // prints 2.5
        movingAverage.addNumberToWindow(4.0d);
        movingAverage.addNumberToWindow(8.0d);
        System.out.println(movingAverage.getAverage()); // prints 4.833333
        movingAverage.addNumberToWindow(5.5d);
        System.out.println(movingAverage.getAverage()); // prints 5.0
    }
}
