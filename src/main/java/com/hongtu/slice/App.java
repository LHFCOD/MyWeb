package com.hongtu.slice;

import com.platform.util.ExtractFile;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {
    public static ExtractFile mdsFile;
    public static void main(String[] args){
       mdsFile=new ExtractFile("/home/mi/project/slicePro/sliceapi/data/1.mds");
        SpringApplication.run(App.class, args);
    }
}
