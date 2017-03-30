package hackerrank.java.oops;

public class MethodOverridingSuperDemo {
    public static void main(String[] args) {
        MotorCycle m = new MotorCycle();
        System.out.println(m);
    }
}

class BiCycle {
    public String defineMe() {
        return "a vehicle with pedals.";
    }
}

class MotorCycle extends BiCycle {
    public String defineMe() {
        return "a cycle with an engine.";
    }

    public MotorCycle() {
        System.out.println("Hello I am a motorcycle, I am " + defineMe());
        String temp = super.defineMe();
        System.out.println("My ancestor is a cycle who is " + temp);
    }
}