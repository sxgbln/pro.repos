/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parcial6am;


import javax.swing.JOptionPane;


/**
 *
 * @author rukku
 */
public class Parcial6am {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //dia uno - Udia
        //dia dos - UdiaS
        //hora uno - Uhora
        //hora dos - UhoraS
        
        
        //todas las variables
        //Udia - primer dia
        //UdiaS - segundo dia
        //Uhora - primera hora
        //UhoraS - segunda hora
        //ContDia - cont dia 1
        //ContDiaS - cont dia 2 
        //horasP - horas pasadas dia 1
        //horasS - horas pasadas dia 2
        
        
        System.out.print("texto");
        
        //iniciar contadores
        
        int ContDia=0;
       
        
        
        String Udia;
        
        //primer dia
        
        Udia=JOptionPane.showInputDialog("Por favor introduzca la primera hora \nDia:");
        
        if("lunes".equals(Udia)){
            ContDia=1;
        }
        if("martes".equals(Udia)){
            ContDia=2;
        }
        if("miercoles".equals(Udia)){
            ContDia=3;
        }
        if("jueves".equals(Udia)){
            ContDia=4;
        }
        if("viernes".equals(Udia)){
            ContDia=5;
        }
        if("sabado".equals(Udia)){
            ContDia=6;
        }
        if("ldomingo".equals(Udia)){
            ContDia=7;
        }
       //hora primer dia
       
       int Uhora=Integer.parseInt(JOptionPane.showInputDialog("Hora: "));
       
       //valores cont primer dia
       
       
      
       
       
       //segunda fecha 
       
       String UdiaS;
       
       UdiaS=JOptionPane.showInputDialog("Por favor introduzca la segunda hora \nDia:");
       
       
       int UhoraS=Integer.parseInt(JOptionPane.showInputDialog("Segunda hora: "));
       
       int ContDiaS=0;
       
       //repetir para UdiaS
       
      if("lunes".equals(UdiaS)){
            ContDiaS=1;
        }
        if("martes".equals(UdiaS)){
            ContDiaS=2;
        }
        if("miercoles".equals(UdiaS)){
            ContDiaS=3;
        }
        if("jueves".equals(UdiaS)){
            ContDiaS=4;
        }
        if("viernes".equals(UdiaS)){
            ContDiaS=5;
        }
        if("sabado".equals(UdiaS)){
            ContDiaS=6;
        }
        if("ldomingo".equals(UdiaS)){
            ContDiaS=7;
        }
       
       //temporal
       JOptionPane.showMessageDialog(null, "valor cont dia uno  " + ContDia + " valor cont dia dos:  " + ContDiaS);
              
       //variable para horas transcurridas desde primer dia - horasP
       
       int horasP;
       
       horasP=24-Uhora;
       
       //valores para horas segundo dia
       
       int horasS;
       
       
       
       JOptionPane.showMessageDialog(null, horasP+" Son las horas pasadas desde el primer dia");
       
       
       
       
              
       int ContDoble=0; //cont doble es la suma de cont de ambos dias, si diferencia mayor a 1 procedimiento diff
       
       ContDoble=ContDiaS-ContDia;
       
       
       
       if(ContDoble==1){
           JOptionPane.showMessageDialog(null, "Entre las "+ Uhora + " horas del dia " + Udia + " y las" + UhoraS + " del dia "+UdiaS+" hay "+(horasP+UhoraS)+ " horas");
       }else if(ContDoble>1){
           
           int resultado;
           
           resultado=horasP+UhoraS+((ContDoble-1)*24);
           
           JOptionPane.showMessageDialog(null, "Entre las "+ Uhora + " horas del dia " + Udia + " y las " + UhoraS + " del dia "+UdiaS+" hay "+ resultado +  " horas");
           
       }else if(ContDoble<1){
           
           JOptionPane.showMessageDialog(null, "lo que ingresaste no es valido: debe ser un dia que vaya despues de otro");

       }
       
       
       
    }
    
}
