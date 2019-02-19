import java.util.Date;
import java.text.DateFormat ;
import java.text.SimpleDateFormat;

public class Principal{

public void fecha(){
  Date fecha = new Date();
  DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
  System.out.println(dateFormat.format(fecha));
}

public static void main(String ...args){

  Principal run = new Principal();

  System.out.println("Hola Mundo");
  System.out.println("Como va la bandera!!");
  run.fecha();
}

}
