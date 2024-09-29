abstract public class Abs {
    int a ;
    int b;
    Abs(int a,int b){
        this.a = a;
        this.b = b;
    }
    abstract void display();
    void name(){
        System.out.println("Hello World");
    }
}
