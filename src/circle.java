public class circle {
    private Double radio = 1.0;
    private String color = "rojo";

    public circle() {
    }

    public circle(Double radio) {
        this.radio = radio;
    }

    public circle(String color) {
        this.color = color;
    }

    public circle(Double radio, String color) {
        this.radio = radio;
        this.color = color;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double area() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public String toString() {
        return "circle{" +
                "radio=" + radio +
                ", color='" + color + '\'' +
                '}';
    }
}
