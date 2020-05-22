package P4KeThua.BaiTap.MovablePoint;

public class RunMovablePoint {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(1, 1, 2, 2);
        float x = point.getX();
        for (int i = 0; i < 3; i++) {
            System.out.println(point);
            point.move();
        }
    }
}
