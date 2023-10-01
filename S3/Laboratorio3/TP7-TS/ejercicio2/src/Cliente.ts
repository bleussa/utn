import { Factura } from "./Factura";

export class Cliente{
    numero: number;
    razonSocial: string;
    cuit: number;
    facturas: Factura[];

    constructor(numero: number, razonSocial: string, cuit: number){
        this.numero = numero;
        this.razonSocial = razonSocial;
        this.cuit = cuit;
        this.facturas = [];
    }

    totalFacturadoXTipoPago(tipoPago: any){
        
        let montoTotal: number = 0;
        
        this.facturas.forEach((factura) => {
            factura.resetear();
            factura.calcularTotalFinal();

            if (factura.tipoPago == tipoPago) {
                montoTotal += factura.totalFinal;
            } else if (tipoPago == null){
                montoTotal += factura.totalFinal;
            }
        })

        console.log('$' + montoTotal);
    }
}