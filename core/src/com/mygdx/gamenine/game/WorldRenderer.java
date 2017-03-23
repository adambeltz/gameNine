package com.mygdx.gamenine.game;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.Disposable;
import com.mygdx.gamenine.util.Constants;

public class WorldRenderer implements Disposable {

    OrthographicCamera camera;
    SpriteBatch batch;
    WorldController worldController;


    public WorldRenderer (WorldController worldController){
        this.worldController = worldController;
        init();

    }

    private void init(){
        camera = new OrthographicCamera(Constants.VIEWPORT_WIDTH, Constants.VIEWPORT_HEIGHT);
        camera.position.set(camera.viewportWidth / 2f, camera.viewportHeight / 2f, 0);
        batch = new SpriteBatch();
        camera.update();
    }

    public void render(){
        renderWorld(batch);
    }

    public void renderWorld(SpriteBatch batch){
        batch.setProjectionMatrix(camera.combined);
        camera.update();

        batch.begin();

        batch.end();

    }

    @Override
    public void dispose() {
        batch.dispose();
    }
}
