package com.example.imageUpload.demo.image.Controller;

import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.imageUpload.demo.image.model.Documents;
import com.example.imageUpload.demo.image.service.DocumentService;

@RestController
@RequestMapping("/image")
public class DocumentController {
	
	@Autowired
	DocumentService documentService;
	
	
	
	
	@PostMapping("/upload")
	public void uploadImage(@RequestParam("file") MultipartFile file) throws IOException {
		
		documentService.uploadImage(file);
	}
	
    @GetMapping("/download")
    public ResponseEntity<Documents> getData(@RequestParam("id") long id){
    	
    	Documents d1=documentService.getData(id);
    	
    	return new ResponseEntity<Documents>(d1,HttpStatus.OK);
    }
    
   @GetMapping("/transfer")
   public ResponseEntity<Documents> saveImage(@RequestParam("id") long id){
	   Documents dd=documentService.saveImage(id);
	   
	   return new ResponseEntity<Documents>(dd,HttpStatus.OK);
   }
 
}
	
	


	



