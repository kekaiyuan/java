package com.kky.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

@Controller
public class UploadController {

    @RequestMapping("/upload")
    public void upload(@RequestParam("file") MultipartFile[] multipartFile, @RequestParam(value = "desc", required =
            false) String desc) throws Exception {

        //文件描述
        System.out.println(desc);

        for (MultipartFile file : multipartFile) {
            if(!file.isEmpty()){
                //文件名称
                System.out.println(file.getOriginalFilename());
                //将文件传输到指定目录
                file.transferTo(new File("d:\\file\\" + file.getOriginalFilename()));
            }
        }
    }
}
