"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
const conn = require('./connection');
exports.list = (req, res) => {
    conn.query('SELECT * FROM empleado', (error, results) => {
        if (error) {
            res.send('[ERROR] ' + error);
        }
        else {
            try {
                results.forEach((result) => {
                    const año = result.fechaIngreso.getFullYear();
                    const mes = (result.fechaIngreso.getMonth() + 1).toString().padStart(2, '0');
                    const día = result.fechaIngreso.getDate().toString().padStart(2, '0');
                    const fechaTransformada = `${año}-${mes}-${día}`;
                    result.fechaIngreso = fechaTransformada;
                });
            }
            catch (error) {
                console.error(error);
            }
            res.render('index', { results: results });
        }
    });
};
exports.save = (req, res) => new Promise((resolve, reject) => {
    const { legajo, apellido, nombre, dni, sector, fechaIngreso, activo } = req.body;
    var values = [legajo, apellido, nombre, dni, sector, fechaIngreso, activo];
    conn.query('INSERT INTO empleado (legajo, apellido, nombre, dni, sector, fechaIngreso, activo) VALUES (?, ?, ?, ?, ?, ?, ?)', values, (error, results) => {
        if (error) {
            res.send('[ERROR] ' + error);
        }
        else {
            res.redirect('/');
        }
    });
});
exports.getOne = (req, res) => {
    const legajo = req.params.legajo;
    conn.query('SELECT * FROM empleado WHERE legajo=?', legajo, (error, results) => {
        if (error) {
            res.send('[ERROR] ' + error);
        }
        else {
            try {
                results.forEach((result) => {
                    const año = result.fechaIngreso.getFullYear();
                    const mes = (result.fechaIngreso.getMonth() + 1).toString().padStart(2, '0');
                    const día = result.fechaIngreso.getDate().toString().padStart(2, '0');
                    const fechaTransformada = `${año}-${mes}-${día}`;
                    result.fechaIngreso = fechaTransformada;
                });
            }
            catch (error) {
                console.error(error);
            }
            res.render('update', { results: results });
        }
    });
};
exports.update = (req, res) => {
    const { legajo, apellido, nombre, dni, sector, fechaIngreso, activo } = req.body;
    var values = [apellido, nombre, dni, sector, fechaIngreso, activo, legajo];
    conn.query('UPDATE empleado SET apellido=?, nombre=?, dni=?, sector=?, fechaIngreso=?, activo=? WHERE legajo = ?', values, (error, results) => {
        if (error) {
            res.send('[ERROR] ' + error);
        }
        else {
            res.redirect('/');
        }
    });
};
exports.delete = (req, res) => {
    const legajo = req.params.legajo;
    conn.query('DELETE FROM empleado WHERE legajo=?', legajo, (error, results) => {
        if (error) {
            res.send('[ERROR] ' + error);
        }
        else {
            res.redirect('/');
        }
    });
};
