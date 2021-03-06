package com.smeanox.games.sg002.player;

import com.smeanox.games.sg002.world.Action;

/**
 * A real player that plays locally
 *
 * @author Benjamin Schmid
 */
public class LocalPlayer extends Player {
	public LocalPlayer() {
	}

	@Override
	protected void play() {

	}

	@Override
	public void update(float delta) {

	}

	@Override
	public boolean proposeAction(Action action) {
		return gameController.getGameWorld().doAction(action);
	}

	@Override
	public boolean proposeEndPlaying() {
		endPlaying();
		return true;
	}
}
