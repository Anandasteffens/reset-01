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
    private List<Integer> curtidasMusicas = new ArrayList<>();
    private List<Integer> curtidasFilmes = new ArrayList<>();
    private List<Integer> curtidasSeries = new ArrayList<>();
    private List<Integer> curtidasJogos = new ArrayList<>();
    private List<Integer> curtidasEsporte = new ArrayList<>();
    private List<Integer> curiosidades = new ArrayList<>();
    public List<Integer> curtidasUsuario = new ArrayList<>();
    public List<Integer> dislikesUsuario = new ArrayList<>();

    public Usuario( String nome, String email, String telefone, LocalDate dataNascimento, String bio, Double latitude, Double longitude, String urlFoto) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.bio = bio;
        this.latitude = latitude;
        this.longitude = longitude;
        this.urlFoto = urlFoto;
    }

    public Usuario() {

    }

//    public Usuario() {}

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

    public List<Integer> getCuriosidades() {
        return curiosidades;
    }

    public void setCuriosidades(List<Integer> curiosidades) {
        this.curiosidades = curiosidades;
    }

    public List<Integer> getCurtidasUsuario() {
        return curtidasUsuario;
    }

    public void setCurtidasUsuario(List<Integer> curtidasUsuario) {
        this.curtidasUsuario = curtidasUsuario;
    }

    public List<Integer> getDislikesUsuario() {
        return dislikesUsuario;
    }

    public void setDislikesUsuario(List<Integer> dislikesUsuario) {
        this.dislikesUsuario = dislikesUsuario;
    }

    public boolean curtirUsuario (int idUsuarioAvaliador){
        if (!curtidasUsuario.contains(idUsuarioAvaliador)){
            if (dislikesUsuario.contains(idUsuarioAvaliador)){
                int a = dislikesUsuario.indexOf(idUsuarioAvaliador);
                dislikesUsuario.remove(a);
            }
            return curtidasUsuario.add(idUsuarioAvaliador);
        }
       return false;
    }


    public boolean dislikeUsuario (int idUsuarioAvaliador){
        if (!dislikesUsuario.contains(idUsuarioAvaliador)){
            if (curtidasUsuario.contains(idUsuarioAvaliador)){
                int a = curtidasUsuario.indexOf(idUsuarioAvaliador);
                curtidasUsuario.remove(a);
            }
            return dislikesUsuario.add(idUsuarioAvaliador);
        }
        return false;
    }

    public Integer deletarCurtidaUsuario (int idUsuarioAvaliador){
        if (curtidasUsuario.contains(idUsuarioAvaliador)){
            int a = curtidasUsuario.indexOf(idUsuarioAvaliador);
            return curtidasUsuario.remove(a);
        }
        return null;
    }

    public Integer deletarDislikeUsuario (int idUsuarioAvaliador){
        if (dislikesUsuario.contains(idUsuarioAvaliador)){
            int a = dislikesUsuario.indexOf(idUsuarioAvaliador);
            return dislikesUsuario.remove(a);
        }
        return null;
    }


    public boolean curtirMusica (int idMusica){
        if (!curtidasMusicas.contains(idMusica)){
            return curtidasMusicas.add(idMusica);
        }
        return false;
    }

    public Integer descurtirMusica (int idMusica){
        if (curtidasMusicas.contains(idMusica)){
            int a = curtidasMusicas.indexOf(idMusica);
            return curtidasMusicas.remove(a);
        }
        return null;
    }

    public boolean curtirFilme (int idFilme){
        if (!curtidasFilmes.contains(idFilme)){
            return curtidasFilmes.add(idFilme);
        }
        return false;
    }

    public Integer descurtirFilme (int idFilme){
        if (curtidasFilmes.contains(idFilme)){
            int a = curtidasFilmes.indexOf(idFilme);
            return curtidasFilmes.remove(a);
        }
        return null;
    }

    public boolean curtirSerie (int idSerie){
        if (!curtidasSeries.contains(idSerie)){
            return curtidasSeries.add(idSerie);
        }
        return false;
    }
    public Integer descurtirSerie (int idSerie){
        if (curtidasSeries.contains(idSerie)){
            int a = curtidasSeries.indexOf(idSerie);
            return curtidasSeries.remove(a);
        }
        return null;
    }

    public boolean curtirJogo (int idJogo) {
        if (!curtidasJogos.contains(idJogo));{
            return curtidasJogos.add(idJogo);
        }
    }

    public Integer descurtirJogo (int idJogo){
        if (curtidasJogos.contains(idJogo)){
            int a = curtidasJogos.indexOf(idJogo);
            return curtidasJogos.remove(a);
        }
        return null;
    }

    public boolean curtirEsporte (int idEsporte){
        if (!curtidasEsporte.contains(idEsporte)){
            return curtidasEsporte.add(idEsporte);
        }
        return false;
    }
    public Integer descurtirEsporte (int idEsporte){
        if (curtidasEsporte.contains(idEsporte)){
            int a = curtidasEsporte.indexOf(idEsporte);
            return curtidasEsporte.remove(a);
        }
        return null;
    }

    public boolean cadastrarCuriosidade (int idCuriosidade){
        if (!curiosidades.contains(idCuriosidade)){
            return curiosidades.add(idCuriosidade);
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
