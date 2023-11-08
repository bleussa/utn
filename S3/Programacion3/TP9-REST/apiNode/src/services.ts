import conn from "./connection";

interface Agenda {
    nombre: string;
    apellido: string;
    telefono: number;
    email: string;
    domicilio: string;
}

const getAllAgendas = () => {
    return new Promise((resolve, reject) => {
        conn.query('SELECT * FROM agenda', (error, results) => {
            if (error) {
                reject(error);
            } else {
                resolve(results);
            }
        });
    });
}

const getOneAgenda = (id:number) => {
    return new Promise((resolve, reject) => {
        conn.query('SELECT * FROM agenda WHERE id=?', id, (error, results) => {
            if (error) {
                reject(error);
            } else {
                if (results.length === 1) {
                    resolve(results[0]);
                } else {
                    resolve(null);
                }
            }
        });
    });
}

const createOneAgenda = (body: Agenda) => {
    return new Promise((resolve, reject) => {
        const {nombre, apellido, telefono, email, domicilio} = body;
        const nuevaAgenda = [nombre, apellido, telefono, email, domicilio];
        conn.query('INSERT INTO agenda (nombre, apellido, telefono, email, domicilio) VALUES (?, ?, ?, ?, ?)', nuevaAgenda, (error, results) => {
            if (error) {
                reject(error);
            } else {
                if (results.affectedRows === 1) {
                    resolve(results.insertId);
                } else {
                    resolve(false);
                }
            }
        });
    });
} 

const updateOneAgenda = (id:number, body: Agenda) => {
    return new Promise((resolve, reject) => {
        const {nombre, apellido, telefono, email, domicilio} = body;
        const agendaActualizado = [nombre, apellido, telefono, email, domicilio, id];
        conn.query('UPDATE agenda SET nombre=?, apellido=?, telefono=?, email=?, domicilio=? WHERE id=?', agendaActualizado, (error, results) => {
            if (error) {
                reject(error);
            } else {
                if (results.affectedRows === 1) {
                    resolve(true);
                } else {
                    resolve(false);
                }
            }
        });
    });
} 

const deleteOneAgenda = (id:number) => {
    return new Promise((resolve, reject) => {
        conn.query('DELETE FROM agenda WHERE id=?', id, (error, results) => {
            if (error) {
                reject(error);
            } else {
                if (results.affectedRows === 1) {
                    resolve(id);
                } else {
                    resolve(null);
                }
            }
        });
    });
} 

module.exports = {
    getAllAgendas,
    getOneAgenda,
    createOneAgenda,
    updateOneAgenda,
    deleteOneAgenda
}