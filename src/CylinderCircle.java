public class CylinderCircle extends OOPcircle{
    private double height;

    public static void main(String[]args) {
        CylinderCircle s1 = new CylinderCircle();
        System.out.println(s1+" height: "+ s1.getHeight());

        CylinderCircle s2 = new CylinderCircle(4.3);
        System.out.println(s2+ " height: "+ s2.getHeight());

        CylinderCircle s3 = new CylinderCircle(2.1, 5.6);
        System.out.println(s3+ " heigth: "+s3.getHeight());

        CylinderCircle s4 = new CylinderCircle(5.0);
        System.out.println(s4+ " heigth: "+ s4.getHeight()+ " volume: "+ s4.getVolume());

        CylinderCircle s5 = new CylinderCircle();
        System.out.println("height:"+ s5.setHeight(5.0));


    }
    public CylinderCircle(){
        super();
        height = 1.0;
    }
    public CylinderCircle(double height){
        super();
        this.height = height;
    }
    public CylinderCircle(double radius, double height){
        super(radius);
        this.height = height;
    }
    public double getHeight(){
        return height;
    }
    public double getVolume(){
        return getArea()*height;
    }
    public double setHeight(double height){
        this.height = height;
        return height;
    }

    @Override
    public String toString(){
        return super.toString()+ " heigth: "+height;
    }




}
