package com.loncoto.backendIntervention.repositories;

import org.springframework.data.repository.CrudRepository;

import com.loncoto.backendIntervention.metier.Article;

public interface ArticleRepository extends CrudRepository<Article, Integer> {

}
