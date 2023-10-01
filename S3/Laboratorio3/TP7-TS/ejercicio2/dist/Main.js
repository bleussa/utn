"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var Articulo_1 = require("./Articulo");
var Cliente_1 = require("./Cliente");
var DetalleFactura_1 = require("./DetalleFactura");
var Factura_1 = require("./Factura");
var TipoPago_1 = require("./TipoPago");
// CREAMOS 1 CLIENTE
var cliente = new Cliente_1.Cliente(46845599, '365Kiosko', 23468455993);
// CREAMOS 5 ARTICULOS
var articulo1 = new Articulo_1.Articulo(1, 'Aceite 1Lt', 950, 'Litros');
var articulo2 = new Articulo_1.Articulo(2, 'Coca Cola 1Lt', 759, 'Litros');
var articulo3 = new Articulo_1.Articulo(3, 'Jamon', 3650, 'Kilogramo');
var articulo4 = new Articulo_1.Articulo(4, 'Queso', 3268, 'Kilogramo');
var articulo5 = new Articulo_1.Articulo(5, 'Galletas', 1299, 'Gramos');
// CREAMOS 3 FACTURAS
var factura1 = new Factura_1.Factura('A', 123668, 199, TipoPago_1.TipoPago.E, 0, 0, new Date('2023-10-1'), cliente);
var factura2 = new Factura_1.Factura('A', 369945, 250, TipoPago_1.TipoPago.TD, 0, 0, new Date('2023-9-25'), cliente);
var factura3 = new Factura_1.Factura('A', 648795, 29, TipoPago_1.TipoPago.E, 0, 0, new Date('2023-9-12'), cliente);
// CREAMOS 6 DETALLE FACTURA
var detalle1 = new DetalleFactura_1.DetalleFactura(1, 0, articulo1, factura1);
var detalle2 = new DetalleFactura_1.DetalleFactura(2, 0, articulo2, factura1);
var detalle3 = new DetalleFactura_1.DetalleFactura(4, 0, articulo5, factura2);
var detalle4 = new DetalleFactura_1.DetalleFactura(1, 0, articulo3, factura2);
var detalle5 = new DetalleFactura_1.DetalleFactura(2, 0, articulo4, factura3);
var detalle6 = new DetalleFactura_1.DetalleFactura(2, 0, articulo3, factura3);
articulo1.detalles.push(detalle1);
articulo2.detalles.push(detalle2);
articulo3.detalles.push(detalle4);
articulo3.detalles.push(detalle6);
articulo4.detalles.push(detalle5);
articulo5.detalles.push(detalle3);
factura1.detalles.push(detalle1);
factura1.detalles.push(detalle2);
factura2.detalles.push(detalle3);
factura2.detalles.push(detalle4);
factura3.detalles.push(detalle5);
factura3.detalles.push(detalle6);
cliente.facturas.push(factura1);
cliente.facturas.push(factura2);
cliente.facturas.push(factura3);
// TESTEAMOS CON EFECTIVO
console.log('\nFILTRADO EFECTIVO');
cliente.totalFacturadoXTipoPago('Efectivo');
// TESTEAMOS CON EFECTIVO
console.log('\nFILTRADO TARJETA DEBITO');
cliente.totalFacturadoXTipoPago('Tarjeta Debito');
// TESTEAMOS CON NULL
console.log('\nSIN FILTRAR');
cliente.totalFacturadoXTipoPago(null);
