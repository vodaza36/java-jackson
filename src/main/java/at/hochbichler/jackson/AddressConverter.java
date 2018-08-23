package at.hochbichler.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class AddressConverter {
    public AddressDTO toAddressDTO(String jsonFile) throws IOException {

        ObjectMapper om = new ObjectMapper();
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource(jsonFile).getFile());

        AddressDTO dto = om.readValue(file, AddressDTO.class);

        return dto;
    }
}
