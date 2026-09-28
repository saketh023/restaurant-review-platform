package com.sakeva.restaurant.services;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.util.Optional;

public interface StorageService {

    // images are stored as multipart files when being passed to a spring controller
    String store(MultipartFile file, String filename);

    Optional<Resource> loadAsResource(String id);
}
