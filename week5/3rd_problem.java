public class 3rd_problem {
    public static void main(String[] args) {

        }
    }
}

class Point {
    private float x = 0.0f;
    private float y = 0.0f;

    Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    Point() {
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        float f[] = new float[2];
        f[0] = x;
        f[1] = y;
        return f;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

class MovablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    MovablePoint() {
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

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        float f[] = new float[2];
        f[0] = xSpeed;
        f[1] = ySpeed;
        return f;
    }

    @Override
    public String toString() {
        return super.toString() + ", speed = (" + xSpeed + ", " + ySpeed + ")";
    }

    public MovablePoint move() {
        super.setXY(super.getX() + xSpeed, super.getY() + ySpeed);
        return this;
    }
}