import { Router } from 'express';
import usersController from '../controllers/users.controller';
import errorHandlerMiddleware from '../middlewares/error.handler.middleware';

const usersRoute = Router();

usersRoute.get('/users', usersController.findAll);
usersRoute.get('/users/:uuid', usersController.findById, errorHandlerMiddleware);
usersRoute.post('/users', usersController.create);
usersRoute.put('/users/:uuid', usersController.update, errorHandlerMiddleware);
usersRoute.delete('/users/:uuid', usersController.delete, errorHandlerMiddleware);

export default usersRoute;
