package com.liceotrujillo.apiclt.news.infrastructure.output.s3;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutObjectRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.UUID;

@Service
public class AwsS3Service {
    private final static String BUCKET = "apiltimages";

    @Autowired
    private AmazonS3 s3Client;

    public String putObject(MultipartFile file){
        String extension = StringUtils.getFilenameExtension(file.getOriginalFilename());
        String key = String.format("%s.%s", UUID.randomUUID(),extension);

        ObjectMetadata objectMetadata = new ObjectMetadata();
        objectMetadata.setContentType(file.getContentType());

        try {
            PutObjectRequest putObjectRequest = new PutObjectRequest(BUCKET,key,file.getInputStream(),objectMetadata);
            s3Client.putObject(putObjectRequest);
            return key;
        }catch (IOException ex){
            throw new RuntimeException(ex);
        }
    }

    public String getUrlImage(String key){
        return String.format("https://%s.s3.amazonaws.com/%s",BUCKET,key);
    }


}
