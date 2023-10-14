package src.styles;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JRadioButton;


public class Styles {

    //=> Metodo responsavel por definir os estilos dos meus JButtons exit Button
    public void styleJButtonsExitButton(JButton button) {

        button.setIcon(new ImageIcon("./src/images/close.png"));
        button.setBorder(null);
        button.setBorderPainted(false);
        button.setOpaque(true);
        button.setFocusPainted(false);
        button.setContentAreaFilled(false);

    }

    //=> Metodo responsavel por definir os estilos dos meus JRadioButton
    public void styleRadButton(JRadioButton radButton) {

        ImageIcon radSelected   = new ImageIcon("./src/images/selected.png");
        ImageIcon radNoSelected = new ImageIcon("./src/images/noSelected.png");
        
        Image selectedImage    = radSelected.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        Image notSelectedImage = radNoSelected.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);

        ImageIcon radSelectedIcon   = new ImageIcon(selectedImage);
        ImageIcon radNoSelectedIcon = new ImageIcon(notSelectedImage);

        radButton.setSelectedIcon(radSelectedIcon);
        radButton.setIcon(radNoSelectedIcon);
        radButton.setOpaque(false);
        radButton.setFocusPainted(false);
        radButton.setBorder(null);
        radButton.setForeground(Color.WHITE);
    }

    //=> Metodo responsavel por definir o estilo do Label de imagem
    public void styleImageLabel(JLabel label, String fileName) {

        ImageIcon image   = new ImageIcon(fileName);
        
        Image selectedImage    = image.getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH);

        label.setIcon(new ImageIcon(selectedImage));

    }
}