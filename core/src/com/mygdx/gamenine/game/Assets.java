package com.mygdx.gamenine.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.AssetDescriptor;
import com.badlogic.gdx.assets.AssetErrorListener;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.sun.media.jfxmediaimpl.MediaDisposer;

public class Assets implements MediaDisposer.Disposable, AssetErrorListener{

    public final String TAG = Assets.class.getName();

    AssetManager assetManager;
    TextureAtlas frontAndBack;
    TextureAtlas sides;

    TextureAtlas.AtlasRegion backgroundFront;
    TextureAtlas.AtlasRegion backgroundSide;



    public Assets(){
        init();
    }

    private void init(){

        //fix and finish setting up ASSET Manager
        assetManager = new AssetManager();
        assetManager.load("assets/frontAndBack.atlas", TextureAtlas.class);
        //assetManager.finishLoading();
        //assetManager.load("assets/sides.atlas", TextureAtlas.class);
        //assetManager.finishLoading();
        frontAndBack = assetManager.get("frontAndBack.atlas");
        //sides = assetManager.get("sides.atlas");

        Gdx.app.log(TAG, "Number of assets loaded: " + assetManager.getAssetNames().size);
    }


    @Override
    public void error(AssetDescriptor asset, Throwable throwable) {

    }

    @Override
    public void dispose() {

    }
}
