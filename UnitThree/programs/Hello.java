public class Hello{ 
public static void main(String[] args) {
    System.out.println(hi(50));
}
public static String hi(int x) {
    String z = "";
    for (int y = 0; y < x; y++)
        z += "hi ";
    return z;
}}