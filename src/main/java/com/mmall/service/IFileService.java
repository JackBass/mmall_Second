package com.mmall.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 * Created by tony on 03/10/2018.
 */
@Service("iFileService")
public interface IFileService {
    String upload(MultipartFile file, String path);

}
