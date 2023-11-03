import express from 'express';
const router = express.Router();
const controller = require('./controller');

router.get("/", controller.getAllArticulos);
router.get("/:id", controller.getOneArticulo);
router.post("/", controller.createOneArticulo);
router.put("/:id", controller.updateOneArticulo);
router.delete("/:id", controller.deleteOneArticulo);

export default router;