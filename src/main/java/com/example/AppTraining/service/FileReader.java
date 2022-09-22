package com.example.AppTraining.service;

import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

@Service
public class FileReader {

    public String reader(String path) throws IOException {
        return new String(Files.readString(Path.of(path)));
    }
}
