package com.example.mixin;

import java.util.ArrayList;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import com.example.InputSyscall;

import mars.MarsLaunch;

// Modify the MarsLaunch class
@Mixin(targets = "mars/mips/instructions/SyscallLoader")
public class SyscallLoaderMixin {
	
	@Shadow
	private ArrayList syscallList;
	
	@Inject(method = "mars/mips/instructions/SyscallLoader.loadSyscalls()V", at = @At("TAIL"))
	private void initHook(CallbackInfo ci) {
		syscallList.add(new InputSyscall());
	}
}
