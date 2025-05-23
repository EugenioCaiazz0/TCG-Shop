package sera.tcg.backend.mapper;

import sera.tcg.backend.dto.VideogiocoDTO;
import sera.tcg.backend.model.VideogiocoEntity;

public class VideogiocoMapper {

    public static VideogiocoDTO toDTO(VideogiocoEntity entity) {
        if (entity == null) return null;
        
        VideogiocoDTO dto = new VideogiocoDTO();
        dto.setId(entity.getId());
        dto.setTitolo(entity.getTitolo());
        dto.setPiattaforma(entity.getPiattaforma());
        dto.setGenere(entity.getGenere());
        dto.setAnnoUscita(entity.getAnnoUscita());
        dto.setPrezzo(entity.getPrezzo());
        return dto;
    }

    public static VideogiocoEntity toEntity(VideogiocoDTO dto) {
        if (dto == null) return null;
        
        VideogiocoEntity entity = new VideogiocoEntity();
        entity.setId(dto.getId());  // utile per update
        entity.setTitolo(dto.getTitolo());
        entity.setPiattaforma(dto.getPiattaforma());
        entity.setGenere(dto.getGenere());
        entity.setAnnoUscita(dto.getAnnoUscita());
        entity.setPrezzo(dto.getPrezzo());
        return entity;
    }
}
