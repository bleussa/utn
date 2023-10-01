import { DetalleFactura } from "./DetalleFactura";

export class Articulo{
    codigo: number;
    denominacion: string;
    precio: number;
    unidadMedida: string;
    detalles: DetalleFactura[];

    constructor(codigo: number, denominacion: string, precio: number, unidadMedida: string) {
        this.codigo = codigo;
        this.denominacion = denominacion;
        this.precio = precio;
        this.unidadMedida = unidadMedida;
        this.detalles = [];
    }
}