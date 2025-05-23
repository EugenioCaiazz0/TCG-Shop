package sera.tcg.backend.service;

import sera.tcg.backend.dto.VideogiocoDTO;
import sera.tcg.backend.mapper.VideogiocoMapper;
import sera.tcg.backend.model.VideogiocoEntity;
import sera.tcg.backend.repository.VideogiocoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class VideogiocoService {

    private final VideogiocoRepository repository;

    public VideogiocoService(VideogiocoRepository repository) {
        this.repository = repository;
    }

    public List<VideogiocoDTO> getAll() {
        return repository.findAll().stream()
                .map(VideogiocoMapper::toDTO)
                .collect(Collectors.toList());
    }

    public VideogiocoDTO create(VideogiocoDTO dto) {
        VideogiocoEntity entity = VideogiocoMapper.toEntity(dto);
        VideogiocoEntity saved = repository.save(entity);
        return VideogiocoMapper.toDTO(saved);
    }

    public VideogiocoDTO update(Long id, VideogiocoDTO dto) {
        VideogiocoEntity existing = repository.findById(id).orElseThrow(() -> new RuntimeException("Not found"));
        existing.setTitolo(dto.getTitolo());
        existing.setPiattaforma(dto.getPiattaforma());
        return VideogiocoMapper.toDTO(repository.save(existing));
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}


