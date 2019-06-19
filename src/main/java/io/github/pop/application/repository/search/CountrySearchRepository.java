package io.github.pop.application.repository.search;

import io.github.pop.application.domain.Country;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data Elasticsearch repository for the {@link Country} entity.
 */
public interface CountrySearchRepository extends ElasticsearchRepository<Country, Long> {
}
