package arralist;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class Arralist {
    public static void main(String[] args) {
        ArrayList<Integer> content;
        int a=0;
        content = new ArrayList<Integer>();
        int i = 0;
        int j = 0;
        String aux="";
        int suma=0;
        do{
            content.add(Integer.parseInt(JOptionPane.showInputDialog(
                    "Ingresa el numero de la posicion:"+(i+1))));
         i++;
         if(i%10==0){
            a = JOptionPane.showConfirmDialog(null,"¿Deseas agregar un bloque de otros 10 numeros?");
            if(JOptionPane.NO_OPTION==a){
            }
            else{
            }
         }
        }
        while(a!=1);
        int par = 0;
        int impar = 0; 
        int sumapar = 0;
        int sumaimpar = 0;
        while(j<content.size()){
            aux = aux+" "+ content.get(j)+""; 
           if(content.get(j)%2==0){
               sumapar+=content.get(j);
           par++;
           }
           else{
               sumaimpar+=content.get(j);
               impar++;
           }
            suma +=content.get(j);
            j++;
        }
        //int cantidad = content.size();
       
        JOptionPane.showMessageDialog(null,"La cantidad de numeros capturados son: "+content.size(),"Cantidad: ",JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null," "+aux,"Numeros Seleccionados:",JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null,"La sumatoria de todos los numero es igual a: "+suma,"Numeros Seleccionados:",JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null,"La cantidad de pares es: "+par,"Numeros Seleccionados:",JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null,"La cantidad de impares es: "+impar,"Numeros Seleccionados:",JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null,"La suma de pares es: "+sumapar,"Numeros Seleccionados:",JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null,"La suma de impares es: "+sumaimpar,"Numeros Seleccionados:",JOptionPane.PLAIN_MESSAGE);
    }
    
}
