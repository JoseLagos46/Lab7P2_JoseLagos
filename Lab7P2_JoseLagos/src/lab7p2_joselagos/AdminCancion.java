package lab7p2_joselagos;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

public class AdminCancion extends Thread {
    private JProgressBar barra;
    private boolean play;
    private boolean continua;
    private JLabel tiempo;
    private Canciones cancion;
    
    public AdminCancion(JProgressBar barra, JLabel tiempo) {
        this.barra = barra;
        this.play = true;
        this.continua = true;
        this.tiempo = tiempo;
       // this.cancion = cancion;
    }

    

    public void setPlay(boolean play) {
        this.play = play;
    }

    public void setContinua(boolean continua) {
        this.continua = continua;
    }
    
    public void run(){
        int minutos = 0;
        int segundos1 = 0;
        int segundos2 = 0;
        while(continua){
            if(play){
                tiempo.setText(minutos+":"+segundos1+""+segundos2);
                segundos2++;
                
                if(segundos2 == 10){
                    segundos1++;
                    segundos2 = 0;
                }
                if(segundos1 == 6){
                    minutos++;
                    segundos1 = 0;
                    segundos2 = 0;
                }
                
                barra.setValue(barra.getValue()+1);
                barra.setString("No logré hacer que funcionara");
            }
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException ex){
                
            }
        }
    }
    
}
