import { Articulo } from "./Articulo";
import { Cliente } from "./Cliente";
import { DetalleFactura } from "./DetalleFactura";
import { Factura } from "./Factura";
import { TipoPago } from "./TipoPago";

// CREAMOS 1 CLIENTE
let cliente = new Cliente(46845599, '365Kiosko', 23468455993);

// CREAMOS 5 ARTICULOS
let articulo1 = new Articulo(1, 'Aceite 1Lt', 950, 'Litros');
let articulo2 = new Articulo(2, 'Coca Cola 1Lt', 759, 'Litros');
let articulo3 = new Articulo(3, 'Jamon', 3650, 'Kilogramo');
let articulo4 = new Articulo(4, 'Queso', 3268, 'Kilogramo');
let articulo5 = new Articulo(5, 'Galletas', 1299, 'Gramos');

// CREAMOS 3 FACTURAS
let factura1 = new Factura('A', 123668, 199, TipoPago.E, 0, 0, new Date('2023-10-1'), cliente);
let factura2 = new Factura('A', 369945, 250, TipoPago.TD, 0, 0, new Date('2023-9-25'), cliente);
let factura3 = new Factura('A', 648795, 29, TipoPago.E, 0, 0, new Date('2023-9-12'), cliente);

// CREAMOS 6 DETALLE FACTURA
let detalle1 = new DetalleFactura(1, 0, articulo1, factura1);
let detalle2 = new DetalleFactura(2, 0, articulo2, factura1);
let detalle3 = new DetalleFactura(4, 0, articulo5, factura2);
let detalle4 = new DetalleFactura(1, 0, articulo3, factura2);
let detalle5 = new DetalleFactura(2, 0, articulo4, factura3);
let detalle6 = new DetalleFactura(2, 0, articulo3, factura3);

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



