package com.FoskoSpringbootTr.MyLibrary.Controller;

import com.FoskoSpringbootTr.MyLibrary.Dto.LibroDto;
import com.FoskoSpringbootTr.MyLibrary.Service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/libro")
public class LibroController {
    private LibroService libroService;
    @Autowired
    public LibroController(LibroService libroService){
        this.libroService=libroService;
    }
    @GetMapping("/libri")
    public List<LibroDto>findLibri(){
        return libroService.findAll();
    }
    @PostMapping("/add")
    public LibroDto addLibro(@RequestBody LibroDto libroDto){
        return libroService.addLibroDto(libroDto);
    }
}
