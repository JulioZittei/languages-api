package br.com.alura.languagesapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.languagesapi.domain.Language;
import br.com.alura.languagesapi.repositories.LanguageRepository;

@RestController
public class LanguageController {
	
	@Autowired
	private LanguageRepository languageRepository;

    @GetMapping("/favorite-language")
    public String getFavoriteLanguage() {
       return "Java";
    }

    @GetMapping("/languages")
    public List<Language> getLanguages() {
       return languageRepository.findAll();
    }
    
    @PostMapping(value = "/languages" )
    @ResponseStatus(code = HttpStatus.CREATED)
    public Language createLanguage(@RequestBody Language newLanguage) {
       return languageRepository.save(newLanguage);
    }
}
