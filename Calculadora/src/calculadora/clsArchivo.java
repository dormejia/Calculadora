
package calculadora;
import java.awt.Desktop;
import java.io.*;


public class clsArchivo {

   
     public static void escribir(String Narchivo,String contenido){
    File  archivo = new File(Narchivo);
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo,true));
            salida.println(contenido);
            salida.close();
        } catch (FileNotFoundException ex) {
          ex.printStackTrace(System.out);
        } catch (IOException ex) {
           ex.printStackTrace(System.out);
        }
    }
      
      public void abrirarchivo(String archivo){

     try {

            File objetofile = new File (archivo);
            Desktop.getDesktop().open(objetofile);

     }catch (IOException ex) {

            System.out.println(ex);

     }

}     
}
