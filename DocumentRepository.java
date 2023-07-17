package com.example.imageUpload.demo.image.repositroy;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.imageUpload.demo.image.model.Documents;

public interface DocumentRepository extends JpaRepository<Documents, Long> {



}
