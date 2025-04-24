package com.design.patterns.builder;

public class Cake {

    private final double sugar;
    private final double butter;
    private final double flour;
    private final String flavor;
    private final int eggs;


    public double getSugar() {
        return sugar;
    }

    public double getButter() {
        return butter;
    }

    public double getFlour() {
        return flour;
    }

    public String getFlavor() {
        return flavor;
    }

    public int getEggs() {
        return eggs;
    }

    public static class Builder {
        private double sugar;
        private double butter;
        private double flour;
        private String flavor;
        private int eggs;

        public Builder sugar (double noOfCups){
            this.sugar = noOfCups;
            return this;
        }

        public Builder butter(double noOfCups){
            this.butter = noOfCups;
            return this;
        }

        public Builder flour (double noOfCups){
            this.flour = noOfCups;
            return this;
        }

       public Builder flavor (String flavor){
            this.flavor = flavor;
            return this;
       }

       public Builder eggs (int numberOfEggs){
            this.eggs = numberOfEggs;
            return this;
       }

       public Cake build () {
            Cake cake = new Cake (this);
            validateObject (cake);
            return cake;
       }

        private void validateObject(Cake cake) {
        }
    }

    private Cake (Builder builder){
        this.sugar = builder.sugar;
        this.butter = builder.butter;
        this.flour = builder.flour;
        this.flavor = builder.flavor;
        this.eggs = builder.eggs;
    }

    @Override
    public String toString() {
        return "Cake{" +
                "sugar=" + sugar +
                ", butter=" + butter +
                ", flour=" + flour +
                ", flavor='" + flavor + '\'' +
                ", eggs=" + eggs +
                '}';
    }
}
