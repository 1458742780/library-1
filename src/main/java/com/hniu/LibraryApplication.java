package com.hniu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.hniu.mapper")
public class LibraryApplication {//extends SpringBootServletInitializer

    public static void main(String[] args) {
        SpringApplication.run(LibraryApplication.class, args);
    }

//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//        return application.sourc-es(LibraryApplication.class);
//    }

}
