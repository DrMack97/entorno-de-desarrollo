/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ra6ArraysListas.src.provenvet.model;

/**
 *
 * @author eblazquez
 */
public class Visita {
    private String data;
    private String motiu;
    private double preu;

    public Visita(String data, String motiu, double preu) {
        this.data = data;
        this.motiu = motiu;
        this.preu = preu;
    }

    public String getData() { return data; }
    public void setData(String data) { this.data = data; }

    public String getMotiu() { return motiu; }
    public void setMotiu(String motiu) { this.motiu = motiu; }

    public double getPreu() { return preu; }
    public void setPreu(double preu) { this.preu = preu; }

    @Override
    public String toString() {
        return "Data: " + data + " | Motiu: " + motiu + " | Preu: " + preu + "€";
    }
}