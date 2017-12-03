package org.biwenger.helper;

import org.biwenger.jsonmapper.BiwengerObjectMapper;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;

public abstract class DeserializingTestHelper {

    public BiwengerObjectMapper objectMapper = new BiwengerObjectMapper();
    private static final String TEST_RESOURCES_PATH = "src/test/resources/";

    public File loadFileFromTestResources(String pRelativePath) throws FileNotFoundException {
        return ResourceUtils.getFile(TEST_RESOURCES_PATH + pRelativePath);
    }

}
