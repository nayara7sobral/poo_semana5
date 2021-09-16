public class CalculadoraCientifica {
    public void raiz(Double n){
        Double resul = Math.sqrt(n);
        System.out.println("raiz de " + n + " = " + resul);
    }
    public void raiz(int n){
        Double resul = Math.sqrt(n);
        System.out.println("raiz de " + n + " = " + resul);
    }
    public void raiz(String n){
        Double resul = Double.parseDouble(n);
        resul = Math.sqrt(resul);
        System.out.println("raiz de " + n + " = " + resul);
    }
    public void potencia(Byte a, Byte b){
        Double resul = Math.pow(a,b);
        System.out.println(a + " elevado a " + b + " = " +  resul);
    }
    public void potencia(String a, String b){
        Double da = Double.parseDouble(a);
        Double db = Double.parseDouble(b);
        Double resul  = Math.pow(da,db);
        System.out.println(a + " elevado a " + b + " = " +  resul);
    }
    public void potencia(int a, Double b){
        Double resul  = Math.pow(a,b);
        System.out.println(a + " elevado a " + b + " = " +  resul);
    }

}
