

class Parent{
    void printMe()
    {
        System.out.println("parent");
    }
}
class Child extends Parent
{
    void PrintMe()
    {
        System.out.println("child");
    }
    void printAll(){
        super.printMe();
        this.PrintMe();
        printMe();
    }
}

public class Test_this {
    public static void main(String[] args) {
        Child myC=new Child();
        myC.printAll();
    }
}
