package com.company;

public class ConversorUnidades{

    public static void main(String[] args) {
	// write your code here
    }

    public static int converteCelsiusKelvin(int x){
        int result = x + 273;
        return result;
    }

    public static double converteKmhparaMetros(double x){
        double result = x/3.6;
        return result;
    }

    public static int converteMetroparaKm(int x){
        int result = x/1000;
        return result;
    }
    public static int converteHorasparaMinutos(int x){
        int result = x*60;
        return result;
    }
}
