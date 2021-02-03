public class TheMain {
    public static void main(String[] args) {
        F f = new F();

        var s1 = f
                .getClass()
                .getClassLoader()
                .getResourceAsStream("nested/anotherone\\anothertest");

        var s2 = f
                .getClass()
                .getClassLoader()
                .getResourceAsStream("nested/anotherone/anothertest");

        var s3 = f
                .getClass()
                .getClassLoader()
                .getResourceAsStream("nested/anotherone\\test");

        var s4 = f
                .getClass()
                .getClassLoader()
                .getResourceAsStream("nested/anotherone/test");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
    }

}

class F {

}
