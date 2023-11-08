import express from 'express';
const router = express.Router();
const controller = require('./controller');

router.get("/", controller.getAllAgendas);
router.get("/:id", controller.getOneAgenda);
router.post("/", controller.createOneAgenda);
router.put("/:id", controller.updateOneAgenda);
router.delete("/:id", controller.deleteOneAgenda);

export default router;