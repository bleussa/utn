"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.DetalleFactura = void 0;
var DetalleFactura = /** @class */ (function () {
    function DetalleFactura(cantidad, subtotal, articulo, factura) {
        this.cantidad = cantidad;
        this.subtotal = subtotal;
        this.articulo = articulo;
        this.factura = factura;
    }
    DetalleFactura.prototype.calcularSubTotal = function () {
        this.subtotal = this.articulo.precio * this.cantidad;
    };
    return DetalleFactura;
}());
exports.DetalleFactura = DetalleFactura;
