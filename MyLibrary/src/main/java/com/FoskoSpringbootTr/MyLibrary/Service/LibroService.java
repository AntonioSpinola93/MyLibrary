package com.FoskoSpringbootTr.MyLibrary.Service;

import com.FoskoSpringbootTr.MyLibrary.Dto.LibroDto;
import com.FoskoSpringbootTr.MyLibrary.Entity.Libro;
import com.FoskoSpringbootTr.MyLibrary.Repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class LibroService {
    @Autowired
    private LibroRepository libroRepository;
    public LibroService(LibroRepository libroRepository){
        this.libroRepository=libroRepository;
    }
    public LibroDto addLibroDto(LibroDto libroDto){
        Libro libro=new Libro();
        libro.setNomeProdotto(libroDto.getNomeProdotto());
        libro.setAutore(libroDto.getAutore());
        libro.setIsbn(libroDto.getIsbn());
        libro.setPrezzo(libroDto.getPrezzo());
        libroRepository.save(libro);
        libroDto.setNomeProdotto(libro.getNomeProdotto());
        libroDto.setAutore(libro.getAutore());
        libroDto.setIsbn(libro.getIsbn());
        libroDto.setPrezzo(libro.getPrezzo());
        return libroDto;
    }
    public List<LibroDto> findAll(){
        List<Libro> listaLibri= libroRepository.findAll();
        List<LibroDto>libroDtoList=new ArrayList<>();
        for(Libro libro:listaLibri){
            libroDtoList.add( new LibroDto(libro.getId(),libro.getNomeProdotto(),libro.getAutore(),
                    libro.getIsbn(),libro.getPrezzo()));
        }
        return libroDtoList;
    }
}
