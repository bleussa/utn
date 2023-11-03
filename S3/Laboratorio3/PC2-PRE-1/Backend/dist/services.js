"use strict";
var __importDefault = (this && this.__importDefault) || function (mod) {
    return (mod && mod.__esModule) ? mod : { "default": mod };
};
Object.defineProperty(exports, "__esModule", { value: true });
const connection_1 = __importDefault(require("./connection"));
const getAllArticulos = () => {
    return new Promise((resolve, reject) => {
        connection_1.default.query('SELECT * FROM articulo', (error, results) => {
            if (error) {
                reject(error);
            }
            else {
                resolve(results);
            }
        });
    });
};
const getOneArticulo = (id) => {
    return new Promise((resolve, reject) => {
        connection_1.default.query('SELECT * FROM articulo WHERE id=?', id, (error, results) => {
            if (error) {
                reject(error);
            }
            else {
                if (results.length === 1) {
                    resolve(results[0]);
                }
                else {
                    resolve(null);
                }
            }
        });
    });
};
const createOneArticulo = (body) => {
    return new Promise((resolve, reject) => {
        const { nombre, codigoBarra, stock, origen, precio, marca } = body;
        const nuevoArticulo = [nombre, codigoBarra, stock, origen, precio, marca];
        connection_1.default.query('INSERT INTO articulo (nombre, codigoBarra, stock, origen, precio, marca) VALUES (?, ?, ?, ?, ?, ?)', nuevoArticulo, (error, results) => {
            if (error) {
                reject(error);
            }
            else {
                if (results.affectedRows === 1) {
                    resolve(results.insertId);
                }
                else {
                    resolve(false);
                }
            }
        });
    });
};
const updateOneArticulo = (id, body) => {
    return new Promise((resolve, reject) => {
        const { nombre, codigoBarra, stock, origen, precio, marca } = body;
        const articuloActualizado = [nombre, codigoBarra, stock, origen, precio, marca, id];
        connection_1.default.query('UPDATE articulo SET nombre=?, codigoBarra=?, stock=?, origen=?, precio=?, marca=? WHERE id=?', articuloActualizado, (error, results) => {
            if (error) {
                reject(error);
            }
            else {
                if (results.affectedRows === 1) {
                    resolve(true);
                }
                else {
                    resolve(false);
                }
            }
        });
    });
};
const deleteOneArticulo = (id) => {
    return new Promise((resolve, reject) => {
        connection_1.default.query('DELETE FROM articulo WHERE id=?', id, (error, results) => {
            if (error) {
                reject(error);
            }
            else {
                if (results.affectedRows === 1) {
                    resolve(id);
                }
                else {
                    resolve(null);
                }
            }
        });
    });
};
module.exports = {
    getAllArticulos,
    getOneArticulo,
    createOneArticulo,
    updateOneArticulo,
    deleteOneArticulo
};
