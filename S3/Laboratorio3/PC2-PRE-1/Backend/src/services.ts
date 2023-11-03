import conn from "./connection";

interface Articulo {
    nombre: string;
    codigoBarra: string;
    stock: number;
    origen: string;
    precio: number;
    marca: string;
}

const getAllArticulos = () => {
    return new Promise((resolve, reject) => {
        conn.query('SELECT * FROM articulo', (error, results) => {
            if (error) {
                reject(error);
            } else {
                resolve(results);
            }
        });
    });
}

const getOneArticulo = (id:number) => {
    return new Promise((resolve, reject) => {
        conn.query('SELECT * FROM articulo WHERE id=?', id, (error, results) => {
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

const createOneArticulo = (body: Articulo) => {
    return new Promise((resolve, reject) => {
        const {nombre, codigoBarra, stock, origen, precio, marca} = body;
        const nuevoArticulo = [nombre, codigoBarra, stock, origen, precio, marca];
        conn.query('INSERT INTO articulo (nombre, codigoBarra, stock, origen, precio, marca) VALUES (?, ?, ?, ?, ?, ?)', nuevoArticulo, (error, results) => {
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

const updateOneArticulo = (id:number, body: Articulo) => {
    return new Promise((resolve, reject) => {
        const {nombre, codigoBarra, stock, origen, precio, marca} = body;
        const articuloActualizado = [nombre, codigoBarra, stock, origen, precio, marca, id];
        conn.query('UPDATE articulo SET nombre=?, codigoBarra=?, stock=?, origen=?, precio=?, marca=? WHERE id=?', articuloActualizado, (error, results) => {
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

const deleteOneArticulo = (id:number) => {
    return new Promise((resolve, reject) => {
        conn.query('DELETE FROM articulo WHERE id=?', id, (error, results) => {
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
    getAllArticulos,
    getOneArticulo,
    createOneArticulo,
    updateOneArticulo,
    deleteOneArticulo
}