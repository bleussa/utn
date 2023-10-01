"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var Detalle_1 = require("./Detalle");
var HojaDeRuta_1 = require("./HojaDeRuta");
var Vehiculo_1 = require("./Vehiculo");
// CREAMOS LOS VEHICULOS
var vehiculo1 = new Vehiculo_1.Vehiculo('AEB658', 'SCANIA', 'V8');
// CREAMOS LAS HOJAS DE RUTA
var hdr1 = new HojaDeRuta_1.HojaDeRuta(new Date('2023-1-10'), 25, vehiculo1);
var hdr2 = new HojaDeRuta_1.HojaDeRuta(new Date('2023-1-15'), 26, vehiculo1);
var hdr3 = new HojaDeRuta_1.HojaDeRuta(new Date('2023-2-20'), 28, vehiculo1);
vehiculo1.hojasDeRuta.push(hdr1);
vehiculo1.hojasDeRuta.push(hdr2);
vehiculo1.hojasDeRuta.push(hdr3);
// CREAMOS LOS DETALLES
var detalle1 = new Detalle_1.Detalle(13458, 13624, 7, 23, 16, 55, hdr1);
var detalle2 = new Detalle_1.Detalle(13624, 13744, 4, 36, 17, 30, hdr1);
var detalle3 = new Detalle_1.Detalle(13744, 13998, 19, 30, 14, 10, hdr1);
var detalle4 = new Detalle_1.Detalle(14100, 14250, 10, 45, 8, 15, hdr2);
var detalle5 = new Detalle_1.Detalle(14250, 14375, 14, 20, 12, 40, hdr2);
var detalle6 = new Detalle_1.Detalle(14400, 14500, 9, 0, 18, 30, hdr2);
var detalle7 = new Detalle_1.Detalle(14500, 14575, 11, 15, 9, 45, hdr3);
var detalle8 = new Detalle_1.Detalle(14600, 14750, 15, 30, 20, 10, hdr3);
var detalle9 = new Detalle_1.Detalle(14750, 14985, 19, 35, 4, 12, hdr3);
hdr1.detalles.push(detalle1);
hdr1.detalles.push(detalle2);
hdr1.detalles.push(detalle3);
hdr2.detalles.push(detalle4);
hdr2.detalles.push(detalle5);
hdr2.detalles.push(detalle6);
hdr3.detalles.push(detalle7);
hdr3.detalles.push(detalle8);
hdr3.detalles.push(detalle9);
var date1 = new Date('2023-1-10');
var date2 = new Date('2023-1-15');
console.log('HDR1 Total KM = ' + hdr1.calcularTotalKilometros());
console.log('HDR1 Total KM = ' + hdr2.calcularTotalKilometros());
console.log('HDR1 Total KM = ' + hdr3.calcularTotalKilometros());
console.log('El total de KM recorridos es: ' + vehiculo1.calcularTotalKilometrosRecorridos(date1, date2));
