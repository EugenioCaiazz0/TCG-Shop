package sera.tcg.backend.dto;

public class VideogiocoDTO {
    private Long id;
    private String titolo;
    private String piattaforma;
    private Double prezzo;
    private Integer annoUscita;
    private String genere;

    public VideogiocoDTO() {}

    public VideogiocoDTO(Long id, String titolo, String piattaforma, Double prezzo, Integer annoUscita, String genere) {
        this.id = id;
        this.titolo = titolo;
        this.piattaforma = piattaforma;
        this.prezzo = prezzo;
        this.annoUscita = annoUscita;
        this.genere = genere;
    }

    // getter e setter

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getTitolo() {
        return titolo;
    }
    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getPiattaforma() {
        return piattaforma;
    }
    public void setPiattaforma(String piattaforma) {
        this.piattaforma = piattaforma;
    }

    public Double getPrezzo() {
        return prezzo;
    }
    public void setPrezzo(Double prezzo) {
        this.prezzo = prezzo;
    }

    public Integer getAnnoUscita() {
        return annoUscita;
    }
    public void setAnnoUscita(Integer annoUscita) {
        this.annoUscita = annoUscita;
    }

    public String getGenere() {
        return genere;
    }
    public void setGenere(String genere) {
        this.genere = genere;
    }
}
