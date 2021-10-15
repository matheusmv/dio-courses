import { Router } from 'express';
import statusController from '../controllers/status.controller';

const statusRoute = Router();

statusRoute.get('/status', statusController.getStatus);

export default statusRoute;
