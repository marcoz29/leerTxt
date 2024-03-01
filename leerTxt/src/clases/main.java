
package clases;

public class main {

    public static void main(String[] args) {
        //leer un TXT
        
        archivos a = new archivos();
        String s1 = a.leerTxt("C:\\Users\\Marco\\Downloads\\ArchivoTexto\\ArchivoTexto\\carros.txt");
        
        System.out.println(s1);
    }
}
