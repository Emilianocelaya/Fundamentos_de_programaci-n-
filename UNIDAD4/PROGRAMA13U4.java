/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programa13u4;

/**
 *
 * @author Emiliano
 */
public class PROGRAMA13U4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      float[][] temp = new float[5][];
            for (int f = 0; f < 5; f++)
            {
                temp[f] = new float[7];
                for (int c = 0; c < 7; c++)
                {
                    System.out.print("Escribe temperatura en (" + f + ", " + c + ")");

                    temp[f][c] = float.Parse(System.out.print());
                }
            }
            float[][] TempF = new float[5][];
            for (int f = 0; f < 5; f++)
            {
                TempF[f] = new float[7];
                for (int c = 0; c < 7; c++)
                {
                    TempF[f][c] = (temp[f][c] * 9 / 5) + 32;
                    System.out.print("Grados Farenheit en (" + f + ", " + c + ")" + TempF[f][c] + ",");
                }
                System.out.print();
            }
        }
    }

        
    
    

