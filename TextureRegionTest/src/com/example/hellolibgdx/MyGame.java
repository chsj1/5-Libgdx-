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
		 * ���캯���е���5����������˼�ֱ�����:
		 * texture:��Ҫ��ȡ��texture
		 * x: ��ȡ�����Ͻǵ�λ�õ�x�������
		 * y: ��ȡ�����Ͻǵ�λ�õ�y�������
		 * width: ��Ҫ��ȡ�Ŀ��
		 * height: ��Ҫ��ȡ�ĸ߶�
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
		Gdx.gl.glClearColor(1, 1, 1, 1);// ���ñ���Ϊ��ɫ
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);// ����
		
		
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
