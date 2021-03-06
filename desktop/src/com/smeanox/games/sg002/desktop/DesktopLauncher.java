package com.smeanox.games.sg002.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.badlogic.gdx.graphics.Texture;
import com.smeanox.games.sg002.SG002;
import com.smeanox.games.sg002.util.Consts;

public class DesktopLauncher {
	public static void main (String[] arg) {
		Consts.textureFilter = Texture.TextureFilter.MipMapLinearLinear;

		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = Consts.devWidth * 2;
		config.height = Consts.devHeight * 2;
		// uncomment this line for production (commented so window can be resized to test different screenSizes faster)
		//config.samples = 32;

		new LwjglApplication(new SG002(), config);
	}
}
