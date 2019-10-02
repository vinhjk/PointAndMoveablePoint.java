public class MoveablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MoveablePoint() {

    }

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
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

    public void setSpeed(float xSpeed, float ySpeed) {
        float[] arr = {xSpeed, ySpeed};
    }

    public float[] getSpeed() {
        float[] arr = {xSpeed, ySpeed};
        return arr;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x = " + this.getX() + ", y = " + this.getY() +
                "  xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }

    public MoveablePoint move(){
        this.setX(this.getX()+ xSpeed);
        this.setY(this.getY()+ ySpeed);
        return this;
    }
}
