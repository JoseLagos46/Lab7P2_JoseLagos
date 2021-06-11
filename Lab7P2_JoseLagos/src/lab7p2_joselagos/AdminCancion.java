package lab7p2_joselagos;

import javax.swing.JProgressBar;

public class AdminCancion {
    private JProgressBar barra;
    private boolean play;
    private boolean continua;

    public AdminCancion(JProgressBar barra) {
        this.barra = barra;
        play = true;
        continua = true;
    }

    public void setPlay(boolean play) {
        this.play = play;
    }

    public void setContinua(boolean continua) {
        this.continua = continua;
    }
    
    public void run(){
        int minutos = 0;
        int segundos = 0;
        while(continua){
            if(play){
                barra.setValue(segundos+1);
                
                if(barra.getValue() == 60){
                    minutos++;
                    segundos = 0;
                    
                    barra.setString(minutos+":"+segundos);
                }else{
                    barra.setString(minutos+":"+segundos);
                }
                
            }
            try{
                Thread.sleep(50);
            }
            catch(InterruptedException ex){
                
            }
        }
    }
    
}
