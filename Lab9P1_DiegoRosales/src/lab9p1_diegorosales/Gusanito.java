package lab9p1_diegorosales;
import java.util.Random;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class Gusanito {
public static Random rand = new Random();
// TAMANO TABLERO
        int ancho;
        int altura;

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public static char[][] generar_tablero(int an,int al){
        // llenar tablero de espacios
        char [][] tablero = new char [al][an];
        
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j <tablero[i].length; j++) {
                tablero[i][j]=' ';
                
            }
        }
       
        // insertar a jugador

        int randaa=rand.nextInt(0,al-1);
        int randaab = rand.nextInt(0,an-1);
        
        if(tablero[randaa][randaab] == ' '){
            tablero[randaa][randaab] = '$';
        }
        
        // insertar manzana
        boolean b=true;
        while(b==true){
            int random_an=rand.nextInt(0,an-1);
            int random_al=rand.nextInt(0,al-1);
            if(tablero[random_al][random_an]==' '){
                
            tablero[random_al][random_an]= 'Ó'; 
            
           b=false;
        }
            
            else{
                
            }
        }
        
        // insertar obstaculos
        int menor=0;
        int mayor=0;
        if(al>an){
            mayor=al-1;
            menor=an-1;
        }
        else if(an>al){
            mayor=an-1;
            menor=al-1;
        }
        else if(an==al){
           mayor=al-1;
            menor=an-1; 
        }
        int contador=0;
            int randnum= rand.nextInt(menor+1,mayor+1);
            int randal=0;
            int randan=0;
            
            while(contador<randnum){
                randal= rand.nextInt(0,al-1);
                randan= rand.nextInt(0,an-1);
                
                if(tablero[randal][randan]==' '){
                    tablero[randal][randan] ='#';
                    contador++;
                }
                else{
                    
                }
                
            }
           String tablero_string ="";
         for (int i = 0; i < tablero.length; i++) {
             for (int j = 0; j <tablero[i].length; j++) {
                 tablero_string +="["+tablero[i][j]+"]"+"\t";
                 
             }
             tablero_string+="\n";
        }
         
         
         
           return tablero; 
           
    }
    
    
    

    
    /* public static char[][] instruccioness(int opcion,char tab [][]){
        if(opcion==1){
            ArrayList<String> instrucciones = new ArrayList<>();
            String instruccion;
            int movimiento;
            char mov;
            String [] num;
            instruccion = JOptionPane.showInputDialog(null, "Ingrese la instruccion de forma magnitudDireccion(ej. 2UP");
            
            mov = instruccion.charAt(0);
            movimiento = Character.getNumericValue(mov);
            char [][] temp;
            char [][] nueva;
            temp=tab;
            if(instruccion.charAt(1)=='U' && instruccion.charAt(1)=='P'){
                for (int i = 0; i < temp.length; i++) {
                    for (int j = 0; j < temp[i].length; j++) {
                        if(temp[i][j]=='$'){
                            temp[i][j]=' ';
                            temp[i+movimiento][j]='$';
                            break;
                        }
                        
                    }
                }
                
                
                
            }
            else if(instruccion.charAt(1)=='D' && instruccion.charAt(1)=='N'){
                for (int i = 0; i < temp.length; i++) {
                    for (int j = 0; j < temp[i].length; j++) {
                        if(temp[i][j]=='$'){
                            temp[i][j]=' ';
                            temp[i-movimiento][j]='$';
                            break;
                        }
                        
                    }
                }
            }
            
            else if((instruccion.charAt(1)=='R' && instruccion.charAt(1)=='T')){
               for (int i = 0; i < temp.length; i++) {
                    for (int j = 0; j < temp[i].length; j++) {
                        if(temp[i][j]=='$'){
                            temp[i][j]=' ';
                            temp[i][j+movimiento]='$';
                            break;
                        }
                        
                    }
                } 
            }
            
            else if((instruccion.charAt(1)=='L' && instruccion.charAt(1)=='T')){
                for (int i = 0; i < temp.length; i++) {
                    for (int j = 0; j < temp[i].length; j++) {
                        if(temp[i][j]=='$'){
                            temp[i][j]=' ';
                            temp[i][j-movimiento]='$';
                            break;
                        }
                        
                    }
                } 
            }
            
        }
        
    } */
    
    
    
        
        
        
}
