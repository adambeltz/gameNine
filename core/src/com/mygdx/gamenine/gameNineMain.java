package com.mygdx.gamenine;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.mygdx.gamenine.game.Assets;
import com.mygdx.gamenine.game.WorldController;
import com.mygdx.gamenine.game.WorldRenderer;

public class gameNineMain extends ApplicationAdapter {
	WorldController worldController;
	WorldRenderer worldRenderer;
	public static Assets assets;

	@Override
	public void create () {
		assets = new Assets();
		worldController = new WorldController();
		worldRenderer = new WorldRenderer(worldController);

	}

	@Override
	public void render () {
		worldController.update(Gdx.graphics.getDeltaTime());
		Gdx.gl.glClearColor(0.57f, 0.77f, 0.85f, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		worldRenderer.render();
	}
	
	@Override
	public void dispose () {
		worldRenderer.dispose();
		assets.dispose();

	}
}
