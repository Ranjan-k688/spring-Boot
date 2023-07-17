package com.example.imageUpload.demo.image.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import org.hibernate.annotations.RowId;

import lombok.Data;

@Entity
@Data
@Table(name = "uploadPic")
public class Documents {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String imageName;
    private String type;
	private String path;
	
	@Lob
	private byte[] uplod;
	

	public void setPath(byte[] uplod) {
		this.uplod=uplod;
		
	}

	public void setPath(String path) {
		
		this.path=path;
		
	}



	
	



	
}

	


