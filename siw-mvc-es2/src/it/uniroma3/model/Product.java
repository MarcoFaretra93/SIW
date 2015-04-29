package it.uniroma3.model;

/**
 * Created by marcofaretra on 25/04/15.
 */
public class Product {
    private Long id;
    private String nomeProdotto;
    private Float prezzo;
    private String descrizione;
    private String codice;

    public Product(String nomeProdotto, Float prezzo,String descrizione,String codice) {
        this.nomeProdotto = nomeProdotto;
        this.prezzo = prezzo;
        this.descrizione = descrizione;
        this.codice = codice;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeProdotto() {
        return nomeProdotto;
    }

    public void setNomeProdotto(String nomeProdotto) {
        this.nomeProdotto = nomeProdotto;
    }

    public Float getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(Float prezzo) {
        this.prezzo = prezzo;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;

        Product product = (Product) o;

        if (id != null ? !id.equals(product.id) : product.id != null) return false;
        if (nomeProdotto != null ? !nomeProdotto.equals(product.nomeProdotto) : product.nomeProdotto != null) return false;
        if (prezzo != null ? !prezzo.equals(product.prezzo) : product.prezzo != null) return false;
        if (descrizione != null ? !descrizione.equals(product.descrizione) : product.descrizione != null) return false;
        return !(codice != null ? !codice.equals(product.codice) : product.codice != null);

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (nomeProdotto != null ? nomeProdotto.hashCode() : 0);
        result = 31 * result + (prezzo != null ? prezzo.hashCode() : 0);
        result = 31 * result + (descrizione != null ? descrizione.hashCode() : 0);
        result = 31 * result + (codice != null ? codice.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", nomeProdotto='" + nomeProdotto + '\'' +
                ", prezzo=" + prezzo +
                ", descrizione='" + descrizione + '\'' +
                ", codice='" + codice + '\'' +
                '}';
    }
}
