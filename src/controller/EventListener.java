package controller;


import model.Direction;

/**
 * Created by Sukora Stas.
 */
public interface EventListener {

    void move(Direction direction);

    void restart();

    void startNextLevel();

    void levelCompleted(int level);

}
