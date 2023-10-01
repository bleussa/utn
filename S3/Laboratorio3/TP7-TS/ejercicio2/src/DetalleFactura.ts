import { Articulo } from "./Articulo";
import { Factura } from "./Factura";

export class DetalleFactura{
    cantidad: number;
    subtotal: number;
    articulo: Articulo;
    factura: Factura;

    constructor(cantidad: number, subtotal: number, articulo: Articulo, factura: Factura) {
        this.cantidad = cantidad;
        this.subtotal = subtotal;
        this.articulo = articulo;
        this.factura = factura;
    }

    calcularSubTotal(){
        this.subtotal = this.articulo.precio * this.cantidad;
    }
}