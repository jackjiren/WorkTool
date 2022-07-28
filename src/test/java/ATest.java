public class ATest {
    public static void main(String[] args) {
        SubClass sb=new SubClass();
        System.out.println(sb.add());

    }
}
class SuperClass{
    int a =1,b=2;
}
class SubClass extends SuperClass{
    int add(){return a-b;}
}
