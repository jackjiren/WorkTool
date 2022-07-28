public class Swtichtest {
    public static void main(String[] args) {
        int j=2;
        switch ( j ) {
            case 2:
                System.out.print("Value is two.");
            case 2+1 :
                System.out.println("Value is three.");
                break;
            default:
                System.out.println("value is"+j);
                break;
        }

    }
}

