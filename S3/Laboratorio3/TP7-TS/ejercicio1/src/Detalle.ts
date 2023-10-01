import { HojaDeRuta } from "./HojaDeRuta";

export class Detalle{

    kmSalida: number;
    kmRegreso: number;
    horaSalida: number;
    horaRegreso: number;
    minutoSalida: number;
    minutoRegreso: number;
    hojaDeRuta: HojaDeRuta;

    constructor(kmSalida: number, kmRegreso: number, horaSalida: number, horaRegreso: number,minutoSalida: number, minutoRegreso: number, hojaDeRuta: HojaDeRuta ) {
        this.kmSalida = kmSalida;
        this.kmRegreso = kmRegreso;
        this.horaSalida = horaSalida;
        this.horaRegreso = horaRegreso;
        this.minutoSalida = minutoSalida;
        this.minutoRegreso = minutoRegreso;
        this.hojaDeRuta = hojaDeRuta;
    }

}