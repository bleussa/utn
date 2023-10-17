import { Router } from "express";
const router = Router();
const controller = require('./controller');

router.get('/', controller.list);
router.post('/crearEmpleado', controller.save);
router.get('/modificarEmpleado/:legajo', controller.getOne);
router.post('/updateEmpleado', controller.update);
router.get('/eliminarEmpleado/:legajo', controller.delete);

module.exports = router;