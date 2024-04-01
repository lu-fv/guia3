public class cylinder extends circle {

    private double height =1.0;

       public cylinder() {
        super();
    }

   public cylinder(Double radio, String color) {
        super(radio, color);
    }

    public cylinder(double radio,  double height) {
        super(radio);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public Double area() {
           double area = ((2* Math.PI * super.getRadio() * this.height)+ (2 * super.area()));
        return (double) Math.round((area * 100)/100);
    }

    public double vol (){
        double vol =  super.area() * this.height;
        return (double) Math.round((vol * 100)/100);
    }

    @Override
    public String toString() {
        return "cylinder{" +
                "subclase de " + super.toString() +
                ", height='" + getHeight() + '\'' +
                '}';
    }
}


