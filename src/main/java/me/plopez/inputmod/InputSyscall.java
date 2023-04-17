package me.plopez.inputmod;

import mars.ProcessingException;
import mars.ProgramStatement;
import mars.mips.hardware.RegisterFile;
import mars.mips.instructions.syscalls.AbstractSyscall;
import mars.util.SystemIO;

public class InputSyscall extends AbstractSyscall {

	public InputSyscall() {
		super(60, "ReadKey");
	}

	@Override
	public void simulate(ProgramStatement statement) throws ProcessingException {
		char keyCode = (char) RegisterFile.getValue(4); // Read parameter from a0
		RegisterFile.updateRegister(2, Keyboard.isKeyPressed(keyCode) ? 1 : 0);
	}

}
