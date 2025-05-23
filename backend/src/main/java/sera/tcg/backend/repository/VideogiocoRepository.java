package sera.tcg.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sera.tcg.backend.model.VideogiocoEntity;

public interface VideogiocoRepository extends JpaRepository<VideogiocoEntity, Long> {
}
