import { Cliente } from "./Cliente";
import { DetalleFactura } from "./DetalleFactura";
import { TipoPago } from "./TipoPago";

export class Factura{
    letra: string;
    numero: number;
    recargo: number;
    tipoPago: TipoPago;
    totalItems: number;
    totalFinal: number;
    fecha: Date;
    cliente: Cliente;
    detalles: DetalleFactura[];

    constructor(letra: string, numero: number, recargo: number, tipoPago: TipoPago, totalItems: number,totalFinal: number, fecha: Date, cliente: Cliente) {
        this.letra = letra;
        this.numero = numero;
        this.recargo = recargo;
        this.tipoPago = tipoPago;
        this.totalItems = totalItems;
        this.totalFinal = totalFinal;
        this.fecha = fecha;
        this.cliente = cliente;
        this.detalles = [];
    }

    calcularTotalItems(){
        this.detalles.forEach((detalle) => {
            detalle.calcularSubTotal();
            this.totalItems += detalle.subtotal;
        });
    }

    calcularTotalFinal(){
        this.calcularTotalItems();
        this.totalFinal = this.totalItems + this.recargo;
    }

    resetear(){
        this.totalFinal = 0;
        this.totalItems = 0;
    }
}