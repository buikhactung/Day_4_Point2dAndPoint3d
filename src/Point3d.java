
public class Point3d extends Point2d {
    public float z = 0.0f;

    public Point3d(){
    }
    public Point3d(float x, float y) {
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y,float z) {
        this.z =z;
        this.setXY(x,y);
    }
    public float[] getXYZ(){
        float [] array2 ={getX(),getY(),getZ()};
        return array2;
    }
    public String toString() {
        return  super.toString() + " z la " + getZ();
    }
}
