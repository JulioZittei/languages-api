package br.com.alura.languagesapi.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import br.com.alura.languagesapi.domain.Language;

public interface LanguageRepository extends MongoRepository<Language, String> {

}
