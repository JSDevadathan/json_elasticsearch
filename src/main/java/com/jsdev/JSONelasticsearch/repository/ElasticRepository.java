package com.jsdev.JSONelasticsearch.repository;

import com.jsdev.JSONelasticsearch.entity.ElasticSearch;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ElasticRepository extends ElasticsearchRepository<ElasticSearch, Long> {
}
