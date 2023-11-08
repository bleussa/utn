import { Request, Response } from "express";
const services = require('./services');

const getAllAgendas = async (req: Request, res: Response) => {
    try {
        const allAgendas = await services.getAllAgendas();
        if (allAgendas.length != 0) {
            res.send({
                status: 200,
                data: allAgendas
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

const getOneAgenda = async (req: Request, res: Response) => {
    try {
        const agenda = await services.getOneAgenda(req.params.id);
        if (agenda) {
            res.status(200).send({
                status: 200,
                data: agenda
            });
        } else {
            res.status(404).send({
                status: 404,
                error: 'Agenda no encontrado'
            });
        }
    } catch (error) {
        res.status(500).send({
            status: 500,
            error: 'Error de servidor'
        });
    }
}

const createOneAgenda = async (req: Request, res: Response) => {
    try {
        const createAgenda = await services.createOneAgenda(req.body);

        if (createAgenda) {
            res.status(201).send({
                status: 201,
                data: `Agenda ${createAgenda} creado`
            });
        }
    } catch (error) {
        res.status(500).send({
            status: 500,
            error: 'Error de servidor'
        });
    }
    
} 

const updateOneAgenda = async (req: Request, res: Response) => {
    try {
        const updateAgenda = await services.updateOneAgenda(req.params.id, req.body);

        if (updateAgenda) {
            res.status(200).send({
                status: 200,
                data: `Agenda ${req.params.id} actualizado`
            });
        } else {
            res.status(404).send({
                status: 404,
                error: `Agenda ${req.params.id} no encontrado`
            });
        }
    } catch (error) {
        res.status(500).send({
            status: 500,
            error: 'Error de servidor'
        });
    }
} 

const deleteOneAgenda = async (req: Request, res: Response) => {
    try {
        const agenda = await services.deleteOneAgenda(req.params.id);

        if (agenda !== null) {
            res.status(200).send({
                status: 200,
                data: `Agenda ${agenda} eliminado`
            });
        } else {
            res.status(404).send({
                status: 404,
                error: `Agenda no encontrado`
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
    getAllAgendas,
    getOneAgenda,
    createOneAgenda,
    updateOneAgenda,
    deleteOneAgenda
}