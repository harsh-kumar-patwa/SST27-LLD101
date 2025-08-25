
public class Demo05 {
    static int areaAfterResize(Rectangle r){
        r.setWidth(5); r.setHeight(4); return r.area();
    }
    static int areaAfterResize(Square r){
        r.setWidth(5); return r.area();
    }
    public static void main(String[] args) {
        System.out.println(areaAfterResize(new Rectangle())); // 20
        System.out.println(areaAfterResize(new Square()));    // 16 (!) violates expectation
    }
}
