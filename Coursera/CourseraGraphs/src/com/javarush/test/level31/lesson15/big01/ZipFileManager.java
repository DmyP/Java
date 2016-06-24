package com.javarush.test.level31.lesson15.big01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipFileManager {
    private Path zipFile = null;

    public ZipFileManager(Path zipFile) {
        this.zipFile = zipFile;
    }

    public void createZip(Path source) throws Exception{
        try (ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(zipFile.toFile()))) {
            ZipEntry zipEntry = new ZipEntry(source.getFileName().toString());
            zipOutputStream.putNextEntry(zipEntry);

            try (InputStream inputStream = Files.newInputStream(source)){
                byte[] buffer = new byte[1024];
                int bytes = -1;
                while ((bytes = inputStream.read(buffer)) > -1) {
                    zipOutputStream.write(buffer, 0, bytes);
                }
                zipOutputStream.flush();
            }

        zipOutputStream.closeEntry();
        }
    }
}
