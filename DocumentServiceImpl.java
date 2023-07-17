package com.example.imageUpload.demo.image.serviceimpl;

import java.io.File;
import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.imageUpload.demo.image.model.Documents;
import com.example.imageUpload.demo.image.repositroy.DocumentRepository;
import com.example.imageUpload.demo.image.service.DocumentService;

@Service
public class DocumentServiceImpl implements DocumentService {
	
	@Autowired
	DocumentRepository  documentRepository;

	@Override
	public Documents uploadImage(MultipartFile file) throws IOException
	 {	
			
			    Documents pImage = new Documents();
		        pImage.setImageName(file.getOriginalFilename());
		        pImage.setPath("E:\\Ranjan\\" + file.getOriginalFilename());
		        pImage.setPath(file.getBytes());
				pImage.setType(file.getContentType());
				
				   File localFile = new File(pImage.getPath());
				    file.transferTo(localFile);
				    
				return documentRepository.save(pImage);
	 }



	@Override
	public Documents saveImage(long id) {
		
		Documents Image = new Documents();
		
		return null;
	}



	@Override
	public Documents getData(long id) {
		// TODO Auto-generated method stub
		return null;
	}
	


}
	

