import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class DataToObj {
    public static MovieLibrary mapJsonToObj(String jsonFileSource) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            File jsonFile = new File(jsonFileSource);
            return objectMapper.readValue(jsonFile, new TypeReference<>() {
            });

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

    }
}
