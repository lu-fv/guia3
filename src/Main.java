//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        cylinder cilindro = new cylinder();
        System.out.println(cilindro);
        System.out.println("Radio: " + cilindro.getRadio());
        System.out.println("Altura: " + cilindro.getHeight());
        System.out.println("Area: " + cilindro.area());
        System.out.println("Volumen: " + cilindro.vol());

        cylinder cilindro1 = new cylinder(12.5, 15.3);
        cilindro1.setColor("verde");

        System.out.println(cilindro1);
        System.out.println("Radio: " + cilindro1.getRadio());
        System.out.println("Altura: " + cilindro1.getHeight());
        System.out.println("Area: " + cilindro1.area());
        System.out.println("Volumen: " + cilindro1.vol());

    }
}