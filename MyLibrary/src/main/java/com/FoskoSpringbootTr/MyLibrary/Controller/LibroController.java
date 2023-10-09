package com.FoskoSpringbootTr.MyLibrary.Controller;

import com.FoskoSpringbootTr.MyLibrary.Dto.LibroDto;
import com.FoskoSpringbootTr.MyLibrary.Service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/libro")
public class LibroController {
    private final LibroService libroService;
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
    @GetMapping("/{id}")
    public LibroDto findById(@PathVariable Long id){
        return libroService.findById(id);
    }
    @PutMapping("/{id}")
    public LibroDto updateById(@PathVariable Long id,@RequestBody LibroDto libroDto){
        return libroService.updateById(id,libroDto);
    }
    @DeleteMapping("/{id}")
    public LibroDto deleteById(@PathVariable Long id){
        return libroService.deleteById(id);
    }
}
