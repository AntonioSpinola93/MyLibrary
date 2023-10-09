package com.FoskoSpringbootTr.MyLibrary.Service;

import com.FoskoSpringbootTr.MyLibrary.Repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class LibroService {
    @Autowired
    private LibroRepository libroRepository;
    public LibroService(LibroRepository libroRepository){
        this.libroRepository=libroRepository;
    }



}
