"use strict";
var __importDefault = (this && this.__importDefault) || function (mod) {
    return (mod && mod.__esModule) ? mod : { "default": mod };
};
Object.defineProperty(exports, "__esModule", { value: true });
const express_1 = __importDefault(require("express"));
const router_1 = __importDefault(require("./router"));
const cors_1 = __importDefault(require("cors"));
const app = (0, express_1.default)();
const PORT = 3000;
const corsOptions = {
    origin: 'http://127.0.0.1:5500',
    methods: 'GET,POST,PUT,DELETE',
};
app.use(express_1.default.json());
app.use((0, cors_1.default)(corsOptions));
app.use('/agendas', router_1.default);
app.listen(PORT, () => {
    console.log("Servidor corriendo en puerto", PORT);
});
