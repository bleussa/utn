"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Articulo = void 0;
var Articulo = /** @class */ (function () {
    function Articulo(codigo, denominacion, precio, unidadMedida) {
        this.codigo = codigo;
        this.denominacion = denominacion;
        this.precio = precio;
        this.unidadMedida = unidadMedida;
        this.detalles = [];
    }
    return Articulo;
}());
exports.Articulo = Articulo;
