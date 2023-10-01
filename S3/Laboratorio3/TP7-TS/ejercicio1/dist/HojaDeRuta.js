"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.HojaDeRuta = void 0;
var HojaDeRuta = /** @class */ (function () {
    function HojaDeRuta(fecha, numero, vehiculo) {
        this.fecha = fecha;
        this.numero = numero;
        this.vehiculo = vehiculo;
        this.detalles = [];
    }
    HojaDeRuta.prototype.calcularTotalKilometros = function () {
        var totalKm;
        totalKm = 0;
        this.detalles.forEach(function (detalle) {
            totalKm += detalle.kmRegreso - detalle.kmSalida;
        });
        return totalKm;
    };
    HojaDeRuta.prototype.calcularTotalKilometrosRecorridos = function (fechaDesde, fechaHasta) {
    };
    return HojaDeRuta;
}());
exports.HojaDeRuta = HojaDeRuta;
