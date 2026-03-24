/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 10726112374
 */
import javax.swing.*;
public class Principal {
public static void main(String args[]) {
    int i, flag;
    int numElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de pessoas a ser cadastrado "));
    String vetorPesquisado[] = new String[numElementos];
    for(i=0; i<numElementos;i++){
        vetorPesquisado[i] = JOptionPane.showInputDialog("Digite o nome para cadastro");
        }
    String elementoProcurado = JOptionPane.showInputDialog("Digite o nome a ser procurado");
    flag = 0;
    for(i=0; i<numElementos;i++){
        if (vetorPesquisado[i].equalsIgnoreCase(elementoProcurado)){
            JOptionPane.showMessageDialog(null,"o valor procurado foi encontrado na posição "+i);
            flag = 1;
            }
}
    if (flag == 0){
        JOptionPane.showMessageDialog(null, "o nome não foi encontrado.");
    }
}
}
