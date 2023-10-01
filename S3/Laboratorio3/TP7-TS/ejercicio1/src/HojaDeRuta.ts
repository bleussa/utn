import { Vehiculo } from "./Vehiculo";
import { Detalle } from "./Detalle";

export class HojaDeRuta{
    fecha: Date;
    numero: number;
    vehiculo: Vehiculo;
    detalles: Detalle[];


    constructor (fecha: Date, numero: number, vehiculo: Vehiculo){
        this.fecha = fecha;
        this.numero = numero;
        this.vehiculo = vehiculo;
        this.detalles = [];
    }

    calcularTotalKilometros() {
        let totalKm: number;
        totalKm = 0;

        this.detalles.forEach(detalle => {
            totalKm += detalle.kmRegreso - detalle.kmSalida;
        });

        return totalKm;
    }

    calcularTotalKilometrosRecorridos(fechaDesde : Date, fechaHasta : Date) {
        
    }
}
