package xyz.ConstruTec.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.ConstruTec.app.model.Obra;

public interface ObraDao extends JpaRepository<Obra, Long> {}