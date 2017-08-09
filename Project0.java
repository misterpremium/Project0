package project;
import java.util.Scanner;
import java.util.Random;
import java.awt.BorderLayout;
import javax.swing.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Math;
//import java.io.*;
//v12.1
public class Project0 extends JFrame {
 private static final long serialVersionUID = 1L;
 public Project0() {
  // TODO Auto-generated constructor stub
  initComponents();
 }
 private void initComponents() {
  // 2) Configuramos los parámetros de la ventana
  setSize(400, 200);
  setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

  // 2) Crear los componentes
  JLabel etiqueta1 = new JLabel("Escribe");
  JTextField campoDeTexto = new JTextField(20);
  JButton boton = new JButton("No vale pa na");
  JButton prueba = new JButton("kk");

  // 3) Crear un contenedor
  //JPanel panelDeContenido = new JPanel();
  JPanel panelDeContenido = (JPanel) this.getContentPane();

  // 4) Asociar los componentes al contenedor
  panelDeContenido.add(etiqueta1, BorderLayout.LINE_START);
  panelDeContenido.add(campoDeTexto, BorderLayout.LINE_END);
  panelDeContenido.add(boton, BorderLayout.PAGE_END);
  panelDeContenido.add(prueba, BorderLayout.PAGE_START);
  // 5) Asociar el contenedor a la ventana
  setContentPane(panelDeContenido);

  // 6) Hacer visible la ventana
  setVisible(true);
 } 
 private static boolean compPos (double valor, String textoError){
   if (valor <0){
       System.out.println (textoError);
       return true;}
     return false;
   }
 private static   int scannerInt(){ 
     Scanner sc; 
     
      sc = new Scanner(System.in);
      return  sc.nextInt();
     
   }
 private static float scannerFloat(){
 Scanner sc;
  sc = new Scanner(System.in);
  return sc.nextFloat();

   }
 private static String scannerString(){
  Scanner sc;
  sc =new Scanner(System.in);
  return sc.nextLine();
 } 
 public static void main(String[] args) throws IOException {

  int menu;
  
  do {
   System.out.println("\t\t ____            _           _    ___  ");
   System.out.println("\t\t|  _ \\ _ __ ___ (_) ___  ___| |_ / _ \\ ");
   System.out.println("\t\t| |_) | '__/ _ \\| |/ _ \\/ __| __| | | |");
   System.out.println("\t\t|  __/| | | (_) | |  __/ (__| |_| |_| |");
   System.out.println("\t\t|_|   |_|  \\___// |\\___|\\___|\\__|\\___/ ");
   System.out.println("\t\t               |__/                     ");
   System.out.println("by:");
   System.out.println("\t\t ____  ____  __  __ ");
   System.out.println("\t\t|  _ \\|  _ \\|  \\/  |");
   System.out.println("\t\t| | | | |_) | |\\/| |");
   System.out.println("\t\t| |_| |  __/| |  | |");
   System.out.println("\t\t|____/|_|   |_|  |_|");

   System.out.println("1) Entorno gráfico.");
   System.out.println("2) Modo texto");
   System.out.println("99) Salir");
   menu = scannerInt();
   switch (menu) {

   // pruebaaaa
   case 1:
    java.awt.EventQueue.invokeLater(new Runnable() {
     public void run() {
      new Project0().setVisible(true);
     }
    });
    break;
   case 2:
    // ////******************************///////////
    int op1, conversor, op7, num, res, res2, res3 = 0, op4, d6 = 1, jk = 0, op, op3, orden = 0, a2, b2, c2, a1, b, c, radicando, elec;
    double r, a9, b9, c9, d9, n, phi, fibonacciphi, fibonacci, r1, r2;
    
    String comando; String s = null;
    float variable0, variable1, f, m, a, a6, b6, c6  x0, y0, z0, x1, y1, z1, x2, y2, z2, resx, resy, resz, det;
    long ad, ab;
    // Runtime.getRuntime().exec("clear");
    // inicio del menú principal
    do {
     System.out.println("\n\n\n\n\n\n\n\n\t\tBIENVENID@");
     System.out.println("1) Problema de fuerza: ");
     System.out.println("2) Conversor:");
     System.out.println("3) Ecuaciones segundo grado.");
     System.out.println("4) Ordenar tres números.");
     System.out.println("5) Sucesión de Fibonacci.");
     System.out
       .println("6) Bucle de números aleatorios. ***(Sin salida WIP)***");
     System.out.println("7) Conversor de decimal a binario.");
     System.out.println("8) Información de discos.");
     System.out.println("9) Consola.");
     System.out.println("10) Array.");
     System.out.println("11) Pruebas");
     System.out.println("12) Matrices.");
     System.out.println("99) Salir:");

     op1 = scannerInt();
     // inicio primer switch
     switch (op1) {
     // inicio del menú problema fuerza
     /****************************************************************************/
     /****************************************************************************/
     case 1:// TODO

      

      do {

       System.out.println("1) La incógnita son la m.");
       System.out.println("2) La incógnita son la F.");
       System.out.println("3) La incógnita es la a.");
       System.out.println("99) Volver al menú.");

       op = scannerInt();

       switch (op) {

       case 1:
        
        System.out.println("Dime la fuerza:");
        f = scannerFloat();        
        System.out.println("Dime la aceleración:");
        a = scannerFloat();
        m = f / a;
        System.out.println("La masa vale:" + m + "Kg");
        break;

       case 2:
        do {
        System.out.println("Dime la masa:");
        m = scannerFloat();
        }while (compPos(m, "la masa no puede ser negativa"));
        System.out.println("Dime la aceleración:");
        a = scannerFloat();
        f = m * a;
        System.out.println("La fuerza vale:" + f + "N");
        break;

       case 3:

        
        System.out.println("Dime la fuerza:");
        f = scannerFloat();
        do {
         System.out.println("Dime la masa:");
         m = scannerFloat();
         }while (compPos(m, "la masa no puede ser negativa"));
        a = f / m;
        System.out.println("La aceleración vale: " + a
          + "m/s2");
        break;

       case 99:
        break;
       default:
        System.out.println("Introduce un número entre 1 y 3 o pulsa 99 para volver");
        break;
       } // second switch closed

      } while ((op >= 1) && (op <= 3) || (op != 99));// cierre
                  // segundo
                  // do
      // sa.close();//variable sa resolved
      break;
     // inicio programa conversor
     /****************************************************************************/
     /****************************************************************************/
     /****************************************************************************/
     case 2:// TODO
      
      do {
       System.out.println("1) Convertir de Km/h a m/s");
       System.out.println("2) Convertir de m/s a Km/h");
       System.out.println("99) Volver");
       op4 = scannerInt();
       switch (op4) {
       case 1:
        do{
        System.out.println("Introduce la velocidad en Km/h:");
        variable0 = scannerFloat();
        }while (compPos(variable0, "La velocidad positiva y mayor qeu cero por favor."));
        variable1 = (variable0 * 1000 / 3600);
        System.out.println("La velocidad es "+ variable1 + " m/s.");
        break;
       case 2:
        do{
        System.out.println("Introduce la velocidad en m/s:");
        variable0 = scannerFloat();
       }while (compPos(variable0, "La velocidad positiva y mayor qeu cero por favor."));
        variable1 = (variable0 * 3600 / 1000);
        System.out.println("La velocidad es "+ variable1 + " Km/h.");

        break;
       case 99:
        break;
       default:
        System.out.println("Valor no válido");
        break;

       }
      } while ((op4 >= 1) && (op4 <= 2) || (op4 != 99));
      break;
     case 3:// Ecuación segundo grado TODO

      
      System.out.println("Dame a:");
      a1 = scannerInt();
      System.out.println("Dame b:");
      b = scannerInt();
      System.out.println("Dame c:");
      c = scannerInt();
      radicando = (b * b) - (4 * c * a1) / (2 * a1);
      if (radicando >= 0) {
       r1 = (-b + (Math.sqrt(radicando)));
       r2 = (-b - (Math.sqrt(radicando)));

       System.out.println("Los resultado son " + r1 + " y " + r2);
      } else {
       System.out.println("No tiene solución real.");
      }

      break;// fin de ecuación
     case 4:// ordenar TODO

      
      do {
       System.out.println("\t ORDEN");
       orden += 1;
      } while (orden <= 5);
      System.out.println("Dame el primer número:");
      a2 = scannerInt();
      System.out.println("Dame el segundo número:");
      b2 = scannerInt();
      System.out.println("Dame el último número:");
      c2 = scannerInt();
      if ((a2 > b2) && (b2 > c2)) {
       System.out.print("El orden es " + a2 + ">" + b2 + ">" + c2 + "\n");
      } else if ((a2 > b2) && (c2 > b2) && (a2 > c2)) {
       System.out.print("El orden es " + a2 + ">" + c2 + ">" + b2 + "\n");
      } else if ((b2 > a2) && (c2 < a2)) {
       System.out.print("El orden es " + b2 + ">" + a2 + ">" + c2 + "\n");
      } else if ((b2 > a2) && (c2 > a2) && (b2 > c2)) {
       System.out.print("El orden es " + b2 + ">" + c2 + ">" + a2 + "\n");
      } else if ((c2 > a2) && (a2 > b2)) {
       System.out.print("El orden es " + c2 + ">" + a2 + ">" + b2 + "\n");
      } else if ((c2 > a2) && (b2 > a2) && (c2 > b2)) {
       System.out.print("El orden es " + c2 + ">" + b2 + ">" + a2 + "\n");
      } else {
       System.out.println("Por favor números distintos.");
      }
      break;
     case 5:// TODO Sucession

      
      do {
       System.out.println("1) Sucesión de Fibonacci");
       System.out.println("99)Salir");
       
       op3 = scannerInt();

       switch (op3) {
       case 1:

        phi = (1 + Math.sqrt(5)) / 2;
        System.out.println("El valor de phi es: " + phi);
        n = 0;
        while (n <= 34) {
         n = n + 1;
         fibonacci = (Math.pow(phi, n) - Math.pow((1 - phi), n)) / Math.sqrt(5);
         System.out.println("Fibonacci Es Igual:" + fibonacci);
         fibonacciphi = phi / fibonacci;
         System.out.println("El Phi De " + fibonacci + " Es: " + fibonacciphi);
        }// TODO
        break;
       case 99:
        break;
       default:
        System.out.println("Opción no válida");

        break;
       }
       // TODO

      } while ((op3 == 1) || (op3 != 99));
      // sop3.close();
      //
      break;
     /***************** BUcle ****************/
     case 6: // TODO random numbers

      while (d6 == 1) {
       Random rnd = new Random();
       a6 = (rnd.nextFloat() * 100);
       b6 = (rnd.nextFloat() * 100);
       c6 = (rnd.nextFloat() * 100);
       System.out.println(a6);
       System.out.println(b6);
       System.out.println(c6);
      }

      break;
     case 7:// TODO coverssor

      
      do {
       System.out.println("1) COnvertir de decimal a binario.");
       System.out.println("2) Convertir de binario a decimal.");
       System.out.println("99) Salir.");
       op7 = scannerInt();

       switch (op7) {
       case 1:

        do {
         do{
         System.out.println("Introduce el número decimal:");
         num = scannerInt();
         }while (compPos(num, "Introduce un número positivo"));
         if ((num >= 0) || (num <= 15)) {
          res = num % 2;// resto de la división,
          res2 = num / 2;// hay que conseguir
              // dividir el resultado
              // y quedarnos contodos
              // los restos hast aque
              // el resultado final
              // sea 1 o 0;
          System.out
            .println("El resto es:" + res);
          if ((res2 != 1) || (res2 != 0)) {
           res3 = res2 / 2;
           res = res2 % 2;
           System.out.println("El resto es:"+ res);

           res = res3 % 2;
           res3 = res3 / 2;

           System.out.println("El resto es:"+ res);
           // System.out.println("El resultado es:"
           // +res2);
          }
          System.out.println("El resultado es:"+ res3);
         }
        } while ((res3 != 1) && (res3 != 0));

        break;
       case 2:
        System.out.println("Introduce el número biario(4 dígitos):");
        num = scannerInt();
        if (num >= 0) {
         a9 = num % 10;
         b9 = num % 100 / 10;
         c9 = num % 1000 / 100;
         d9 = num % 10000 / 1000;
         // r=d9;
         // r=2*Math.pow(2, 3);
         r = (a9 * (Math.pow(2, 0))) + (b9 * (Math.pow(2, 1))) + (c9 * (Math.pow(2, 2))) + (d9 * (Math.pow(2, 3)));
         System.out.println("El número es:" + r);
        } else {
         System.out.println("Numero no valido");
        }
        break;
       case 99:
        System.out.println("Volviste al menu");
        break;
       default:
        System.out.println("Numero erroneo");
        break;
       }
      } while (((op7 >= 1) && (op7 <= 2)) || (op7 != 99));
      break;
     case 8:
      File[] unidades = File.listRoots();

      System.out.printf("   %20s %20s %n", "Tamaño Total", "Tamaño disponible");
      for (File f1 : unidades) {
       System.out.print(f1);
       ad = f1.getTotalSpace() / 1024 / 1024 / 1024;
       ab = f1.getFreeSpace() / 1024 / 1024 / 1024;
       System.out.printf("%20s %20s %n", ad + " GB", ab + " GB");
      }
      break;
     case 9:// TODO console

      // static void main (String[] args){
      
      System.out.println("1) Desea continuar");
      System.out.println("2) Volver");

      conversor = scannerInt();
      do {
       switch (conversor) {
       case 1:
        
        // Scanner sop9= new Scanner (System.in);
        System.out.println("Introduce el comando:");
        comando = scannerString();

        if (comando != "ex") {
         Process p = Runtime.getRuntime().exec(comando);

         BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));

         BufferedReader stdError = new BufferedReader(new InputStreamReader(p.getErrorStream()));

         // Leemos la salida del comando
         System.out.println("Ésta es la salida standard del comando:\n");
         while ((s = stdInput.readLine()) != null) {
          System.out.println(s);

         }
         while ((s = stdError.readLine()) != null) {
          System.out.println(s);
         }

        }

        break;
       case 2:

        System.out.println("Saliste");
        break;
       default:
        break;
       }
      } while (((conversor == 1) && (jk == 0))|| (conversor != 2));

      break;
     case 10:// TODO array
      int tabla[] = new int[3];
      tabla[0] = 1;
      tabla[1] = 2;
      tabla[2] = 3;
      System.out.println(tabla[1]);
      System.out.println(tabla[2]);
      System.out.println(tabla[0]);

      break;
     case 11://
      System.out.println("Pruebas furturas;");
      new Grafico();
      
      break;
     case 99: // TODO exit
      System.out.println("Saliste del programa");
      break;
     default:
      System.out.println("Opción incorrecta.");
      break;
     //
     }// cierre primer switch
    } while (((op1 >= 1) && (op1 <= 11)) || (op1 != 99));// cierre
                  // primer
                  // do
    // sop1.close();//cierre de la variable sop linea5

   case 12:
     do{
   
   System.out.println("Hola.");
   System.out.println("�Que operaci�n desea realizar?");
   System.out.println("1-Determinante.");
   System.out.println("2-Operar matrices.");
   System.out.println("99-WIP");
    elec=scannerInt();
    switch(elec){
    
      case 1:
        System.out.println("Matriz de 3x3");
        System.out.println("dame el primer plano.");
        x0=scannerFloat();
        y0=scannerFloat();
        z0=scannerFloat();
        System.out.println("Danme le segundo plano");
        x1=scannerFloat();
        y1=scannerFloat();
        z1=scannerFloat();
        System.out.println("Dame el tercer plano");
        x2=scannerFloat();
        y2=scannerFloat();
        z2=scannerFloat();
        
        det=(x0*y1*z2)+(x1*y2*z0)+(x2*y0*z1)-(x0*z1*y2)-(y0*x1*z2)-(z0*y1*x2);
        System.out.println("El resultado del determinate es: " +det);
        break;
      case 2:
        break;
      case 99:
        break;
    }
   }while ((elec==1) || (elec==2));    

    break;
    
   case 99:
    System.out.println("Saliste");
    break;
   default:
    System.out.println("Opción no válida.");
    break;
   }
  } while (((menu >= 1) && (menu <= 2)) || (menu != 99));
  
 }
}
  