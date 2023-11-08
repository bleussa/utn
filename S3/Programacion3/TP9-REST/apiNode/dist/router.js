"use strict";
var __importDefault = (this && this.__importDefault) || function (mod) {
    return (mod && mod.__esModule) ? mod : { "default": mod };
};
Object.defineProperty(exports, "__esModule", { value: true });
const express_1 = __importDefault(require("express"));
const router = express_1.default.Router();
const controller = require('./controller');
router.get("/", controller.getAllAgendas);
router.get("/:id", controller.getOneAgenda);
router.post("/", controller.createOneAgenda);
router.put("/:id", controller.updateOneAgenda);
router.delete("/:id", controller.deleteOneAgenda);
exports.default = router;
