public class BouncingBall {

    private int x;
    private int y;
    private int velX;
    private int velY;
    private int radius;

    public BouncingBall(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        randVel();
    }

    public BouncingBall(int x, int y, int radius, int velX, int velY) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.velX = velX;
        this.velY = velY;
    }

    //TODO control with specified speed=sqrt(x^2+y^2) no x or y velocity cann be 0
    private void randVel(){
        int max = 10;
        int min = -10;
        int range = max - min + 1;
        velX = (int) (Math.random() * range) + min;
        velY = (int) (Math.random() * range) + min;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getRadius() {
        return radius;
    }

    public void setNewPos(){
        x += velX;
        y += velY;
    }

    public void setVelX(int velX) {
        this.velX *= velX;
    }

    public void setVelY(int velY) {
        this.velY *= velY;
    }
}
