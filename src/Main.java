public class Main {
    public static void PointTest(){
        Point p = new Point();
        System.out.println(p);
        p = new Point(2,3);
        System.out.println(p);
    }

    public static void MoveablePointTest(){
        MoveablePoint mP = new MoveablePoint();
        System.out.println(mP);
        mP = new MoveablePoint(3,5,110,290);
        System.out.println(mP);
    }

    public static void main(String[] args) {
        PointTest();
        MoveablePointTest();
    }
}
