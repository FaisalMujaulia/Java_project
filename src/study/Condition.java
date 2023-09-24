package study;

class Condition {
    public static void main(String[] args) {
        mySwitchCase();
    }

    private static void mySwitchCase() {
        int button = 1;
        switch (button){
            case 1 :
                System.out.println("faisal");
                break;
//            System.out.println("maryam");
//            break;
            case 2:
                System.out.println("huma");
                break;
            default:
                System.out.println("invalid");
        }
    }
}
