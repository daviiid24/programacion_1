package co.edu.uniquindio.biblioteca.model;

public class VehiculoCarga {

    private String marca;
    private String placa;
    private int numeroEjes;
    private int llantas;
    private int motor;
    private int chasis;
    private String detalle;


    public VehiculoCarga(){

    }


    VehiculoCarga(String marca,
                  String placa,
                  int numeroEjes,
                  int llantas,
                  int motor,
                  int chasis,
                  String detalle) {
        this.marca = marca;
        this.placa = placa;
        this.numeroEjes = numeroEjes;
        this.llantas = llantas;
        this.motor = motor;
        this.chasis = chasis;
        this.detalle = detalle;
    }

    public String getMarca(){
        return this.marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }

    public int getLlantas() {
        return llantas;
    }

    public void setLlantas(int llantas) {
        this.llantas = llantas;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    public int getChasis() {
        return chasis;
    }

    public void setChasis(int chasis) {
        this.chasis = chasis;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public void encender(){
        System.out.println("Encendiendo el vehiculo");
    }

}
