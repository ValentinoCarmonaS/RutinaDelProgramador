package test.testHelpers.helpers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public class ArrayFromFile {

    public static int[] arrayFromFile(String path) throws IOException {
        return Arrays.stream(Files.readString(Path.of(path)).trim().split(","))
        .mapToInt(Integer::parseInt)
        .toArray();
    }
    
}
