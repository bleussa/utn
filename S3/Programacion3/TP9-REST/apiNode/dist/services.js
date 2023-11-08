"use strict";
var __importDefault = (this && this.__importDefault) || function (mod) {
    return (mod && mod.__esModule) ? mod : { "default": mod };
};
Object.defineProperty(exports, "__esModule", { value: true });
const connection_1 = __importDefault(require("./connection"));
const getAllAgendas = () => {
    return new Promise((resolve, reject) => {
        connection_1.default.query('SELECT * FROM agenda', (error, results) => {
            if (error) {
                reject(error);
            }
            else {
                resolve(results);
            }
        });
    });
};
const getOneAgenda = (id) => {
    return new Promise((resolve, reject) => {
        connection_1.default.query('SELECT * FROM agenda WHERE id=?', id, (error, results) => {
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
const createOneAgenda = (body) => {
    return new Promise((resolve, reject) => {
        const { nombre, apellido, telefono, email, domicilio } = body;
        const nuevaAgenda = [nombre, apellido, telefono, email, domicilio];
        connection_1.default.query('INSERT INTO agenda (nombre, apellido, telefono, email, domicilio) VALUES (?, ?, ?, ?, ?)', nuevaAgenda, (error, results) => {
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
const updateOneAgenda = (id, body) => {
    return new Promise((resolve, reject) => {
        const { nombre, apellido, telefono, email, domicilio } = body;
        const agendaActualizado = [nombre, apellido, telefono, email, domicilio, id];
        connection_1.default.query('UPDATE agenda SET nombre=?, apellido=?, telefono=?, email=?, domicilio=? WHERE id=?', agendaActualizado, (error, results) => {
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
const deleteOneAgenda = (id) => {
    return new Promise((resolve, reject) => {
        connection_1.default.query('DELETE FROM agenda WHERE id=?', id, (error, results) => {
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
    getAllAgendas,
    getOneAgenda,
    createOneAgenda,
    updateOneAgenda,
    deleteOneAgenda
};
