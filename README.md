# Deimos Example Mod

A template mod for using [Deimos](https://github.com/illogicWorks/Deimos) to mod Mars, using the Fabric modding toolchain.

## Usage

Download the example mod, change the values in the `gradle.properties` and `fabric.mod.json`, and replace all `modid` you find,
drop the `Mars.jar` in this directory and start modding.

To debug your mod, create a launch configuration with the main class being `KnotClient` (`net.fabricmc.loader.impl.launch.knot.KnotClient`)
and the vm argument `-Dfabric.development=true`. It's also recommended to change the working directory to the `run` folder (in Eclipse you can just do: `${workspace_loc:NameOfYourProject}/run/`). You can also use the gradle run task instead, but a run configuration is generally better.

Optionally (though not tested), the Mixin support from the MCDev plugin may be useful for modding with Deimos, and you should also be able to
setup the annotation processor for Eclipse as mentioned in the Mixin readme.

It's likely that checking FabricMC's resources on mixins and starting modding will be useful if you haven't ever used them.

To build the mod, run `gradlew build` (`./gradlew build` on linux), the resulting jar will be in `build/libs/`.

## License

This template is under CC0. Make sure you remember to change the `LICENSE` file if you want your mod under a different license!
