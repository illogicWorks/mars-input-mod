package com.example.mixin;

import org.spongepowered.asm.mixin.Mixin;

import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import mars.MarsLaunch;

// Modify the MarsLaunch class
@Mixin(MarsLaunch.class)
public class ExampleMixin {
	// Inject at the tail of the constructor
	@Inject(method = "<init>", at = @At("TAIL"))
	private void initHook(String[] args, CallbackInfo ci) {
		System.out.println("This line is printed by an example mod mixin!");
	}
}
