package dominioclasses;

import javax.xml.crypto.Data;
import java.text.DateFormat;

public class Usuario {

    private int id;
    private String nome;
    private String email;
    private String telefone;
    private DateFormat dateFormat;
    private String bio;
    private int latitude;
    private int longitude;

    public Usuario(String nome, String email, String telefone, DateFormat dateFormat, String bio, int latitude, int longitude) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.dateFormat = dateFormat;
        this.bio = bio;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id=id;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email=email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public DateFormat getDateFormat() {
        return dateFormat;
    }

    public void setDateFormat(DateFormat dateFormat) {
        this.dateFormat = dateFormat;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public int getLatitude() {
        return latitude;
    }

    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }

    public int getLongitude() {
        return longitude;
    }

    public void setLongitude(int longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", dateFormat=" + dateFormat +
                ", bio='" + bio + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}
