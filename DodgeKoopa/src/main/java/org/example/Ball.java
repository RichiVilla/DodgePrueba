package org.example;

import java.util.Random;

public class Ball {
    private int x;
    private int y;
    private final String imagePath;

    public Ball(int boardWidth, int boardHeight, String imagePath) {
        Random random = new Random();
        this.x = random.nextInt(boardWidth);
        this.y = random.nextInt(boardHeight);
        this.imagePath = imagePath;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getImagePath() {
        return imagePath;
    }

    // Método para verificar si la pelota es "agarrada" por un Character
    public boolean isGrabbedBy(Character character) {
        return this.x == character.getX() && this.y == character.getY();
    }
}
