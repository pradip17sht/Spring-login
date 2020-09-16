package com.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import com.service.GenericService;


/**
 * Implementation of {@link GenericService}.
 * 
 * @author
 *
 * @param <T>
 *            The entity class.
 * @param <ID>
 *            The type of id.
 * 
 * @since April 5, 2017
 * 
 */
public class GenericServiceImpl<T, ID extends Serializable> implements GenericService<T, ID> {

	private JpaRepository<T, ID> jpaRepository;

	public GenericServiceImpl(JpaRepository<T, ID> jpaRepository) {
		this.jpaRepository = jpaRepository;
	}

	/**
	 * Implementation of {@link GenericService#findAll()}.
	 */
	public List<T> findAll() {
		return jpaRepository.findAll();
	}

	public List<T> findAll(Sort sort) {
		return jpaRepository.findAll(sort);
	}

	/**
	 * Implementation of {@link GenericService#findOne(Serializable)}.
	 */
	public T findOne(ID id) {
		return jpaRepository.findOne(id);
	}

	/**
	 * Implementation of {@link GenericService#saveOrUpdate(Object)}.
	 */
	public T saveOrUpdate(T entity) {
		return jpaRepository.save(entity);
	}

	/**
	 * Implementation of {@link GenericService#saveOrUpdate(Object)}.
	 */
	public List<T> saveOrUpdate(Iterable<T> entities) {
		return jpaRepository.save(entities);
	}

	/**
	 * Implementation of {@link GenericService#delete(Serializable)}.
	 */
	public void delete(ID id) {
		jpaRepository.delete(id);
	}

	/**
	 * Implementation of {@link GenericService#delete(Object)}.
	 */
	public void delete(T entity) {
		jpaRepository.delete(entity);
	}
}
