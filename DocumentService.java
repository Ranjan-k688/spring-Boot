package com.example.imageUpload.demo.image.service;

import java.io.IOException;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.imageUpload.demo.image.model.Documents;

@Service
public interface DocumentService {

	Documents uploadImage(MultipartFile file) throws IOException;

	Documents getData(long id);

	Documents saveImage(long id);

	



	


	
}
