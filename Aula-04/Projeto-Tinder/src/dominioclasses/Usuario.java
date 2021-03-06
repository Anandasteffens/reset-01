package dominioclasses;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class Usuario {

    private int id;
    private String nome;
    private String email;
    private String telefone;
    private LocalDate dataNascimento;
    private String bio;
    private Double latitude;
    private Double longitude;

    public Usuario(String nome, String email, String telefone, LocalDate dataNascimento, String bio, Double latitude, Double longitude) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
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

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public int confirmarIdade (LocalDate dataNascimento) {
        LocalDate today = LocalDate.now();
        LocalDate aniver = dataNascimento;

        Period period = Period.between(aniver, today);
        int idadeUsuario = period.getYears();
        return idadeUsuario;
    }


    @Override
    public String toString() {
        return "Usuário - " + "ID: " + id + ", nome: " + nome + ", email: " + email + ", telefone: " + telefone + ", data de nascimento:" + dataNascimento +
                ", biografia: " + bio + ", latitude: " + latitude + ", longitude: " + longitude + '.';
    }
}
