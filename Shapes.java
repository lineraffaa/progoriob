public class Shapes {
    public static void main(String[] args) {
        Triangulo t1 = new Triangulo(); // exemplo de objeto t1
        Triangulo t2 = new Triangulo();
        t1.setLargura(4.0);
        t1.setAltura(4.0);
        t1.setEstilo("cheio");
        t2.setLargura(8.0);
        t2.setAltura(12.0);
        t2.setEstilo("contorno");
        System.out.println("Info para t1: ");
        t1.mostraEstilo();
        t1.mostraDim();
        System.out.println("Area = " + t1.area());
        System.out.println();
        System.out.println("Info para t2: ");
        t2.mostraEstilo();
        t2.mostraDim();
        System.out.println("Area = " + t2.area());
    }
}
