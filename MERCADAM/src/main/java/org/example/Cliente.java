package org.example;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Cliente {

    private String usuario;
    private String contraseña;
    private String direccion;
    private Pedido pedido;
    private boolean promociones;

    public Cliente (String usuario, String contraseña, String direccion, Pedido pedido, boolean promociones) {

        this.usuario = usuario;
        this.contraseña = contraseña;
        this.direccion = direccion;
        this.pedido = pedido;
        this.promociones = promociones;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "usuario='" + usuario + '\'' +
                ", contraseña='" + contraseña + '\'' +
                ", direccion='" + direccion + '\'' +
                ", pedido=" + pedido +
                ", promociones=" + promociones +
                '}';
    }
}
