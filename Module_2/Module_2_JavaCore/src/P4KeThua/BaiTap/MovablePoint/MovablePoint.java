package P4KeThua.BaiTap.MovablePoint;
import P4KeThua.BaiTap.Pointer.Point2D;
public class MovablePoint extends Point2D {
    private float xSpeed;
    private float ySpeed;

    public MovablePoint() {
        xSpeed = 1;
        ySpeed = 1;
    }
    public MovablePoint(float xSpeed, float ySpeed) {
        super();
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        return new float[]{xSpeed, ySpeed};
    }
    public void setSpeed(float xSpeed, float ySpeed) {
        setxSpeed(xSpeed);
        setySpeed(ySpeed);
    }

    public MovablePoint move() {
        super.setX(super.getX() + xSpeed);
        super.setY(super.getY() + ySpeed);
        return this;
    }
    @Override
    public String toString() {
        return "(" + super.getX() + ", " + super.getY() + "), speed = (" + xSpeed + ", " + ySpeed + ")";
    }
}
