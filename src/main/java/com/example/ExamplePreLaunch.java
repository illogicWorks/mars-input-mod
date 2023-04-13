package com.example;

import net.fabricmc.loader.api.entrypoint.PreLaunchEntrypoint;

public class ExamplePreLaunch implements PreLaunchEntrypoint {
	// Runs before Mars is loaded. Loading Mars classes here can cause several issues!
	// Use a mixin into an early place if you need to run some initialization code
	// before main entrypoints are implemented in Deimos
	@Override
	public void onPreLaunch() {
		System.out.println("This line is printed by an example mod prelaunch entrypoint!");
	}
}
