
package Controller;
import static View.inicio_GUI.resultado_txt;
import java.text.DecimalFormat;

public class Calcula_DAO {
    public static double peso, altura, imc;
    public static void imc(){
        peso = Double.parseDouble(View.inicio_GUI.peso_txt.getText());
        altura = Double.parseDouble(View.inicio_GUI.altura_txt.getText());
         imc = peso / (altura*altura);
         View.inicio_GUI.peso_txt.setText("");
         View.inicio_GUI.altura_txt.setText("");
    }
    public static void resultado(){
   DecimalFormat df = new DecimalFormat("#.00");
   if(imc <= 18.5){
    resultado_txt.setText("Seu IMC é: " + df.format(imc) + ", você esta magro");
    View.inicio_GUI.img1.setVisible(true);
    View.inicio_GUI.img2.setVisible(false);
    View.inicio_GUI.img3.setVisible(false);
    View.inicio_GUI.img4.setVisible(false);
    View.inicio_GUI.img5.setVisible(false);
    
   }
   if(imc >= 18.6 && imc<= 24.9 ){
   resultado_txt.setText("Seu IMC é: " + df.format(imc) + ", você esta normal");
   View.inicio_GUI.img2.setVisible(true);
    View.inicio_GUI.img1.setVisible(false);
    View.inicio_GUI.img3.setVisible(false);
    View.inicio_GUI.img4.setVisible(false);
    View.inicio_GUI.img5.setVisible(false);
   }
   if(imc >= 25 && imc <=29.9){
   resultado_txt.setText("Seu IMC é: " + df.format(imc) + ", você esta em sobrepeso");
   View.inicio_GUI.img3.setVisible(true);
    View.inicio_GUI.img2.setVisible(false);
    View.inicio_GUI.img1.setVisible(false);
    View.inicio_GUI.img4.setVisible(false);
    View.inicio_GUI.img5.setVisible(false);
   }
   if(imc >= 30 && imc <=34.9){
   resultado_txt.setText("Seu IMC é: " + df.format(imc) + ", você esta em obesidade");
   View.inicio_GUI.img4.setVisible(true);
    View.inicio_GUI.img2.setVisible(false);
    View.inicio_GUI.img3.setVisible(false);
    View.inicio_GUI.img1.setVisible(false);
    View.inicio_GUI.img5.setVisible(false);
   }
   if(imc >= 35 && imc <=39.9){
   resultado_txt.setText("Seu IMC é: " + df.format(imc) + ", você esta em obesidade elevada");
   View.inicio_GUI.img5.setVisible(true);
    View.inicio_GUI.img2.setVisible(false);
    View.inicio_GUI.img3.setVisible(false);
    View.inicio_GUI.img4.setVisible(false);
    View.inicio_GUI.img1.setVisible(false);
   }
   if(imc > 40){
   resultado_txt.setText("Seu IMC é: " + df.format(imc) + ", você esta em obesidade extrema");
   View.inicio_GUI.img5.setVisible(true);
    View.inicio_GUI.img2.setVisible(false);
    View.inicio_GUI.img3.setVisible(false);
    View.inicio_GUI.img4.setVisible(false);
    View.inicio_GUI.img1.setVisible(false);
   }
    }
}
