package com.rodrigoeduque.festa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodrigoeduque.festa.model.Convidado;

public interface Convidados extends JpaRepository<Convidado, Long> {

}
