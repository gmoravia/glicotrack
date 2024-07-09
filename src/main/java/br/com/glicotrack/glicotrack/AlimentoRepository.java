package br.com.glicotrack.glicotrack;

import org.springframework.stereotype.Repository;

import br.com.glicotrack.glicotrack.entity.Alimento;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface AlimentoRepository extends JpaRepository<Alimento, Long> {

}
