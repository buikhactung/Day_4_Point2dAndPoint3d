public class Check {
    public static void main(String[] args) {
        Point2d point2d = new Point2d();
        point2d.setXY(3.5f,4.6f);
        System.out.println(point2d);

        Point3d point3d = new Point3d();
        point3d.setXYZ(6.0f, 7.5f,8.8f);
        System.out.println(point3d);
    }
}
