public class MovablePoint implements Movable {
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() {
        System.out.println("\nMove Up");
        System.out.println(" y = " + y
                    + "\n ySpeed = " + ySpeed
                    + "\n"
                    + "now y = " + (y-=ySpeed));
    }

    @Override
    public void moveDown() {
        System.out.println("\nMove Down");
        System.out.println(" y = " + y
                + "\n ySpeed = " + ySpeed
                + "\n"
                + "now y = " + (y+=ySpeed));
    }

    @Override
    public void moveLeft() {
        System.out.println("\nMove Left");
        System.out.println(" x = " + x
                +"\n xSpeed = " + xSpeed
                + "\n"
                + "now x = " + (x-=xSpeed));
    }

    @Override
    public void moveRight() {
        System.out.println("\nMove Right");
        System.out.println(" x = " + x
                +"\n xSpeed = " + xSpeed
                + "\n"
                + "now x = " + (x+=xSpeed));
    }
}
