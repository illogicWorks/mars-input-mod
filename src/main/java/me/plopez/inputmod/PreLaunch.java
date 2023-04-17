package me.plopez.inputmod;

import net.fabricmc.loader.api.entrypoint.PreLaunchEntrypoint;

public class PreLaunch implements PreLaunchEntrypoint {
	// Runs before Mars is loaded. Loading Mars classes here can cause several issues!
	// Use a mixin into an early place if you need to run some initialization code
	// before main entrypoints are implemented in Deimos
	@Override
	public void onPreLaunch() {
		System.out.println("[PreLaunch] Starting InputMod!");
		Keyboard.isKeyPressed('0'); // Call static class to register keyboard event
	}
}
