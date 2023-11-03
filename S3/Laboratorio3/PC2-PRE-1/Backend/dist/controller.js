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
const getAllArticulos = (req, res) => __awaiter(void 0, void 0, void 0, function* () {
    try {
        const allArticulos = yield services.getAllArticulos();
        if (allArticulos.length != 0) {
            res.send({
                status: 200,
                data: allArticulos
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
const getOneArticulo = (req, res) => __awaiter(void 0, void 0, void 0, function* () {
    try {
        const articulo = yield services.getOneArticulo(req.params.id);
        if (articulo) {
            res.status(200).send({
                status: 200,
                data: articulo
            });
        }
        else {
            res.status(404).send({
                status: 404,
                error: 'Articulo no encontrado'
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
const createOneArticulo = (req, res) => __awaiter(void 0, void 0, void 0, function* () {
    try {
        const createArticulo = yield services.createOneArticulo(req.body);
        if (createArticulo) {
            res.status(201).send({
                status: 201,
                data: `Articulo ${createArticulo} creado`
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
const updateOneArticulo = (req, res) => __awaiter(void 0, void 0, void 0, function* () {
    try {
        const updateArticulo = yield services.updateOneArticulo(req.params.id, req.body);
        if (updateArticulo) {
            res.status(200).send({
                status: 200,
                data: `Articulo ${req.params.id} actualizado`
            });
        }
        else {
            res.status(404).send({
                status: 404,
                error: `Articulo ${req.params.id} no encontrado`
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
const deleteOneArticulo = (req, res) => __awaiter(void 0, void 0, void 0, function* () {
    try {
        const articulo = yield services.deleteOneArticulo(req.params.id);
        if (articulo !== null) {
            res.status(200).send({
                status: 200,
                data: `Articulo ${articulo} eliminado`
            });
        }
        else {
            res.status(404).send({
                status: 404,
                error: `Articulo no encontrado`
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
    getAllArticulos,
    getOneArticulo,
    createOneArticulo,
    updateOneArticulo,
    deleteOneArticulo
};
