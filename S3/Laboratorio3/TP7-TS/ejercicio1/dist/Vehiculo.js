"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Vehiculo = void 0;
var Vehiculo = /** @class */ (function () {
    function Vehiculo(patente, marca, modelo) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.hojasDeRuta = [];
    }
    Vehiculo.prototype.calcularTotalKilometrosRecorridos = function (fechaDesde, fechaHasta) {
        var totalKmRecorridos;
        totalKmRecorridos = 0;
        this.hojasDeRuta.forEach(function (hdr) {
            if (hdr.fecha.getTime() >= fechaDesde.getTime() && hdr.fecha.getTime() <= fechaHasta.getTime()) {
                totalKmRecorridos += hdr.calcularTotalKilometros();
            }
        });
        return totalKmRecorridos;
    };
    return Vehiculo;
}());
exports.Vehiculo = Vehiculo;
