package com.test;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RuleTest {

    @Rule
    public TemporaryFolder tmpFolder = new TemporaryFolder();

    @Test
    public void shouldCreateNewFileInTemporaryFolder() throws IOException {

        File createdFile = tmpFolder.newFile("file.txt");

        assertTrue(createdFile.isFile());
        assertEquals(tmpFolder.getRoot(), createdFile.getParentFile());
    }
}
