public class Fan {
    private String speed;
    private static int SLOW = 1;
    private static int MEDIUM = 2;
    private static int FAST = 3;
    private boolean on;
    private double radius;
    private String color;

    public static void main(String[]args){
        Fan fan = new Fan();
        System.out.println(fan);
    }

    public Fan(){
        speed = "1";
        on = false;
        radius = 5.0;
        color = "blue";
    }
    public String getSpeed(){
        return speed;
    }
    public int setSpeed(int speed){
        this.speed = Integer.toString(speed);
        return speed;
    }
    public String getColor(){
        return color;
    }
    public String setColor(String c) {
        color = c;
        return c;
    }
    public boolean isOn(){
        return on;
    }
    public boolean setOn(){

        return on;
    }

}
