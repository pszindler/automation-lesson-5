import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class DataToObj {
    static final String json = "src/jsonData/movies.json";

    public static MovieLibrary Mapper() {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            File jsonFile = new File("src/jsonData/movies.json");
            MovieLibrary lib = objectMapper.readValue(jsonFile, new TypeReference<MovieLibrary>() {
            });
            return lib;

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
