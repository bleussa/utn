import { HojaDeRuta } from "./HojaDeRuta";

export class Vehiculo{

    patente: string;
    marca: string;
    modelo: string;
    hojasDeRuta: HojaDeRuta[];

    constructor(patente: string, marca: string, modelo: string) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.hojasDeRuta = [];
    }

    calcularTotalKilometrosRecorridos (fechaDesde: Date, fechaHasta: Date){
        let totalKmRecorridos: number;
        totalKmRecorridos = 0;
        
        this.hojasDeRuta.forEach((hdr) => {
            if (hdr.fecha.getTime() >= fechaDesde.getTime() && hdr.fecha.getTime() <= fechaHasta.getTime()) {
                totalKmRecorridos += hdr.calcularTotalKilometros();
            }
        })

        return totalKmRecorridos;
    }

}