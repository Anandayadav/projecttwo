package com.Ebill.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Ebill.Model.Consumer;

@Repository
public interface Consumerrepo extends CrudRepository<Consumer, Integer> {

}
