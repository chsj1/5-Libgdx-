package com.example.hellolibgdx;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class MyGame implements ApplicationListener {

	Texture texture;
	TextureRegion region;
	SpriteBatch batch;
	
	@Override
	public void create() {
		texture = new Texture(Gdx.files.internal("data/test1.jpg"));
		
		/**
		 * TextureRegion(Texture texture, int x, int y, int width, int height)
		 * 构造函数中的这5个参数的意思分别如下:
		 * texture:需要截取的texture
		 * x: 截取的左上角的位置的x轴的坐标
		 * y: 截取的左上角的位置的y轴的坐标
		 * width: 需要截取的宽度
		 * height: 需要截取的高度
		 */
		region = new TextureRegion(texture, 0, 0, 256, 256);
		batch = new SpriteBatch();
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub

	}
	
	
	
	
	@Override
	public void render() {
		Gdx.gl.glClearColor(1, 1, 1, 1);// 设置背景为白色
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);// 清屏
		
		
		batch.begin();
		
		batch.draw(region, 0, 0);
		
		
		batch.end();
	}

	@Override
	public void resize(int arg0, int arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub

	}

}
