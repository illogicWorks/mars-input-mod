# Input Mod

This mod adds a new syscall to check if a keyboard key is being pressed, without blocking code execution.

## Usage

Make sure you have [Deimos](https://github.com/illogicWorks/deimos) installed.

Download the latest release mod, add it to your mods folder, and that's it!

| Syscall Code ($v0) | Parameters               | Return value                          | Description                                                           |
|--------------------|--------------------------|---------------------------------------|-----------------------------------------------------------------------|
|         60         | $a0 = key character code | $v0 = 1 \| 0 `1` if true `0` if false | Checks if the key with specified character code is currently pressed. |

### Example
```asm
.text
li $v0, 60 #; Load syscall code into $v0
li $a0, 'a' #; Load charcode for the "a" key
syscall
#; If the "a" key was pressed during the syscall there is a 1 in $v0, else there is a 0.
```

## License

This mod is under GPLv3. Check the [`LICENSE`](LICENSE) file for more information.
