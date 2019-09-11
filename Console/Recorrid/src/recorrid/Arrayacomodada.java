package recorrid;
import java.util.Scanner;//libreria de scanner

public class Arrayacomodada {
public int [][] Matriz;
int i=0 ,x=0;
   
public void metodo1 (){
Matriz=new int [4][4];
    System.out.println("****************************************************************************");
    Matriz [0][0]=1;
    Matriz [0][1]=3;
    Matriz [0][2]=5;
    Matriz [0][3]=7;
    Matriz [1][0]=4;
    Matriz [1][1]=7;
    Matriz [1][2]=9;
    Matriz [1][3]=7;
    Matriz [2][0]=2;
    Matriz [2][1]=6;
    Matriz [2][2]=8;
    Matriz [2][3]=0;
    Matriz [3][0]=2;
    Matriz [3][1]=4;
    Matriz [3][2]=5;
    Matriz [3][3]=2;
 
    for(int i=0;i<4;i++){
        for(int x=0;x<4;x++){
   System.out.print("["+Matriz[i][x]+"]");
        }
        System.out.print("\n");
    }
    System.out.println("*********************************************************************************************************");
 
    System.out.println("la matriz queda acomodada asi");
    
    
    
    
for(int i=0;i<4;i++){
        for(int x=0;x<4;x++){
            if(x==0){
                System.out.print(Matriz[i][x]+",");
            } 
}
}
    for(int i=Matriz.length-1;i>-1;i--){
    for(int x=Matriz.length-1;x>-1;x--){
        if(x==1){
            System.out.print(Matriz[i][x]+",");
        }
    
    }
    }
    for(int i=0;i<4;i++){
        for(int x=0;x<4;x++){
            if(x==2){
                System.out.print(Matriz[i][x]+",");
            } 
}
}
    for(int i=Matriz.length-1;i>-1;i--){
    for(int x=Matriz.length-1;x>-1;x--){
        if(x==3){
            System.out.print(Matriz[i][x]+",");
        }
    
    }
    }
}

    public static void main(String[] args) {
     Arrayacomodada nuevo=new Arrayacomodada();
      nuevo.metodo1();
    }
    
}