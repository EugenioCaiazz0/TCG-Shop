package sera.tcg.backend.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sera.tcg.backend.dto.VideogiocoDTO;
import sera.tcg.backend.service.VideogiocoService;

@RestController
@RequestMapping("/api/videogiochi")
public class VideogiocoController {

    private final VideogiocoService service;

    public VideogiocoController(VideogiocoService service) {
        this.service = service;
    }

    @GetMapping
    public List<VideogiocoDTO> getAll() {
        return service.getAll();
    }

    @PostMapping
    public VideogiocoDTO create(@RequestBody VideogiocoDTO dto) {
        // dto contiene: titolo, genere, piattaforma, annoUscita, prezzo (BigDecimal)
        return service.create(dto);
    }

    @PutMapping("/{id}")
    public VideogiocoDTO update(@PathVariable Long id, @RequestBody VideogiocoDTO dto) {
        // aggiorna il videogioco con id = id
        return service.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}


