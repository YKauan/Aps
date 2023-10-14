package src.functions.java;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Buscas {
    
    private String found;

    private int index;

    public void buscaLinear(ArrayList<?> arr, String value){

        for (int i = 0; i < arr.size(); i++) {
            
            if(arr.get(i).toString().equals(value)){
                found = arr.get(i).toString();
                index = i;
                break;
            }
            
        }

        if(found != null){
            JOptionPane.showMessageDialog(null, "Encontrado: " + found + " na posição: " + index);
        }else{
            JOptionPane.showMessageDialog(null, value + " Não encontrado");
        }
    }

    public void buscaBinaria(ArrayList<?> arr, String value){

        int inicio = 0, fim = arr.size()-1;
        
        int meio;
        
        while (inicio <= fim) {
        
            meio = (inicio + fim) / 2;
        
            if (arr.get(meio).toString().equals(value)){
                found = arr.get(meio).toString();
                index = meio;
            }
        
            if (arr.get(meio).toString().compareToIgnoreCase(value) > 0){
            
                fim = meio - 1;

            } else {
        
                inicio = meio + 1;
            }

        }
        
        if(found != null){
            JOptionPane.showMessageDialog(null, "Encontrado: " + found + " na posição: " + index);
        }else{
            JOptionPane.showMessageDialog(null, value + " Não encontrado");
        }
    }

}
