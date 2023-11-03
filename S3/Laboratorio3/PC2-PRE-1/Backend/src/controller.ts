import { Request, Response } from "express";
const services = require('./services');

const getAllArticulos = async (req: Request, res: Response) => {
    try {
        const allArticulos = await services.getAllArticulos();
        if (allArticulos.length != 0) {
            res.send({
                status: 200,
                data: allArticulos
            });
        } else {
            res.send({
                status: 400,
                data: 'No existen registros'
            });
        }
    } catch (error) {
        res.status(500).send({
            status: 500,
            error: 'Error de servidor'
        });
    }
}

const getOneArticulo = async (req: Request, res: Response) => {
    try {
        const articulo = await services.getOneArticulo(req.params.id);
        if (articulo) {
            res.status(200).send({
                status: 200,
                data: articulo
            });
        } else {
            res.status(404).send({
                status: 404,
                error: 'Articulo no encontrado'
            });
        }
    } catch (error) {
        res.status(500).send({
            status: 500,
            error: 'Error de servidor'
        });
    }
}

const createOneArticulo = async (req: Request, res: Response) => {
    try {
        const createArticulo = await services.createOneArticulo(req.body);

        if (createArticulo) {
            res.status(201).send({
                status: 201,
                data: `Articulo ${createArticulo} creado`
            });
        }
    } catch (error) {
        res.status(500).send({
            status: 500,
            error: 'Error de servidor'
        });
    }
    
} 

const updateOneArticulo = async (req: Request, res: Response) => {
    try {
        const updateArticulo = await services.updateOneArticulo(req.params.id, req.body);

        if (updateArticulo) {
            res.status(200).send({
                status: 200,
                data: `Articulo ${req.params.id} actualizado`
            });
        } else {
            res.status(404).send({
                status: 404,
                error: `Articulo ${req.params.id} no encontrado`
            });
        }
    } catch (error) {
        res.status(500).send({
            status: 500,
            error: 'Error de servidor'
        });
    }
} 

const deleteOneArticulo = async (req: Request, res: Response) => {
    try {
        const articulo = await services.deleteOneArticulo(req.params.id);

        if (articulo !== null) {
            res.status(200).send({
                status: 200,
                data: `Articulo ${articulo} eliminado`
            });
        } else {
            res.status(404).send({
                status: 404,
                error: `Articulo no encontrado`
            });
        }
    } catch (error) {
        res.status(500).send({
            status: 500,
            error: 'Error de servidor'
        });
    }
} 

module.exports = {
    getAllArticulos,
    getOneArticulo,
    createOneArticulo,
    updateOneArticulo,
    deleteOneArticulo
}