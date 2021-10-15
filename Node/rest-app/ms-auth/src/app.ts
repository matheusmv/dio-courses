import express, { json, urlencoded, Application } from 'express';
import errorHandlerMiddleware from './middlewares/error.handler.middleware';

import statusRoute from './routes/status.route';
import usersRoute from './routes/users.route';

class App {
    public readonly app: Application;

    constructor() {
        this.app = express();
        this.middlewares();
        this.routes();
    }

    private middlewares() {
        this.app.use(urlencoded({ extended: true }));
        this.app.use(json());
        this.app.use(errorHandlerMiddleware);
    }

    private routes() {
        this.app.use(usersRoute);
        this.app.use(statusRoute);
    }
}

export default new App().app;
