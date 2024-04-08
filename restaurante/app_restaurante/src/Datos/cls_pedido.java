package Datos;

public class cls_pedido {
    private String id_clienteStr;
    private String det_pedidoStr;
    private float totalFlt;

    public cls_pedido(String id_cliente, String det_pedido, float total) {
        this.id_clienteStr = id_cliente;
        this.det_pedidoStr = det_pedido;
        this.totalFlt = total;
    }

    public String getdetalle() {
        return this.det_pedidoStr;
    }

    public String getid_cliente() {
        return this.id_clienteStr;
    }

    public float gettotal() {
        return this.totalFlt;
    }
}
