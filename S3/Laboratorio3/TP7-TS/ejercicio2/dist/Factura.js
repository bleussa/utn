"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Factura = void 0;
var Factura = /** @class */ (function () {
    function Factura(letra, numero, recargo, tipoPago, totalItems, totalFinal, fecha, cliente) {
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
    Factura.prototype.calcularTotalItems = function () {
        var _this = this;
        this.detalles.forEach(function (detalle) {
            detalle.calcularSubTotal();
            _this.totalItems += detalle.subtotal;
        });
    };
    Factura.prototype.calcularTotalFinal = function () {
        this.calcularTotalItems();
        this.totalFinal = this.totalItems + this.recargo;
    };
    Factura.prototype.resetear = function () {
        this.totalFinal = 0;
        this.totalItems = 0;
    };
    return Factura;
}());
exports.Factura = Factura;
