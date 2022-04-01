public class Main {
    public static void main(String[] args) {
        NewClass.print();
        int x = 222;
        //int z;
        //System.out.println(z);
        var n = new NewClass();
        Integer x2 = x;
        x = 2023;
        System.out.println(x2);
        System.out.println(n.x);
        System.out.println(n.y);
        Integer a=127,b=127;
        System.out.println(a==b);
        char zz = 'A';
        x = zz;
        System.out.println(x);
        //Valid//ab,AB,a1,a2,_a,a_b,$a,a$;
        //Invalid//a#,a@,a!,a&,a%,1a,any keyword
        //primitive
        // boolean-->true,false,
        // byte ->-2^8 to 2^8(-128 to 127)
        //1 bit is sign bit 7 bit for values
    }
}
