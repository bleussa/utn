"use strict";
var __awaiter = (this && this.__awaiter) || function (thisArg, _arguments, P, generator) {
    function adopt(value) { return value instanceof P ? value : new P(function (resolve) { resolve(value); }); }
    return new (P || (P = Promise))(function (resolve, reject) {
        function fulfilled(value) { try { step(generator.next(value)); } catch (e) { reject(e); } }
        function rejected(value) { try { step(generator["throw"](value)); } catch (e) { reject(e); } }
        function step(result) { result.done ? resolve(result.value) : adopt(result.value).then(fulfilled, rejected); }
        step((generator = generator.apply(thisArg, _arguments || [])).next());
    });
};
Object.defineProperty(exports, "__esModule", { value: true });
const services = require('./services');
const getAllAgendas = (req, res) => __awaiter(void 0, void 0, void 0, function* () {
    try {
        const allAgendas = yield services.getAllAgendas();
        if (allAgendas.length != 0) {
            res.send({
                status: 200,
                data: allAgendas
            });
        }
        else {
            res.send({
                status: 400,
                data: 'No existen registros'
            });
        }
    }
    catch (error) {
        res.status(500).send({
            status: 500,
            error: 'Error de servidor'
        });
    }
});
const getOneAgenda = (req, res) => __awaiter(void 0, void 0, void 0, function* () {
    try {
        const agenda = yield services.getOneAgenda(req.params.id);
        if (agenda) {
            res.status(200).send({
                status: 200,
                data: agenda
            });
        }
        else {
            res.status(404).send({
                status: 404,
                error: 'Agenda no encontrado'
            });
        }
    }
    catch (error) {
        res.status(500).send({
            status: 500,
            error: 'Error de servidor'
        });
    }
});
const createOneAgenda = (req, res) => __awaiter(void 0, void 0, void 0, function* () {
    try {
        const createAgenda = yield services.createOneAgenda(req.body);
        if (createAgenda) {
            res.status(201).send({
                status: 201,
                data: `Agenda ${createAgenda} creado`
            });
        }
    }
    catch (error) {
        res.status(500).send({
            status: 500,
            error: 'Error de servidor'
        });
    }
});
const updateOneAgenda = (req, res) => __awaiter(void 0, void 0, void 0, function* () {
    try {
        const updateAgenda = yield services.updateOneAgenda(req.params.id, req.body);
        if (updateAgenda) {
            res.status(200).send({
                status: 200,
                data: `Agenda ${req.params.id} actualizado`
            });
        }
        else {
            res.status(404).send({
                status: 404,
                error: `Agenda ${req.params.id} no encontrado`
            });
        }
    }
    catch (error) {
        res.status(500).send({
            status: 500,
            error: 'Error de servidor'
        });
    }
});
const deleteOneAgenda = (req, res) => __awaiter(void 0, void 0, void 0, function* () {
    try {
        const agenda = yield services.deleteOneAgenda(req.params.id);
        if (agenda !== null) {
            res.status(200).send({
                status: 200,
                data: `Agenda ${agenda} eliminado`
            });
        }
        else {
            res.status(404).send({
                status: 404,
                error: `Agenda no encontrado`
            });
        }
    }
    catch (error) {
        res.status(500).send({
            status: 500,
            error: 'Error de servidor'
        });
    }
});
module.exports = {
    getAllAgendas,
    getOneAgenda,
    createOneAgenda,
    updateOneAgenda,
    deleteOneAgenda
};
