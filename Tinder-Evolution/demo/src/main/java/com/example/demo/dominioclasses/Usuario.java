package com.example.demo.dominioclasses;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private int id;
    private String nome;
    private String email;
    private String telefone;
    private LocalDate dataNascimento;
    private String bio;
    private Double latitude;
    private Double longitude;
    private String urlFoto;
    private List<Integer> curtidasMusicas;
    private List<Integer> curtidasFilmes;
    private List<Integer> curtidasSeries;
    private List<Integer> curtidasJogos;
    private List<Integer> curtidasEsporte;
    private List<Integer> curtidasCuriosidades;


    public Usuario( String nome, String email, String telefone, LocalDate dataNascimento, String bio, Double latitude, Double longitude, String urlFoto) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.bio = bio;
        this.latitude = latitude;
        this.longitude = longitude;
        this.urlFoto = urlFoto;
        this.curtidasMusicas = new ArrayList<>();
        this.curtidasFilmes = new ArrayList<>();
        this.curtidasSeries = new ArrayList<>();
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

    public String getUrlFoto() {return urlFoto;}

    public void setUrlFoto(String urlFoto) {this.urlFoto = urlFoto;}

    public List<Integer> getCurtidasMusicas() {
        return curtidasMusicas;
    }

    public void setCurtidasMusicas(List<Integer> curtidasMusicas) {
        this.curtidasMusicas = curtidasMusicas;
    }

    public List<Integer> getCurtidasFilmes() {
        return curtidasFilmes;
    }

    public void setCurtidasFilmes(List<Integer> curtidasFilmes) {
        this.curtidasFilmes = curtidasFilmes;
    }

    public List<Integer> getCurtidasSeries() {
        return curtidasSeries;
    }

    public void setCurtidasSeries(List<Integer> curtidasSeries) {
        this.curtidasSeries = curtidasSeries;
    }

    public List<Integer> getCurtidasJogos() {
        return curtidasJogos;
    }

    public void setCurtidasJogos(List<Integer> curtidasJogos) {
        this.curtidasJogos = curtidasJogos;
    }

    public List<Integer> getCurtidasEsporte() {
        return curtidasEsporte;
    }

    public void setCurtidasEsporte(List<Integer> curtidasEsporte) {
        this.curtidasEsporte = curtidasEsporte;
    }

    public List<Integer> getCurtidasCuriosidades() {
        return curtidasCuriosidades;
    }

    public void setCurtidasCuriosidades(List<Integer> curtidasCuriosidades) {
        this.curtidasCuriosidades = curtidasCuriosidades;
    }

    public boolean curtirMusica (int idMusica){
        if (!curtidasMusicas.contains(idMusica)){
            return curtidasMusicas.add(idMusica);
        }
       return false;
    }

    public boolean curtirFilme (int idFilme){
        if (!curtidasFilmes.contains(idFilme)){
            return curtidasFilmes.add(idFilme);
        }
        return false;
    }

    public boolean curtirSerie (int idSerie){
        if (!curtidasSeries.contains(idSerie)){
            return curtidasSeries.add(idSerie);
        }
        return false;
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
        return "Usuario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", bio='" + bio + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", urlFoto='" + urlFoto + '\'' +
                '}';
    }
}
