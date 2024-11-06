public class MoveablePoint implements Moveable {

    private int x;
    private int y;
    private int ySpeed;
    private int xSpeed;

    public MoveablePoint(int x, int y, int ySpeed, int xSpeed) {
        this.x = x;
        this.y = y;
        this.ySpeed = ySpeed;
        this.xSpeed = xSpeed;
    }

    @Override
    public void moveUp() {
        this.y += ySpeed;
        System.out.println("Moving up ("+this.y+","+this.x+")");
    }

    @Override
    public void moveDown() {

            this.y -= ySpeed;
            System.out.println("Moving down ("+this.y+","+this.x+")");

    }

    @Override
    public void moveLeft() {

            this.x -= xSpeed;
            System.out.println("Moving left ("+this.y+","+this.x+")");


    }

    @Override
    public void moveRight() {
        this.x += xSpeed;
        System.out.println("Moving right ("+this.y+","+this.x+")");
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getySpeed() {
        return ySpeed;
    }

    public void setySpeed(int ySpeed) {
        this.ySpeed = ySpeed;
    }

    public int getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }
}
