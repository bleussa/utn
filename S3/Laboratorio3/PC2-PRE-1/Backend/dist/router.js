"use strict";
var __importDefault = (this && this.__importDefault) || function (mod) {
    return (mod && mod.__esModule) ? mod : { "default": mod };
};
Object.defineProperty(exports, "__esModule", { value: true });
const express_1 = __importDefault(require("express"));
const router = express_1.default.Router();
const controller = require('./controller');
router.get("/", controller.getAllArticulos);
router.get("/:id", controller.getOneArticulo);
router.post("/", controller.createOneArticulo);
router.put("/:id", controller.updateOneArticulo);
router.delete("/:id", controller.deleteOneArticulo);
exports.default = router;
