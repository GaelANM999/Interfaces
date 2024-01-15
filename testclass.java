public class testclass implements aritmeticos{
    public static void main(String[] args) {
        System.out.println(new testclass().suma(4, 6));
        System.out.println(new testclass().resta(7, 3));
        System.out.println(new testclass().multiplicacion(8, 2));
        System.out.println(new testclass().division(9, 3));
    }

    
    public int suma(int x, int y) {
        return x+y;
    }
    public int resta(int x, int y) {
        return x-y;
    }

    public int multiplicacion(int x, int y) {
        return x*y;
    }

    public int division(int x, int y) {
        return x/y;
    }
}

interface aritmeticos{
    public  abstract int suma(int x, int y);

    public abstract int resta(int x, int y);

    public abstract int multiplicacion(int x, int y);

    public abstract int division(int x, int y);
}
