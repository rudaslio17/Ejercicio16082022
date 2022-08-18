public class Main {
    public static void main(String[] args) {
      Cuenta cuenta1=new Cuenta("1454121","ahorro",70000);
      cuenta1.retirar(10000);
      cuenta1.consignar(2000000);
        System.out.println( cuenta1.toString());
        System.out.println(cuenta1.getSaldoActual());

    }
}
