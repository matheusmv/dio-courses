import { Request, Response, NextFunction } from 'express';

class StatusController {

    async getStatus(req: Request, res: Response, next: NextFunction) {
        res.sendStatus(200);
    }
}

export default new StatusController();
