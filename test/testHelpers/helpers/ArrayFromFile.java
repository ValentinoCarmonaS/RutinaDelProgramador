package test.testHelpers.helpers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayFromFile {

    public static int[] arrayFromFile(String path) throws IOException {
        try (Stream<String> lines = Files.lines(Path.of(path))) {
            return lines
                    .flatMap(line -> Arrays.stream(line.split(",")))
                    .map(String::trim)
                    .filter(s -> !s.isEmpty())
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
    }
}
