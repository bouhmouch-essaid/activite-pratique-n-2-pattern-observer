package org.isga;

public class ObserverImpl1 implements Observer {
    @Override
    public void update(int state) {
        double result = state * state + 9;
        System.out.println("Observer Implementation 1");
        System.out.println("New update: state = " + state);
        System.out.println("Calculation result: " + result);
    }
}
