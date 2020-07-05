package com.tuyano.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tuyano.springboot.MyData;

/**
 * リスト5-20
 */
//@Repository
public interface MyDataRepository_List5_20 extends JpaRepository<MyData, Long> {

//	public Optional<MyData> findById(Long name);
//
//	public List<MyData> findByNameLike(String name);
//
//	public List<MyData> findByIdIsNotNullOrderByIdDesc();
//
//	public List<MyData> findByAgeGreaterThan(Integer age);
//
//	public List<MyData> findByAgeBetween(Integer age1, Integer age2);

}
