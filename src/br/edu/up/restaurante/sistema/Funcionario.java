package br.edu.up.restaurante.sistema;

public class Funcionario {

    private String nomeFuncionario;
    private Double salario;
    private Double cargaHoraria;
    private int numeroDeRegistro;

    public Double getSalario() {
        return salario;
    }
    public void setSalario(Double salario) {
        this.salario = salario;
    }
    public Double getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(Double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    public int getNumeroDeRegistro() {
        return numeroDeRegistro;
    }
    public void setNumeroDeRegistro(int numeroDeRegistro) {
        this.numeroDeRegistro = numeroDeRegistro;
    }
}
