package com.darkredgm.formulariogui.Components;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class SidePanel extends JPanel {

    private Image background;

    public SidePanel() {
        try {
            background = ImageIO.read(getClass().getResourceAsStream("/imgs/side.jpg"));
            if (background == null) {
                System.err.println("Image not found at /imgs/side.jpg");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (background != null) {
            g.drawImage(background, 0, 0, getWidth(), getHeight(), this);
        }
    }
}
