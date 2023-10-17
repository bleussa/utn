import { Request, Response } from "express";
const conn = require('./connection');

exports.list = (req:Request, res:Response) => {
    conn.query('SELECT * FROM empleado', (error:any, results:any) => {
        if (error) {
            res.send('[ERROR] ' + error);
        } else {
            try {
                results.forEach((result:any) => {
                    const año = result.fechaIngreso.getFullYear();
                    const mes = (result.fechaIngreso.getMonth() + 1).toString().padStart(2, '0');
                    const día = result.fechaIngreso.getDate().toString().padStart(2, '0');
                    const fechaTransformada = `${año}-${mes}-${día}`;
                    result.fechaIngreso = fechaTransformada;
                });
            } catch (error) {
                console.error(error);
            }
            res.render('index', {results:results});
        }
    })
}

exports.save = (req:Request, res:Response) => new Promise((resolve, reject) => {
    const {legajo, apellido, nombre, dni, sector, fechaIngreso, activo} = req.body;
    var values = [legajo, apellido, nombre, dni, sector, fechaIngreso, activo];

    conn.query(
        'INSERT INTO empleado (legajo, apellido, nombre, dni, sector, fechaIngreso, activo) VALUES (?, ?, ?, ?, ?, ?, ?)', values, (error:any, results:any) => {
            if (error) {
                res.send('[ERROR] ' + error);
            } else {
                res.redirect('/');
            }
        }
    )
});

exports.getOne = (req:Request, res:Response) => {
    const legajo = req.params.legajo;
    conn.query('SELECT * FROM empleado WHERE legajo=?', legajo, (error:any, results:any) => {
        if (error) {
            res.send('[ERROR] ' + error);
        } else {
            try {
                results.forEach((result:any) => {
                    const año = result.fechaIngreso.getFullYear();
                    const mes = (result.fechaIngreso.getMonth() + 1).toString().padStart(2, '0');
                    const día = result.fechaIngreso.getDate().toString().padStart(2, '0');
                    const fechaTransformada = `${año}-${mes}-${día}`;
                    result.fechaIngreso = fechaTransformada;
                });
            } catch (error) {
                console.error(error);
            }
            res.render('update', {results:results});
        }
    })
};

exports.update = (req:Request, res:Response) => {
    const {legajo, apellido, nombre, dni, sector, fechaIngreso, activo} = req.body;
    var values = [apellido, nombre, dni, sector, fechaIngreso, activo, legajo];

    conn.query(
        'UPDATE empleado SET apellido=?, nombre=?, dni=?, sector=?, fechaIngreso=?, activo=? WHERE legajo = ?', values, (error:any, results:any) => {
            if (error) {
                res.send('[ERROR] ' + error);
            } else {
                res.redirect('/');
            }
        }
    )
}

exports.delete = (req:Request, res:Response) => {
    const legajo = req.params.legajo;
    conn.query('DELETE FROM empleado WHERE legajo=?', legajo, (error:any, results:any) => {
        if (error) {
            res.send('[ERROR] ' + error);
        } else {
            res.redirect('/');
        }
    })
};