import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class DataToObj {
    public static void Mapper() {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            File jsonFile = new File("src/jsonData/movies.json");
            objectMapper.readValue(jsonFile, new TypeReference<MovieLibrary>() {
            });

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
