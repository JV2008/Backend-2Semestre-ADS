package bloconotas;

import java.util.Scanner;

import javax.swing.JOptionPane;

import bloconotas.model;

public class app {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String title = JOptionPane.showInputDialog("Digite o nome do arquivo que deseja criar: ");

        model arquivo3 = new model(title);
       
    
        arquivo3.edit("Ingredientes: \n- 1 xícara de farinha de trigo\n- 1/2 xícara de açúcar\n- 1/4 xícara de manteiga\n- 1 ovo\n- 1 colher de chá de fermento em pó\n- 1/2 xícara de leite\n- 1 colher de chá de essência de baunilha");
    
        JOptionPane.showMessageDialog(null, 
        arquivo3.open());
    }
}
