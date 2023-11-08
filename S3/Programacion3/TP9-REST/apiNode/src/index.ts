import express from "express";
import router from "./router";
import cors from "cors";

const app = express();
const PORT = 3000;

const corsOptions = {
    origin: 'http://127.0.0.1:5500', // LIVE SERVER
    methods: 'GET,POST,PUT,DELETE',
};

app.use(express.json());
app.use(cors(corsOptions));
app.use('/agendas', router);
app.listen(PORT, () => {
    console.log("Servidor corriendo en puerto", PORT);
})