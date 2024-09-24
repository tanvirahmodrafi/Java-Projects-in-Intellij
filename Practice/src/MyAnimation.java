public class MyAnimation implements AnotherInterface{


    public void bounce(int fraction) {
        System.out.println("Fraction: " + fraction);
    }


    public void gravity() {
        System.out.println("Gravity");
    }


    public void aboutPi() {
        System.out.println("The value of Pi  = "+ Math.PI);
    }


    public void bigBounce() {
        System.out.println("Big Bounce");
    }
    @Override
    public void view() {
        System.out.println("View");
    }
}
