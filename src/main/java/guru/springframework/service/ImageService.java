package guru.springframework.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;

public interface ImageService {

    void saveImageFile(Long recipeId, MultipartFile image);

}
