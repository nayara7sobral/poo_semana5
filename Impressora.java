public class Impressora{
    public void exibir(float f1){
        System.out.println(f1);
    }
    public void exibir(float f1, float f2){
        System.out.println(f1 + ", " + f2);
    }
    public void exibir(float f1, String s1){
        System.out.println(f1 + ", " + s1);
    }
    public void exibir(String s1, float f1){
        System.out.println(s1 + ", " + f1);
    }
    public void exibir(String s1, String s2, String s3){
        System.out.println(s1 + ", " + s2 + ", " + s3);
    }
    public void exibir(int i1, int i2, String s1){
        System.out.println(i1 + ", " + i2 + ", " + s1);
    }
}