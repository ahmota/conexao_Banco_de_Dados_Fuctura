package biblioteca;

import java.util.Calendar;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table (name="LIVRO")
public class Livro {
@Id
@GeneratedValue(strategy= GenerationType.SEQUENCE)
@Column
private int idlivro;

@Column
private String autor;
@Column
private String titulolivro;
@Temporal(TemporalType.DATE)
@Column (name="DATA_PUBLI", nullable=true)
private Calendar datalocacao;

public Livro() {
	
}
public Livro (String autor, String titulolivro, Calendar datalocacao) {
	this.autor=autor;
	this.titulolivro=titulolivro;
	this.datalocacao=datalocacao;
	}
 public int getidlivro() {
return idlivro;
 }
 
public void setidlivro() {
this.idlivro= idlivro;	
}
public String getAutor() {
	return autor;
}
public void setAutor(String autor) {
	this.autor = autor;
}
public String getTitulolivro() {
	return titulolivro;
}
public void setTitulolivro(String titulolivro) {
	this.titulolivro = titulolivro;
}
public Calendar getDatalocacao() {
	return datalocacao;
}
public void setDatalocacao(Calendar datalocacao) {
	this.datalocacao = datalocacao;
}
@Override
public int hashCode() {
	return Objects.hash(idlivro);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Livro other = (Livro) obj;
	return idlivro == other.idlivro;
}
@Override
public String toString() {
	return "Livro [idlivro=" + idlivro + ", autor=" + autor + ", titulolivro=" + titulolivro + ", datalocacao="
			+ datalocacao + "]";
}



}
