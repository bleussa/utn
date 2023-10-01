"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Cliente = void 0;
var Cliente = /** @class */ (function () {
    function Cliente(numero, razonSocial, cuit) {
        this.numero = numero;
        this.razonSocial = razonSocial;
        this.cuit = cuit;
        this.facturas = [];
    }
    Cliente.prototype.totalFacturadoXTipoPago = function (tipoPago) {
        var montoTotal = 0;
        this.facturas.forEach(function (factura) {
            factura.resetear();
            factura.calcularTotalFinal();
            if (factura.tipoPago == tipoPago) {
                montoTotal += factura.totalFinal;
            }
            else if (tipoPago == null) {
                montoTotal += factura.totalFinal;
            }
        });
        console.log('$' + montoTotal);
    };
    return Cliente;
}());
exports.Cliente = Cliente;
