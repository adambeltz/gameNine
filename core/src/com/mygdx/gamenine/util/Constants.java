package com.mygdx.gamenine.util;

import com.badlogic.gdx.Gdx;

public class Constants {

    public static final float ASPECT_RATIO = (float)Gdx.graphics.getHeight() / (float)Gdx.graphics.getWidth();


    // Sets up camera for 100 * 100 keeping screen's aspect ratio
    public static final float VIEWPORT_WIDTH = 100;
    public static final float VIEWPORT_HEIGHT = 100 * ASPECT_RATIO;
}
