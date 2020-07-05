package com.tuyano.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tuyano.springboot.MyData;

/**
 * リスト5-9
 */
//@Repository
public interface MyDataRepository_List5_09  extends JpaRepository<MyData, Long> {

}

