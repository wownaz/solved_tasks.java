public class OOPcircle {
    private double radius;
    private String color;
    public static void main(String[]args) {
        OOPcircle c1 = new OOPcircle();
        System.out.println("radius: "+ c1.getRadius()+ " area: "+ c1.getArea());

        OOPcircle c2 = new OOPcircle(2.0, "blue");
        System.out.println("Radius: "+ c2.getRadius()+ " Area: "+ c2.getArea()+ " Color: "+ c2.getColor());

        OOPcircle c3 = new OOPcircle();
        c3.setRadius(6.3);
        c3.setColor("yellow");
        System.out.println("Radius: "+ c3.getRadius()+" Area: "+ c3.getArea()+ " Color: "+ c3.getColor());

        OOPcircle c4 = new OOPcircle();
        System.out.println( c4.setRadius(8.5));

        OOPcircle c5 = new OOPcircle(5.5);
        System.out.println(c5.toString());


    }


    public OOPcircle(){
        radius = 1.0;
        color = "red";
    }
    public OOPcircle(double r){
        radius = r;
        color = "red";
    }
    public OOPcircle(double r, String c){
        radius = r;
        color = c;
    }
    public double getRadius(){
        return radius;
    }
    public String getColor(){
        return color;
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }

    public String toString(){
        return "radius:"+ radius + " color:"+color;
    }
    public double setRadius(double radius){
        this.radius = radius;
        return radius;
    }
    public void setColor(String color){
        this.color = color;
    }

}




