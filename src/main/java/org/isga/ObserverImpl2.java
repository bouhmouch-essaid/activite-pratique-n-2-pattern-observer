package org.isga;

public class ObserverImpl2 implements Observer {
    private int counter;

    @Override
    public void update(int state) {
        if ((state % 2) == 0) {
            ++counter;
        }
        System.out.println("Observer Implementation 2");
        System.out.println("New update: state = " + state);
        System.out.println("Calculation result: " + ((state % 2) == 0 ? "Even" : "Odd"));
        System.out.println("The counter is: " + counter);
    }
}
