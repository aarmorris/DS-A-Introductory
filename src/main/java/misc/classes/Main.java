package misc.classes;

public class Main {
    public static void main(String[] arg){

        Cookie cookieOne = new Cookie("green");
        Cookie cookieTwo = new Cookie("blue");

        cookieOne.setColor("yellow");

        System.out.println(cookieOne.getColor());
        System.out.println(cookieTwo.getColor());
    }
}






























//
//public class Main {
//
//    public static void printItems(int n) {
//        for(int i = 0; i < n; i++) {
//            for(int j = 0; j < n; j++) {
//                    System.out.println(i + " " + j);
//            }
//
//        }
//        for(int k = 0; k < n; k++) {
//            System.out.println(k);
//        }
//    }


//
//    public static void main(String[] args) {
//
//        printItems(10);
//    }
//}