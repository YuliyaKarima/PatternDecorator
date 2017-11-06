package service;

import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.Assert.*;

public class ReportCreatorTest {
    ReportCreator creator = new ReportCreator();

    @Test
    public void createReport() throws Exception {
        //given
        String filepath1 = "Report 1";
        String filepath2 = "Report 2";
        String filepath3 = "Report 3";
        //when
        creator.createReport(filepath1, filepath2, filepath3);
        //then
        assertEquals("test failed", true, Files.exists(Paths.get(filepath1)));
        assertEquals("test failed", true, Files.exists(Paths.get(filepath2)));
        assertEquals("test failed", true, Files.exists(Paths.get(filepath3)));
    }
}